package pract2B;

public class Voetbalclub {
    private String naam;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;
    private int aantalGespeeld;
    private int aantalPunten;

    public Voetbalclub(String nm) {
        naam = nm;
    }



    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }

    public int aantalGespeeld() {
        return aantalGewonnen + aantalGelijk + aantalVerloren;

    }

    public int aantalPunten() {
        return (aantalGewonnen * 3) + aantalGelijk;

    }

    public String toString() {
        String s = naam + " " + aantalGespeeld() + " " + aantalGewonnen + " " + aantalGelijk + " " +aantalVerloren + " " +aantalPunten();
        return s;
    }
}
