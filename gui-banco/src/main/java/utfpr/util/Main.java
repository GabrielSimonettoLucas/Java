/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.util;

import javax.swing.JFrame;
import utfpr.gui.Principal;
import utfpr.banco.Banco;

/**
 *
 * @author evand
 */
public class Main {
    public static void main(String[] args) {
        DataProvider provider = new DataProvider();
        Banco banco = provider.criarBanco("MoonBank");    
     
        Principal principal = new Principal();
        principal.passarBanco(banco);
        principal.setVisible(true);
        principal.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
    }
}
