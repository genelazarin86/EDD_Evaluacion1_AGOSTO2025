/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eeva1_13_falso_for;

/**
 *
 * @author Admin
 */
public class EEVA1_13_FALSO_FOR {

    public static void main(String[] args) {
        falsoFor(5);
        System.out.println("");
        falsoForUp(10,1);
    }
    public static void falsoFor(int val){
        System.out.println(val+" - " );
        if(val > 1)
        //resolver un problema
        falsoFor(val- 1);// llamarse  a si mismo
        //debemos detenr la recursividad
        
    }
    public static void falsoForUp(int valor,int valINI){
        System.out.println( valor + "-");
        if(valINI<valor)
            
    falsoForUp(valor , valINI+1);
    }
}

