import java.util.Scanner;

public class Pratica02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18)
            System.out.println("ja pode ser preso");
        else
            System.out.println("fundação casa");

    }
}
