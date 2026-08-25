package exercicios_semestre2.sonora_fase02;
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

            if (sc.hasNextInt()) {
                opcao = sc.nextInt();
                sc.nextLine();
            } else {
                System.out.println("Digite uma opção válida.");
                sc.next();
                opcao = -1;
            }

            switch (opcao) {
                case 1:
                    System.out.println("Título: ");
                    String titulo = sc.nextLine();

                    System.out.println("Artista: ");
                    String artista = sc.nextLine();

                    System.out.println("Duração em segundos: ");
                    int duracao = sc.nextInt();
                    sc.nextLine();

                    Musica musica = new Musica(titulo, artista, duracao);

                    if (plataforma.cadastrarMusica(musica)) {
                        System.out.println("Música cadastrada com sucesso!");
                        System.out.println("ID: " + musica.getId());
                    } else {
                        System.out.println("Não foi possível cadastrar a música.");
                    }
                    break;
            
                case 2:
                    System.out.println("Nome: ");
                    String nomeUsuario = sc.nextLine();

                    System.out.println("E-mail: ");
                    String email = sc.nextLine();

                    Usuario usuario = new Usuario(nomeUsuario, email);

                    if (plataforma.cadastrarUsuario(usuario)) {
                        System.out.println("Usuário cadastrado com sucesso!");
                        System.out.println("ID: " + usuario.getId());
                    } else {
                        System.out.println("Não foi possível cadastrar o usuário.");
                    }
                    break;

                case 3:
                    System.out.println("Nome da playlist: ");
                    String nomePlaylist = sc.nextLine();

                    System.out.println("ID do usuário dono: ");
                    int idDono = sc.nextInt();
                    sc.nextLine();

                    Usuario dono = plataforma.buscarUsuarioPorId(idDono);

                    if (dono == null) {
                        System.out.println("Usuário não encontrado.");
                        break;
                    }

                    Playlist playlist = new Playlist(nomePlaylist, dono);

                    System.out.println("Quantas músicas deseja adicionar? ");
                    int quantidadeMusicas = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < quantidadeMusicas; i++) {
                        System.out.println("Digite o ID da música " + (i+1) + ": ");
                        int idMusica = sc.nextInt();
                        sc.nextLine();

                        Musica musicaPlaylist = plataforma.buscarMusicaPorId(idMusica);

                        if (musicaPlaylist == null) {
                            System.out.println("Música não encontrada.");
                        } else if (playlist.adicionar(musicaPlaylist)) {
                            System.out.println("Música adicionada.");
                        }
                    }

                    System.out.println("Playlist criada com sucesso!");
                    System.out.println("Músicas na playlist: " + playlist.getQuantidade());
                    break;

                case 4:
                    System.out.println("Digite o ID da música: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    Musica musicaId = plataforma.buscarMusicaPorId(id);

                    if (musicaId == null) {
                        System.out.println("Música não encontrada.");
                    } else {
                        System.out.println("ID: " + musicaId.getId());
                        System.out.println("Título: " + musicaId.getTitulo());
                        System.out.println("Artsta: " + musicaId.getArtista());
                        System.out.println("Duração: " + musicaId.getDuracaoFormatada());
                        System.out.println("Reproduções: " + musicaId.getReproducoes());
                    }
                    break;

                case 5:
                    System.out.println("Digite o título: ");
                    String tituloBusca = sc.nextLine();

                    Musica musicaTitulo = plataforma.buscarMusica(tituloBusca);

                    if (musicaTitulo == null) {
                        System.out.println("Música não encontrada.");
                    } else {
                        System.out.println("ID: " + musicaTitulo.getId());
                        System.out.println("Título: " + musicaTitulo.getTitulo());
                        System.out.println("Artsta: " + musicaTitulo.getArtista());
                        System.out.println("Duração: " + musicaTitulo.getDuracaoFormatada());
                        System.out.println("Reproduções: " + musicaTitulo.getReproducoes());
                    }
                    break;

                case 6:
                    System.out.println("Digite o ID da música: ");
                    int idReproducao = sc.nextInt();
                    sc.nextLine();

                    Musica musicaReproduzir = plataforma.buscarMusicaPorId(idReproducao);

                    if (musicaReproduzir == null) {
                        System.out.println("Música não encontrada.");
                    } else {
                        musicaReproduzir.reproduzir();
                        System.out.println("Reproduzindo: " + musicaReproduzir.getTitulo());
                        System.out.println("Reproduções: " + musicaReproduzir.getReproducoes());
                    }

                    break;

                case 7:
                    System.out.println();
                    System.out.println("=== Acervo ===");

                    if (plataforma.getTotalMusicas() == 0) {
                        System.out.println("Nenhuma música cadastrada.");
                    } else {
                        for (int i = 0; i < plataforma.getTotalMusicas(); i++) {
                            Musica musicaAcervo = plataforma.buscarMusicaPorId(i + 1);

                            if (musicaAcervo != null) {
                                System.out.println(
                                    "ID: " + musicaAcervo.getId()
                                    + " | " + musicaAcervo.getTitulo()
                                    + " | " + musicaAcervo.getArtista()
                                    + " | " + musicaAcervo.getDuracaoFormatada()
                                    + " | Reproduções: " + musicaAcervo.getReproducoes()
                                );
                            }
                        }
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o Sonora...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }
}

