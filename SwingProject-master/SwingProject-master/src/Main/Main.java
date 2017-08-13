/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import GUI.Theme;
import GUI.welcome;
import java.awt.IllegalComponentStateException;

/**
 *
 * @author lahir
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        welcome wl = new welcome();
       wl.setExtendedState(welcome.MAXIMIZED_BOTH);
       wl.setVisible(true);
        
    }
    
}
