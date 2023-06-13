import Intefaces.AbstractBuilder;
import Intefaces.Iadressa;
import Intefaces.Itelefons;
import PhoneClasses.Telefo8;

public class PhoneBuilder implements AbstractBuilder {

    @Override
    public Iadressa setAdress(String zip, String pais) {
        return null;
    }

    @Override
    public Itelefons setPhones(String pref, String num) {
        if (pref == null) {
            return new Telefo8();
        }
        return new Telefo8();
    }

}
