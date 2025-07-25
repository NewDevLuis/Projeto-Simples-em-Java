package functions;

import java.util.Scanner;

public class newProduct {
    public static void novoProduto() {
        listProducts listProducts = new listProducts();
        Scanner scanner = new Scanner(System.in);
        String continuar;

        do {
            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o valor: ");
            String valor = scanner.nextLine();

            System.out.print("Digite o estoque: ");
            String estoque = scanner.nextLine();

            listProducts.armazenarProduto(nome, valor, estoque);

            System.out.print("Deseja adicionar outro produto? (s/n): ");
            continuar = scanner.nextLine();
        } while (continuar.equalsIgnoreCase("s"));

        select.selecionar();

        scanner.close();
    }

    public static void retornarProdutos() {
        listProducts listProducts = new listProducts();
        listProducts.exibirProdutos();
        select.selecionar();
    }
}