/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MatricesTrabajo;

import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author María Andrea Alzate
 */
public class EjerciciosMatrices1 {
    /* Ejercicio 1 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[][] matriz = new int[4][4];
        
        // Ingresar datos
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Ingresa un numero: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        int maximo = matriz[0][0];
        int filaMax = 0;
        int columnaMax = 0;
        
        // Revisar datos.
               for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] > maximo) {
       
                    maximo = matriz[i][j];
                    filaMax = i;
                    columnaMax = j;
                }
            }
        }
        
        System.out.println(Arrays.deepToString(matriz));
         System.out.println("El número mayor es " + maximo + " y se encuentra en la fila " + filaMax + " y columna " + columnaMax);
    }
}
