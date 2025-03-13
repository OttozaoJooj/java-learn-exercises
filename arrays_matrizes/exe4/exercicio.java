package arrays_matrizes.exe4;
/*Faça um programa que receba do usuário um vetor com 10 posições. Em seguida deverá
ser impresso o maior e o menor elemento do vetor. */

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>(10);
        Scanner scannerIn = new Scanner(System.in);

        int numbersLen = 10;
        int maxNumber = 0;
        int minNumber = 0;

        for(int i = 0; i < numbersLen; i++){
            System.out.println("Digite um número: ");
            numbers.add(scannerIn.nextInt());
                    
        }

        scannerIn.close();

        for(int i = 0; i < numbersLen; i++){
            if(i == 0){
                maxNumber = numbers.get(0);
                minNumber = numbers.get(0);

            } else if(numbers.get(i) > maxNumber){
                maxNumber = numbers.get(i);

            } else if(numbers.get(i) < minNumber){
                minNumber = numbers.get(i);
            } else{
                continue;
            }
        }

        System.out.println(String.format("Maior número: %d", maxNumber));
        System.out.println(String.format("Menor número: %d", minNumber));




        
    }
}
