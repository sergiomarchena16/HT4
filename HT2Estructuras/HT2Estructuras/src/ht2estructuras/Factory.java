/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ht2estructuras;

import java.util.Scanner;

/**
 *
 * @author Mafer
 */
public class Factory {
    public Stack getLista(int opcion, String texto){
        String o2 = "";
        Scanner sc = new Scanner(System.in);
        if(opcion==1){
            return new StackArrayList(texto);
        } else if(opcion==2){
            return new StackArray(texto);
        } else if (opcion == 3){
            System.out.println("Seleccione que lista desea usar");
            System.out.println("A. Lista Simple.");
            System.out.println("B. Lista Doble.");
            System.out.println("C. Lista Circular.");
            o2 = sc.next();
            
            if(o2.equals("A")){
                return new SinglyLinkedList(texto);
            } else if(o2.equals("B")){
                return new DoublyLinkedList(texto);
            } else if(o2.equals("C")){
                return new CircularList(texto);
            }
        }
        return null;
    }
    
}
