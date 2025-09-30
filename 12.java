import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = leitor.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = leitor.nextInt();

        if (num1 > num2) {
            System.out.println("O primeiro número (" + num1 + ") é maior.");
        } else if (num2 > num1) {
            System.out.println("O segundo número (" + num2 + ") é maior.");
        } else {
            System.out.println("Os números são iguais.");
        }

        leitor.close();
    }
}
