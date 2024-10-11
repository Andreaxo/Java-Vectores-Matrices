/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VectoresTrabajo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author María Andrea Alzate
 */
public class EjercicioVectores2 {
    /* Ejercicio 2. */
    public static void main(String[] args) {
      Scanner entrada = new Scanner (System.in);
      int[] vector = new int[10];
      
      
      // Guardar los datos
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese un número entero: ");
            vector[i] = entrada.nextInt();
        }
        
        // Sumar los dígitos pares de cada número
        for (int i = 0; i < vector.length; i++) {
            int numero = vector[i];  // Obtener el número del vector
            int suma = 0;  // Variable para almacenar la suma de los dígitos pares

            // Extraer y procesar cada dígito del número
            while (numero > 0) {
                int digito = numero % 10;  // Obtiene el último dígito
                if (digito % 2 == 0) {  // Verifica si el dígito es par
                    suma += digito;  // Sumar el dígito par
                }
                numero /= 10;  // Elimina el último dígito
            }
            
        System.out.println("Suma de digitos: " + Arrays.toString(vector) + " es: " + suma);

    }
        
}
}
