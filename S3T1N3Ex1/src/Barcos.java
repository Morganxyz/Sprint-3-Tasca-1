public class Barcos extends Vehiculos{

    private int habitaciones;
    private boolean helipuerto;


    public Barcos(String marca,String color,String matri,int habitaciones){
        super(marca,color,matri);
        this.habitaciones = habitaciones;
    }

    public int getHabitaciones() {
        return this.habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    @Override
    public String toString() {
        return "Marca: " + super.getMarca() + " Color: " + super.getColor() + " Matrícula: " + super.getMatri() +
                " número de habitaciones: " + this.habitaciones;
    }

    @Override
    public void acelerar(boolean aceleracion) {
        if(aceleracion = true) {
            System.out.println("El barco de matrícula : " + super.getMatri() + " está acelerando");
            System.out.println("");
        }
    }

    @Override
    public void frenar(boolean frenazo) {
        if(frenazo = true) {
            System.out.println("El barco de matrícula : " + super.getMatri() +  " está frenando");
            System.out.println("");
        }
    }
    @Override
    public void aparcar(boolean aparcado) {
        if( aparcado= true) {
            System.out.println("El barco de matrícula : " + super.getMatri() +  " está aparcando");
            System.out.println("");
        }
    }
}
