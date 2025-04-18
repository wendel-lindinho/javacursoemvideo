import java.util.Scanner;

public class Exercicios {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome completo ");
        String nomeCompleto = scan.nextLine();
        System.out.println("Digite sua idade ");
        int idade = scan.nextInt();
        System.out.printf("Você é %s e tem %d anos.%n", nomeCompleto, idade);
    }

} 