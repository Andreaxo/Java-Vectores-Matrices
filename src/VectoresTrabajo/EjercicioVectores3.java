/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VectoresTrabajo;

import java.util.Scanner;
import java.util.Arrays;

/**
 * @author María Andrea Alzate
 */
public class EjercicioVectores3 {
    /* Ejercicio 40. */
       public static void main(String[] args) {
       
       Scanner entrada = new Scanner (System.in);
           
       int[] vector = new int[4];
       int[] digitosFinales = new int[4];
       
           for (int i = 0; i < vector.length; i++) {
               System.out.println("Ingrese un número entero: - 3");
               vector[i] = entrada.nextInt();
              
           }
           
           for (int i = 0; i < vector.length; i++) {
               int ultimoDigito = vector[i];
               if(ultimoDigito == 15){
                   digitosFinales[i] = ultimoDigito;
               }
               
           }
           
           System.out.println(Arrays.toString(digitosFinales));
               
       
    }
}
