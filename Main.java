import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean menu=true;
        Heroe hero=new Heroe();
        Imprimirmenu();
        do {

            Scanner sc=new Scanner(System.in);

            try {
                int i= sc.nextInt();

                switch (i){
                    case 0:
                        System.out.println("Chao");
                        menu=false;
                        break;
                    case 1:
                        hero.seleccionHeroe();

                        break;
                    case 2:
                        hero.insertarArma();
                        break;
                    case 3:
                        System.out.println("¿Cuál es el nombre del héroe que quieres eliminar?");
                        String nombre= sc.next();
                        if (hero.Heroes.contains(hero.buscarHeroe(nombre))) {
                            hero.Heroes.remove(hero.buscarHeroe(nombre));
                            System.out.println("El Héroe "+nombre+" fue borrado correctamente");
                            System.out.println();
                        }else {
                            System.out.println("El Héroe "+ nombre+ " no existe en la lista");
                            System.out.println();
                        }
                        break;
                    case 4:
                        System.out.println("¿Cuál es el nombre del héroe que quieres consultar?");
                        String nombre2= sc.next();
                        if (hero.Heroes.contains(hero.buscarHeroe(nombre2))) {
                            System.out.println(hero.buscarHeroe(nombre2));
                            System.out.println();
                        }else {
                            System.out.println("El Héro "+ nombre2+ " no existe en la lista");
                            System.out.println();
                        }
                        break;
                    case 5:
                        hero.printHeroes();
                        break;
                    case 6:
                        Imprimirmenu();
                        break;
                    default:
                        System.out.println("Elige una opción válida");
                        Imprimirmenu();
                        System.out.println();
                }
            }catch (InputMismatchException e){
                System.out.println("Error elige una opción válida");
                Imprimirmenu();
                System.out.println();
                sc.nextLine();
            }
        }while (menu);
        System.out.println(" ");
    }
    public static void Imprimirmenu(){
        System.out.println("Elige una opción: ");
        System.out.println("0.Salir");
        System.out.println("1.Añadir un nuevo Heroe");
        System.out.println("2.Añadir un arma al arsenal");
        System.out.println("3.Eliminar un Héroe por su nombre");
        System.out.println("4.Buscar un héroe y mostrar sus detalles");
        System.out.println("5.Listar todos los héroes registrados en el gremio");
        System.out.println("6.Imprimir Menú");
    }
}
