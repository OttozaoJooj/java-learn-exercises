package arrays_matrizes.matrizes.exe5;

import java.util.Scanner;
/*5. Leia uma matriz 5 x 5. Leia também um valor X. O programa deverá fazer uma busca
desse valor na matriz e, ao final, escrever a localização (linha e coluna) ou uma mensa-
gem de “não encontrado”. */
public class exercicio {


     public static void main(String[] args){
        int[][] matriz = new int[4][4];

        Scanner scannerIn = new Scanner(System.in);

        int matrizRowLen = matriz.length;
        int matrizColLen = matriz[0].length;
        int valueToSearch = 0;
        Integer valueX = null;
        Integer valueY = null;

        


        for(int i = 0; i < matrizRowLen; i++){
            for(int j = 0; j < matrizColLen; j++){
                System.out.print(String.format("Digite o número da posição [%d][%d]: ", i, j));
                matriz[i][j] = scannerIn.nextInt();
            }
        }

        System.out.println();
        System.out.print("Qual valor deseja encontrar? ");
        valueToSearch = scannerIn.nextInt();


        scannerIn.close();

        for(int i = 0; i < matrizRowLen; i++){
            for(int j = 0; j < matrizColLen; j++){
                
                System.out.print(String.format("[%d] ", matriz[i][j]));
            }
            System.out.println();
        }

        /* --- Label ---
         * MARCA O LOOP PARA FAZER UM BREAK DENTRO DE UM LOOP ANINHADO.
         * 
         */
        loop: for(int i = 0; i < matrizRowLen; i++){
            for(int j = 0; j < matrizColLen; j++){
                if(matriz[i][j] == valueToSearch){
                    valueX = i;
                    valueY = j;
                    break loop;
                
                }
            }
           
        }


        if (valueX != null || valueY != null){
            System.out.println(String.format("O número %d está na posição [%d] [%d]", valueToSearch, valueX, valueY));

        } else{
            System.out.println("Valor não encontrado.");
        }

    }
}
