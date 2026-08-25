package exercicios_semestre2.sonora_fase02;
public class Plataforma {

    private Musica[] musicas;
    private Usuario[] usuarios;
    private int totalMusicas;
    private int totalUsuarios;

    public Plataforma() {
        musicas = new Musica[500];
        usuarios = new Usuario[500];
    }

    public boolean cadastrarMusica(Musica musica) {
        if (musica == null || totalMusicas >= musicas.length) {
            return false;            
        }

        musicas[totalMusicas] = musica;
        totalMusicas++;
        
        return true;
    }

    public boolean cadastrarUsuario(Usuario usuario) {
        if (usuario == null || totalUsuarios >= usuarios.length) {
            return false;
        }

        usuarios[totalUsuarios] = usuario;
        totalUsuarios++;

        return true;
    }

    public Musica buscarMusicaPorId(int id) {
        for(int i = 0; i < totalMusicas; i++) {
            if (musicas[i].getId() == id) {
                return musicas[i];
            }
        }

        return null;
    }

    public Musica buscarMusica(String titulo) {
        for(int i = 0; i < totalMusicas; i++) {
            if (musicas[i].getTitulo().equals(titulo)) {
                return musicas[i];
            }
        }

        return null;
    }

    public Usuario buscarUsuarioPorId(int id) {
        for(int i = 0; i < totalUsuarios; i++) {
            if (usuarios[i].getId() == id) {
                return usuarios[i];
            }
        }

        return null;
    }

    public int getTotalMusicas() {
        return totalMusicas;
    }

    public int getTotalUsuarios() {
        return totalUsuarios;
    }
}