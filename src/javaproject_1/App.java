/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaproject_1;



import java.awt.CardLayout;
import java.io.File;
import java.io.FileNotFoundException;


/**
 *
 * @author Diego A. Vivolo
 */



public class App {
    private File dataFile;
    public static App instance;
    
    
    public App(){
        //initComponents();//
        
    }
    
    public File getDataFile() {
        return dataFile;
    }

    public void setDataFile(File dataFile) {
        this.dataFile = dataFile;
    }  
    
    public void show(String name) {
        ((CardLayout) contentPanel.getLayout()).show(contentPanel, name);
    }    
 
    
    
    public void showventanaOpcion(){
        show("VentanaOpcion");
    }
    
    public void showVentanaLoad(){
        show("VentanaLoad");
    }
    public void showGestionVentana(){
        GestionVentana.
        show("GestionVentana");
    }

    
    public static void main(String args[]) {
        instance = new App();
        Ventana1 vComienzo = new Ventana1();
        vComienzo.setVisible(true);
    }
       
    
    // Variables declaration - do not modify                     
    private javax.swing.JPanel contentPanel;
    // End of variables declaration   
    
    public static App getInstance() {
        return instance;
        
    }


}    
    
    
    
    
    
    
    
    
    
    
