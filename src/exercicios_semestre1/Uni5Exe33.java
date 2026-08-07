package exercicios_semestre1;
import java.util.Scanner;
public class Uni5Exe33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int voto;
        int c1 = 0, c2 = 0, c3 = 0, c4 = 0;
        int nulo = 0, branco = 0;
        int total = 0;

        do {
            System.out.println("Digite seu voto (1-4 candidatos, 5=nulo, 6=branco, 0=sair): ");
            voto = sc.nextInt();

            if (voto == 0) {
                break;
            }

            switch (voto) {
                case 1 -> c1++;
                case 2 -> c2++;
                case 3 -> c3++;
                case 4 -> c4++;
                case 5 -> nulo++;
                case 6 -> branco++;
                default -> {
                    System.out.println("Opção incorreta");
                    continue; // não conta voto inválido
                }
            }

            total++;

        } while (true);

        System.out.println("\nResultado:");

        System.out.println("Candidato 1: " + c1);
        System.out.println("Candidato 2: " + c2);
        System.out.println("Candidato 3: " + c3);
        System.out.println("Candidato 4: " + c4);
        System.out.println("Votos nulos: " + nulo);
        System.out.println("Votos em branco: " + branco);

        if (total > 0) {
            double percNulos = (double) nulo / total * 100;
            double percBrancos = (double) branco / total * 100;

            System.out.printf("Percentual de nulos: %.2f%%\n", percNulos);
            System.out.printf("Percentual de brancos: %.2f%%\n", percBrancos);
        } else {
            System.out.println("Nenhum voto computado.");
        }
    }
}