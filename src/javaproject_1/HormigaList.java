/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaproject_1;

import java.util.ArrayList;

/**
 *
 * @author Diego A. Vivolo
 */
public class HormigaList extends Lista<Hormiga>{
    
    
    private final ArrayList<Hormiga> hormigas;
    
    public HormigaList() {
        this.hormigas = new ArrayList<>(); 
    }
 
    /**
     *
     * @return
     */
    public ArrayList<Hormiga> getHormigas() { // Método para obtener la lista de hormigas
        return hormigas;
    }

    public void agregarHormigas(Hormiga hormiga) {
        getHormigas().add(hormiga);
    }

    public void eliminarHormigas(Hormiga hormiga) {
        getHormigas().remove(hormiga);
    }

    private Object getHormiga() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
