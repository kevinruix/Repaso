/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso;

import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */
public class Repaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String cadena ;
     int entero;
     char letra;
     
     cadena = JOptionPane.showInputDialog("digite una cadena: ");
     entero = Integer.parseInt(JOptionPane.showInputDialog("digite un entero:"));
     letra = JOptionPane.showInputDialog("Digite un caracter: ").charAt(0);
     
     JOptionPane.showInternalMessageDialog(null, "La cadena es: "+cadena);
     JOptionPane.showInternalMessageDialog(null, "El numero entero es: "+entero);
     JOptionPane.showInternalMessageDialog(null, "El caracter es: "+letra);
    }
    
}
