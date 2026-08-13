package exercicios_semestre2.lista02.questao03;
import java.util.Scanner;
public class App {
    
    public static void main(String[] args) {
        
    
        Scanner sc = new Scanner(System.in);
        
        ContaBancaria conta1 = new ContaBancaria();
        ContaBancaria conta2 = new ContaBancaria();

        System.out.println("Digite o número da conta 1: ");
        conta1.setNumero(sc.next());

        System.out.println("Digite o nome do titular da conta 1:");
        conta1.setTitular(sc.next());
    
        System.out.println("Digite o número da conta 2: ");
        conta2.setNumero(sc.next());

        System.out.println("Digite o nome do titular da conta 2:");
        conta2.setTitular(sc.next());
    
        conta1.depositar(1000.00);
        conta1.depositar(700.00);

        conta2.depositar(5000.00);

        conta2.sacar(3000.00);

        conta2.transferir(conta1, 1800);

        System.out.println(conta1.getTitular() + ": R$" + conta1.getSaldo());
        System.out.println(conta2.getTitular() + ": R$" + conta2.getSaldo());

    }
}