package exercicios;
import java.util.Scanner;
public class Uni5Exe27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int diaAbril, pecasManha, pecasTarde, continuidade = 1, diaMaiorProducao = 0, pecasManhaTotal = 0, pecasTardeTotal = 0, maiorProducao = 0;
        double valorRecebido;

        while (continuidade == 1) {

            System.out.println("Dia: ");
            diaAbril = sc.nextInt();
            
            if (diaAbril > 0 && diaAbril < 31) {
               
                System.out.println("Peças produzidas pela manhã: ");
                pecasManha = sc.nextInt();
                System.out.println("Peças produzidas pela tarde: ");
                pecasTarde = sc.nextInt();

                if (maiorProducao < (pecasTarde + pecasManha)) {
                    maiorProducao = pecasManha + pecasTarde;
                    diaMaiorProducao = diaAbril;
                }

                pecasManhaTotal += pecasManha;
                pecasTardeTotal += pecasTarde;

                    if (diaAbril <= 15) {
                        
                        if (pecasManha + pecasTarde > 100 && pecasManha >= 30 && pecasTarde >= 30) {
                            valorRecebido = (pecasManha + pecasTarde) * 0.8;
                        } else {
                            valorRecebido = (pecasManha + pecasTarde) * 0.5;
                        }
                    } else {

                        valorRecebido = (pecasManha * 0.4) + (pecasTarde * 0.3);
                    }

                System.out.printf("Valor recebido: R$%.2f\n" , valorRecebido);
                System.out.println("Novo funcionário (1.sim 2.não)?");
                continuidade = sc.nextInt();
            } else {
                System.out.println("Dia inválido");
                continuidade = 1;
            }
        }

        System.out.println("Dia com a maior produção: " + diaMaiorProducao + "/4");
        
        if (pecasManhaTotal > pecasTardeTotal) {
            System.out.println("Período com a maior produção: Manhã\nPeças produzidas nesse período: " + pecasManhaTotal);
        } else if (pecasTardeTotal > pecasManhaTotal) {
            System.out.println("Período com a maior produção: Tarde\nPeças produzidas nesse período: " + pecasTardeTotal);
        } else {
            System.out.println("Foram produzidas as mesmas quantidades de produto nos dois turnos. Cada turno produziu: " + pecasManhaTotal);
        }
    }
}