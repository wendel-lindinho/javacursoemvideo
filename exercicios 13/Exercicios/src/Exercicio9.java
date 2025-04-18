import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite os graus celsius: ");
        Double celsius = scan.nextDouble();

        double fahrenheit = (9.0/5.0 * celsius) + 32;
        System.out.printf("A conversão fica %.2f °F", fahrenheit);
 
    }
}
