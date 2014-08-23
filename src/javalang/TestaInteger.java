/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javalang;

import java.io.PrintStream;

/**
 *
 * @author MEUS DOCUMENTOS
 */
public class TestaInteger {
    
    public static void main(String[] args){
        Integer x1= new Integer(10);
        Integer x2= new Integer(10);
        Integer x3=null;
        String s1="10";
        
        
        PrintStream saida; 
        saida=System.out;
        saida.println("ola");

        if(x1.equals(x2)){
           System.out.println("Igual");     
           x3=Integer.parseInt(s1); //Convert
           System.out.println(x3);
           
        }else{
           System.out.println("Diferente");      
        }
        
        /**
         *  1) Simbolo == esta os objeto
         *  2) Metodo iguals testar sempre o valor dos objetos
         *  3) ParseInt método estático que recebe uma string e transforma para inteiro
         *  4) A variavel saida para receber o referencia do System.out, precisa ser do tipo PrintStream.
         */ 
    }

    
}
