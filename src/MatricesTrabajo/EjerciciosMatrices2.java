
package MatricesTrabajo;

import java.util.Arrays;
import java.util.Scanner;
    

public class EjerciciosMatrices2 {
    /* Ejercicio 17*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[][] matriz = new int[5][4];
        
        // Ingreso de datos
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Ingresa un número: ");
                matriz[i][j] = scanner.nextInt();
                
            }
        }
        
        int[][] nueva = new int[5][4];
        // Revision de datos
   
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if(matriz[i][j]%5 == 0){
                    nueva[i][j] = matriz[i][j];
                }
            }
        }
        
        System.out.println(Arrays.deepToString(nueva));
    }
}
