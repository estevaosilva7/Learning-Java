import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListaParte1 {
    public static void main(String[] args) {
        // Criar uma lista de inteiros
        List<Integer> lista = new ArrayList<>();

        // Inserir 10 elementos na lista
        for (int i = 0; i < 10; i++) {
            lista.add(i * 2); // Exemplo: insere os números pares de 0 a 18
        }

        // Ordenar os elementos em ordem crescente
        Collections.sort(lista);

        // Exibir a lista ordenada
        System.out.println("Lista ordenada: " + lista);

        // Pesquisar um elemento
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para pesquisar na lista: ");
        if (scanner.hasNextInt()) {
            int numeroPesquisado = scanner.nextInt();
            if (lista.contains(numeroPesquisado)) {
                System.out.println("O número " + numeroPesquisado + " está na lista.");
            } else {
                System.out.println("O número " + numeroPesquisado + " não está na lista.");
            }
        } else {
            System.out.println("Nenhuma entrada fornecida.");
        }

        // Remover um elemento
        System.out.print("Digite um número para remover da lista: ");
        if (scanner.hasNextInt()) {
            int numeroRemovido = scanner.nextInt();
            if (lista.remove(Integer.valueOf(numeroRemovido))) {
                System.out.println("O número " + numeroRemovido + " foi removido da lista.");
            } else {
                System.out.println("O número " + numeroRemovido + " não está na lista.");
            }
        } else {
            System.out.println("Nenhuma entrada fornecida.");
        }

        // Exibir a lista atualizada
        System.out.println("Lista após a remoção: " + lista);

        scanner.close();
    }
}
