package pract6A;

import java.util.ArrayList;

public class Persoon {
    private String naam;
    private double budget;
    private ArrayList<String> Games;

    public Persoon(String nm,double bud){
        naam=nm;budget=bud;
    }
    public double getBudget(){
        return  budget;
    }
    public boolean koop(Game g) {
        if (budget > g.huidigeWaarde()) {
            return true;
        }
        Games.add(naam);
        budget -= g.huidigeWaarde();
        return true;

        }


    public boolean verkoop(Game g,Persoon koper){
        if(budget > g.huidigeWaarde()){
            return true;
        }
        Games.remove(naam);
        budget += g.huidigeWaarde();
        return true;
    }
    public String toString(){
        return naam + " heeft een budget van " + budget + " en bezit de volgende games:";
    }
}
