import java.util.ArrayList;

public class Mago extends Heroe{
    int mana;

    public Mago(String nombre, int nivel, int puntosVida, ArrayList<Arma> arsenalHeroe, int mana) {
        super(nombre, nivel, puntosVida, arsenalHeroe);
        this.mana = mana;
    }

    @Override
    public String toString() {
        return "Mago ->" +
                " Nombre-> " + Nombre +
                " Nivel-> " + Nivel +
                " PuntosVida-> " + PuntosVida +
                " Maná-> " + mana +
                " || Armas-> " + arsenalHeroe;

    }
}
