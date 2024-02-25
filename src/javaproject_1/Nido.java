/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaproject_1;

/**
 *
 * @author Diego A. Vivolo
 */
public class Nido extends Ciudad{
    private Ciudad name;
    private Ciudad ciudadInicio;
    private Ciudad ciudadComida;

    public Nido(String name, Ciudad ciudadInicio, Ciudad ciudadFinal) {
        super(name);
        this.ciudadInicio = ciudadInicio;
        this.ciudadComida = ciudadComida;
    }
    
    public Nido(String name){
        super(name);
    }
    public void agregarHormiga(Hormiga hormiga) {
        getHormiga().add(hormiga);
    }

    public void eliminarHormiga(Hormiga hormiga) {
        getHormiga().remove(hormiga);
    }

    private Object getHormiga() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

