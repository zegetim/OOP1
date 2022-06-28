package pract8;

public class Fiets extends Voertuig{
    private int framenummer;
    private int productieJaar;

    public Fiets(String tp, double pr,int jr,int fnr){
        super(tp,pr,jr);
    }
    public double huidigeWaarde(){
        double waarde = nieuwprijs * Math.pow(0.9 ,(2020-productieJaar));
        return waarde;
    }
    /*public boolean equals(Object obj){
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Fiets fiets = (Fiets) o;
        return framenummer == fiets.framenummer &&
                productieJaar == fiets.productieJaar;
    }
}
