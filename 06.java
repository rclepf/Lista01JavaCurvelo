import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite seu primeiro nome: ");
        String nome = leitor.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = leitor.nextLine();

        String nomeCompleto = nome + " " + sobrenome;
        System.out.println("Olá, " + nomeCompleto + "!");

        leitor.close();
    }
}
