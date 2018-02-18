
package ht2estructuras;

import static java.lang.Double.NaN;

/**
 * @author Jose Cifuentes
 * @author Mafer Lopez
 * @version 02.02.2018
 */
public class Operacion implements Calculadora {
    private Stack<Double> x;
    private Operacion instance;
    double d2;
    double n1,n2;
    
    public Operacion(Stack tipo){
        x = tipo;
    }
    public Operacion getInstance(Stack tipo){
        if(instance == null){
            instance = new Operacion(tipo);
        } else {
            System.out.println("No se puede");
        }
        return instance;
    }
    @Override
    public double operar(String expresion) 
    {       
       
        for(int i=0;i<expresion.length();i++)
        {            
            try
            {               
               double d1 =  Double.parseDouble(Character.toString(expresion.charAt(i)));    
               x.push(d1);
                
           }catch(Exception e)
           {
               switch (expresion.charAt(i)) 
               {
                    case '+':
                       n1=x.pop();
                       n2=x.pop();
                       d2 =  n2+n1;
                       x.push(d2);            
                       break;
                       
                   case '-':
                       n1=x.pop();
                       n2=x.pop();
                       d2 =  n2-n1;
                       x.push(d2);            
                       break;    
                       
                    case '*':
                       n1=x.pop();
                       n2=x.pop();
                       d2 =  n2*n1;
                       x.push(d2);            
                       break;   
                    
                       
                    case '/':
                       n1=x.pop();
                       n2=x.pop();
                       
                        if (n1==0) 
                        {
                            d2=NaN;                            
                        }
                        else
                        {
                            d2=n2/n1;
                        }
                      
                      
                       x.push(d2);            
                       break;    
                }
            }
            }
        return x.pop();
       }
    }