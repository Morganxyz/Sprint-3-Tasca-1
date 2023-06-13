import Intefaces.Itelefons;

public class TelefoNac implements Itelefons {

    private String num;
    private String pref;

    public TelefoNac(String pref, String num){
        this.pref = pref;
        this.num = num;
    }

    public String getNum() {
        return this.num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getPref() {
        return this.pref;
    }

    public void setPref(String pref) {
        this.pref = pref;
    }

    @Override
    public String getTelf() {
        return "Prefixe : " + this.pref + " Num: " + this.num;
    }

    @Override
    public String toString() {
        return "TelefoNac{" +
                "num='" + num + '\'' +
                ", pref='" + pref + '\'' +
                '}';
    }
}
