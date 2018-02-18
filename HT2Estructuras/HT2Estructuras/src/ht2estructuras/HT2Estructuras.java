
package ht2estructuras;

import java.io.*;
import static java.lang.Double.NaN;
import static java.lang.Double.isNaN;
import java.util.Scanner;


/**
 * @author Jose Cifuentes
 * @author Mafer Lopez
 * @version 02.02.2018
 */
public class HT2Estructuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException 
    {
         String linea = null;
         Scanner sc = new Scanner(System.in);
         int opcion;
         Stack stack = null;
         
         Factory factory = new Factory();
                 
        File archivo = new File ("C:\\Users\\Mafer\\Documents\\HT2Estructuras\\HT2Estructuras\\HT2Estructuras\\datos.txt");
        
        System.out.println("Elija una opcion: ");
        System.out.println("1. ArrayList.");
        System.out.println("2. Array.");
        System.out.println("3. Listas.");
        opcion = sc.nextInt();
        
        
        stack = factory.getLista(opcion, linea);
        Operacion opera = new Operacion(stack);
        
        
        
        
        /**
        File archivo = new File ("C:\\Users\\Mafer\\Documents\\GitHub\\HT2Estructuras\\HT2Estructuras\\src\\ht2estructuras\\Fuente.txt");
        */
        
        FileReader fr = new FileReader (archivo);
        BufferedReader br = new BufferedReader(fr);
        
        while ( (linea = br.readLine()) != null)
        {      
            opera.operar(linea);
            if(Double.isNaN(opera.operar(linea))){
                System.out.println("No se pudo realizar la operación");
                
            } else {
                System.out.println(opera.operar(linea));
            }
            
         
        }
        
        
        
    }
    
}
