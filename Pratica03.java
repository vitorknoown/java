import javax.swing.*;
import java.util.Scanner;

public class Pratica03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero de 1 a 3");
        int opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                System.out.println("voce escolheu maça");
                break;
            case 2:
                System.out.println("voce escolheu abacaxi");
                break;
            case 3:
                System.out.println("voce escolheu laranja");
                break;
            default:
                System.out.println("escolha invalida");

        }
    }
}
