package com.mycompany.repositorio;

import com.mycompany.repositorio.Persona;

class Deportista extends Persona {
    private String deporte;
    
    public Deportista(String nombre, int edad, String deporte) {
        super(nombre, edad);
        this.deporte = deporte;
    }
    
    public String getDeporte() {
        return deporte;
    }
    
    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }
    
    @Override
    public void presentarse() {
        System.out.println("Hola, soy " + getNombre() + ", tengo " + getEdad() + " años y soy deportista profesional de " + deporte + ".");
    }
    
    public void entrenar() {
        System.out.println(getNombre() + " está entrenando " + deporte + ".");
    }
}

