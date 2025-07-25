package functions;

import java.util.ArrayList;
import java.util.List;

public class listClientes {
    private static List<Cliente> clientes; 

    public listClientes() {
        if (clientes == null) {
            clientes = new ArrayList<>(); 
        }
    }

    public void armazenarCliente(String nome, String cpf) {
        clientes.add(new Cliente(nome, cpf));
    }

    public void exibirClientes() {
        System.out.println("\nLista de Clientes:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    public static class Cliente {
        private String nome;
        private String cpf;

        public Cliente(String nome, String cpf) {
            this.nome = nome;
            this.cpf = cpf;
        }

        @Override
        public String toString() {
            return "Nome: " + nome + ", CPF: " + cpf;
        }
    }
}