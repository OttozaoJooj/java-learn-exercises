package arrays_matrizes.exe3;

/*Leia um vetor de 10 posições. Contar e escrever quantos valores pares ele possui. */

import java.util.ArrayList;
import java.util.Scanner;



public class exercicio {
    public static void main(String[] args ) throws InterruptedException{
        ArrayList<Integer> numbers = new ArrayList<Integer>(10);
        
        Scanner scannerIn = new Scanner(System.in);

        int numbersLen = 10;

        int countNumbersEven = 0;

        for(int i = 0; i < numbersLen; i++){
            System.out.print("Digite um número: ");
            numbers.add(scannerIn.nextInt());
            
        }

        scannerIn.close();

        //Iterator<Integer> itNumbers = numbers.iterator();

        for(Integer number : numbers){
            if(number % 2 == 0){
                countNumbersEven++;
                System.out.println(String.format("--- O número %d é par", number));
                Thread.sleep(500);

            }
        }

        System.out.println(String.format("Total de números par: %d", countNumbersEven));


        


    }
}
