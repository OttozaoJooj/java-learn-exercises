package arrays_matrizes.matrizes.exe7;
/*7. Gerar e imprimir uma matriz de tamanho 10 x 10, onde seus elementos são da forma:
A[i][j] = 2i + 7j − 2 se i < j;
A[i][j] = 3i2 − 1 se i = j;
A[i][j] = 4i3 − 5j 2 + 1 se i > j. */
public class exercicio {
    public static void main(String[] args){
        int[][] matriz = new int[10][10];
        
        int matrizLen = matriz.length;

        for(int i = 0; i < matrizLen; i++){
            for(int j = 0; j < matrizLen; j++){
                if(i < j){
                    matriz[i][j] = i * 2 + j * 7 - 2; // [1][2] = 14

                } else if(i == j){
                    matriz[i][j] = 3 * (i * i) - 1; // [2][2] = 11

                } else{
                    matriz[i][j] = 4 * (i * i * i) - 5 * (j * j) + 1; // [3][1] = 104
                }
            }
        }

        
        for(int i = 0; i < matrizLen; i++){
            for(int j = 0; j < matrizLen; j++){
                System.out.print(String.format("[%d] ", matriz[i][j]));
            }
            System.out.println();
        }

    }
}
