import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Heroe {
    String Nombre;
    int Nivel;
    int PuntosVida;
    Arma arma;

    ArrayList<Heroe> Heroes=new ArrayList<>();
    ArrayList<Arma> Arsenal=new ArrayList<>();

    public void gestionArsenal(){
        if (Arsenal.isEmpty()) {
            Arsenal.add(new Arma("Bastón Arcano",50));
            Arsenal.add(new Arma("Arco Místico",60));
            Arsenal.add(new Arma("Espada Mortífera",75));
            Arsenal.add(new Arma("Daga Venenosa",40));
        }
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getNivel() {
        return Nivel;
    }

    public void setNivel(int nivel) {
        Nivel = nivel;
    }

    public int getPuntosVida() {
        return PuntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        PuntosVida = puntosVida;
    }

    public Heroe(String nombre, int nivel, int puntosVida, Arma arma) {
        Nombre = nombre;
        Nivel = nivel;
        PuntosVida = puntosVida;
        this.arma = arma;
    }

    public Heroe() {
    }

    @Override
    public String toString() {
        return "Heroe -> " +
                "Nombre='" + Nombre + '\'' +
                ", Nivel=" + Nivel +
                ", PuntosVida=" + PuntosVida;
    }

    public void seleccionHeroe(){
        Scanner sc=new Scanner(System.in);
        boolean boo=true;
        System.out.println("1.Guerrero/a");
        System.out.println("2.Mago/a");
        System.out.println("3.Arquero/a");
        System.out.println("4.Asesino/a");
        int opcion=sc.nextInt();
        if (opcion>4||opcion<1){
            System.out.println("Elige una opción válida");
        }else {
        if (boo) {
            if (opcion == 1) {
                System.out.println("¿Cual es el nombre del Guerrero ?");
                String nombre = sc.next();
                System.out.println("¿Cuál es su nivel?");
                int lvl = sc.nextInt();
                System.out.println("¿Cuántos puntos de vida tiene?");
                int pv = sc.nextInt();
                System.out.println("¿Cuanta fuerza tiene del Guerrero?");
                int fuerza = sc.nextInt();
                System.out.println("Nombre del Guerrero: " + nombre);
                System.out.println("Nivel: " + lvl);
                System.out.println("Puntos de Vida: " + pv);
                System.out.println("Fuerza: " + fuerza);
                System.out.println();
                Heroes.add(new Guerrero(nombre,lvl,pv,seleccionArma(),fuerza));

            } else if (opcion == 2) {
                System.out.println("¿Cual es el nombre del Mago ?");
                String nombre = sc.next();
                System.out.println("¿Cuál es su nivel?");
                int lvl = sc.nextInt();
                System.out.println("¿Cuántos puntos de vida tiene?");
                int pv = sc.nextInt();
                System.out.println("¿Cuanta maná tiene el mago?");
                int mana = sc.nextInt();
                System.out.println("Nombre del Mago: " + nombre);
                System.out.println("Nivel: " + lvl);
                System.out.println("Puntos de Vida: " + pv);
                System.out.println("Maná: " + mana);
                System.out.println();
                Heroes.add(new Mago(nombre,lvl,pv,seleccionArma(),mana));
            } else if (opcion == 3) {
                System.out.println("¿Cual es el nombre del Arquero ?");
                String nombre = sc.next();
                System.out.println("¿Cuál es su nivel?");
                int lvl = sc.nextInt();
                System.out.println("¿Cuántos puntos de vida tiene?");
                int pv = sc.nextInt();
                System.out.println("¿Cuanta precision tiene el Arquero?");
                int punteria = sc.nextInt();
                System.out.println("Nombre del Arquero: " + nombre);
                System.out.println("Nivel: " + lvl);
                System.out.println("Puntos de Vida: " + pv);
                System.out.println("Punteria: " + punteria);
                System.out.println();
                Heroes.add(new Arquero(nombre,lvl,pv,seleccionArma(),punteria));
            } else if (opcion == 4) {
                System.out.println("¿Cual es el nombre del Asesino ?");
                String nombre = sc.next();
                System.out.println("¿Cuál es su nivel?");
                int lvl = sc.nextInt();
                System.out.println("¿Cuántos puntos de vida tiene?");
                int pv = sc.nextInt();
                System.out.println("¿Cuanto sigilo tiene el asesino?");
                int sigilo = sc.nextInt();
                System.out.println("Nombre del Asesino: " + nombre);
                System.out.println("Nivel: " + lvl);
                System.out.println("Puntos de Vida: " + pv);
                System.out.println("Sigilo: " + sigilo);
                System.out.println();
                Heroes.add(new Asesino(nombre,lvl,pv,seleccionArma(),sigilo));

            }
            }
        }
    }
    public Arma seleccionArma(){
        Scanner sc=new Scanner(System.in);
        boolean boo=true;
        printArmas();
        Arma ar = new Arma();
        do {
            try {
                System.out.println("¿Que arma quieres que posea tu héroe?");
                int respu = sc.nextInt();
                if (respu > 4) {
                    ar = Arsenal.get(respu - 1);
                    System.out.println("Tu héroe posee una " + ar.Nombre);
                    boo=false;
                }

                if (respu == 1) {
                    System.out.println("Tu héroe posee un Bastón Arcano ");
                    ar = Arsenal.getFirst();
                    boo=false;
                }

                if (respu == 2) {
                    System.out.println("Tu héroe posee un Arco Místico ");
                    ar = Arsenal.get(1);
                    boo=false;
                }
                if (respu == 3) {
                    System.out.println("Tu héroe posee una Espada Mortífera ");
                    ar = Arsenal.get(2);
                    boo=false;
                }
                if (respu == 4) {
                    System.out.println("Tu héroe posee una Daga Venenosa ");
                    ar = Arsenal.get(3);
                    boo=false;
                }

            } catch (Exception e) {
                System.out.println("Error elige una opción válida");
                sc.nextLine();
            }
        } while (boo);
        return ar;
    }
    public void printHeroes(){
        int cont =1;
        System.out.println("Lista de Heroes :");
        if (Heroes.isEmpty()){
            System.out.println("No hay heroes registrados");
        }
        for (Heroe hero:Heroes){
            System.out.println(cont+". "+hero);
            cont++;

        }
    }
    public void printArmas(){
        int cont =1;
        gestionArsenal();
        System.out.println("Lista de Armas :");
        if (Arsenal.isEmpty()){
            System.out.println("No hay armas registradas");
        }
        for (Arma arma:Arsenal){
            System.out.println(cont+". "+arma);
            cont++;
        }

    }
    public Heroe buscarHeroe(String nombre){
        for (Heroe conta:Heroes){
            if (conta.getNombre().equalsIgnoreCase(nombre)){
                return conta;
            }
        }
        return null;
    }

    public void insertarArma(){
        Scanner sc=new Scanner(System.in);
        gestionArsenal();
        System.out.println("¿Cuál es el nombre del arma?");
        String nombre= sc.nextLine();
        System.out.println("¿Cuanto daño tiene?");
        int danyo= sc.nextInt();
        System.out.println("Arma añadida al arsenal");
        Arsenal.add(new Arma(nombre,danyo));
    }
}
