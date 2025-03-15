package arrays_matrizes.matrizes.exe1;

import java.util.Scanner;

/*1. Leia uma matriz 4 x 4, conte e escreva quantos valores maiores que 10 ela possui. */

public class exercicio {
    public static void main(String[] args){

        int[][] matriz = new int[4][4];

        Scanner scannerIn = new Scanner(System.in);

        int matrizRowLen = matriz.length;
        int matrizColLen = matriz[0].length;
        int countGTTen = 0;


        for(int i = 0; i < matrizRowLen; i++){
            for(int j = 0; j < matrizColLen; j++){
                System.out.print(String.format("Digite o número da posição [%d][%d]: ", i, j));
                matriz[i][j] = scannerIn.nextInt();
            }
        }

        scannerIn.close();

        for(int i = 0; i < matrizRowLen; i++){
            for(int j = 0; j < matrizColLen; j++){

                if(matriz[i][j] >= 10){ countGTTen++; }
                
            }
        }

        for(int i = 0; i < matrizRowLen; i++){
            for(int j = 0; j < matrizColLen; j++){
                
                System.out.print(String.format("[%d] ", matriz[i][j]));
            }
            System.out.println();
        }

        System.out.println(String.format("Essa matriz tem %d números maiores do que 10.", countGTTen));

        
        
    }
}
