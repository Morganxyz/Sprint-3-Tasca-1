public class AparcarClass  implements Command {

    private Vehiculos vehiculo;
    private boolean aparcar;

    public AparcarClass(Vehiculos vehiculo, boolean aparcar){
        this.vehiculo = vehiculo;
        this.aparcar = aparcar;
    }


    @Override
    public void execute() {
        this.vehiculo.aparcar(true);
    }
}
