package arrays_matrizes.arrays.exe2;
import java.util.ArrayList;
import java.util.Scanner;
/*Faça um programa que leia um vetor de 8 posições e, em seguida, leia também dois va-
lores X e Y quaisquer correspondentes a duas posições no vetor. Ao final seu programa
deverá escrever a soma dos valores encontrados nas respectivas posições X e Y . */

/*OBS:
 * Para Preencher um array, basta usar, quando declara, Collections.nCopies(vezes, elemento);
 * 
 */

public class exercicio {
    public static void main(String[] args){
        Scanner iptScanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        int numbersLen = 8;

        for(int i = 0; i < numbersLen; i++){

            System.out.print("Digite um número:");
            numbers.add(iptScanner.nextInt());
        }

        
        System.out.print("Selecione um número: ");
        int firstIndexSelected = iptScanner.nextInt() - 1;

        System.out.print("Selecione mais um número: ");
        int secondIndexSelected = iptScanner.nextInt() - 1;

        iptScanner.close();

        int sumNumbersSelected = numbers.get(firstIndexSelected) + numbers.get(secondIndexSelected);

        System.out.println(String.format("A soma dos números selecionados dá %d", sumNumbersSelected));

    }
}
