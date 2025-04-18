import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite os metros");
        double metros = scan.nextDouble();

        double resultado = metros * 100;
        int centimetros = (int) resultado;

        System.out.println(centimetros);


    }
}
