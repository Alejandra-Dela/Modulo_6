package com.mycompany.repositorio;

import java.util.Scanner;


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
    
    @Override
    public void presentarse() {
        System.out.println("Hola, soy el Dr. " + getNombre() + ", tengo " + getEdad() + " años y soy especialista en " + especialidad + ".");
    }
     
    public void realizarDiagnostico() {
        System.out.println("El Dr. " + getNombre() + " está realizando un diagnóstico.");
    }
}
