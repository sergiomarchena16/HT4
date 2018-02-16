package ht2estructuras;


/**
 * @author Jose Cifuentes
 * @author Mafer Lopez
 * @version 02.02.2018
 */
public interface Calculadora 
{
    
    /**
    * Metodo que lee una expresion notacion postfix
    * @param expresion cadena de texto que contiene la expresion en notacion postfix 
    * @pre la cadena expresion contiene 2 numeros y 1 signo como minimo
    * @post regresa el resultado de la expresion
    */
    public double operar(String expresion);
}
