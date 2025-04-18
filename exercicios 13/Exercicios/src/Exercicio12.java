import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite quanto você recebe por horas trabalhadas: " );
        double salarioHora = scan.nextDouble();
        System.out.print("Quantas horas você trabalha no mês? ");
        double horasTrabalhada = scan.nextDouble();
        
        double salarioBruto = salarioHora * horasTrabalhada;
        System.out.println("você recebera " + salarioBruto + " brutos no final do mês");

        double inss = (salarioBruto / 100) * 8;
        double sindicato =  (salarioBruto / 100) * 5;
        double ir = (salarioBruto / 100) * 8;
        double totalDescontos = inss + sindicato + ir;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("INSS R$" + inss);
        System.out.println("SINDICATO R$" + sindicato);
        System.out.println("IR R$" + ir);
        System.out.println("Total de descontos R$" + totalDescontos);
        System.out.println("Salario Liquido R$" + salarioLiquido);

    
    }
}

