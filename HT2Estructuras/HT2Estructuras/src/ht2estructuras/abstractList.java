/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ht2estructuras;

/**
 *
 * @author Mafer
 */
public abstract class abstractList<E> implements Lista<E> {
    public abstractList()
   // post: does nothing
   {
   }

   public boolean isEmpty()
   // post: returns true iff list has no elements
   {
      return size() == 0;
   }
   
   @Override
    public void push(E item) {
        addLast(item);
    }

    /**
     * Elimina el último elemento
     * @return método para eliminar el último elemento
     */
    @Override
    public E pop() {
        return removeLast();
    }

    /**
     * Muestra el último elemento agregado a la lista
     * @return último elemento
     */
    @Override
    public E peek() {
        return getLast();
    }

    /**
     * Pone el tamaño como 0
     * @return boolean de is empty
     */
    @Override
    public boolean empty() {
        return isEmpty();
    }

    /**
     * Indica el tamaño del nodo
     * @return count el tamaño
     */
    @Override
    public int size() {
        return 0;
    }
  
  
}
