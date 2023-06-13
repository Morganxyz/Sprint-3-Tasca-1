public abstract class Vehiculos{

    private String marca;
    private String color;
    private String matri;



    public Vehiculos(String marca,String color,String matri){
        this.marca = marca;
        this.color = color;
        this.matri = matri;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatri() {
        return this.matri;
    }

    public void setMatri(String matri) {
        this.matri = matri;
    }

    public abstract void acelerar(boolean aceleracion);
    public abstract void frenar(boolean frenazo);
    public abstract void aparcar(boolean aparcado);
}
