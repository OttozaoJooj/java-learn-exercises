package exe2;
/*Imprima a soma de 1 até 1000.*/
public class exercicio {
    public static void main(String[] args){

        int start = 1, end = 1000, sum = 0;

        for(int i = start; i <= end; i++ ){
            sum += i;
        }
        System.out.println("Soma do Intervalo de 1 a 1000 é " + sum);
    }
}
