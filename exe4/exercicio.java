package exe4;
/*Imprima os fatoriais de 1 a 10. */
public class exercicio {
    public static void main(String[] args){
        int fatorialEnd = 6, fatorial = 1;

        for(int i = 2; i <= fatorialEnd; i++ ){
            fatorial *= i;
        }
        System.out.println("10! é " + fatorial);



    }

// FAZER O EXERCÍCIO USANDO RECURSIVIDADE.
/*
    public int fatorial(int x){

    }
    */
}
