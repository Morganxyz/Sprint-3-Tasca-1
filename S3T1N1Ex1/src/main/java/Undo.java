import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Undo {

    public static Scanner entrada = new Scanner(System.in);
    private static Undo instance;

    private List<Producte> llistaProductes;
    private Undo() {

        this.llistaProductes = new LinkedList<>();
    }

    public List<Producte> getLlistaProductes(){
        return this.llistaProductes;
    }
    public void setLlistaProductes(Producte llistaProductes){

        this.llistaProductes.add(llistaProductes);
    }
    public static Undo getInstance() {

        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }
    public void crearComanda() {

        veureComanda();
        System.out.println("");


        String nomFru;
        int quantFru;
        String resp;

        do {

            System.out.println("Vols afegir més fruita al magatzem? : S/N");
            resp = entrada.next();

            if (resp.equalsIgnoreCase("s")) {

                System.out.println("Introdueix el nom de la fruita: ");
                nomFru = entrada.next();
                System.out.println("Introdueix la quantitat de la fruita: ");
                quantFru = entrada.nextInt();

                Producte p0 = new Producte(quantFru, nomFru);
                setLlistaProductes(p0);
                System.out.println("");
            } else {
                System.out.println("Sortint");
                System.out.println("");
            }

        } while (resp.equalsIgnoreCase("s"));
    }

    public void eliminarComanda(){

        String resp;

       veureComanda();
        System.out.println("");


        System.out.println("Vols eliminar la darrera comanda del magatzem? : S/N");
        resp = entrada.next();

        if(resp.equalsIgnoreCase("s")){
           llistaProductes.remove(getLlistaProductes().size() - 1);
           System.out.println("");
           System.out.println("La nova llista de comandes es: ");

            for(int i = 0; i < getLlistaProductes().size(); i++){
                System.out.println(getLlistaProductes().get(i).getNom());
            }
            System.out.println("");

        }else{
            System.out.println("Sortint");
        }
    }
    public void veureComanda(){

        for(int i = 0; i < getLlistaProductes().size(); i++){
            System.out.println("Quantitat :" + getLlistaProductes().get(i).getQuant() +
                    " // Fruita : " + getLlistaProductes().get(i).getNom());
        }
    }

}




