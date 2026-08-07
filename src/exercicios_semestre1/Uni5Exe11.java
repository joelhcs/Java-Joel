package exercicios_semestre1;

public class Uni5Exe11 {
    public static void main(String[] args) {
        
        int qtdbiscoito = 0, biscoito = 1;

        for(int n = 1; n <= 16; n++) {

            qtdbiscoito += biscoito;          
            biscoito *= 3;
        }

        System.out.println(qtdbiscoito);

    }
}