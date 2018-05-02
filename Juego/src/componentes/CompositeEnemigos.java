package componentes;

import personajes.Personaje;
import java.util.ArrayList;

public class CompositeEnemigos {

    private ArrayList<Personaje> enemigos;

    public CompositeEnemigos() {
        enemigos = new ArrayList<>();
    }

    public void setAgregarEnemigos(ArrayList<Personaje> e) {
        enemigos = e;
    }

    public ArrayList<Personaje> getAgregarEnemigos() {
        return enemigos;
    }
}
