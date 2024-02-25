
package javaproject_1;

import java.util.Objects;


/**
 *
 * @author Diego A. Vivolo
 */


public class Lista<T> {
    private ListNode<T> first;
    private ListNode<T> last;
    private int size;
    
    /**
     * Agrega un elemento al final de la lista
     * @param value elemento a agregar
     */
    public void append(T value) {
        ListNode<T> node = new ListNode(value);
        if(size == 0) {
            first = last = node;
        }
        else {
            last.setNext(node);
            last = node;
        }
        size += 1;
    }
    
    /**
     * Busca y elimina un elemento de la lista, y retorna su valor
     * @param value elemento a eliminar
     * @return El valor del elemento eliminado, o {@code null} si no se encontr�
     * @see compareKey
     */
    public T remove(Object value) {
        for(ListNode<T> node = first, prev = null; node != null; prev = node, node = node.getNext()) {
            if(compareKey(node.getValue(), value)) {
                if(node == last) {
                    last = prev;
                }
                if(node == first) {
                    first = node.getNext();
                }
                else {
                    prev.setNext(node.getNext());
                }
                size -= 1;
                return node.getValue();
            }
        }
        return null;
    }
    
    /**
     * Elimina el elemento en la posici�n {@code index} y retorna su valor
     * @param index �ndice del elemento en la lista
     * @return El valor del elemento encontrado
     * @throws IndexOutOfBoundsException si el �ndice no est� en el rango de la lista
     */
    public T removeAt(int index) {
        int i = 0;
        for(ListNode<T> node = first, prev = null; node != null; prev = node, node = node.getNext()) {
            if(index == i++) {
                if(node == last) {
                    last = prev;
                }
                if(node == first) {
                    first = node.getNext();
                }
                else {
                    prev.setNext(node.getNext());
                }
                size -= 1;
                return node.getValue();
            }
        }
        throw new IndexOutOfBoundsException(index);
    }
    
    /**
     * Retorna el elemento en la posici�n {@code index}
     * @param index �ndice del elemento en la lista
     * @return El valor del elemento encontrado
     * @throws IndexOutOfBoundsException si el �ndice no est� en el rango de la lista
     */
    public T at(int index) {
        int i = 0;
        for(ListNode<T> node = first; node != null; node = node.getNext()) {
            if(index == i++) {
                return node.getValue();
            }
        }
        throw new IndexOutOfBoundsException(index);
    }
    
    /**
     * Busca un elemento de la lista, y retorna su valor
     * @param value elemento a buscar
     * @return El valor del elemento encontrado, o {@code null} si no se encontr�
     * @see compareKey
     */
    public T find(Object value) {
        for(ListNode<T> node = first; node != null; node = node.getNext()) {
            if(compareKey(node.getValue(), value)) {
                return node.getValue();
            }
        }
        return null;
    }
    

    /**
     * Retorna el primer nodo de la lista
     * @return Primer nodo de la lista
     */
    public ListNode<T> getFirst() {
        return first;
    }


    /**
     * Retorna el �ltimo nodo de la lista
     * @return �ltimo nodo de la lista
     */
    public ListNode<T> getLast() {
        return last;
    }

    /**
     * Retorna el tama�o de la lista
     * @return Tama�o de la lista
     */
    public int getSize() {
        return size;
    }
    
    /**
     * Indica si la lista est� vac�a
     * @return {@code true} si la lista est� vac�a, si no {@code false}
     */
    public boolean isEmpty() {
        return size == 0;
    }
    
    /**
     * Compara un elemento de la lista con un objeto
     * @param a elemento de la lista
     * @param b objeto a comparar
     * @return @return {@code true} si los objetos coinciden, si no {@code false}
     */
    protected boolean compareKey(T a, Object b) {
        return Objects.equals(a, b);
    }
}

}

    

