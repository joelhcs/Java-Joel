package exercicios;
import java.util.Scanner;
public class Uni5Exe28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int voto, nenhumDeNos = 0,cpm22 = 0,skank = 0,jotaQuest = 0,votosTotais = 0;
        char continuidade = 'S';

        while (continuidade == 'S') {
            
            System.out.println("Digite seu voto (1: Nenhum de Nós; 2: CPM22; 3: Skank; 4: Jota Quest): ");
            voto = sc.nextInt();

            switch (voto) {
                case 1 -> nenhumDeNos++;
                case 2 -> cpm22++;
                case 3 -> skank++;
                case 4 -> jotaQuest++;
            }
            
            votosTotais++;

            System.out.println("Mais um voto: s (SIM) / n (NÃO)?");
            continuidade = sc.next().toUpperCase().charAt(0);
        }

        System.out.println("Votos pra cada grupo:\nNenhum de Nós: " + nenhumDeNos + "\nCPM22: " + cpm22 + "\nSkank: " + skank + "\nJota Quest: " + jotaQuest);
        System.out.printf("\nPercentual para cada grupo:\nNenhum de Nós: %.2f%%\nCPM22: %.2f%%\nSkank: %.2f%%\nJota Quest: %.2f%%\n\n" , ((double)nenhumDeNos/votosTotais*100) , ((double)cpm22/votosTotais*100) , ((double)skank/votosTotais*100) , ((double)jotaQuest/votosTotais*100));

        if (nenhumDeNos > cpm22 && nenhumDeNos > skank && nenhumDeNos > jotaQuest) {
            System.out.println("Grupo vencedor: Nenhum de Nós");
        } else if (cpm22 > nenhumDeNos && cpm22 > skank && cpm22 > jotaQuest) {
            System.out.println("Grupo vencedor: CPM22");
        } else if (skank > nenhumDeNos && skank > cpm22 && skank > jotaQuest) {
            System.out.println("Grupo vencedor: Skank");
        } else if (jotaQuest > nenhumDeNos && jotaQuest > cpm22 && jotaQuest > skank) {
            System.out.println("Grupo vencedor: Jota Quest");
        } else {
            System.out.println("Ocorreu um empate");
        }

    }
}