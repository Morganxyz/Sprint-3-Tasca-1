package PhoneClasses;

import Intefaces.Itelefons;

public class Telefo8 implements Itelefons {

    @Override
    public String getTelf(){
        return "El prefixe no és válid, no es pot afegir";

    }
}
