package exercicios_semestre1;
import java.util.Scanner;
public class Uni5Exe20 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double massaInicial = 0, massa = 0, massaFinal = 0, tempo = 0;

        System.out.println("Dê a massa inicial em kg: ");
        massaInicial = sc.nextDouble();
        massaInicial *= 1000;
        massa = massaInicial;

        while (massa > 0.5) {
            
            massa /= 2;
            tempo += 50;
        }

        massaFinal = massa;

        System.out.printf("Massa inicial: %.2f g\nMassa final: %.3f g\nTempo: %.0f segundos\n", massaInicial, massaFinal, tempo);

    }
}