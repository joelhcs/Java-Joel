package exercicios;
import java.util.Scanner;
public class Uni5Exe14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalCompra = 0, totalVenda = 0;
        int lucro1 = 0, lucro2 = 0, lucro3 = 0;
        double percentualLucro = 0;

        for(int a = 1; a <= 20; a++) {
            
            System.out.println("Digite o nome do produto: ");
            String produto = sc.next();
            
            System.out.println("Digite o preço de compra do/da " + produto + ":");
            double precoCompra = sc.nextDouble();
            
            System.out.println("Digite o preço de venda do/da " + produto + ":");
            double precoVenda = sc.nextDouble();

            percentualLucro = (precoVenda - precoCompra) / precoCompra * 100;
            totalCompra += precoCompra;
            totalVenda += precoVenda;

            if (percentualLucro < 10) {
                lucro1++;
            } else if (percentualLucro >= 10 && percentualLucro <= 20) {
                lucro2++;
            } else {
                lucro3++;
            }
        }

        double lucroTotal = totalVenda - totalCompra;

        System.out.println("Quantidade de mercadorias com lucro abaixo de 10%: " + lucro1);
        System.out.println("Quantidade de mercadorias com o lucro entre 10% e 20%: " + lucro2);
        System.out.println("Quantidade de mercadorias com lucro maior de 20%: " + lucro3);
        System.out.printf("Valor total de compra: R$%.2f\n" , totalCompra);
        System.out.printf("Valor total de venda: R$%.2f\n" , totalVenda);
        System.out.printf("Lucro total: R$%.2f\n" , lucroTotal);
    }
}