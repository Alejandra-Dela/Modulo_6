package com.mycompany.repositorio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese los datos del Doctor:");
        System.out.print("Nombre: ");
        String nombreDoctor = scanner.nextLine();
        System.out.print("Edad: ");
        int edadDoctor = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Especialidad: ");
        String especialidadDoctor = scanner.nextLine();
        
        Doctor doctor = new Doctor(nombreDoctor, edadDoctor, especialidadDoctor);
        
        System.out.println("\nIngrese los datos del Deportista:");
        System.out.print("Nombre: ");
        String nombreDeportista = scanner.nextLine();
        System.out.print("Edad: ");
        int edadDeportista = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Deporte: ");
        String deporteDeportista = scanner.nextLine();
        
        Deportista deportista = new Deportista(nombreDeportista, edadDeportista, deporteDeportista);
        
        System.out.println("\nInformación ingresada:");
        doctor.presentarse();
        doctor.realizarDiagnostico();
        
        deportista.presentarse();
        deportista.entrenar();
        
        scanner.close();
    }
}