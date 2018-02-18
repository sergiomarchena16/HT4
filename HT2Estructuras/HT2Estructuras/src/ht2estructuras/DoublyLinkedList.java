
package ht2estructuras;

public class DoublyLinkedList<E> extends abstractList<E>{
    protected int count;
    protected DoublyLinkedNode<E> head;
    protected DoublyLinkedNode<E> tail;

    public DoublyLinkedList(String texto)
    // post: constructs an empty list
    {
       head = null;
       tail = null;
       count = 0;
    }


    public void addFirst(E value)
    // pre: value is not null
    // post: adds element to head of list
    {
       // construct a new element, making it head
       head = new DoublyLinkedNode<E>(value, head, null);
       // fix tail, if necessary
       if (tail == null) tail = head;
       count++;
    }


    public void addLast(E value)
    // pre: value is not null
    // post: adds new value to tail of list
    {
       // construct new element
       tail = new DoublyLinkedNode<E>(value, null, tail);
       // fix up head
       if (head == null) head = tail;
       count++;
    }
    
    @Override
    public void push(E item) {
        addLast(item);
    }
    
    @Override
    public E pop() {
        return removeLast();
    }
    
    @Override
    public E peek() {
        return getLast();
    }

    @Override
    public int size() {
        return count;
    }
   
    @Override
    public E getLast() {
        return tail.getValue();
    
    }

    @Override
    public E remove(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E removeLast() {
        DoublyLinkedNode<E>  temp = tail;
        tail = tail.getPrevious();
        if(tail == null){
            head = null;
        } else {
            tail.setNext(null);
        }
        count--;
        return temp.getValue();
        
    }
}
