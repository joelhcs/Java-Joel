package exercicios_semestre1;
import java.util.Scanner;
public class Uni5Exe26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor máximo de pedágio: ");
        double valorMaximoPedagio = sc.nextDouble();
        int valorAcimaPedagio = 0, qtdTrechos = 0, trechosAcima150Aceitos = 0, distancia = 0;
        System.out.println("Digite o preço do pedágio do trecho 1");
        double pedagio = sc.nextDouble();
        
        while (pedagio >= 0) {
            
            System.out.println("Digite a distância do trecho " + (qtdTrechos + 1) + ":");
            distancia = sc.nextInt();

            if (pedagio > valorMaximoPedagio) {
                valorAcimaPedagio++;
            }

            if (distancia > 150 && valorMaximoPedagio >= pedagio) {
                trechosAcima150Aceitos++;
            }

            qtdTrechos++;

            System.out.println("Digite o preço do pedágio do trecho " + (qtdTrechos + 1) + ":");
            pedagio = sc.nextDouble();
        }

        System.out.println("Trechos com valor acima do qual ele nega-se a pagar: " + valorAcimaPedagio);
        System.out.println("Quantidade de trechos informados: " + qtdTrechos);
        System.out.println("Trechos acima de 150km com valor aceito por ele: " + trechosAcima150Aceitos);
    }
}