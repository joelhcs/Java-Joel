package exercicios;
import java.util.Scanner;
public class Uni5Exe24 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        char continuidade = 's';
        double limiteDiario, pesoPorPeixe, pesoTotal = 0;

        System.out.println("Digite o peso limite diário em kilogramas: ");
        limiteDiario = sc.nextDouble();
        limiteDiario *= 1000;

        while (continuidade == 's') {

            System.out.println("Digite o peso do peixe em gramas: ");
            pesoPorPeixe = sc.nextDouble();
            
            pesoTotal += pesoPorPeixe;
            System.out.printf("Peso total até aqui: %.2f g\n" , pesoTotal);

            if (pesoTotal > limiteDiario) {
                System.out.println("O limite diário foi excedido.");
                break;
            } else {
                System.out.println("Deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)?");
                continuidade = sc.next().charAt(0);
            }
        }
    }
}