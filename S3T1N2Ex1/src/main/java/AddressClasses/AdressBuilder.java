package AddressClasses;

import AddressClasses.Adressa8;
import Intefaces.AbstractBuilder;
import Intefaces.Iadressa;
import Intefaces.Itelefons;

public class AdressBuilder implements AbstractBuilder {

    @Override
    public Iadressa setAdress(String zip, String pais) {
        if(zip == null){
            return new Adressa8();
        }
        return new Adressa8();
    }

    @Override
    public Itelefons setPhones(String pref, String num) {
        return null;
    }
}
