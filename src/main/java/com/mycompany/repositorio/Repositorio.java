/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.repositorio;

/**
 *
 * @author Alejandra
 */
public class Repositorio {
class Doctor extends Persona {
    private String especialidad;
    
 
    public Doctor(String nombre, int edad, String especialidad) {
        super(nombre, edad);
        this.especialidad = especialidad;
    }
    
   
    public String getEspecialidad() {
        return especialidad;
    }
    
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
  
    public void presentarse() {
        System.out.println("Hola, soy el Dr. " + getNombre() + ", tengo " + getEdad() + " años y soy especialista en " + especialidad + ".");
    }
    
    
    public void realizarDiagnostico() {
        System.out.println("El Dr. " + getNombre() + " está realizando un diagnóstico.");
    }
}