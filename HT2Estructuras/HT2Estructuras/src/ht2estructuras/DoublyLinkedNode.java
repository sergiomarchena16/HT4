
package ht2estructuras;
public class DoublyLinkedNode<E> {

    protected E data;
    protected DoublyLinkedNode<E> nextElement;
    protected DoublyLinkedNode<E> previousElement;

    public DoublyLinkedNode(E v,DoublyLinkedNode<E> next,DoublyLinkedNode<E> previous)
    {
        data = v;
        nextElement = next;
        if (nextElement != null)
            nextElement.previousElement = this;
        previousElement = previous;
        if (previousElement != null)
            previousElement.nextElement = this;
    }

    public DoublyLinkedNode(E v)
    // post: constructs a single element
    {
        this(v,null,null);
    }
    
    public E getValue(){
        return data;
    }
    
    public DoublyLinkedNode<E> getNext(){
        return nextElement;
    }
    
    public void setNext(DoublyLinkedNode<E> next){
        nextElement = next;
    }
    
    public void setValue(E value){
        data = value;
    }
    
    public void setPrevious(DoublyLinkedNode<E> previous){
        previousElement = previous;
    }
    
    public DoublyLinkedNode<E> getPrevious(){
        return previousElement;
    }
    
    
}