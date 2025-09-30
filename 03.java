public class Exercicio03 {
    public static void main(String[] args) {
        double valorEmDolares = 150.0;
        double taxaCambio = 4.97; // Cotação do dia

        double valorEmReais = valorEmDolares * taxaCambio;

        System.out.println("Valor em Dólares: $" + valorEmDolares);
        System.out.println("Valor em Reais: R$" + valorEmReais);
    }
}
