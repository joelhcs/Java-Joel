package exercicios_semestre1;
import java.util.Scanner;

public class Aluno {

    String nome;
    double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String situacao() {
        if (nota >= 7.0) {
            return "Aprovado";
        } else if (nota >= 4.0) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aluno[] alunos = new Aluno[5];

        for (int i = 0; i < alunos.length; i++) {
            System.out.print("Aluno " + (i + 1) + " - Nome: ");
            String nome = sc.nextLine();

            System.out.print("Aluno " + (i + 1) + " - Nota: ");
            double nota = sc.nextDouble();
            sc.nextLine();

            alunos[i] = new Aluno(nome, nota);
        }

        System.out.println("\n=== RESULTADO ===");

        for (int i = 0; i < alunos.length; i++) {
            System.out.println(alunos[i].nome + " - " +
                               alunos[i].nota + " - " +
                               alunos[i].situacao());
        }
    }
}