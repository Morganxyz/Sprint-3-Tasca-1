public class Aviones extends Vehiculos{

    private int alas;

    public Aviones(String marca,String color,String matri,int alas){
        super(marca,color,matri);
        this.alas = alas;

    }

    public int getAlas() {
        return this.alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    @Override
    public String toString() {
        return "Marca: " + super.getMarca() + " Color: " + super.getColor() + " Matrícula: " + super.getMatri() +
                " Número de alas: " + this.alas;
    }

    @Override
    public void acelerar(boolean aceleracion) {
        if(aceleracion = true) {
            System.out.println("El avión de matrícula : " + super.getMatri() +  " está acelerando");
            System.out.println("");
        }
    }

    @Override
    public void frenar(boolean frenazo) {
        if(frenazo = true) {
            System.out.println("El avión de matrícula : " + super.getMatri() +  " está frenando");
            System.out.println("");
        }
    }

    @Override
    public void aparcar(boolean aparcado) {
        if(aparcado = true) {
            System.out.println("El avión de matrícula : " + super.getMatri() +  " está aparcando");
            System.out.println("");
        }
    }
}
