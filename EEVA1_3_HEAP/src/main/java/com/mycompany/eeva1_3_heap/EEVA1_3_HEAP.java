/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eeva1_3_heap;

/**
 *
 * @author Admin
 */
public class EEVA1_3_HEAP {

    public static void main(String[] args) {
    
        int x = 5;
        Prueba prueba1 = new Prueba(); //referencia 
        Prueba prueba2 = new Prueba();
        System.out.println("x =" + x);
        System.out.println("prueba =" + prueba1);
        System.out.println("prueba2  =" + prueba2);
        System.out.println("prueba.valor =" + prueba1.valor);
        prueba1 = null;//rompemos el enlace
}
    public static class Prueba{
    int valor = 100;
    }
}