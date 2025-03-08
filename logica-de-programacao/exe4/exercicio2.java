package exe4;
/*Imprima os fatoriais de 1 a 10. (RECURSIVIDADE) */
public class exercicio2 {
    
    public static long fatorial(long x){
        if(x == 0){
            return 1;
        }else{
            return x * fatorial(x - 1);
        }
    }

    public static void main(String[] args){
        System.out.println(fatorial(10));
    }
}
