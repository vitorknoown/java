import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Arraydeinteiros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de numeros:");
        int n = scanner.nextInt();

        Integer[] numeros = new Integer[n];

        System.out.println("--------------------------------");
        System.out.println("Digite " + n + " Numeros Inteiros");
        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextInt();
        }

        System.out.println("--------------------------------");

        // buscar array
        System.out.println("Digite um numero para buscar");
        int busca = scanner.nextInt();

        boolean encontrado = false;

        for (Integer num : numeros){
            if (num != null && num == busca){
            encontrado = true;
            break;
        }
        }
        // booleaano; true : false
        System.out.println(
                encontrado ? "O numero " + busca + " Foi encontrado com sucesso" :
                        "O numero " + busca + " Não Foi encontrado no array"

        );


        System.out.println("--------------------------------");
        // remoção
        System.out.println("Digite um numero para ser removido");
        int remover = scanner.nextInt();

        for (int i = 0; i< numeros.length; i++) {
            if (numeros[i] != null && numeros[i] == remover) {
                numeros[i] = null;
                break;
            }
        }
        System.out.println("Array apos a remoção " + Arrays.toString(numeros));

        System.out.println("--------------------------------");


        // ORDENAÇÃO
        Arrays.sort(numeros,(a, b) ->{
        if (a == null ) return 1;
        if(b == null) return -1;
        return a -b;
        });

        System.out.println("Array ordenado " + Arrays.toString(numeros));
    }

}
