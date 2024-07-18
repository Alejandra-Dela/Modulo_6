package com.mycompany.repositorio;

import com.mycompany.repositorio.Persona;

// Subclase Deportista
class Deportista extends Persona {
    private String deporte;
    
    // Constructor
    public Deportista(String nombre, int edad, String deporte) {
        super(nombre, edad);
        this.deporte = deporte;
    }
    
    // Getter y setter para deporte
    public String getDeporte() {
        return deporte;
    }
    
    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }
    
    // Implementación del método abstracto
    @Override
    public void presentarse() {
        System.out.println("Hola, soy " + getNombre() + ", tengo " + getEdad() + " años y soy deportista profesional de " + deporte + ".");
    }
    
    // Método específico de Deportista
    public void entrenar() {
        System.out.println(getNombre() + " está entrenando " + deporte + ".");
    }
}

