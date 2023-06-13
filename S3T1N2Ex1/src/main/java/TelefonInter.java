import Intefaces.Itelefons;

public class TelefonInter implements Itelefons {
    private String num;
    private String pref;

    public TelefonInter(String pref, String num){
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
        return "TelefonInter{" +
                "num='" + num + '\'' +
                ", pref='" + pref + '\'' +
                '}';
    }
}
