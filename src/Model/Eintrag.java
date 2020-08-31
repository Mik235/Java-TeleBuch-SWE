package Model;

import java.util.ArrayList;

public class Eintrag {
    String name;
    String nachname;
    Adresse adresse;
    ArrayList<Long> telnr=new ArrayList<>();
    boolean unternehemn;

    public Eintrag(String name, String nachname, Adresse adresse, long[] telnra, boolean unternehemn) {
        this.name = name;
        this.nachname = nachname;
        this.adresse = adresse;
        for (int i = 0; i <telnra.length ; i++) {
            telnr.add(telnra[i]);
        }
        this.unternehemn = unternehemn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public ArrayList<Long> getTelnr() {
        return telnr;
    }

    public void setTelnr(ArrayList<Long> telnr) {
        this.telnr = telnr;
    }

    public boolean isUnternehemn() {
        return unternehemn;
    }

    public void setUnternehemn(boolean unternehemn) {
        this.unternehemn = unternehemn;
    }

    @Override
    public String toString() {
        String temu;
        if(unternehemn==false){
            temu= "kein";
        }
        else {
            temu="ein";
        }
        return  name +" "+ nachname +" "+ adresse.toString() + " Telefonnummern: " + telnr + " Es ist "+temu+" Unternehmen"
                ;
    }
}
