package exe5;

public class exercicio {

    
/*série de Fibonacci */

    public static int fibonacciNum[] = {0, 1};

    public static int[] arrayPush(int length, int[] array, int element){
        int newArray[] = new int[length + 1];
        
        for(int i = 0; i < array.length; i++){
            newArray[i] = array[i];

        }

        newArray[newArray.length - 1] = element;

        return newArray;

    }

    public static void fibonacci(int z){

        int sumNum = 0;
        while (true) {
            sumNum = fibonacciNum[fibonacciNum.length - 2] + fibonacciNum[fibonacciNum.length - 1];
            if (sumNum < 100){
                fibonacciNum = arrayPush(fibonacciNum.length, fibonacciNum, sumNum);
            } else{
                break;
            }
            
        }
            

  
    }


    public static void main(String[] args){

        fibonacci(1000);
        for(int i : fibonacciNum){
            System.out.println(i);
        }
    

   
        
    }
}
