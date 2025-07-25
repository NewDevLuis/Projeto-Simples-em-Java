package functions;
import java.util.Scanner;

public class select {
    public static void selecionar() {
        System.out.print("Digite o numero da operacao que deseja usar: \n" +
        "[1] Novo produto\n" +
        "[2] Novo cliente\n" +
        "[3] Listar produtos\n" +
        "[4] Listar clientes\n" +
        "[5] Remover produtos\n");

        Scanner scanner = new Scanner(System.in);
        int escolha = scanner.nextInt();
        if (escolha == 1) {
            newProduct.novoProduto();
        }

        if (escolha == 2) {
            newClient.novoCliente();
        }

        if (escolha == 3) { 
            newProduct.retornarProdutos();
        }

        if (escolha == 4) {
            newClient.retornarClientes();
        } 

        if (escolha == 5) {
            removeProducts removeProducts = new removeProducts();
            removeProducts.remover();
        }

        scanner.close();
    }
}