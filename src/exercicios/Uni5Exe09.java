package exercicios;
import java.util.Scanner;
public class Uni5Exe09 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de alunos: ");
        int qtdAlunos = sc.nextInt();
        int qtdAlunosAcimaDe20 = 0;
        String nomes18 = "";

        for(int n = 1; n <= qtdAlunos; n++) {

            System.out.println("Digite o nome do " + n + "° aluno(a): ");
            String nome = sc.next();
            System.out.println("Digite a idade dele/dela: ");
            int idade = sc.nextInt();

            if (idade == 18) {
                nomes18 += nome + " ";
            } else if (idade > 20) {
                qtdAlunosAcimaDe20++;
            }
        }

        System.out.println("Nomes dos alunos que tem 18 anos: " + nomes18);
        System.out.println("Quantidade de alunos que tem idade acima de 20 anos: " + qtdAlunosAcimaDe20);
    }
}