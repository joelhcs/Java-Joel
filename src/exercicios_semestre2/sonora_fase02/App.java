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

            while (true) {
                try {
                    System.out.println("Escolha uma opção: ");
                    opcao = Integer.parseInt(sc.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Valor inválido. Digite um número.");
                }
            }

            switch (opcao) {
                case 1:
                    
                    int duracao;

                    System.out.println("Título: ");
                    String titulo = sc.nextLine();

                    System.out.println("Artista: ");
                    String artista = sc.nextLine();

                    while (true) {
                        try {
                            System.out.println("Duração em segundos: ");
                            duracao = Integer.parseInt(sc.nextLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Valor inválido. Digite um número");
                        }
                    }    

                    try {
                    Musica musica = new Musica(titulo, artista, duracao);

                    if (plataforma.cadastrarMusica(musica)) {
                        System.out.println("Música cadastrada com sucesso!");
                        System.out.println("ID: " + musica.getId());
                    } else {
                        System.out.println("Não foi possível cadastrar a música");
                    }

                    } catch (IllegalArgumentException e) {
                        System.out.println("Não foi possível cadastrar: " + e.getMessage());
                    }
                    break;
            
                case 2:
                    
                try {
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
                } catch (IllegalArgumentException e) {
                    System.out.println("Erro: " + e.getMessage());
                }
                    break;

                case 3:
                    
                    int idDono;

                    System.out.println("Nome da playlist: ");
                    String nomePlaylist = sc.nextLine();

                    while (true) {
                        try {
                            System.out.println("ID do usuário dono: ");
                            idDono = Integer.parseInt(sc.nextLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Valor inválido. Digite um número");
                        }
                    }

                    Usuario dono = plataforma.buscarUsuarioPorId(idDono);

                    if (dono == null) {
                        System.out.println("Usuário não encontrado.");
                        break;
                    }

                    try {
                    
                        Playlist playlist = new Playlist(nomePlaylist, dono);
                        int quantidadeMusicas;
                        
                        while (true) {
                            try {
                                System.out.println("Quantas músicas deseja adicionar? ");
                                quantidadeMusicas = Integer.parseInt(sc.nextLine());
                                if (quantidadeMusicas < 0) {
                                    System.out.println("A quantidade não pode ser negativa.");
                                } else {
                                break;
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Valor inválido. Digite um número.");
                            }
                        }
                
                        for (int i = 0; i < quantidadeMusicas; i++) {
                            int idMusica;
                            
                            while (true) {
                                
                                try {
                                    System.out.println("Digite o ID da música " + (i+1) + ": ");
                                    idMusica = Integer.parseInt(sc.nextLine());
                                    break;
                                } catch (NumberFormatException e) {
                                    System.out.println("Valor inválido. Digite um número");
                                }
                            }

                            Musica musicaPlaylist = plataforma.buscarMusicaPorId(idMusica);

                            if (musicaPlaylist == null) {
                                System.out.println("Música não encontrada.");
                            } else if (playlist.adicionar(musicaPlaylist)) {
                                System.out.println("Música adicionada.");
                            } else {
                                System.out.println("Playlist cheia.");
                            }
                        }

                        System.out.println("Playlist criada com sucesso!");
                        System.out.println("Músicas na playlist: " + playlist.getQuantidade());
                    } catch (IllegalArgumentException e) {
                        System.out.println("Erro: " + e.getMessage());
                }
                
                break;

                case 4:
                    int id;

                    while (true) {
                        try {
                            System.out.println("Digite o ID da música: ");
                            id = Integer.parseInt(sc.nextLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Valor inválido. Digite um número.");
                        }
                    }

                    Musica musicaId = plataforma.buscarMusicaPorId(id);

                    if (musicaId == null) {
                        System.out.println("Música não encontrada.");
                    } else {
                        System.out.println("ID: " + musicaId.getId());
                        System.out.println("Título: " + musicaId.getTitulo());
                        System.out.println("Artista: " + musicaId.getArtista());
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
                        System.out.println("Artista: " + musicaTitulo.getArtista());
                        System.out.println("Duração: " + musicaTitulo.getDuracaoFormatada());
                        System.out.println("Reproduções: " + musicaTitulo.getReproducoes());
                    }
                    break;

                case 6:
                    System.out.println("Digite o ID da música: ");
                    try {
                        int idReproducao = Integer.parseInt(sc.nextLine());

                        Musica musicaReproduzir = plataforma.buscarMusicaPorId(idReproducao);

                        musicaReproduzir.reproduzir();
                        System.out.println("Reproduzindo: " + musicaReproduzir.getTitulo());
                        System.out.println("Reproduções: " + musicaReproduzir.getReproducoes());
                    } catch (NumberFormatException e) {
                        System.out.println("A posição precisa ser um número.");
                    } catch(NullPointerException e) {
                        System.out.println("Música não encontrada");
                    } finally {
                        System.out.println("Operação concluída.");
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