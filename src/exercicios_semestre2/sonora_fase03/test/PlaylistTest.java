package exercicios_semestre2.sonora_fase03.test;
import exercicios_semestre2.sonora_fase03.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
public class PlaylistTest {

    private Playlist playlist;
    private Musica musica;

    @BeforeEach
    public void configurar() {
        Usuario usuario = new Usuario("Joel", "joel@email.com");
        playlist = new Playlist("Favoritas", usuario);
        musica = new Musica("Hotel California", "Eagles", 354);
    }

    @Test
    @DisplayName("Adicionar música em playlist com espaço disponível")
    public void adicionarMusicaComEspaco() {
        boolean resultado = playlist.adicionar(musica);

        assertTrue(resultado);
        assertEquals(1, playlist.getQuantidade());

    }

    @Test
    @DisplayName("Adicionar música em playlist com espaço disponível")
    public void adicionarSegundaMusica() {
        playlist.adicionar(musica);

        Musica segundaMusica = new Musica("Billie Jean", "Michael Jackson", 294);

        boolean resultado = playlist.adicionar(segundaMusica);

        assertTrue(resultado);
        assertEquals(2, playlist.getQuantidade());
    }

    @Test
    @DisplayName("Tentar adicionar música em playlist cheia")
    public void adicionarEmPlaylistCheia() {
        for (int i = 0; i < 100; i++) {
            Musica musica = new Musica("Musica " + i, "Artista " + i, 100);
            playlist.adicionar(musica);
        }

        Musica musicaExtra = new Musica("Música extra", "Artista extra", 100);

        boolean resultado = playlist.adicionar(musicaExtra);

        assertFalse(resultado);
        assertEquals(100, playlist.getQuantidade());
    }

    @Test
    @DisplayName("Buscar música em uma posição válida")
    public void buscarEmPosicaoValida() {
        playlist.adicionar(musica);
        Musica segundaMusica = new Musica("Billie Jean", "Michael Jackson", 294);
        playlist.adicionar(segundaMusica);

        Musica resultado = playlist.getNaPosicao(0);

        assertEquals(musica, resultado);
    }

    @Test
    @DisplayName("Buscar música com índice negativo")
    public void buscaMusicaIndiceNegativo() {
        playlist.adicionar(musica);
        Musica segundaMusica = new Musica("Billie Jean", "Michael Jackson", 294);
        playlist.adicionar(segundaMusica);

        assertThrows(IndexOutOfBoundsException.class, () -> playlist.getNaPosicao(-2));
    }

    @Test
    @DisplayName("Buscar música com índice além da quantidade")
    public void buscarAlemDaQuantidade() {
        playlist.adicionar(musica);

        assertThrows(IndexOutOfBoundsException.class, () -> playlist.getNaPosicao(1));

   }
}