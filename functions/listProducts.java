package functions;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class listProducts {
    private static List<Produto> produtos; // Tornando a lista estática

    public listProducts() {
        if (produtos == null) {
            produtos = new ArrayList<>(); // Inicializa a lista apenas se ela for nula
        }
    }

    public void armazenarProduto(String nome, String valor, String estoque) {
        produtos.add(new Produto(nome, valor, estoque));
    }

    public void exibirProdutos() {
        System.out.println("\nLista de Produtos:");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    // Método para remover um produto pelo nome
    public boolean removerProdutoPorNome(String nome) {
        Iterator<Produto> iterator = produtos.iterator();
        while (iterator.hasNext()) {
            Produto produto = iterator.next();
            if (produto.getNome().equalsIgnoreCase(nome)) {
                iterator.remove();
                return true; // Produto removido com sucesso
            }
        }
        return false; // Produto não encontrado
    }

    public static class Produto {
        private String nome;
        private String valor;
        private String estoque;

        public Produto(String nome, String valor, String estoque) {
            this.nome = nome;
            this.valor = valor;
            this.estoque = estoque;
        }

        public String getNome() {
            return nome;
        }

        public String getValor() {
            return valor;
        }

        public String getEstoque() {
            return estoque;
        }

        @Override
        public String toString() {
            return "Nome: " + nome + ", Valor: " + valor + ", Estoque: " + estoque;
        }
    }
}