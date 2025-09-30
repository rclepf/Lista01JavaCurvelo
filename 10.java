import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = leitor.nextDouble();

        double fahrenheit = (celsius * 1.8) + 32;
        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit + "°F");

        leitor.close();
    }
}
