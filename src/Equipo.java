import java.util.ArrayList;
import java.util.List;

public class Equipo {
    String nom;
    List titulars = new ArrayList<Jugador>();
    List reserves = new ArrayList<Jugador>();
    Entrenador entrenador = new Entrenador();
    String tag;
}