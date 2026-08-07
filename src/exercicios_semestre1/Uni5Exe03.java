package exercicios_semestre1;

public class Uni5Exe03 {
    public static void main(String[] args) {
        
        double resultado = 0;

        for(int a = 1; a <= 100; a++) {

            resultado += 1.0/a;
        }

        System.out.println(resultado);
    }
}