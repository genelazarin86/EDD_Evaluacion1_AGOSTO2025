/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eeva1_9_cambiar_tamano;

/**
 *
 * @author Admin
 */
public class EEVA1_9_CAMBIAR_TAMANO {

    public static void main(String[] args) {
      int[] arreglo = new int[10];
        
        // Llenar con números aleatorios
        llenar(arreglo);

        // Imprimir el arreglo original
        System.out.println("Arreglo original:");
        imprimir(arreglo);

        // Copiar el arreglo
        int[] copia = copiar(arreglo);

        // Imprimir la copia
        System.out.println("\nArreglo copia:");
        imprimir(copia);

      int[] arregloRedimensionado = cambiarTamano(arreglo, 5);
        imprimir(arregloRedimensionado);
    }

    // Método para llenar el arreglo con números aleatorios
    public static void llenar(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 100); // entre 0 y 99
        }
    }

    // Método para imprimir el arreglo
    public static void imprimir(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + "   ");
        }
        System.out.println();
    }

    // Método para copiar el arreglo
    public static int[] copiar(int[] arreglo) {
        int[] nuevo = new int[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            nuevo[i] = arreglo[i];
        }
        return nuevo;
    }
    
     public static int[] cambiarTamano(int[] arreglo, int nuevoTam) {
        int[] nuevo = new int[nuevoTam];
        int n = Math.min(arreglo.length, nuevoTam); 
        for (int i = 0; i < n; i++) {
            nuevo[i] = arreglo[i];
        }
        return nuevo;
}
}