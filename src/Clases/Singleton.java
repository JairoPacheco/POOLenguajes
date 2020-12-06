/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import javax.swing.DefaultListModel;

/**
 *
 * @author Jus
 */
public class Singleton implements Serializable{
    
    public static Singleton instance = null;
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
    
    public DefaultListModel<Imagen> listaImagenes = new DefaultListModel<>();
    public DefaultListModel<ImagenModificada> listaImagenesModificadas = new DefaultListModel<>();
    
    public void MeterArchivo(){
        try{
            ObjectOutputStream escribiendo = new ObjectOutputStream(new FileOutputStream("Imagenes.txt"));
            ObjectOutputStream escribiendo2 = new ObjectOutputStream(new FileOutputStream("ImagenesModificadas.txt"));
            escribiendo.writeObject(listaImagenes);
            escribiendo2.writeObject(listaImagenesModificadas);
        }catch(IOException e){
            
        }
    }
    
    public void SacarArchivo(){
        try{
            ObjectInputStream sacar2 = new ObjectInputStream(new FileInputStream("ImagenesModificadas.txt"));
            this.listaImagenesModificadas = (DefaultListModel<ImagenModificada>)sacar2.readObject();
            ObjectInputStream sacar = new ObjectInputStream(new FileInputStream("Imagenes.txt"));
            this.listaImagenes = (DefaultListModel<Imagen>)sacar.readObject();
        }catch(IOException | ClassNotFoundException e){
            listaImagenes = listaImagenes;
            listaImagenesModificadas = listaImagenesModificadas;
        }
    }
}
