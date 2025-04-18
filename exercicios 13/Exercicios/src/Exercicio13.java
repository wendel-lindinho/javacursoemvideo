import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("tamanho do arquivo em mb: ");
        double tamanhoArquivo = scan.nextDouble();
        System.out.println("velocidade da internet: ");
        double velocidade = scan.nextDouble();

        double tempo = tamanhoArquivo / velocidade;

        System.out.println("o tempo que levara é "+ tempo);

    }
}