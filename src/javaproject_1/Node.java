/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaproject_1;

/**
 *
 * @author Diego A. Vivolo
 */
public class Node<T>{

  private T value;
  private Node<T> next;
  
  /**
   * Crea un nodo
   * @param value el valor del nodo 
   */
  public Node(T value) {
      this.value = value;
  }
  
  /**
   * Crea un nodo
   * @param value el valor del nodo 
   * @param next referencia al siguiente nodo
   */
  public Node(T value, Node<T> next) {
      this.value = value;
      this.next = next;
  }
  
  /**
   * Retorna el valor del nodo
   * @return El valor del nodo
   */
  public T getValue() {
      return value;
  }
  
  /**
   * Establece el valor del nodo
   * @param value el valor del nodo
   */
  public void setValue(T value) {
      this.value = value;
  }
  
  /**
   * Retorna una referencia al siguiente nodo
   * @return El siguiente nodo
   */
  public Node<T> getNext() {
      return next;
  }
  
  /**
   * Establece la referencia al siguiente nodo
   * @param next el siguiente nodo
   */
  public void setNext(Node<T> next) {
      this.next = next;
  }   
  }
  