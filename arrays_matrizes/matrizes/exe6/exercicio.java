package arrays_matrizes.matrizes.exe6;
/*6. Leia duas matrizes 4 x 4 e escreva uma terceira com os maiores valores de cada posição
das matrizes lidas. */

import java.util.Scanner;

public class exercicio {
    public static void main(String[] args){
        int[][] firstMatriz = new int[4][4];
        int[][] secondMatriz = new int[4][4];
        int[][] maxNumbersMatriz = new int[4][4];

        Scanner scannerIn = new Scanner(System.in);

        int matrizRowLen = firstMatriz.length;
        int matrizColLen = firstMatriz[0].length;       


        for(int i = 0; i < matrizRowLen; i++){
            for(int j = 0; j < matrizColLen; j++){
                System.out.print(String.format("Digite o número da posição [%d][%d]: ", i, j));
                firstMatriz[i][j] = scannerIn.nextInt();
            }
        }

        for(int i = 0; i < matrizRowLen; i++){
            for(int j = 0; j < matrizColLen; j++){
                System.out.print(String.format("Digite o número da posição [%d][%d]: ", i, j));
                secondMatriz[i][j] = scannerIn.nextInt();
            }
        }

        scannerIn.close();


        for(int i = 0; i < matrizRowLen; i++){
            for(int j = 0; j < matrizColLen; j++){
                if(firstMatriz[i][j] > secondMatriz[i][j]){
                    maxNumbersMatriz[i][j] = firstMatriz[i][j];
                }else{
                    maxNumbersMatriz[i][j] = secondMatriz[i][j];
                }
            }
        }


        for(int i = 0; i < matrizRowLen; i++){
            for(int j = 0; j < matrizColLen; j++){
                System.out.println(maxNumbersMatriz[i][j]);
            }
        }







    }
}
