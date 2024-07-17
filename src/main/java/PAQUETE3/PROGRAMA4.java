/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PAQUETE3;

/**
 *
 * @author PC
 */
public class PROGRAMA4 {
    public static void main(String[] args) {
        String[] nombres = new String[10]; // Primero declaramos una variable 
                                           // que almacene 10 arreglos

        // Asignar nombres al arreglo
        nombres[0] = "Jose";
        nombres[1] = "Astrid";
        nombres[2] = "Rosell";
        nombres[3] = "Jareth";
        nombres[4] = "Edgardo";
        nombres[5] = "Lohany";
        nombres[6] = "Evelio";
        nombres[7] = "Lohana";
        nombres[8] = "Maribel";
        nombres[9] = "Rudy";

        System.out.println("Nombres de amigos de clase:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
    }
}
