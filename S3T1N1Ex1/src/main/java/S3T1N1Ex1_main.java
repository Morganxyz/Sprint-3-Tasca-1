import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class S3T1N1Ex1_main {
    public static Scanner entrada = new Scanner(System.in);
    public static List<Producte> llistaProducte = new LinkedList<Producte>();

    public static void main(String []args){

        Undo r0 = Undo.getInstance();
        //Undo r3 = new Undo ();

        int opcio;

        do {
            System.out.println("Introdueix l´opció desitjada: \n1. Crear comanda\n2. Eliminar comanda" +
                    "\n3. Veure comanda\n0. Sortir");
            opcio = entrada.nextInt();

            switch (opcio) {

                case 1:
                    r0.crearComanda();
                    break;
                case 2:
                    r0.eliminarComanda();
                    break;
                case 3:
                    r0.veureComanda();
                    break;
                case 0:
                    System.out.println("Sortint");
                    System.out.println("");
                    break;
                default:
                    System.out.println("Opció incorrecte!");
                    System.out.println("");

            }

        } while (opcio != 0);
    }

}

