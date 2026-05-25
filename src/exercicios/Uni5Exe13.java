package exercicios;
import java.util.Scanner;
public class Uni5Exe13 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas paradas foram realizadas: ");
        int paradas = sc.nextInt();
        double quilometragemTotal = 0, combustivelTotal = 0;
        double mediaPorParada = 0;

        for(int a = 1; a <= paradas; a++) {

            System.out.println("Parada " + a + ": Quilometragem: ");
            double quilometragem = sc.nextDouble();
            System.out.println("Combustível: ");
            double combustível = sc.nextDouble();

            mediaPorParada =  quilometragem / combustível;

            System.out.println("Parada " + a + ": " + mediaPorParada + " km por litro");

            quilometragemTotal += quilometragem;
            combustivelTotal += combustível;
        }

        double mediaTotal = quilometragemTotal / combustivelTotal;

        System.out.printf("Quilometragem média obtida por litro: %.2f" , mediaTotal);
    }
}