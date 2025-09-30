import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int senhaCorreta = 1234;

        System.out.print("Digite a senha: ");
        int senhaDigitada = leitor.nextInt();

        if (senhaDigitada == senhaCorreta) {
            System.out.println("Acesso permitido.");
        } else {
            System.out.println("Acesso negado.");
        }

        leitor.close();
    }
}
