/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.evva1_10_arrglo_objetoss;

/**
 *
 * @author Admin
 */
public class EVVA1_10_ARRGLO_OBJETOSS {

    public static void main(String[] args) {
        // Crear un arreglo de 3 objetos Ejemplo
        Ejemplo[] arreglo = new Ejemplo[3];

        // Llenar el arreglo con objetos Ejemplo con diferentes valores
        arreglo[0] = new Ejemplo(100);
        arreglo[1] = new Ejemplo(200);
        arreglo[2] = new Ejemplo(300);

        // Imprimir los valores usando el método mostrar()
        System.out.println("Valores del arreglo:");
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i].mostrar();
        }

        // Modificar un valor
        arreglo[1].setVal(500);
        System.out.println("\nDespués de modificar el segundo objeto:");
        for (Ejemplo e : arreglo) {
            e.mostrar();
        }
    }

    // Clase interna estática para poder usarla en main
    static class Ejemplo {
        private int val;  // atributo privado

        // Constructor
        public Ejemplo(int val) {
            this.val = val;
        }

        // Método para mostrar el valor
        public void mostrar() {
            System.out.println("Valor: " + val);
        }

        // Método para cambiar el valor
        public void setVal(int val) {
            this.val = val;
        }

        // Método para obtener el valor (opcional)
        public int getVal() {
            return val;
        }
    }
}

