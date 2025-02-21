import java.util.ArrayList;

public class Guerrero extends  Heroe{
    int fuerza;


    public Guerrero(String nombre, int nivel, int puntosVida, ArrayList<Arma> arsenalHeroe, int fuerza) {
        super(nombre, nivel, puntosVida, arsenalHeroe);
        this.fuerza = fuerza;
    }

    @Override
    public String toString() {
        return "Guerrero ->" +
                " Nombre-> " + Nombre +
                " Nivel-> " + Nivel +
                " PuntosVida-> " + PuntosVida +
                " Fuerza-> " + fuerza +
                " || Armas-> " + arsenalHeroe;
    }
}
