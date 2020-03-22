package pract8;

abstract class Voertuig implements Goed {
    private String type;
    protected double nieuwprijs;
    protected int bouwjaar;

    public Voertuig(String tp, double np, int jr){
        type=tp;nieuwprijs=np;bouwjaar=jr;
    }
    /*public boolean equals(Object obj){
    }*/
    public String toString(){
        return "voertuig: " + type + " met bouwjaar " + bouwjaar + " heeft een waarde van: " + huidigeWaarde();
    }



}
