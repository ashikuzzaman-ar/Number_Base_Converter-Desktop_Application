
package home;

import java.math.BigInteger;

public class BaseConversion {
    
    private final String inputNumber ;
    private final String inputBase ;
    private final String outputBase ;
    private String inputNumberFirstPart ;
    private String inputNumberSecondPart ;

    public BaseConversion(String inputNumber, String inputBase, String outputBase) {
        this.inputNumber = inputNumber;
        this.inputBase = inputBase;
        this.outputBase = outputBase;
        inputNumberFirstPart = "0";
        inputNumberSecondPart = "0";
    }
    
    
    private boolean checker(){
        
        boolean result = true;
        
        for(int i=0; i<inputNumber.length(); i++){
            
            if(charValToInt(inputNumber.charAt(i))>=Integer.valueOf(inputBase)){
                
                result = false;
                break;
            }
        }
        
        return result;
    }
    
    
    private void devideInputNumber(){
        
        int radixPoint = inputNumber.length();
        
        for(int i=0; i<inputNumber.length(); i++){
            if(inputNumber.charAt(i)!='.'){
                inputNumberFirstPart += inputNumber.charAt(i);
            } else {
                radixPoint = i;
                break;
            }
        }
        
        if(radixPoint < inputNumber.length()){
            
            for(int i=radixPoint+1; i<inputNumber.length(); i++){
                inputNumberSecondPart += inputNumber.charAt(i);
            }
        }
    }
    
    
    private int charValToInt(char cr){
        
        int result = 0;
        
        if(cr>=48 && cr <=57){
            
            result = (int) (cr-48);
        } else if(cr>=65 && cr<=90){
            
            result = (int) (cr-55);
        } else if(cr>=97 && cr<=122){
            
            result = (int) (cr-61);
        }
        
        return result;
    }
    
    
    private char intValToChar(int in){
        
        char result = '0';
        
        if(in>=0 && in<=9){
            
            result = (char) (in+48);
        } else if(in>=10 && in<=35){
            
            result = (char) (in+55);
        } else if(in>=36 && in<=61){
            
            result = (char) (in+61);
        }
        
        return result;
    }
    
    
    private void anyBaseToTenFirstHalf(){
        
        BigInteger number = new BigInteger("0");
        int j = inputNumberFirstPart.length()-1;
        
        for(int i=0; i<inputNumberFirstPart.length(); i++,j--){
            int temp = (int) Math.pow(Integer.valueOf(inputBase), j);
            number = number.add(
                    BigInteger.valueOf(charValToInt(inputNumberFirstPart.charAt(i))*temp));
        }
        
        inputNumberFirstPart = String.valueOf(number);
    }
    
    private void anyBaseToTenSecondHalf(){
        
        if(!inputNumberSecondPart.equals("0")){
            
            double number = 0;

            for (int i = 0; i < inputNumberSecondPart.length(); i++) {

                number += (charValToInt(inputNumberSecondPart.charAt(i))) 
                        * (Math.pow(Integer.valueOf(inputBase), (i) * (-1)));
            }

            String temp = String.valueOf(number);
            inputNumberSecondPart = temp.substring(1, temp.length());
        } else {
            
            inputNumberSecondPart = ".0";
        }
    }
    
    
    private void tenBaseToAnyBaseFirstHalf(){
        
        BigInteger number = new BigInteger(inputNumberFirstPart);
        BigInteger base = new BigInteger(outputBase);
        String temp = "";
        
        boolean counter = !number.divide(base).equals(BigInteger.ZERO);
        temp = String.valueOf(intValToChar(Integer.valueOf(String.valueOf(number.mod(base)))));
        
        while(counter){
            
            number = number.divide(base);
            temp += intValToChar(Integer.valueOf(String.valueOf(number.mod(base))));
            counter = !number.divide(base).equals(BigInteger.ZERO);
        }
        
        inputNumberFirstPart = "";
        
        for(int i=temp.length()-1; i>=0; i--){
            
            inputNumberFirstPart += temp.charAt(i);
        }
    }
    
    
    private void tenBaseToAnyBaseSecondHalf(){
        
        double number = Double.valueOf(inputNumberSecondPart); 
        int tempNumber = (int) number;
        double base = Double.valueOf(outputBase);
        inputNumberSecondPart = "";
        
        while(number!=0.0){
            
            number *= base;
            tempNumber = (int) number;
            number -= tempNumber;
            inputNumberSecondPart += String.valueOf(intValToChar(tempNumber));            
        }
        
        if(inputNumberSecondPart.equals("")){
            inputNumberSecondPart = "0";
        }
    }
    
    
    
    private void converter(){
        
        devideInputNumber();
        anyBaseToTenFirstHalf();
        anyBaseToTenSecondHalf();
        tenBaseToAnyBaseFirstHalf();
        tenBaseToAnyBaseSecondHalf();
    }
    
    public String getNumber(){
        
        int in = Integer.valueOf(inputBase);
        int out = Integer.valueOf(outputBase);
        
        if(in==out){
            
            return inputNumber;
        } else if(checker() && in>=2 && in<=62 && out>=2 && out<=62){
            
            converter();
            return inputNumberFirstPart+"."+inputNumberSecondPart;
        } else {
            
            return "Input/Output Base Error!";
        }
    }
}
