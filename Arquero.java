public class Arquero extends Heroe {
    int punteria;

    public Arquero(String nombre, int nivel, int puntosVida, Arma arma, int punteria) {
        super(nombre, nivel, puntosVida, arma);
        this.punteria = punteria;
    }

    @Override
    public String toString() {
        return "Arquero ->" +
                " Nombre-> " + Nombre +
                " Nivel-> " + Nivel +
                " PuntosVida-> " + PuntosVida +
                " Punteria-> " + punteria +
                " || Arma-> " + arma;
    }
}
