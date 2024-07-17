/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PAQUETE3;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class PROGRAMA2 {
     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo numero entero: ");
        int num2 = scanner.nextInt();

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        double division = 0;
        int modulo = 0;

        // Verificar si el segundo número es distinto de cero para evitar la división por cero
        if (num2 != 0) {
            division = (double) num1 / num2;
            modulo = num1 % num2;
        } else {
            System.out.println("No se puede realizar la division ni el modulo por cero.");
        }

        // Imprimir los resultados
        System.out.println("Suma: " + num1 + " + " + num2 + " = " + suma);
        System.out.println("Resta: " + num1 + " - " + num2 + " = " + resta);
        System.out.println("Multiplicacion: " + num1 + " * " + num2 + " = " + multiplicacion);

        // Imprimir los resultados de la división y el módulo solo si el segundo número es distinto de cero
        if (num2 != 0) {
            System.out.println("Division: " + num1 + " / " + num2 + " = " + division);
            System.out.println("Modulo: " + num1 + " % " + num2 + " = " + modulo);
        }
    }
}
