public class Coches extends Vehiculos{

    private boolean marchaAtras;
    private int ruedas;

    public Coches(String marca,String color,String matri,int ruedas){
        super(marca,color,matri);
        this.ruedas = ruedas;
        this.marchaAtras = true;
    }

    @Override
    public String toString() {
        return "Marca: " + super.getMarca() + " Color: " + super.getColor() + " Matrícula: " + super.getMatri() +
                 " Número de ruedas: " + this.ruedas + " Tiene marcha átras: " + this.marchaAtras;
    }

    @Override
    public void acelerar(boolean aceleracion) {
        if(aceleracion = true) {
            System.out.println("El coche de matrícula " + super.getMatri()+ " está acelerando");
            System.out.println("");
        }
    }

    @Override
    public void frenar(boolean frenazo) {
        if(frenazo = true) {
            System.out.println("El coche de matrícula " + super.getMatri()+ " está frenando");
            System.out.println("");

        }
    }

    @Override
    public void aparcar(boolean aparcado) {
        if(aparcado = true) {
            System.out.println("El coche de matrícula " + super.getMatri()+ " está aparcando");
            System.out.println("");
        }
    }
}
