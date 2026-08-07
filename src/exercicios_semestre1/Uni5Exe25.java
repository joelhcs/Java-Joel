package exercicios_semestre1;
import java.util.Scanner;
public class Uni5Exe25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ponto = ' ';
        int pontoDireita = 0, pontoEsquerda = 0;

        while (!((pontoDireita >= 21 && pontoDireita > pontoEsquerda + 1) || (pontoEsquerda >= 21 && pontoEsquerda > pontoDireita + 1))) {

            System.out.println("Digite pra quem vai o ponto, 'D' pra direita e 'E' pra esquerda: ");
            ponto = sc.next().toUpperCase().charAt(0);

            if (ponto == 'D') {
                pontoDireita++;
            }

            if (ponto == 'E') {
                pontoEsquerda++;
            }
        }

        if (pontoEsquerda > pontoDireita) {
            System.out.println("O jogador da esquerda ganhou:\n" + pontoEsquerda + " X " + pontoDireita);
        } else {
            System.out.println("O jogador da direita ganhou:\n" + pontoDireita + " X " + pontoEsquerda);
        }
    }
}