import java.util.Scanner;

public class App {
    public static void main(String[] args){
        String Valor = "30";
        int idade = Integer.parseInt(Valor);
        System.out.println(idade);

        String valor = "30.3";
        float idadee = Float.parseFloat(valor);
        System.out.printf("a idade é %.2f", idadee);



/** conversão de int para string
    int Idade = 20;
    String Valor = Integer.toString(Idade);
    System.out.println(Valor);
*/

/**  entrada de dados       
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        System.out.printf("Sua nota de %s é %.2f", nome, nota);
*/

/** dados primitivos
 *      float nota = 8.5f;
        String nome = "Gustavo";
        System.out.println(nota);
        System.out.printf("Sua nota de %s é %.2f", nome, nota);
ou      System.out.printformat("Sua nota de %s é %.2f", nome, nota);
*/    }
    
}
