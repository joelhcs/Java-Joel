package exercicios_semestre1;
import java.util.Scanner;
public class Uni5Exe17 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int inscricao = 1, inscricaoMenor = 0, inscricaoMaior = 0;
        double altura = 0, alturaMaior = 0, alturaMenor = 100, mediaAltura, alturaTotal = 0, qtdAtletas = 0;

        System.out.println("N° de inscrição: ");
        inscricao = sc.nextInt();

        while (inscricao != 0) {

            System.out.println("Altura: ");
            altura = sc.nextDouble();

            if (altura > alturaMaior) {
                alturaMaior = altura;
                inscricaoMaior = inscricao;
            }

            if (altura < alturaMenor) {
                alturaMenor = altura;
                inscricaoMenor = inscricao;
            }

            qtdAtletas++;
            alturaTotal += altura;

            System.out.println("N° de inscrição: ");
            inscricao = sc.nextInt();
        }

        mediaAltura = alturaTotal / qtdAtletas;

        System.out.println("O atleta mais baixo tem " + alturaMenor + "m e o seu número de inscrição é " + inscricaoMenor);
        System.out.println("O atleta mais alto tem " + alturaMaior + "m e o seu número de inscrição é " + inscricaoMaior);
        System.out.printf("A altura média do grupo de atletas é: %.2f" , mediaAltura);
    }
}