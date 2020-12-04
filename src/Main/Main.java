/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Clases.Singleton;
import UI.MainFrame;
import java.awt.Frame;

/**
 *
 * @author Jus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Singleton sigleton = Singleton.getInstance();
        MainFrame main = new MainFrame();
        main.setVisible(true);
    }
    
}
