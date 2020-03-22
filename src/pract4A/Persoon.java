package pract4A;

public class Persoon {
    private String naam;
    private int leeftijd;

    public Persoon(String nm, int lft){
        naam=nm;leeftijd=lft;
    }
    public String toString(){
        String a="en heeft huisbaas "+naam+"; leeftijd "+ leeftijd;
        return a;
    }
}
