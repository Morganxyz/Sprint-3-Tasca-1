
import Intefaces.Iadressa;
import Intefaces.Itelefons;

import java.util.*;

public class ClaseBase {
    public static List<Object> agenda = new LinkedList<Object>();
    public static Scanner input = new Scanner(System.in);

    private static ClaseBase instancia;

    private ClaseBase() {

    }

    public static ClaseBase getInstancia() {
        if (instancia == null) {
            instancia = new ClaseBase();
        }
        return instancia;
    }

    public void menu() {

        int opcio;

        do {
            System.out.println("Introduzca la opción deseada: \n1. Añadir Teléfono y Dirección" +
                    "\n2. Veure Agenda\n0. Salir");
            opcio = input.nextInt();

            switch (opcio) {
                case 1:
                    afegirNou();
                    break;
                case 2:
                    veureAgenda();
                    break;
                case 0:
                    System.out.println("Sortint");
                    System.out.println("");
                default:
                    System.out.println("Sortint");
                    System.out.println("");
            }


        } while (opcio != 0);

    }

    public void afegirNou() {

        String pref;
        String num;
        String zip;
        String pais;

        System.out.println("Introdueix el prefixe del número de teléfon amb el format +xx(xxx): ");
        pref = input.next();
        System.out.println("Introdueix el número de teléfon: ");
        num = input.next();

        FactoryBuilder f0 = new FactoryBuilder();
        Itelefons t0 = f0.getTelefons(pref, num);

        System.out.println("Introdueix el códi postal :");
        zip = input.next();
        System.out.println("Introdueix el nom del país: ");
        pais = input.next();

        FactoryBuilder f1 = new FactoryBuilder();
        Iadressa a0 = f1.getAdresses(zip, pais);

        agenda.add(t0);
        agenda.add(a0);
    }

    public void veureAgenda() {

        for (int i = 0; i < agenda.size(); i++) {
            System.out.println(agenda.get(i).toString());
        }
    }
}
