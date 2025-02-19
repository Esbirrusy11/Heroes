public class Mago extends Heroe{
    int mana;

    public Mago(String nombre, int nivel, int puntosVida, Arma arma, int mana) {
        super(nombre, nivel, puntosVida, arma);
        this.mana = mana;
    }

    @Override
    public String toString() {
        return "Mago ->" +
                " Nombre-> " + Nombre +
                " Nivel-> " + Nivel +
                " PuntosVida-> " + PuntosVida +
                " Maná-> " + mana +
                " || Arma-> " + arma;
    }
}
