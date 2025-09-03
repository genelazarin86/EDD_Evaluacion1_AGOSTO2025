/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eeva1_14_factorial;

/**
 *
 * @author Admin
 */
public class EEVA1_14_FACTORIAL {

    public static void main(String[] args) {
        System.out.println("factorial de 5 ="+ factorial(5));
        
        
    }
    public static int factorial(int val){
    if(val==0)
        return 1;
    else 
        return val * factorial(val-1);
    }
}
