package exercicios_semestre1;

public class Uni5Exe21 {
    public static void main(String[] args) {
        
        double alturaChico = 1.5, alturaZe = 1.1;
        int ano = 0;

        while (alturaChico >= alturaZe) {
            
            alturaChico += 0.02;
            alturaZe += 0.03;
            ano++;
        }

        System.out.println(ano + " anos");
    }
}