package com.mycompany.repositorio;

import java.util.Scanner;


// Subclase Doctor
class Doctor extends Persona {
    private String especialidad;
    
    // Constructor
    public Doctor(String nombre, int edad, String especialidad) {
        super(nombre, edad);
        this.especialidad = especialidad;
    }
    
    // Getter y setter para especialidad
    public String getEspecialidad() {
        return especialidad;
    }
    
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    // Implementación del método abstracto
    @Override
    public void presentarse() {
        System.out.println("Hola, soy el Dr. " + getNombre() + ", tengo " + getEdad() + " años y soy especialista en " + especialidad + ".");
    }
    
    // Método específico de Doctor
    public void realizarDiagnostico() {
        System.out.println("El Dr. " + getNombre() + " está realizando un diagnóstico.");
    }
}

