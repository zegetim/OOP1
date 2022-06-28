package pract8;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Double.compare(computer.aanschafPrijs, aanschafPrijs) == 0 &&
                productieJaar == computer.productieJaar &&
                Objects.equals(type, computer.type) &&
                Objects.equals(macAdres, computer.macAdres);
    }
    public String toString(){
        return "Computer: " + type + " heeft waarde: " + huidigeWaarde();
    }
}
