import java.util.ArrayList;
import java.util.Scanner;

public class Heroe {
    String Nombre;
    int Nivel;
    int PuntosVida;
   
    ArrayList<Heroe> Heroes=new ArrayList<>();
    ArrayList<Arma> Arsenal=new ArrayList<>();
    ArrayList<Arma> arsenalHeroe=new ArrayList<>();

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

    public Heroe(String nombre, int nivel, int puntosVida, ArrayList<Arma> arsenalHeroe) {
        Nombre = nombre;
        Nivel = nivel;
        PuntosVida = puntosVida;
        this.arsenalHeroe = new ArrayList<>(arsenalHeroe);
    }

    public Heroe() {
    }

    public void seleccionHeroe(){
        Scanner sc=new Scanner(System.in);
        boolean boo=true;
        do {
            try {
                System.out.println("1.Guerrero/a");
                System.out.println("2.Mago/a");
                System.out.println("3.Arquero/a");
                System.out.println("4.Asesino/a");
                int opcion=sc.nextInt();
                sc.nextLine();

                if (opcion>4||opcion<1){
                    System.out.println("Elige una opción válida");
                }else {

                    int lvl=-1;
                    int pv=-1;
                    System.out.println("¿Cual es el nombre del Héroe ?");
                    String nombre = sc.nextLine();
                    while (lvl<0){
                        System.out.println("¿Cuál es su nivel?");
                        lvl = sc.nextInt();
                    }
                    while (pv<0){
                        System.out.println("¿Cuántos puntos de vida tiene?");
                        pv = sc.nextInt();
                    }
                    if (opcion == 1) {

                        int fuerza=-1;
                        while (fuerza<0){
                            System.out.println("¿Cuanta fuerza tiene del Guerrero?");
                            fuerza = sc.nextInt();
                        }
                        System.out.println("Nombre del Guerrero: " + nombre);
                        System.out.println("Nivel: " + lvl);
                        System.out.println("Puntos de Vida: " + pv);
                        System.out.println("Fuerza: " + fuerza);
                        System.out.println();
                        Heroes.add(new Guerrero(nombre,lvl,pv,seleccionArma(),fuerza));
                        arsenalHeroe.clear();
                        boo=false;

                    } else if (opcion == 2) {

                        int mana=-1;
                        while (mana<0){
                            System.out.println("¿Cuanta maná tiene el mago?");
                            mana = sc.nextInt();
                        }
                        System.out.println("Nombre del Mago: " + nombre);
                        System.out.println("Nivel: " + lvl);
                        System.out.println("Puntos de Vida: " + pv);
                        System.out.println("Maná: " + mana);
                        System.out.println();
                        Heroes.add(new Mago(nombre,lvl,pv,seleccionArma(),mana));
                        arsenalHeroe.clear();
                        boo=false;

                    } else if (opcion == 3) {

                        int precision=-1;
                        while (precision<0){
                            System.out.println("¿Cuanta precision tiene el Arquero?");
                            precision = sc.nextInt();
                        }

                        System.out.println("Nombre del Arquero: " + nombre);
                        System.out.println("Nivel: " + lvl);
                        System.out.println("Puntos de Vida: " + pv);
                        System.out.println("Punteria: " + precision);
                        System.out.println();
                        Heroes.add(new Arquero(nombre,lvl,pv,seleccionArma(),precision));
                        arsenalHeroe.clear();
                        boo=false;

                    } else if (opcion == 4) {

                        int sigilo=-1;
                        while (sigilo<0){
                            System.out.println("¿Cuanto sigilo tiene el asesino?");
                            sigilo = sc.nextInt();
                        }

                        System.out.println("Nombre del Asesino: " + nombre);
                        System.out.println("Nivel: " + lvl);
                        System.out.println("Puntos de Vida: " + pv);
                        System.out.println("Sigilo: " + sigilo);
                        System.out.println();
                        Heroes.add(new Asesino(nombre,lvl,pv,seleccionArma(),sigilo));
                        arsenalHeroe.clear();
                        boo=false;
                    }
                }
            }catch (Exception e){
                System.out.println("Error: Elige un tipo de heroe");
                sc.nextLine();
            }
        }while (boo);
    }


    public ArrayList<Arma> seleccionArma(){
        Scanner sc=new Scanner(System.in);
        Arma ar;
        int cont=0;
        System.out.println("¿Cuántas armas quieres que posea tu héroe?");
        int respus= sc.nextInt();
        do {
            try {
                printArmas();
                System.out.println("¿Que arma quieres que posea tu héroe?");
                int respu = sc.nextInt();
                if (respu<=0){
                    System.out.println();
                    System.out.println("Elige una opción válida");
                    printArmas();
                }
                if (respu > 4) {
                    System.out.println();
                    ar = Arsenal.get(respu - 1);
                    System.out.println("Tu héroe posee una " + ar.Nombre);
                    arsenalHeroe.add(ar);
                    cont++;

                }

                if (respu == 1) {
                    System.out.println();
                    System.out.println("Tu héroe posee un Bastón Arcano ");
                    ar = Arsenal.getFirst();
                    arsenalHeroe.add(ar);
                    cont++;
                }

                if (respu == 2) {
                    System.out.println();
                    System.out.println("Tu héroe posee un Arco Místico ");
                    ar = Arsenal.get(1);
                    arsenalHeroe.add(ar);
                    cont++;

                }
                if (respu == 3) {
                    System.out.println();
                    System.out.println("Tu héroe posee una Espada Mortífera ");
                    ar = Arsenal.get(2);
                    arsenalHeroe.add(ar);
                    cont++;
                }
                if (respu == 4) {
                    System.out.println();
                    System.out.println("Tu héroe posee una Daga Venenosa ");
                    ar = Arsenal.get(3);
                    arsenalHeroe.add(ar);
                    cont++;

                }

            } catch (Exception e) {
                System.out.println();
                System.out.println("Error elige una opción válida");
                sc.nextLine();
            }
        } while (cont<respus);
        return arsenalHeroe;

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

    public void insertarArma() {
        Scanner sc = new Scanner(System.in);
        gestionArsenal();
        boolean boo=true;
        System.out.println("¿Cuál es el nombre del arma?");
        String nombre = sc.nextLine();

        int danyo = -1;
        do {
            try {
                while (danyo<=0){
                    System.out.println("¿Cuanto daño tiene?");
                    danyo= sc.nextInt();
                }
                System.out.println("Arma añadida al arsenal");
                Arsenal.add(new Arma(nombre, danyo));
                boo=false;

            } catch (Exception e) {
                System.out.println("¿Cuánto daño tiene?");
                sc.nextLine();
            }
        } while (boo);
    }
}
