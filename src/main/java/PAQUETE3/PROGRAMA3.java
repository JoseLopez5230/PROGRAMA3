/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package PAQUETE3;


public class PROGRAMA3 {
    public static void main(String[] args) {
        int M = 6;
        int T = 1;
        int K = -10;

        boolean valor1 = M > T;            // En este escenario vamos a construir el
        boolean valor2 = T / K == -5;       // cuerpo general del programa
        boolean valor3 = (M + T == 7) || (M - T == 5);

        System.out.println("M > T: " + valor1);     // En el consiguiente mostramos los resultados
        System.out.println("T / K == -5: " + valor2);  // en la consola, diferenciando si es verdadero o falso
        System.out.println("(M + T == 7) || (M - T == 5): " + valor3);
    }
}
