package exercicios_semestre2.sonora_fase03.test;
import exercicios_semestre2.sonora_fase03.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
public class MusicaTest {
    private Musica musica;

    @BeforeEach
    public void configurar() {
        musica = new Musica("Musica", "Artista", 100);
    }

    @Test
    @DisplayName("Reproduzir uma música uma vez")
    public void reproduzirUmaVez() {
        musica.reproduzir();

        assertEquals(1, musica.getReproducoes());
    }

    @Test
    @DisplayName("Reproduzir uma música duas vezes")
    public void reproduzirDuasVezes() {
        musica.reproduzir();
        musica.reproduzir();

        assertEquals(2, musica.getReproducoes());
    }

    @Test
    @DisplayName("Reproduzir uma música três vezes")
    public void reproduzirTresVezes() {
        musica.reproduzir();
        musica.reproduzir();
        musica.reproduzir();

        assertEquals(3, musica.getReproducoes());
    }

    @Test
    @DisplayName("IDs de músicas devem ser sequenciais")
    public void idsMusicasSequenciais() {
        Musica segunda = new Musica ("2","2",2);
        Musica terceira = new Musica("3","3",3);

        assertEquals(musica.getId() + 1, segunda.getId());
        assertEquals(segunda.getId() + 1, terceira.getId());
    }

    @Test
    @DisplayName("IDs de usuários devem ser sequenciais")
    public void idsUsuariosSequenciais() {
        Usuario um = new Usuario("1", "1@");
        Usuario dois = new Usuario("2", "2@");
        Usuario tres = new Usuario("3","3@");

        assertEquals(um.getId() + 1, dois.getId());
        assertEquals(dois.getId() + 1, tres.getId());
    }

    @Test
    @DisplayName("IDs de música e usuário são independentes")
    public void musicaUsuarioIndependentes() {
        Musica segunda = new Musica("2","2",2);
        Usuario um = new Usuario("1", "1@");

        assertEquals(segunda.getId(), um.getId() + 1);
    }
}