package arrays_matrizes.matrizes.exe4;

import java.util.Scanner;

/*4. Leia uma matriz 4 x 4, imprima a matriz e retorne a localização (linha e a coluna) do
maior valor. */
public class exercicio {
    public static void main(String[] args){
        int[][] matriz = new int[4][4];

        Scanner scannerIn = new Scanner(System.in);

        int matrizRowLen = matriz.length;
        int matrizColLen = matriz[0].length;
        int maxNumber = 0;
        int maxNumberRow = 0;
        int maxNumberCol = 0;

    

        

        for(int i = 0; i < matrizRowLen; i++){
            for(int j = 0; j < matrizColLen; j++){
                System.out.print(String.format("Digite o número da posição [%d][%d]: ", i, j));
                matriz[i][j] = scannerIn.nextInt();
            }
        }

        scannerIn.close();

        maxNumber = matriz[0][0];

        for(int i = 0; i < matrizRowLen; i++){
            for(int j = 0; j < matrizColLen; j++){
                if(matriz[i][j] > maxNumber){ 
                    maxNumber = matriz[i][j]; 
                    maxNumberRow = i;
                    maxNumberCol = j;
                }
            }
           
        }



        for(int i = 0; i < matrizRowLen; i++){
            for(int j = 0; j < matrizColLen; j++){
                
                System.out.print(String.format("[%d] ", matriz[i][j]));
            }
            System.out.println();
        }

        System.out.println(String.format("O maior número da matriz é %d e está na linha %d e na coluna %d", maxNumber, maxNumberRow, maxNumberCol));
    }
}
