public class Asesino extends Heroe{
    int sigilo;

    public Asesino(String nombre, int nivel, int puntosVida, Arma arma, int sigilo) {
        super(nombre, nivel, puntosVida, arma);
        this.sigilo = sigilo;
    }

    @Override
    public String toString() {
        return "Asesino ->" +
                " Nombre-> " + Nombre +
                " Nivel-> " + Nivel +
                " PuntosVida-> " + PuntosVida +
                " Sigilo-> " + sigilo +
                " || Arma-> " + arma;
    }
}
