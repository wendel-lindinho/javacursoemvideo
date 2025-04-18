import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o tamanho do lado do quadrado: ");
        int lado = scan.nextInt();
        int area = (int) Math.pow(lado, 2);
        System.out.println("A area é " + area + "^2" );

        System.out.println("Seu valor duplicado é " + area*2 );
    }
}