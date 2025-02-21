import java.util.ArrayList;

public class Arquero extends Heroe {
    int punteria;

    public Arquero(String nombre, int nivel, int puntosVida, ArrayList<Arma> arsenalHeroe, int punteria) {
        super(nombre, nivel, puntosVida, arsenalHeroe);
        this.punteria = punteria;
    }

    @Override
    public String toString() {
        return "Arquero ->" +
                " Nombre-> " + Nombre +
                " Nivel-> " + Nivel +
                " PuntosVida-> " + PuntosVida +
                " Punteria-> " + punteria +
                " || Armas-> " + arsenalHeroe;
    }
}
