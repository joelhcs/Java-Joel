package exercicios_semestre2.lista01.questao04;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa[] pessoa = new Pessoa[3];

        for(int i = 0; i < pessoa.length; i++) {
            pessoa[i] = new Pessoa();
            System.out.println("Digite o nome da pessoa " + (i+1));
            pessoa[i].nome = sc.next();
            
            System.out.println("Digite a altura da pessoa " + (i+1));
            pessoa[i].altura = sc.nextDouble();

            System.out.println("Digite o peso da pessoa " + (i+1));
            pessoa[i].peso = sc.nextDouble();
        }

        for(int i = pessoa.length - 1; i >= 0; i--) {
            System.out.println("Dados da pessoa " + (i+1));
            pessoa[i].exibirInfo();
            System.out.println("------------");
        }
    }
}