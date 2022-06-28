package pract6A;

import java.util.ArrayList;

public class Persoon {
    private String naam;
    private double budget;
    private ArrayList<Game> games = new ArrayList<Game>();
    private Object Game;


    public Persoon(String nm, double bud) {
        naam = nm;
        budget = bud;
    }

    public double getBudget() {
        return budget;
    }

    public boolean koop(Game g) {
            if (budget > g.huidigeWaarde() && !games.contains(g)) {

                games.add(g);
                budget -= g.huidigeWaarde();
                return true;
            }
        return false;
}


    public boolean verkoop(Game g,Persoon koper){

        if(koper.budget > g.huidigeWaarde()&&games.contains(g)){

        games.remove(g);
        koper.games.add(g);
        koper.budget -= g.huidigeWaarde();
        budget += g.huidigeWaarde();
        return true;
    }
        return false;
    }

    public String toString(){
        String listofGames = "";
        for (Game game : games) {
            listofGames += "\n" + game.toString();
        }

        String s = naam + " heeft een budget van " + String.format("%.2f", budget) + " en bezit de volgende games:" +"\n"+ games;
        return s;
    }
}
