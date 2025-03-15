package arrays_matrizes.arrays.exe5;

/*Escreva um programa que leia 10 números inteiros e os armazene em um vetor. Imprima
o vetor, o maior elemento e a posição que ele se encontra. */

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio {
    public static void main(String args[]){
        ArrayList<Integer> numbers = new ArrayList<Integer>(10);
        Scanner scannerIn = new Scanner(System.in);

        int numbersLen = 10;
        int maxNumber = 0;


        for(int i = 0; i < numbersLen; i++){
            System.out.print("Digite um número: ");
            numbers.add(scannerIn.nextInt());
        }

        scannerIn.close();

        maxNumber = numbers.get(0);

        for (Integer number : numbers) {
            if(number > maxNumber){
                maxNumber = number;
            }

        }

        System.out.println(String.format("O maior número é %d e está na posição %d", maxNumber, numbers.indexOf(maxNumber) + 1));

    

        

        
    }
    

}
