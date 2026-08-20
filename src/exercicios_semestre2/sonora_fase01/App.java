package exercicios_semestre2.sonora_fase01;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Plataforma plataforma = new Plataforma();
        
        Musica musica1 = new Musica("Hotel California", "Eagles", 354);
        Musica musica2 = new Musica("Billie Jean", "Michael Jackson", 294);
        Musica musica3 = new Musica("Construção", "Chico Buarque", 385);
        
        plataforma.cadastrarMusica(musica1);
        plataforma.cadastrarMusica(musica2);
        plataforma.cadastrarMusica(musica3);

        int opcao;

        do {
            System.out.println("=== Sonora ===");
            System.out.println("1 - Cadastrar música manualmente");
            System.out.println("2 - Cadastrar usuário");
            System.out.println("3 - Criar playlist e adicionar músicas");
            System.out.println("4 - Buscar música por id");
            System.out.println("5 - Buscar música por título");
            System.out.println("6 - Reproduzir uma música");
            System.out.println("7 - Listar acervo");
            System.out.println("0 - Sair");
        } while (opcao != 0);
    }
}

