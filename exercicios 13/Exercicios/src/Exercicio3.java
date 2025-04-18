import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nota 1: ");
        int nota1 = scan.nextInt();
        System.out.println("Nota 2: ");
        int nota2 = scan.nextInt();
        System.out.println("Nota 3: ");
        int nota3 = scan.nextInt();
        System.out.println("Nota 4: ");
        int nota4 = scan.nextInt();

        int media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A média é: " + media);

    }
}
