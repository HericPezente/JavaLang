/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javalang;

/**
 *
 * @author MEUS DOCUMENTOS
 */
public class TestaString {
    
    public static void main(String[] args){
        String s="maria";
        String x="";
        //s.replaceAll("ia","io");
        s=s.replaceAll("ia","io");
        System.out.println(s);
        
        if(s.indexOf("mar") > -1){
        System.out.println("Mar -- existe");
        System.out.println(s.trim()); //Tira espaço em branco
        System.out.println(s.length()); 
        if(!s.equals("")){
            System.out.println("Não esta vazia ");
        }
        }
        
        
    }
    
}
