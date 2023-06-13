import java.util.ArrayList;
import java.util.List;

public class Parking {

    private int plazas;
    private String nom;
    private List<Vehiculos> listaVehiculos;

    public Parking(){
        this.plazas = 500000;
        this.nom = "Parking It Academy";
        this.listaVehiculos = new ArrayList<>();
    }
    public List<Command>listaComands = new ArrayList<Command>();

    public void getAction(Command command){
        this.listaComands.add(command);
    }
    public void doAction(){
        this.listaComands.forEach(x -> x.execute());
        this.listaComands.clear();
    }

    public List<Vehiculos> getLlistaVehiculos() {
        return this.listaVehiculos;
    }

    public void setLlistaVehiculos(Vehiculos vehiculo) {
        this.listaVehiculos.add(vehiculo);
    }


}
