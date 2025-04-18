import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite quanto você recebe por horas trabalhadas: " );
        double salarioHora = scan.nextDouble();
        System.out.print("Quantas horas você trabalha no mês? ");
        double horasTrabalhada = scan.nextDouble();
        
        double salario = salarioHora * horasTrabalhada;
        System.out.println("você recebera " + salario + "no final do mês");
    
    }
}
