package exercicios_semestre2.lista01.questao03;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Pessoa[] pessoa = new Pessoa[3];

        for(int i = 0; i < pessoa.length; i++) {
            pessoa[i] = new Pessoa();
            System.out.println("Digite a altura da pessoa " + (i+1));
            pessoa[i].altura = sc.nextDouble();

            System.out.println("Digite o peso da pessoa " + (i+1));
            pessoa[i].peso = sc.nextDouble();

            System.out.println("O IMC da pessoa " + (i+1) + " é " + pessoa[i].calcularImc());
        }
    }
}