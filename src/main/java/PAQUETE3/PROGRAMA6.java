/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PAQUETE3;

/**
 *
 * @author PC
 */
public class PROGRAMA6 {
    public static void main(String[] args) {
        Object[][] estudiantes = {
            {"Alexandra", 89},
            {"Miguel", 97},
            {"Helin", 63},
            {"Nelson", 64},
            {"Iris", 99}
        };

        System.out.println("Calificacion del estudiante:");
        for (int i = 0; i < estudiantes.length; i++) {
            String nombre = (String) estudiantes[i][0];
            int nota = (int) estudiantes[i][1];
            String estado = nota >= 65 ? "Aprobado" : "Reprobado";

            System.out.println("Nombre: " + nombre);
            System.out.println("Nota: " + nota);
            System.out.println(estado);
            System.out.println(); // Nuevamente dejamos una linea de codigo para hacer
        }                         // un espacio en blanco.
    }
}