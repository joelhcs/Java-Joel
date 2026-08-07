package exercicios_semestre1;
import java.util.Scanner;
public class Uni5Exe05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int termo = 8;
        System.out.println("Digite um valor maior que 2: ");
        int a = sc.nextInt();

        for(int n = 1; n <= a; n++) {
            
            if (n % 2 != 0) {
                
                System.out.println(termo);

            } else {

                System.out.println(termo + 2);
                termo *= 2;
              }
        }
        
    }
}