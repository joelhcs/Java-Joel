package exercicios_semestre1;
import java.util.Scanner;
public class Uni7Exe02 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        double[][] notas = new double[3][5]; 
        double[] mediaAluno = new double[3];
        double[] totalAluno = new double[3];
        double[] mediaProva = new double[5];
        double[] totalProva = new double[5];

        for(int lin = 0; lin < notas.length; lin++) {
            for(int col = 0; col < notas[lin].length; col++) {
                System.out.println("Digite a nota [" + col + "] do aluno [" + lin + "]");
                notas[lin][col] = sc.nextDouble();
                totalAluno[lin] += notas[lin][col];
                totalProva[col] += notas[lin][col];
            }
            mediaAluno[lin] = totalAluno[lin] / notas[lin].length;
            System.out.println("A média do aluno [" + lin + "] foi de : " + mediaAluno[lin]);
        }

        for(int x = 0; x < 5; x++) {
            mediaProva[x] = totalProva[x] / notas.length;
            System.out.println("A média da prova [" + x + "] foi de: " + mediaProva[x]); 
        }
    }
}