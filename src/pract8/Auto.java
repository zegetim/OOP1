package pract8;

public class Auto extends Voertuig{
    private String kenteken;
    private int productieJaar;

    public Auto(String tp,double np,int jr,String kt){
        super(tp,np,jr);
    }
    public double huidigeWaarde(){
        double waarde = nieuwprijs * Math.pow(0.7 ,(2020-productieJaar));
        return waarde;
    }
    /*public boolean equals(Object obj){
    }*/
}
