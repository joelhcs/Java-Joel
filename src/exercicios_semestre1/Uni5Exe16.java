package exercicios_semestre1;
import java.util.Scanner;
public class Uni5Exe16 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        char genero;
        double qtdMulheres = 0, qtdTotal = 0, altura, mediaAlturaMulheres = 0, mediaAltura, alturaTotal = 0, alturaTotalMulheres = 0;

        System.out.println("Altura: ");
        altura = sc.nextDouble();

        while (altura != 0) {

            System.out.println("Gênero: ");
            genero = sc.next().toUpperCase().charAt(0);

            if (genero == 'F') {

                alturaTotalMulheres += altura;
                qtdMulheres++;
            }
            
            alturaTotal += altura;
            qtdTotal++;

            System.out.println("Altura: ");
            altura = sc.nextDouble();
        }
        
        if (qtdMulheres > 0) {
            mediaAlturaMulheres = alturaTotalMulheres / qtdMulheres;
        }
        
        mediaAltura = alturaTotal / qtdTotal;

        System.out.printf("A média da altura das mulheres é: %.2f" , mediaAlturaMulheres);
        System.out.printf("\nA média de altura do grupo é: %.2f" , mediaAltura);

    }
}