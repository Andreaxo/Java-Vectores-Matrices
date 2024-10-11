
package MatricesTrabajo;

import java.util.Arrays;
import java.util.Scanner;
import java.util.HashSet;

public class EjerciciosMatrices5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[][] matrizA = new int[4][5];
        int[][] matrizB = new int[4][5];
        
        //Ingreso de datos de la matriz A - B.
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Ingresa en matriz A: ");
                matrizA[i][j] = scanner.nextInt();

                System.out.println("Ingresa en matriz B: ");
                matrizB[i][j] = scanner.nextInt();
            }
        }
        int contador = 0;
        
        // Revisión de datos
        /*
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                if(matrizA[i][j] == matrizB[i][j]){
                    datos[i][j] = matrizA[i][j];
                    
                    
            }
            }
        } */
        
        //Juntar datos revisión más completa
        HashSet<Integer> elementosComunes = new HashSet<>();
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                elementosComunes.add(matrizA[i][j]);
                
                // Se revisa porque se guarda la matriz A y se saca la B
                if(elementosComunes.contains(matrizB[i][j])){
                    contador++;
                }
            }
        }
        
        System.out.println("Numeros similares en las matrices: " + contador);

    }
}
