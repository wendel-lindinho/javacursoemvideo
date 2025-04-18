import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("digite a temperatura em graus F: ");
        double fahrenheit = scan.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.printf("em graus C fica: %.2f °C", celsius);

    }
    
}
