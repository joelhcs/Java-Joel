package exercicios_semestre2.lista02.questao01;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa[] pessoa = new Pessoa[3];

        for(int i = 0; i < pessoa.length; i++) {
            pessoa[i] = new Pessoa();
            System.out.println("Digite o nome da pessoa " + (i+1));
            pessoa[i].setNome(sc.next());
            
            System.out.println("Digite a altura da pessoa " + (i+1));
            pessoa[i].setAltura(sc.nextDouble());

            System.out.println("Digite o peso da pessoa " + (i+1));
            pessoa[i].setPeso(sc.nextDouble());
        }
        System.out.println("--------------");
        for(int i = pessoa.length - 1; i >= 0; i--) {
            System.out.println("Dados da pessoa " + (i+1));
            pessoa[i].exibirInfo();
            System.out.println("------------");
        }
    }
}