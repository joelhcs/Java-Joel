package exercicios_semestre2.sonora_fase03.test;
import exercicios_semestre2.sonora_fase03.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
public class PlataformaTest {
    
    private Plataforma plataforma;
    
    @BeforeEach
    public void configurar() {
        plataforma = new Plataforma();
    }

    @Test
    @DisplayName("Buscar música cadastrada pelo título")
    public void buscarMusicaPorTitulo() {
        Musica musica = new Musica("Hotel California", "Eagles" , 354);
        
        plataforma.cadastrarMusica(musica);

        assertEquals(musica, plataforma.buscarMusica("Hotel California"));
    }

    @Test
    @DisplayName("Buscar música por título inexistente")
    public void buscarMusicaPorTituloInexistente() {
        Musica resultado = plataforma.buscarMusica("Imagine");

        assertNull(resultado);
    }

    @Test
    @DisplayName("Buscar música cadastrada pelo ID")
    public void buscarMusicaPorId() {
        Musica musica = new Musica("Hotel California", "Eagles" , 354);
        
        plataforma.cadastrarMusica(musica);

        assertEquals(musica, plataforma.buscarMusicaPorId(1));
    }

    @Test
    @DisplayName("Buscar música por ID inexistente")
    public void buscarMusicaPorIdInexistente() {
        assertNull(plataforma.buscarMusicaPorId(999));
    }
}