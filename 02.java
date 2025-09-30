public class Exercicio02 {
    public static void main(String[] args) {
        String nomeProduto = "Notebook Gamer";
        double preco = 5500.00;
        int quantidade = 8;

        double valorTotalEstoque = preco * quantidade;

        System.out.println("Produto: " + nomeProduto);
        System.out.println("Valor total em estoque: R$ " + valorTotalEstoque);
    }
}
