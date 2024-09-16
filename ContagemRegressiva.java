import java.util.Scanner;

public class ContagemRegressiva {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inicial para a contagem regressiva: ");
        int numeroInicial = scanner.nextInt();
        
        while (numeroInicial >= 0) {
            System.out.println(numeroInicial);
            numeroInicial--;
        }
        
        scanner.close();
    }
}
