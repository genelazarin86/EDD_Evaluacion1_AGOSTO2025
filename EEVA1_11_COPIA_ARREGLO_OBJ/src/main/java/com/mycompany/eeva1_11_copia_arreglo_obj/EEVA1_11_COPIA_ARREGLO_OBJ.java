/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eeva1_11_copia_arreglo_obj;

/**
 *
 * @author Admin
 */
public class EEVA1_11_COPIA_ARREGLO_OBJ {

    public static void main(String[] args) {
       Persona[] arreglo= new Persona[2]; 
       
       arreglo[0]= new Persona ("kerry", "caverga");
       arreglo[1]= new Persona("juanito" ,"loco");
       
    }
}
class Persona{
private String nombre;
private String apellido;


public Persona (String nombre,String apellido){
    this.nombre = nombre;
        this.apellido = apellido;


}
}
