public class AcelerarClass implements Command{

    private Vehiculos vehiculo;
    private boolean acelerar;

    public AcelerarClass(Vehiculos vehiculo, boolean acelerar){
        this.vehiculo = vehiculo;
        this.acelerar = acelerar;
    }
    @Override
    public void execute() {
        this.vehiculo.acelerar(true);
    }
}
