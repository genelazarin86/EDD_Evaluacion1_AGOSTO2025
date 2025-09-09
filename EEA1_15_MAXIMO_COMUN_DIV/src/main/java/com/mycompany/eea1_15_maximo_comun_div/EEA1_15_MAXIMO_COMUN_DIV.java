/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eea1_15_maximo_comun_div;

/**
 *
 * @author Admin
 */
public class EEA1_15_MAXIMO_COMUN_DIV {

    public static void main(String[] args) {
        System.out.println("" + mcd(180,48));
    }
    public static int mcd(int dividiendo, int divisor){
    
        int residuo = dividiendo % divisor;
        if(residuo ==0)
            return divisor;
        else
        return mcd(divisor,residuo);
    }
}
