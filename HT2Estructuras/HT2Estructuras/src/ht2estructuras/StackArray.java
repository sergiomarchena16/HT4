package ht2estructuras;

import java.util.ArrayList;

/**
 *
 * @author jose
 */
public class StackArray<E>
 implements Stack<E>
{
	protected E[] data;

	public StackArray()
	// post: constructs a new, empty stack
	{
		data = (E[]) new Object[100];
	}

	public void push(E item)
	// post: the value is added to the stack
	//          will be popped next if no intervening push
	{
		for(int i=0; i<100;i++){
                    data[i] = item;
                }
	}

	public E pop()
	// pre: stack is not empty
	// post: most recently pushed item is removed and returned
	{
                
		return data.(size()-1);
	}

	public E peek()
	// pre: stack is not empty
	// post: top value (next to be popped) is returned
	{
		return data.get(size() - 1);
	}
	
	public int size()
	// post: returns the number of elements in the stack
	{
		int contador=0;
                for(int i=0;i<data.length;i++){
                    if(data[i]!=null){
                        contador++;
                    }
                }
                return contador;
	}
  
	public boolean empty()
	// post: returns true if and only if the stack is empty
	{
		return size() == 0;
	}
}