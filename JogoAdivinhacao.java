import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int numeroAleatorio = random.nextInt(100) + 1;

        int palpite = 0;
        boolean acertou = false;

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Eu escolhi um número entre 1 e 100. Tente adivinhar qual é!");

        while (!acertou) {
            System.out.print("Digite seu palpite: ");

            if (scanner.hasNextInt()) {
                palpite = scanner.nextInt();

                if (palpite < 1 || palpite > 100) {
                    System.out.println("Por favor, digite um número entre 1 e 100.");
                } else if (palpite < numeroAleatorio) {
                    System.out.println("O número é maior que " + palpite + ". Tente novamente.");
                } else if (palpite > numeroAleatorio) {
                    System.out.println("O número é menor que " + palpite + ". Tente novamente.");
                } else {
                    System.out.println("Parabéns! Você acertou o número " + numeroAleatorio + "!");
                    acertou = true;
                }
            } else {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.next();
            }
        }

        scanner.close();
    }
}
