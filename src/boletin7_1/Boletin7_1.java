package boletin7_1;

import javax.swing.JOptionPane;

public class Boletin7_1 {

    public static void main(String[] args) {
        Positivo obj = new Positivo();
       
        double num = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un número "));
        obj.esPositivo(num);
        
    }
    
}
