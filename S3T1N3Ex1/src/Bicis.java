public class Bicis extends Vehiculos{

    private int ruedas;

    public Bicis(String marca,String color,String matri,int ruedas){
        super(marca,color,matri);
        this.ruedas =  ruedas;

    }

    public int getRuedas() {
        return this.ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    @Override
    public String toString() {
        return "Marca: " + super.getMarca() + " Color: " + super.getColor() + " Matrícula: " + super.getMatri() +
                " Número de ruedas: " + this.ruedas;
    }

    @Override
    public void acelerar(boolean aceleracion) {
        if(aceleracion = true) {
            System.out.println("La bici de matrícula : " + super.getMatri() +  " está acelerando");
            System.out.println("");
        }
    }

    @Override
    public void frenar(boolean frenazo) {
        if(frenazo = true) {
            System.out.println("La bici de matrícula : " + super.getMatri() +  " está frenando");
        }
    }

    @Override
    public void aparcar(boolean aparcado) {
        if(aparcado = true) {
            System.out.println("La bici de matrícula : " + super.getMatri() +  " está aparcando");
        }
    }
}
