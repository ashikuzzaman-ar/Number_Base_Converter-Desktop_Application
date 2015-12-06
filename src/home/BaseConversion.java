package home;

import java.math.BigInteger;
import javax.swing.JOptionPane;

public class BaseConversion {
    
    private final String inputNumber;
    private final String inputBase;
    private final String outputBase;
    private String inputNumberFirstPart;
    private String inputNumberSecondPart;
    
    public BaseConversion(String inputNumber, String inputBase, String outputBase) {
        
        this.inputNumber = inputNumber;
        this.inputBase = inputBase;
        this.outputBase = outputBase;
        this.inputNumberFirstPart = "0";
        this.inputNumberSecondPart = "0";
    }
    
    private boolean checker() {
        
        boolean result = true;
        
        try {
            
            for (int i = 0; i < this.inputNumber.length(); i++) {
                
                if (charValToInt(this.inputNumber.charAt(i)) >= Integer.valueOf(this.inputBase)) {
                    
                    result = false;
                    break;
                }
            }
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
        return result;
    }
    
    private void devideInputNumber() {
        
        try {
            
            int radixPoint = this.inputNumber.length();
            
            for (int i = 0; i < this.inputNumber.length(); i++) {
                
                if (this.inputNumber.charAt(i) != '.') {
                    
                    this.inputNumberFirstPart += this.inputNumber.charAt(i);
                } else {
                    
                    radixPoint = i;
                    break;
                }
            }
            
            if (radixPoint < this.inputNumber.length()) {
                
                for (int i = radixPoint + 1; i < this.inputNumber.length(); i++) {
                    
                    this.inputNumberSecondPart += this.inputNumber.charAt(i);
                }
            }
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    private int charValToInt(char cr) {
        
        int result = 0;
        
        try {
            
            if (cr >= 48 && cr <= 57) {
                
                result = (int) (cr - 48);
            } else if (cr >= 65 && cr <= 90) {
                
                result = (int) (cr - 55);
            } else if (cr >= 97 && cr <= 122) {
                
                result = (int) (cr - 61);
            }
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
        return result;
    }
    
    private char intValToChar(int in) {
        
        char result = '0';
        
        try {
            
            if (in >= 0 && in <= 9) {
                
                result = (char) (in + 48);
            } else if (in >= 10 && in <= 35) {
                
                result = (char) (in + 55);
            } else if (in >= 36 && in <= 61) {
                
                result = (char) (in + 61);
            }
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
        return result;
    }
    
    private void anyBaseToTenFirstHalf() {
        
        try {
            
            BigInteger number = new BigInteger("0");
            
            int j = this.inputNumberFirstPart.length() - 1;
            
            for (int i = 0; i < this.inputNumberFirstPart.length(); i++, j--) {
                
                int temp = (int) Math.pow(Integer.valueOf(this.inputBase), j);
                number = number.add(BigInteger.valueOf(charValToInt(this.inputNumberFirstPart.charAt(i)) * temp));
            }
            
            this.inputNumberFirstPart = String.valueOf(number);
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    private void anyBaseToTenSecondHalf() {
        
        try {
            
            if (!this.inputNumberSecondPart.equals("0")) {
                
                double number = 0;
                
                for (int i = 0; i < this.inputNumberSecondPart.length(); i++) {
                    
                    number += (charValToInt(this.inputNumberSecondPart.charAt(i)))
                            * (Math.pow(Integer.valueOf(this.inputBase), (i) * (-1)));
                }
                
                String temp = String.valueOf(number);
                this.inputNumberSecondPart = temp.substring(1, temp.length());
            } else {
                
                this.inputNumberSecondPart = ".0";
            }
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    private void tenBaseToAnyBaseFirstHalf() {
        
        try {
            
            BigInteger number = new BigInteger(this.inputNumberFirstPart);
            BigInteger base = new BigInteger(this.outputBase);
            String temp;
            
            boolean counter = !number.divide(base).equals(BigInteger.ZERO);
            temp = String.valueOf(intValToChar(Integer.valueOf(String.valueOf(number.mod(base)))));
            
            while (counter) {
                
                number = number.divide(base);
                temp += intValToChar(Integer.valueOf(String.valueOf(number.mod(base))));
                counter = !number.divide(base).equals(BigInteger.ZERO);
            }
            
            this.inputNumberFirstPart = "";
            
            for (int i = temp.length() - 1; i >= 0; i--) {
                
                this.inputNumberFirstPart += temp.charAt(i);
            }
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    private void tenBaseToAnyBaseSecondHalf() {
        
        try {
            
            double number = Double.valueOf(this.inputNumberSecondPart);
            int tempNumber;
            double base = Double.valueOf(this.outputBase);
            this.inputNumberSecondPart = "";
            
            while (number != 0.0) {
                
                number *= base;
                tempNumber = (int) number;
                number -= tempNumber;
                this.inputNumberSecondPart += String.valueOf(intValToChar(tempNumber));
            }
            
            if (this.inputNumberSecondPart.equals("")) {
                
                this.inputNumberSecondPart = "0";
            }
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    private void converter() {
        
        try {
            
            this.devideInputNumber();
            this.anyBaseToTenFirstHalf();
            this.anyBaseToTenSecondHalf();
            this.tenBaseToAnyBaseFirstHalf();
            this.tenBaseToAnyBaseSecondHalf();
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    public String getNumber() {
        
        try {
            
            int in = Integer.valueOf(this.inputBase);
            int out = Integer.valueOf(this.outputBase);
            
            boolean t1 = in == out;
            boolean t2 = this.checker();
            
            if (t1 && t2) {
                
                return this.inputNumber;
            } else if (t2) {
                
                this.converter();
                return this.inputNumberFirstPart + "." + this.inputNumberSecondPart;
            } else {
                
                return "Each Digit Should Smaller Than Base Number!";
            }
        } catch (Exception e) {
            
            return e.toString();
        }
    }
}
