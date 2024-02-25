/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaproject_1;

/**
 *
 * @author Diego A. Vivolo
 */
public class Comida extends Ciudad{
    private Ciudad name;
    private Ciudad ciudadInicio;
    private Ciudad ciudadComida;

    public Comida(String name, Ciudad ciudadInicio, Ciudad ciudadFinal) {
        super(name);
        this.ciudadInicio = ciudadInicio;
        this.ciudadComida = ciudadComida;
    }
    
    public Comida (String name){
        super(name);
    }

    public void agregarHormiga(HormigaList hormigas) {
        getHormiga().add(hormigas);
    }

    public void eliminarHormigas(HormigaList hormigas) {
        getHormiga().remove(hormigas);
    }

    private Object getHormiga() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}    
    

