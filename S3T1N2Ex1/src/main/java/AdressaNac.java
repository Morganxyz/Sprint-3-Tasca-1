import Intefaces.Iadressa;

public class AdressaNac implements Iadressa {

    private String zip;
    private String pais;
    public AdressaNac(String zip,String pais){
        this.zip = zip;
        this.pais = pais;

    }
    public String getZip() {
        return this.zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPais() {
        return this.pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String getAdressa() {
        return "País : " + this.pais + " Zip: " + this.zip;
    }

    @Override
    public String toString() {
        return "AdressaNac{" +
                "zip='" + zip + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
