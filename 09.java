import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor total da conta: R$ ");
        double totalConta = leitor.nextDouble();

        double gorjeta = totalConta * 0.10;
        System.out.println("A gorjeta (10%) é: R$ " + gorjeta);

        leitor.close();
    }
}
