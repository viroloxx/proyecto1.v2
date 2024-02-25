package javaproject_1;

import java.util.Objects;

/**
 *
 * @author Diego A. Vivolo
 */
public class CiudadList extends Lista<Ciudad> {
    
    /**
     * Compara el nombre de un almac�n con un objeto
     * @param a almac�n
     * @param b nombre a comparar
     * @return {@code true} si el nombre coincide, si no {@code false}
     * @see find
     * @see remove
     */
    @Override
    protected boolean compareKey(Ciudad a, Object b) {
        return Objects.equals(a.getName(), b);
    }   
}
    
    

