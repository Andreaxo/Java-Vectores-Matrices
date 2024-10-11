
package VectoresTrabajo;

import java.util.Scanner;
import java.util.Arrays;



public class EjercicioVectores4 {
    /* Ejercicio 41*/
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        
        int[] vector = new int[10];
        
        int[] primero = new int[10];
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingresa un número para el vector");
            vector[i] = scanner.nextInt();
            
        }
        
        for (int i = 0; i < vector.length; i++) {
          int digito = vector[i];
          int primerDigito = digito;
            while(primerDigito >= 10){
                primerDigito /= 10;
                
             if(primerDigito==3 || primerDigito == 3){
                 primero[i] = primerDigito;
             }
            }
    }
        System.out.println("Vector completo: " + Arrays.toString(vector));
        System.out.println("Digitos de 3: " + Arrays.toString(primero));
}
}