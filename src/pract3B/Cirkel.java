package pract3B;

public class Cirkel {
    private int radius;
    private int xPositie;
    private int yPositie;

    public Cirkel(int rad, int x, int y){
        radius=rad;xPositie=x;

        if(rad<=0) throw new IllegalArgumentException("radius moet groter dan 0 zijn");
    }
    public String toString(){
        String s= "cirkel "+"("+xPositie+","+yPositie+")"+" met radius: "+radius;
        return s;

    }
}
