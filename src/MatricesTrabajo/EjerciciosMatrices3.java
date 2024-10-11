
package MatricesTrabajo;

import java.util.Scanner;
import java.util.Arrays;

public class EjerciciosMatrices3 {
    
    public static void main(String[] args) {
        /* Ejercicio 14 */
        Scanner scanner = new Scanner(System.in);      
        int[][] matriz = new int[5][5];
        int[][] nueva = new int[5][5];
        int contador = 0;
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Ingresa números a la matriz: ");
                matriz[i][j] = scanner.nextInt();
                
                if(matriz[i][j] > 99){
                    contador +=1;
                    nueva[i][j] = matriz[i][j];
                } 
            }
        }
        System.out.println("Numeros con más de 3 digitos: " + contador);
        System.out.println(Arrays.deepToString(nueva));
        
    }
}
