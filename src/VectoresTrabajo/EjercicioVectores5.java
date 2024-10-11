
package VectoresTrabajo;

import java.util.Scanner;
import java.util.Arrays;

public class EjercicioVectores5 {
    /* Ejercicio 37. */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int[] vector = new int[10];
        int[] cuadrado = new int[10];
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese un dato:");
            vector[i] = scanner.nextInt();
            
            cuadrado[i] = vector[i] * vector[i];
           
        }
        
        System.out.println("Vector completo: " + Arrays.toString(vector));
        System.out.println("Vector cuadrado: " + Arrays.toString(cuadrado));
    }
}
