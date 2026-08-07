package exercicios_semestre1;
import java.util.Scanner;
public class Uni6Exe03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double[] numero = new double[12];

        for(int i = 0; i < numero.length; i++) {
            numero[i] = sc.nextDouble();
        }

        for(int i = 0; i < numero.length; i++) {

            if ((i+1) % 2 != 0) {
                numero[i] += numero[i]*0.05; 
            } else{
                numero[i] += numero[i]*0.02;
            }
        }

        System.out.println("Números após as alterações: ");

        for(int i = 0; i < numero.length; i++) {
            System.out.println(numero[i]);
        }
    }
}