/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author Jus
 */
public class Singleton {
    
    public static Singleton instance = null;
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
    
    public DefaultListModel<Imagen> listaImagenes = new DefaultListModel<>();
    public DefaultListModel<ImagenModificada> listaImagenesModificadas = new DefaultListModel<>();
}
