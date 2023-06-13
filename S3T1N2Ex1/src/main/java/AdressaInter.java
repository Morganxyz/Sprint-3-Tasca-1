import Intefaces.Iadressa;

public class AdressaInter implements Iadressa {

    private String zip;
    private String pais;
    public AdressaInter(String zip,String pais){
        this.zip = zip;
        this.pais = pais;

    }

    public String getZip() {
        return this.zip;
    }

    public void setZip(String dir) {
        this.zip = dir;
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
        return "AdressaInter{" +
                "zip='" + zip + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
