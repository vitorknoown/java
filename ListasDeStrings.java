import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListasDeStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>();

        // ADICIONANDO
        System.out.println("Quantos nomes deseja adicionar");
        int qts = scanner.nextInt();
        scanner.nextLine();

        // adicionando nomes
        System.out.println("Digite os nomes: ");
        for (int i = 0; i < qts; i++){
            nomes.add(scanner.nextLine());
        }
            System.out.println("--------------------------------");



        // buscando
        System.out.println("Digite o nome que deseja buscar");
        String busca = scanner.nextLine();
        System.out.println(nomes.contains(busca) ? "nome encontrado" : " nome não encontrado. ");


        //remoção
        System.out.println("Digite um nome para ser removido");
        String remover = scanner.nextLine();
        if (nomes.remove(remover)){
            System.out.println("Nome removido com sucesso");
        }
        else{
            System.out.println("nome não encontrado");
        }
        System.out.println("lista apos a remoção" + nomes);


        // ordenação

        Collections.sort(nomes);
        System.out.println("Lista ordenada" + nomes);

    }

}
