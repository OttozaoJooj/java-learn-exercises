package arrays_matrizes.arrays.exe7;


import java.util.ArrayList;
import java.util.Scanner;

/*Crie um programa que lê 6 valores inteiros pares e, em seguida, mostre na tela os valores
lidos na ordem inversa. */

public class exercicio {
     public static void main(String args[]){
        ArrayList<Integer> numbers = new ArrayList<Integer>(6);
        Scanner scannerIn = new Scanner(System.in);

        final int numbersLen = 6;
        int numberIn;

        for(int i = 0; i < numbersLen; i++){
            do{
                System.out.print(String.format("Digite o %dº número: ", i + 1));
                numberIn = scannerIn.nextInt();

            } while(numberIn % 2 != 0);

            numbers.add(numberIn);
        }

        scannerIn.close();

        for(int i = numbersLen - 1; i >= 0; i--){
            System.out.println(numbers.get(i));
        }


    }
}
