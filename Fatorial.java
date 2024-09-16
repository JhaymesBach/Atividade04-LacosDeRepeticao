import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 8;
        int fatorial = 1;
        
        int i = num;
        do {
            fatorial *= i;
            i--;
        } while (i > 0);
        
        System.out.println("O fatorial de " + num + " é: " + fatorial);
    }
}
