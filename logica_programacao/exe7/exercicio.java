package exe7;
/*(Opcional) Imprima a seguinte tabela usando for s encadeados:
1
2 4
3 6 9
4 8 12 16
n n*2 n*3 .... n*n
 */
public interface exercicio {
    public static void main(String[] args){
        

        for(int count = 1; count <= 50; count++){
            int limitNumOfLine = count * count;
            for(int num = count; num <= limitNumOfLine; num += count){
                System.out.print(num + " ");
            }
            System.out.println("");

        }

    }
}
