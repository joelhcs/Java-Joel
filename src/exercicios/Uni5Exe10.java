package exercicios;
public class Uni5Exe10 {
    public static void main(String[] args) {

        int encontrados = 0;

        for(int numero = 1; encontrados < 10; numero++) {

            int digitos = 0;
            
            for(int temp = numero; temp > 0; temp /= 10 ) {
                digitos++;
            }

            if (digitos % 2 == 0) {
                int metade = digitos/2;
                int divisor = (int) Math.pow(10, metade);
                int parte1 = numero / divisor;
                int parte2 = numero % divisor;
                int soma = parte1 + parte2;
            

            if (soma * soma == numero) {

                System.out.println(numero);
                encontrados++;
                
            }
            }
        }


    }
}

