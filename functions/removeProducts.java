package functions;

import java.util.Scanner;

public class removeProducts {
    public void remover() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o nome do produto que deseja remover: ");
        String nome = scanner.nextLine();

        listProducts listProducts = new listProducts();

        boolean removido = listProducts.removerProdutoPorNome(nome);

        if (removido) {
            System.out.println("Produto removido com sucesso!");
        } else {
            System.out.println("Produto não encontrado.");
        }

        select.selecionar();
        scanner.close();
    }
}