/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaproject_1;

/**
 *
 * @author Diego A. Vivolo
 */
public class Hormiga {
    private String hormiga;
    private int cantidad;
    
    
    public Hormiga(String hormiga, int cantidad){
        this.hormiga = hormiga;
        this.cantidad = cantidad;
    }
    
    public String getHormiga(){
        return hormiga;
    }
    public void sethormiga(String homiga) {
        this.hormiga = hormiga;
    }
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Establece la cantidad de hormigas
     * @param amount cantidad de productos
     */
    public void setCantidad (int cantidad) {
        this.cantidad = cantidad;
    }


