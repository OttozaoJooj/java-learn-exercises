package arrays_matrizes.arrays.exe6;


import java.util.ArrayList;
import java.util.Scanner;
//import java.util.List;
/*Crie um programa que lê 6 valores inteiros e, em seguida, mostre na tela os valores lidos
na ordem inversa. */
public class exercicio {
    public static void main(String args[]){
        ArrayList<Integer> numbers = new ArrayList<Integer>(6);
        Scanner scannerIn = new Scanner(System.in);

        int numbersLen = 6;

        for(int i = 0; i < numbersLen; i++){
            System.out.print("Digite um número: ");
            numbers.add(scannerIn.nextInt());
        }

        scannerIn.close();

        for(int i = 1; i <= numbersLen; i++){
            System.out.println(numbers.get(numbersLen - i));
        }


        /*
        for(int i = numbersLen - 1; i >= 0; i--){
            System.out.println(numbers.get(i));
            
        }
        */

        /*
        List<Integer> numbersReversed = numbers.reversed();

        for (Integer number : numbersReversed) {
            System.out.println(number);            
        }
        */


    }
}
