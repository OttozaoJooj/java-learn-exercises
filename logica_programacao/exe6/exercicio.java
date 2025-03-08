package exe6;

public class exercicio {
/*Escreva um programa em que, dada uma variável x com algum valor inteiro, temos um novo x de acordo com a seguinte regra:
        Se x é par, x = x / 2 ;
        Se x é impar, x = 3 * x + 1 ;
        Imprime x ;

    programa deve parar quando x tiver o valor final de 1.
*/

    public static void main(String[] args){
        int x = 745699;
        do{
            System.out.println(x);
            if(x % 2 == 0){
                x /= 2;

            }else{
                x = x * 3 + 1;

            }
            
        }while(x > 1);
        

    }
    
}
