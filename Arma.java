public class Arma {
    String Nombre;
    int damage;

    public Arma(String nombre, int damage) {
        Nombre = nombre;
        this.damage = damage;
    }

    @Override
    public String toString() {
        return
                Nombre + " | "+
                        " Daño-> " + damage ;
    }
}
