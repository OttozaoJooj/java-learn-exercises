package exe5;

public class exercicio2 {
/*série de Fibonacci (RECURSIVO)*/


    public static long fibonacciLimmit = 2000000000000000000l;

    public static long fibonacciRecursive(long start, long end){
    
        long sum = start + end;
        if(sum > fibonacciLimmit){return 555;}

        System.out.println(fibonacciRecursive(end, sum));

        return sum;
        

    }
    public static void main(String[] args){
        System.out.println(fibonacciRecursive(0, 1));
    }
}
