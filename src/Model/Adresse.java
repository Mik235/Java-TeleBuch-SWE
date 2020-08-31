package Model;

public class Adresse {
    String strasse;
    int plz;
    int hnr;
    String stadt;
    String land;

    public Adresse(String strasse, int plz, int hnr, String stadt, String land) {
        this.strasse = strasse;
        this.plz = plz;
        this.hnr = hnr;
        this.stadt = stadt;
        this.land = land;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public int getPlz() {
        return plz;
    }

    public void setPlz(int plz) {
        this.plz = plz;
    }

    public int getHnr() {
        return hnr;
    }

    public void setHnr(int hnr) {
        this.hnr = hnr;
    }

    public String getStadt() {
        return stadt;
    }

    public void setStadt(String stadt) {
        this.stadt = stadt;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }

    @Override
    public String toString() {
        return strasse+" "+hnr+" "+plz+" "+stadt+" "+land ;
    }
}
