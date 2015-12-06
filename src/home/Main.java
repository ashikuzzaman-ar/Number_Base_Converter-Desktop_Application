
package home;

import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
        
        try {
            
            MainFrame.launcher();
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
}
