package arrays_matrizes.exe1;

import java.util.ArrayList;
import java.util.Iterator;

/*Ler um conjunto de n ´umeros reais, armazenando-o em vetor e calcular o quadrado das
componentes deste vetor, armazenando o resultado em outro vetor. Os conjuntos t ˆem
10 elementos cada. Imprimir todos os conjuntos. */

public class exercicio {
    public static void main(String[] args){
        /* Declaração do array de arrays */
        ArrayList<ArrayList<Float>>  numbers = new ArrayList<ArrayList<Float>>(3);

        ArrayList<ArrayList<Float>>  numbersSquare = new ArrayList<ArrayList<Float>>(3);


        /*Criar os arrays */

        ArrayList<Float> array1 = new ArrayList<Float>();
        array1.add(2.5f);
        array1.add(6.5f);
        array1.add(3.5f);
        array1.add(2.0f);
        array1.add(3.5f);


        ArrayList<Float> array2 = new ArrayList<Float>();
        array2.add(2.5f);
        array2.add(6.5f);
        array2.add(3.5f);
        array2.add(2.0f);
        array2.add(3.5f);


        ArrayList<Float> array3 = new ArrayList<Float>();
        array3.add(2.5f);
        array3.add(6.5f);
        array3.add(3.5f);
        array3.add(2.0f);
        array3.add(50f);
        

        numbers.add(array1);
        numbers.add(array2);
        numbers.add(array3);


        Iterator<ArrayList<Float>> itNumbers = numbers.iterator();

        itNumbers.forEachRemaining((arrayNumbers) -> {

            ArrayList<Float> newArrayNumbersSquare = new ArrayList<Float>();
            for(Float number : arrayNumbers){
                newArrayNumbersSquare.add(number * number);
            }
            numbersSquare.add(newArrayNumbersSquare);
            
        });

        Iterator<ArrayList<Float>> itNumbersSquare = numbersSquare.iterator();

        System.out.println("Números ao quadrado.");

        while(itNumbersSquare.hasNext()){
            System.out.println(itNumbersSquare.next());
        }

       
    }
}
