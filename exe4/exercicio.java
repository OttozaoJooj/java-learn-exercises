package exe4;
/*Imprima os fatoriais de 1 a 10. */
public class exercicio {
    public static void main(String[] args){

        int fatorial = 1, fatorialEnd = 10;
        
        for(int i = 2; i <= fatorialEnd; i++ ){
            fatorial *= i;
        }
        System.out.println("10! é " + fatorial);


    }

   
    
}
