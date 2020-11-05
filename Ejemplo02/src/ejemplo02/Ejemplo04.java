/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo02;

import java.util.Scanner;

/**
 *
 * @author JEanpa
 */
public class Ejemplo04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Ingreso de datos por teclado
        // uso de la clase Scanner
       
        String nombre;
        String apellido;
        String nacimiento;
        String ciudad;
        String pais;
        
        System.out.println("Ingrese el nombre del estudiante");
        nombre = entrada.nextLine(); // nextLine: obtiene una cadena ingresada
                                    // por teclado
        System.out.println("Ingrese el apellido del estudiante");
        apellido = entrada.nextLine();
        
        System.out.println("Ingrese la fecha de nacimiento");
        nacimiento = entrada.nextLine();
        
        System.out.println("Ingrese la ciudad de nacimiento");
        ciudad = entrada.nextLine();
        
        System.out.println("Ingrese el país de nacimiento");
        pais = entrada.nextLine();
        
        System.out.printf("Datos del estudiante\n%s\n%s\n%s\n%s\n%s\n", 
                nombre,
                apellido,
                nacimiento,
                ciudad,
                pais,
    }
}
