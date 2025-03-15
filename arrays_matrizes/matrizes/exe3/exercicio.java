package arrays_matrizes.matrizes.exe3;
/*3. Faça um programa que preenche uma matriz 4 x 4 com o produto do valor da linha e da
coluna de cada elemento. Em seguida, imprima na tela a matriz. */
public class exercicio {
    public static void main(String[] args){
        int[][] matriz = new int[4][4];
        int matrizRowLen = matriz.length;
        int matrizColLen = matriz[0].length;

        for(int i = 0; i < matrizRowLen; i++){
            for(int j = 0; j < matrizColLen; j++){
                matriz[i][j] = i*j;
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
