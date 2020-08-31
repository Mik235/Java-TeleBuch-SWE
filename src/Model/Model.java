package Model;

import java.util.ArrayList;

public class Model implements EintrageDaten{
    
    public Model() {
        eintraege.add(new Eintrag("Hans","Peter",new Adresse("Wasserweg",51109,12,"Koeln","Deutschland"),new long[]{13375009},false));
        eintraege.add(new Eintrag("RheinEnergie","",new Adresse("Apfelstraße",50667,17,"Koeln","Deutschland"),new long[]{566782587},true));
        eintraege.add(new Eintrag("Bayer","",new Adresse("Chempark",51373,2,"Leverkusen","Deutschland"),new long[]{2143099314},true));
        eintraege.add(new Eintrag("Hans","Ulrich",new Adresse("Schloss.str",51429,16,"Bergisch Gladbach","Deutschland"),new long[]{849549085,610164,4},false));
        
    }
    public String[] suchen(String name,String plzorort){
        ArrayList<Eintrag> rest=new ArrayList<>();
        String[] ret;
        name=name.toLowerCase();
        plzorort=plzorort.toLowerCase();
        for (int i = 0; i <eintraege.size() ; i++) {

            if ((eintraege.get(i).getName().toLowerCase().equals(name)||eintraege.get(i).getNachname().toLowerCase().equals(name))&&(plzorort.equals(""+eintraege.get(i).getAdresse().getPlz())||eintraege.get(i).getAdresse().getStadt().toLowerCase().equals(plzorort))){
                rest.add(eintraege.get(i));

            }
            
        }
        ret=new String[rest.size()];
        for (int i = 0; i <rest.size() ; i++) {
            ret[i]=rest.get(i).toString();
        }
        return ret;
    }
    public String[] bsuche(int telnre){
        ArrayList<Eintrag> rest=new ArrayList<>();
        String[] ret;
        for (int i = 0; i <eintraege.size() ; i++) {
            for (int j = 0; j <eintraege.get(i).getTelnr().size(); j++) {
                if(eintraege.get(i).getTelnr().get(j)==telnre){
                    rest.add(eintraege.get(i));
                }
            }
            
        }
        ret=new String[rest.size()];
        for (int i = 0; i <rest.size() ; i++) {
            ret[i]=rest.get(i).toString();
        }
        return ret;
    }
}
