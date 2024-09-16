import java.util.Scanner;

public class Tabuada {
public static void main (String[] args) {
    
    Scanner scanner = new Scanner (System.in);

    System.out.Println ("Digite um número: ");
    int numero = scanner.nextInt();

    System.out.Println ("Tabuada do " + numero + ":");
    for (int i = 1; i <= 10;i++) {
        System.out.Println(numero + " x " + i + " = " + (numero * i));
    }

    scanner.close();
  }
}