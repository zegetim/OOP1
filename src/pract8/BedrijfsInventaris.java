package pract8;

public class BedrijfsInventaris {
    private String bedrijfsnaam;
    private double budget;

    public BedrijfsInventaris(String nm,double bud){
        bedrijfsnaam=nm;budget=bud;
    }
    public void schafAan(Goed g){
        if (budget>g.huidigeWaarde()){
            budget-=g.huidigeWaarde();

            }
        }

    public String toString(){
        return "HU INVENTARIS";
    }
}
