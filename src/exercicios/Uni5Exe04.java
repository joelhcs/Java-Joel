package exercicios;

public class Uni5Exe04 {
    public static void main(String[] args) {
        
        double resultado = 0;

        for(int a = 1; a <= 20; a++) {
            
           double numerador = 2*a + 1;
           double denominador = a * (a+1);

           resultado += numerador/denominador;

        }

        System.out.println(resultado);
    }
}
