
package MatricesTrabajo;

import java.util.Scanner;
import java.util.Arrays;

public class EjerciciosMatrices4 {
    /* Ejercicio 16*/
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[5][4];
        int[][] nueva = new int[5][4];
        int contador = 0;
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Ingrese un número: ");
                matriz[i][j] = scanner.nextInt();
                
                if(matriz[i][j] >= 0 && matriz[i][j] <=9){
                    contador +=1;
                    nueva[i][j] = matriz[i][j];
                }
            }
        }
        
        System.out.println("Numeros de un solo digito " + contador);
        System.out.println(Arrays.deepToString(nueva));
    }
}
