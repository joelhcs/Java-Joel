package exercicios_semestre1;
import java.util.Scanner;
public class Uni4Ex11 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite a idade do primeiro irmão: ");
    int idade1 = sc.nextInt();
    System.out.println("Digite a idade do segundo irmão: ");
    int idade2 = sc.nextInt();
    System.out.println("Digite a idade do terceiro irmão: ");
    int idade3 = sc.nextInt();
    if (idade1 == idade2 && idade1 == idade3) {
        System.out.println("TRIGÊMEOS");
    } else if (idade1 == idade2 || idade1 == idade3 || idade2 == idade3){
        System.out.println("GÊMEOS");
    } else {
        System.out.println("APENAS IRMÃOS");

    }
        
    

}
}
