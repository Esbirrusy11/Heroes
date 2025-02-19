public class Guerrero extends  Heroe{
   int fuerza;


    public Guerrero(String nombre, int nivel, int puntosVida, Arma arma, int fuerza) {
        super(nombre, nivel, puntosVida, arma);
        this.fuerza = fuerza;
    }

    @Override
    public String toString() {
        return "Guerrero ->" +
                " Nombre-> " + Nombre +
                " Nivel-> " + Nivel +
                " PuntosVida-> " + PuntosVida +
                " Fuerza-> " + fuerza +
                " || Arma-> " + arma;
    }
}
