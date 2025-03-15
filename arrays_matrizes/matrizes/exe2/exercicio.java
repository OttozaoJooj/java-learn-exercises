package arrays_matrizes.matrizes.exe2;

/*2. Declare uma matriz 5 x 5. Preencha com 1 a diagonal principal e com 0 os demais
elementos. Escreva ao final a matriz obtida. */

public class exercicio {
    public static void main(String[] args){
        int[][] matriz = new int[5][5];
        int matrizRowLen = matriz.length;
        int matrizColLen = matriz[0].length;

        for(int i = 0; i < matrizRowLen; i++){
            for(int j = 0; j < matrizColLen; j++){
                if(i == j){
                    matriz[i][j] = 1;
                }
            }
        }


        for(int i = 0; i < matrizRowLen; i++){
            for(int j = 0; j < matrizColLen; j++){
                
                System.out.print(String.format("[%d] ", matriz[i][j]));
            }
            System.out.println();
        }

    }
}
