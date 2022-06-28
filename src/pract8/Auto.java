package pract8;

import java.util.Objects;

public class Auto extends Voertuig{
    private String kenteken;
    private int productieJaar;

    public Auto(String tp,double pr,int jr,String kt){
        super(tp,pr,jr);
    }
    public double huidigeWaarde(){
        double waarde = nieuwprijs * Math.pow(0.7 ,(2020-productieJaar));
        return waarde;
    }
    /*public boolean equals(Object obj){
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Auto auto = (Auto) o;
        return productieJaar == auto.productieJaar &&
                Objects.equals(kenteken, auto.kenteken);
    }
}
