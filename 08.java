import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite sua idade em anos: ");
        int anos = leitor.nextInt();

        int dias = anos * 365;
        System.out.println("Sua idade aproximada em dias é: " + dias);

        leitor.close();
    }
}
