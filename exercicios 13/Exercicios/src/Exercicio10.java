import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int num1 = scan.nextInt();
        System.out.print("Digite um outro numero inteiro: ");
        int num2 = scan.nextInt();
        System.out.print("Digite um numero real: ");
        double num3 = scan.nextDouble();

        int resultadoA = (num1 * 2) * (num2 / 2);
        double resultadoB = (num1 * 3) + num3;
        double resultadoC = Math.pow(num3, 3);

        System.out.println("Resultado 1" + resultadoA);
        System.out.println("Resultado 2" + resultadoB);
        System.out.println("Resultado 3" + resultadoC);

    }
}
