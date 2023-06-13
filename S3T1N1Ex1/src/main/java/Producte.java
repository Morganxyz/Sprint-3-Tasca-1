
public class Producte {

    private String nom;
    private int quant;
    public Producte(int quant,String nom){

        this.quant = quant;
        this.nom = nom;
    }

    public int getQuant(){
        return this.quant;
    }

    public void setQuant(int quant){
        this.quant = quant;
    }

    public String getNom(){
        return this.nom;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public String ToString(){

        return "Quantitat: " + this.quant  + "Fruita: " + this.nom;
    }
}
