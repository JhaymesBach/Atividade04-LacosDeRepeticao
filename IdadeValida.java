import java.util.Scanner;

public class IdadeValida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade = -1;

        while (idade <= 0) {
            System.out.print("Digite sua idade: ");
            if (scanner.hasNextInt()) {
                idade = scanner.nextInt();
                if (idade <= 0) {
                    System.out.println("Idade inválida. Por favor, digite uma idade maior que 0.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.next();
            }
        }

        System.out.println("Idade válida fornecida: " + idade);
        scanner.close();
    }
}
