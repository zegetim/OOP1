package pract2B;

public class Voetbalclub {
    public String naam;
    public int aantalGewonnen;
    public int aantalGelijk;
    public int aantalVerloren;
    public int aantalGespeeld;
    public int aantalPunten;

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
