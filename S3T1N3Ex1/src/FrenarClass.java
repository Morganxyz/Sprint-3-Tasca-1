public class FrenarClass implements Command{

    private Vehiculos vehiculo;
    private boolean frenar;

    public FrenarClass(Vehiculos vehiculo, boolean frenar){
        this.vehiculo = vehiculo;
        this.frenar = frenar;
    }

    @Override
    public void execute() {
        this.vehiculo.frenar(true);

    }
}
