import java.util.ArrayList;

public class Asesino extends Heroe{
    int sigilo;

    public Asesino(String nombre, int nivel, int puntosVida, ArrayList<Arma> arsenalHeroe, int sigilo) {
        super(nombre, nivel, puntosVida, arsenalHeroe);
        this.sigilo = sigilo;
    }

    @Override
    public String toString() {
        return "Asesino ->" +
                " Nombre-> " + Nombre +
                " Nivel-> " + Nivel +
                " PuntosVida-> " + PuntosVida +
                " Sigilo-> " + sigilo +
                " || Armas-> " + arsenalHeroe;
    }
}
