/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaproject_1;

import java.util.Objects;
/**
 *
 * @author Diego A. Vivolo
 */
public class RutaList extends Lista<Ruta> {


    public int[] getConteoDirecto();
        float[] count;
        for(ListNode<Ruta> node = getFirst(); node != null; node = node.getNext()){
            if(node.getValue().estaAlre()){
                count[1]++;
            }
            else{
                count[0]++;

            }
        }
        return count;
    
}
