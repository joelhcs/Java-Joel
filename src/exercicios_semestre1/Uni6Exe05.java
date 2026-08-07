package exercicios_semestre1;
import java.util.Scanner;
public class Uni6Exe05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] respostaRapaz = new String[5];
        String[] respostaMoca = new String[5];

        System.out.println("A resposta deve ser SIM, NAO ou IND (indiferente):\nPara o rapaz:");
        System.out.println("Gosta de música?");
        respostaRapaz[0] = sc.next().toUpperCase();

        System.out.println("Gosta de futebol?");
        respostaRapaz[1] = sc.next().toUpperCase();
    
        System.out.println("Gosta de seriados?");
        respostaRapaz[2] = sc.next().toUpperCase();

        System.out.println("Gosta de redes sociais?");
        respostaRapaz[3] = sc.next().toUpperCase();

        System.out.println("Gosta da Oktoberfest?");
        respostaRapaz[4] = sc.next().toUpperCase();

        System.out.println("Para a moça:");
        
        System.out.println("Gosta de música?");
        respostaMoca[0] = sc.next().toUpperCase();

        System.out.println("Gosta de futebol?");
        respostaMoca[1] = sc.next().toUpperCase();
    
        System.out.println("Gosta de seriados?");
        respostaMoca[2] = sc.next().toUpperCase();

        System.out.println("Gosta de redes sociais?");
        respostaMoca[3] = sc.next().toUpperCase();

        System.out.println("Gosta da Oktoberfest?");
        respostaMoca[4] = sc.next().toUpperCase();

        int afinidade = 0;

        for(int i = 0; i < 5; i++) {

            if (respostaMoca[i].equals(respostaRapaz[i])) {
                afinidade += 3;
            } else if ((respostaMoca[i].equals("SIM") && respostaRapaz[i].equals("NAO")) || respostaMoca[i].equals("NAO") && respostaRapaz[i].equals("SIM")) {
                afinidade -= 2;
            } else {
                afinidade += 1;
            }
        }

        if (afinidade == 15) {
            System.out.println("Casem!");
        } else if (afinidade <= 14 && afinidade >= 10) {
            System.out.println("Vocês tem muita coisa em comum!");
        } else if (afinidade <= 9 && afinidade >= 5) {
            System.out.println("Talvez não dê certo :(");
        } else if (afinidade <= 4 && afinidade >= 0) {
            System.out.println("Vale um encontro.");
        } else if (afinidade <= -1 && afinidade >= -9) {
            System.out.println("Melhor não perder tempo");
        } else {
            System.out.println("Vocês se odeiam!");
        }
    }
}