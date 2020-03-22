package pract8;

public class Computer implements Goed{
    private String type;
    private String macAdres;
    private double aanschafPrijs;
    private int productieJaar;

    public Computer(String tp,String adr,double pr,int jr){
        type=tp;macAdres=adr;aanschafPrijs=pr;productieJaar=jr;
    }
    public double huidigeWaarde(){
        double waarde = aanschafPrijs * Math.pow(0.6 ,(2020-productieJaar));
        return waarde;
    }
    /*public boolean equals(Object obj){
    }*/
    public String toString(){
        return "Computer: " + type + " heeft waarde: " + huidigeWaarde();
    }
}
