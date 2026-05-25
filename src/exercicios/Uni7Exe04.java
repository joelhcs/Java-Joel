package exercicios;
import java.util.Scanner;
public class Uni7Exe04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int depto = 0;
        int funPorDpto = 0;
        do {

        System.out.println("Digite o número de departamentos(máximo 10): ");
        depto = sc.nextInt();
        } while (depto < 1 || depto > 10);

        do {
        System.out.println("Digite a quantidade de funcionários por departamento(máximo 20):");
        funPorDpto = sc.nextInt();
        } while (funPorDpto < 1 || funPorDpto > 20);    

        double[][] salarios = new double[depto][funPorDpto];

        double totalSalario = 0;
        double maiorSalario = 0;
        int dptoMaiorSalario = 0, funcionarioMaiorSalario = 0;
        double[] totalSalarioDepartamento = new double[depto];
        double[] mediaDepartamento = new double[depto];

        for(int lin = 0; lin < salarios.length; lin++) {
            for(int col = 0; col < salarios[lin].length; col++) {
                System.out.println("Digite o salário do funcionário [" + col + "] do departamento [" + lin + "]");
                salarios[lin][col] = sc.nextDouble();
                totalSalario += salarios[lin][col];

                if (salarios[lin][col] > maiorSalario) {
                    maiorSalario = salarios[lin][col];
                    dptoMaiorSalario = lin;
                    funcionarioMaiorSalario = col;
                }
            }
        }

        for(int lin = 0; lin < salarios.length; lin++) {
            for(int col = 0; col < salarios[lin].length; col++) {
                totalSalarioDepartamento[lin] += salarios[lin][col];
            }
            mediaDepartamento[lin] = totalSalarioDepartamento[lin] / salarios[lin].length;
        }

        double mediaGeralEmpresa = totalSalario / (salarios.length * salarios[0].length);
        int qtdAcimaMedia = 0;

        System.out.println("O maior salário de toda empresa é: " + maiorSalario + 
        " encontrando-se no departamento [" + dptoMaiorSalario + "] funcionário ["
        + funcionarioMaiorSalario + "]");

        for(int lin = 0; lin < salarios.length; lin++) {
            System.out.println("Média salarial do departamento [" + lin + "]: " + mediaDepartamento[lin]);
        }

        for(int lin = 0; lin < salarios.length; lin++) {
            for(int col = 0; col < salarios[lin].length; col++) {
                if (salarios[lin][col] > mediaGeralEmpresa) {
                    qtdAcimaMedia++;
                }
            }
        }

        System.out.println("Quantidade de funcionários que ganham acima da média: " + qtdAcimaMedia);

    }
}