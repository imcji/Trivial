import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import smellytrivial.Game;

public class TrivialTests {

    @Test
    public void crear_Game(){
        Game trivial = new Game();
    }
    @Test
    public void minimo_dos_jugadores_para_jugar() {
        Game trivial = new Game();
        boolean esJugable = trivial.esJugable();
        Assertions.assertTrue(esJugable);
    }
    @Test
    public void maximo_seis_jugadores_para_jugar() {
        Game trivial = new Game();
        boolean esJugable = trivial.esJugable();
        Assertions.assertTrue(esJugable);
    }
}
