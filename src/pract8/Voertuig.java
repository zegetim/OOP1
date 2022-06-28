package pract8;

import java.util.Objects;

abstract class Voertuig implements Goed {
    private String type;
    protected double nieuwprijs;
    protected int bouwjaar;

    public Voertuig(String tp, double pr, int jr){
        type=tp;nieuwprijs=pr;bouwjaar=jr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Voertuig voertuig = (Voertuig) o;
        return Double.compare(voertuig.nieuwprijs, nieuwprijs) == 0 &&
                bouwjaar == voertuig.bouwjaar &&
                Objects.equals(type, voertuig.type);
    }

    @Override
    public int hashCode() {
        return 0;
    }

    /*public boolean equals(Object obj){
        }*/
    public String toString(){
        return "voertuig: " + type + " met bouwjaar " + bouwjaar + " heeft een waarde van: " + huidigeWaarde();
    }



}
