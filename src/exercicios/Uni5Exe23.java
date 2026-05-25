package exercicios;
import java.util.Scanner;
public class Uni5Exe23 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String nome = "";
        double totalVendas, salario = 0, precoUnitario = 0, qtdVendida = 0, totalPorProduto = 0;
        char continuidade = 's';

        while (continuidade == 's') {

            totalVendas = 0;
            
            System.out.println("Digite o nome do vendedor: ");
            nome = sc.next();
            
            System.out.println("Digite quantos produtos você vendeu: ");
            int numeroProdutos = sc.nextInt();
            
            for (int a = 1; a <= numeroProdutos; a++) {

                System.out.println("Digite o preço unitário do produto " + a + ": ");
                precoUnitario = sc.nextDouble();

                System.out.println("Digite a quantidade vendida: ");
                qtdVendida = sc.nextDouble();

                totalPorProduto = qtdVendida * precoUnitario;
                totalVendas += totalPorProduto;
            }

            salario = totalVendas * 0.3;

            System.out.printf("Nome: %s\nTotal de vendas: R$%.2f\nSalário: R$%.2f",nome,totalVendas,salario);

            System.out.println("\nDeseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)?");
            continuidade = sc.next().charAt(0);
        }
    }
}