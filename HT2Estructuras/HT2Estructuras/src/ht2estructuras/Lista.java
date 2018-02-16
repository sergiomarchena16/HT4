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
public interface Lista<E> {
    public int size();
   // post: returns number of elements in list
    
    public boolean isEmpty();
   // post: returns true iff list has no elements
    
    public void addFirst(E value);
   // post: value is added to beginning of list

   public void addLast(E value);
   // post: value is added to end of list

   public E getFirst();
   // pre: list is not empty
   // post: returns first value in list

   public E getLast();
   // pre: list is not empty
   // post: returns last value in list
   
   public void add(E value);
   // post: value is added to tail of list
   
   public E remove(int i);
   // pre: 0 <= i < size()
   // post: removes and returns object found at that location
   
   public E get(int i);
   // pre: 0 <= i < size()
   // post: returns object found at that location
    
   public int indexOf(E value);
   // pre: value is not null
   // post: returns (0-origin) index of value,
   // or -1 if value is not found
    
    
}
