package exercicios_semestre1;
import java.util.Scanner;
public class Uni6Exe09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] sexo = new int[30];
        int[] nota = new int[30];
        int[] idade = new int[30];

        double somaNotas = 0;
        double somaNotasHomens = 0;
        int qtdHomens = 0;

        int menorIdadeMulher = 999;
        int notaMulherMaisJovem = 0;

        for (int i = 0; i < 30; i++) {

            System.out.println("Pessoa " + (i + 1));

            System.out.println("Sexo (1=feminino 2=masculino): ");
            sexo[i] = sc.nextInt();

            System.out.println("Nota do cinema (0 a 10): ");
            nota[i] = sc.nextInt();

            System.out.println("Idade: ");
            idade[i] = sc.nextInt();

            somaNotas += nota[i];

            if (sexo[i] == 2) {
                somaNotasHomens += nota[i];
                qtdHomens++;
            }

            if (sexo[i] == 1) {

                if (idade[i] < menorIdadeMulher) {
                    menorIdadeMulher = idade[i];
                    notaMulherMaisJovem = nota[i];
                }
            }
        }

        double mediaCinema = somaNotas / 30;
        double mediaHomens = somaNotasHomens / qtdHomens;

        int mulheres50AcimaMedia = 0;

        for (int i = 0; i < 30; i++) {

            if (sexo[i] == 1 && idade[i] > 50 && nota[i] > mediaCinema) {

                mulheres50AcimaMedia++;
            }
        }

        System.out.printf("\nNota média do cinema: %.2f", mediaCinema);

        System.out.printf("\nNota média atribuída pelos homens: %.2f", mediaHomens);

        System.out.println("\nNota atribuída pela mulher mais jovem: " + notaMulherMaisJovem);

        System.out.println("Quantidade de mulheres com mais de 50 anos que deram nota acima da média: " + mulheres50AcimaMedia);
    }
}
