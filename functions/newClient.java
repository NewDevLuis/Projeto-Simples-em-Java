package functions;

import java.util.Scanner;

public class newClient {
    public static void novoCliente() {
        listClientes listClientes = new listClientes();
        Scanner scanner = new Scanner(System.in);
        String continuar;

        do {
            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o CPF: ");
            String cpf = scanner.nextLine();

            listClientes.armazenarCliente(nome, cpf);

            System.out.print("Deseja adicionar outro cliente? (s/n): ");
            continuar = scanner.nextLine();
        } while (continuar.equalsIgnoreCase("s"));

        select.selecionar();

        scanner.close();
    }

    public static void retornarClientes() {
        listClientes listClientes = new listClientes();
        listClientes.exibirClientes();
        select.selecionar();
    }
}