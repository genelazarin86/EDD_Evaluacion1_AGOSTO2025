/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eeva1_16_fibonacci;

/**
 *
 * @author Admin
 */
public class EEVA1_16_FIBONACCI {

    public static void main(String[] args) {
        System.out.println("fibonacci (6) = "+ fibonacci(6));
    }
    public static int fibonacci(int posi){
 
        
        if (posi <= 1)
        return posi;
        else
          return  fibonacci(posi-1) + fibonacci(posi -2);
        
        
    }
}


