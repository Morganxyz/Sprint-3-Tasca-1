import AddressClasses.Adressa8;
import Intefaces.Iadressa;
import Intefaces.Itelefons;
import PhoneClasses.Telefo8;

public class FactoryBuilder {

    public Itelefons getTelefons(String pref, String num) {
        if (pref == null) {
            return new Telefo8();
        }
        if (pref.equals("+34")) {
            return new TelefoNac(pref,num);
        }
        if (!pref.equals("+34")) {
            return new TelefonInter(pref, num);
        }
            return new Telefo8();
    }

    public Iadressa getAdresses(String zip, String pais){
        if(zip == null){
            return new Adressa8();
        }
        if(pais.equalsIgnoreCase("España")){
            return new AdressaNac(zip,pais);
        }
        if(!pais.equals("España") && !pais.equals("españa")){
            return new AdressaInter(zip,pais);
        }
        return new Adressa8();
    }
}
