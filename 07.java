import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = leitor.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = leitor.nextInt();

        int soma = num1 + num2;
        System.out.println("A soma é: " + soma);

        leitor.close();
    }
}
