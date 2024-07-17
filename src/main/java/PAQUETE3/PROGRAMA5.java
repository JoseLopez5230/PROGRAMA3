/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PAQUETE3;

/**
 *
 * @author PC
 */
public class PROGRAMA5 {
    public static void main(String[] args) {
        // Crear un arreglo multidimensional para guardar datos personales
        String[][] compañeros = {
            {"Rudy", "Rodriguez", "Electronica", "Gildan"},
            {"Jose", "Lopez", "Medicina", "Empire"},
            {"Oscar", "Maradiaga", "Industrial", "BancoOccidente"},
            {"Yoeli", "Aguilar", "Mecatronica", "Dinant"},
            {"Any", "Sarmiento", "Computacion", "ICCSE"}
        };

       System.out.println("Datos personales de compañeros de clase:");
for (int i = 0; i < compañeros.length; i++) {
    System.out.println("Nombre: " + compañeros[i][0]);
    System.out.println("Apellido: " + compañeros[i][1]);
    System.out.println("Carrera: " + compañeros[i][2]);
    System.out.println("Lugar de Trabajo: " + compañeros[i][3]);
    System.out.println();           // Esta linea nos ayudara como espacio en blanco. 
}

    }
}

