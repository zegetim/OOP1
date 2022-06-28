package pract6A;

import java.time.LocalDate;

public class Game {
    private String naamGame;
    private int releaseJaar;
    private double nieuwprijs;

    public Game(String ng, int rJ,double nwpr){
        naamGame=ng;releaseJaar=rJ;nieuwprijs=nwpr;
    }
    public String getNaam(){
        return naamGame;
    }
    public double huidigeWaarde(){
        double waarde = nieuwprijs * Math.pow(0.7 ,( LocalDate.now().getYear() -releaseJaar));
        return waarde;
    }
   /* public boolean equals(Object andereObject){


    }*/
    public String toString() {
        String s = naamGame + ", uitgegeven in " + releaseJaar + "; nieuwprijs: " + nieuwprijs + " nu voor: " + huidigeWaarde() + "\n";

        return s;
    }
}
