package exe3;
/*Imprima todos os múltiplos de 3, entre 1 e 100. */
public class exercicio {
    public static void main(String[] args){
        int start = 1;
        int end = 100;

        for(int i = start; i <= end; i++){
            if (i % 3 == 0){
                System.out.println(i + "é um número múltiplo de 3");
            }
        }
    }
}
