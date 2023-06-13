
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClasseBase {

    Parking p0 = new Parking();
    private static ClasseBase instancia;

    private ClasseBase() {
    }

    public static ClasseBase getInstance() {
        if (instancia == null) {
            instancia = new ClasseBase();
        }
        return instancia;
    }

    public void menu() {

        Scanner input = new Scanner(System.in);

        int opcio;

        do {
            System.out.println("Introduce el tipo del vehiculo que entra en el parking: \n1. Coche\n2. Avión\n3. Bici" +
                    "\n4. Barco\n5. Menu acciones\n0. Salir");
            opcio = input.nextInt();

            switch (opcio) {

                case 1:
                    crearCoche();
                    break;
                case 2:
                    crearAvion();
                    break;
                case 3:
                    crearBici();
                    break;
                case 4:
                    crearBarco();
                    break;
                case 5:
                    menu2();
                    break;
                case 0:
                    System.out.println("Saliendo");
                    System.out.println("");
                    break;
                default:
                    System.out.println("");
            }
        } while (opcio != 0);

    }

    public void crearCoche() {

        Scanner input = new Scanner(System.in);

        String marca;
        String color;
        String matri;
        int ruedas;

        System.out.println("Introduce el nombre de la marca: ");
        marca = input.nextLine();
        System.out.println("Introduce el color del coche: ");
        color = input.nextLine();
        System.out.println("Introduce la matrícula del coche : ");
        matri = input.nextLine();
        System.out.println("Introduce el número de ruedas que tiene el coche : ");
        ruedas = input.nextInt();

        Vehiculos ch0 = new Coches(marca, color, matri, ruedas);
        p0.setLlistaVehiculos(ch0);
        System.out.println(ch0);
        System.out.println("");

    }

    public void crearAvion() {


        Scanner input = new Scanner(System.in);
        String marca;
        String color;
        String matri;
        int alas;


        System.out.println("Introduce el nombre de la marca: ");
        marca = input.nextLine();
        System.out.println("Introduce el color del avión: ");
        color = input.nextLine();
        System.out.println("Introduce la matrícula del avión : ");
        matri = input.nextLine();
        System.out.println("Introduce el número de alas del avión: ");
        alas = input.nextInt();

        Vehiculos a0 = new Aviones(marca, color, matri, alas);
        p0.setLlistaVehiculos(a0);
        System.out.println(a0);
        System.out.println("");
    }

    public void crearBici() {

        String marca;
        String color;
        String matri;
        int ruedas;

        Scanner input = new Scanner(System.in);

        System.out.println("Introduce el nombre de la marca: ");
        marca = input.nextLine();
        System.out.println("Introduce el color de la bicicleta: ");
        color = input.nextLine();
        System.out.println("Introduce la matrícula de la bicicleta : ");
        matri = input.nextLine();
        System.out.println("Introduce el número ruedas de la bicicleta ");
        ruedas = input.nextInt();

        Vehiculos bi0 = new Bicis(marca, color, matri, ruedas);
        p0.setLlistaVehiculos(bi0);
        System.out.println(bi0);
        System.out.println("");
    }

    public void crearBarco() {

        Scanner input = new Scanner(System.in);

        String marca;
        String color;
        String matri;
        int habitaciones;

        System.out.println("Introduce el nombre de la marca: ");
        marca = input.nextLine();
        System.out.println("Introduce el color del barco: ");
        color = input.nextLine();
        System.out.println("Introduce la matrícula del barco : ");
        matri = input.nextLine();
        System.out.println("Introduce el número de habitaciones del barco: ");
        habitaciones = input.nextInt();

        Vehiculos b0 = new Barcos(marca, color, matri, habitaciones);
        p0.setLlistaVehiculos(b0);
        System.out.println(b0);
        System.out.println("");
    }

    public void verVehiculos() {

        for (int i = 0; i < p0.getLlistaVehiculos().size(); i++) {
            System.out.println("Marca : " + p0.getLlistaVehiculos().get(i).getMarca() + " // Color : " +
                    p0.getLlistaVehiculos().get(i).getColor() + "  // Matrícula : " + p0.getLlistaVehiculos().get(i).getMatri());
        }
        System.out.println("");
    }

    public void menu2() {

        Scanner input = new Scanner(System.in);


        int opcio;

        do {
            System.out.println("Introduce el tipo de acción quieres realizar: \n1. Acelerar\n2. Frenar\n3. Aparcar" +
                    "\n0. Salir");
            opcio = input.nextInt();

            switch (opcio) {

                case 1:
                    acelerarVehiculos();
                    break;
                case 2:
                    frenarVehiculos();
                    break;
                case 3:
                    aparcarVehiculos();
                    break;
                case 0:
                    System.out.println("Saliendo");
                    System.out.println("");
                    break;
                default:
                    System.out.println("");
            }
        } while (opcio != 0);
    }

    public List<Vehiculos> getVehicle() {

        List<Vehiculos> listaMatriculas = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        int i = 0;
        String matri;
        int posVeh = -1;
        boolean esc = false;

            System.out.println("Introduzca el número de matrícula del vehículo: ");
            matri = input.next();

            while (i < p0.getLlistaVehiculos().size() && !esc) {
                Vehiculos vehiTrovat = p0.getLlistaVehiculos().get(i);

                if (matri.equalsIgnoreCase(vehiTrovat.getMatri())) {
                    esc = true;
                    posVeh = i;
                }
                i++;
            }
            if (esc) {
                System.out.println("Vehículo encontrado");
                listaMatriculas.add(p0.getLlistaVehiculos().get(posVeh));
                System.out.println("");
            } else {
                System.out.println("Vehículo no encontrado");
                System.out.println("");
            }

        return listaMatriculas;
    }

    public void acelerarVehiculos() {

        Scanner input = new Scanner(System.in);
        String resp;

        verVehiculos();

        System.out.println("¿Deseas acelerar todos los vehículos del parking? (S/N) (Fast & Furious XX)");
        resp = input.next();
        if (resp.equalsIgnoreCase("s")) {

            for (int i = 0; i < p0.getLlistaVehiculos().size(); i++) {
                AcelerarClass ac0 = new AcelerarClass(p0.getLlistaVehiculos().get(i), true);
                p0.getAction(ac0);
                p0.doAction();
            }
        }
        if (resp.equalsIgnoreCase("n")) {

            List v = getVehicle();

            for (int i = 0; i < v.size(); i++) {
                AcelerarClass ac0 = new AcelerarClass(p0.getLlistaVehiculos().get(i), true);
                p0.getAction(ac0);
                p0.doAction();
            }
        }
    }

    public void frenarVehiculos() {

        Scanner input = new Scanner(System.in);
        String resp;

        verVehiculos();

        System.out.println("¿Deseas frenar todos los vehículos del parking? (S/N)");
        resp = input.next();
        if (resp.equalsIgnoreCase("s")) {

            for (int i = 0; i < p0.getLlistaVehiculos().size(); i++) {
                FrenarClass ac0 = new FrenarClass(p0.getLlistaVehiculos().get(i), true);
                p0.getAction(ac0);
                p0.doAction();
            }
        }
        if (resp.equalsIgnoreCase("n")) {

            List v = getVehicle();

            for (int i = 0; i < v.size(); i++) {
                FrenarClass ac0 = new FrenarClass(p0.getLlistaVehiculos().get(i), true);
                p0.getAction(ac0);
                p0.doAction();
            }
        }
    }

    public void aparcarVehiculos() {

        Scanner input = new Scanner(System.in);
        String resp;

        verVehiculos();

        System.out.println("¿Deseas aparcar todos los vehículos del parking? (S/N)");
        resp = input.next();
        if (resp.equalsIgnoreCase("s")) {

            for (int i = 0; i < p0.getLlistaVehiculos().size(); i++) {
                AparcarClass ac0 = new AparcarClass(p0.getLlistaVehiculos().get(i), true);
                p0.getAction(ac0);
                p0.doAction();
            }
        }
        if (resp.equalsIgnoreCase("n")) {

            List v = getVehicle();

            for (int i = 0; i < v.size(); i++) {
                AparcarClass ac0 = new AparcarClass(p0.getLlistaVehiculos().get(i), true);
                p0.getAction(ac0);
                p0.doAction();
            }
        }

    }
}
