/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package VectoresTrabajo;
import java.util.Scanner;
import java.util.Arrays;

/**
 * @author María Andrea Alzate
 */

public class EjerciciosVectores1 {

    /* Ejercicio 1 */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int[] vector = new int[10];
        int[] vectorUltimoDigito = new int[10];

        System.out.println("Ingresa un número para comparar");
        int entero = entrada.nextInt();
        
        // Entrada de datos
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese un número entero: ");
           vector[i] = entrada.nextInt();
        }
        

        // Iteración para ultimo digito
        for (int i = 0; i < vector.length; i++) {
            int ultimoDigito = vector[i]%10;
            if(ultimoDigito == entero){
                vectorUltimoDigito[i] = ultimoDigito;
            }
        }
        
        System.out.println("El vector inicialmente: " + Arrays.toString(vector));
        System.out.println("El vector con los ultimos digitos son: " + Arrays.toString(vectorUltimoDigito));
            
    }
    
}
