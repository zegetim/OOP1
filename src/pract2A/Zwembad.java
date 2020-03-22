package pract2A;

public class Zwembad {
    public Zwembad(){

    }


    private double breedte;
    private double lengte;
    private double diepte;


    public Zwembad(double br, double len, double dpt) {
        breedte = br;
        lengte = len;
        diepte = dpt;
    }
    public double getBreedte() {
        return breedte;
    }
    public void setBreedte(double br){
        breedte=br;
    }
    public double getLengte() {
        return lengte;
    }
    public void setLengte(double len){
        lengte=len;
    }
    public double getDiepte() {
        return diepte;
    }

    public void setDiepte(double dpt) {
        diepte=dpt;
    }
    public double inhoud() {
        double inhoud;
        inhoud=breedte*lengte*diepte;
        return inhoud;
    }

    public String toString() {
        return "dit zwembad is "+breedte+" meter breed, "+lengte+" meter lang, en "+diepte+" meter diep";
    }

}
