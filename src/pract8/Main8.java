package pract8;

public class Main8 {
    public static void main(String[] args){
        BedrijfsInventaris b1 = new BedrijfsInventaris("HU", 1000000);
        Computer c1 = new Computer("hp", "00:1B:44:11:3A:B7", 2000, 2019);
        Computer c2 = new Computer("hp", "00:1B:44:11:3A:B7", 2000, 2019);
        Computer c3 = new Computer("macbook", "00:1B:44:11:3A:F1", 2000, 2019);
        Auto a1 = new Auto("Mercedes-Benz A-klasse A 180", 29995.00, 2019, "4-ZTV-94");
        Auto a2 = new Auto("Mercedes-Benz A-klasse A 180", 29995.00, 2019, "4-ZTV-94");
        Auto a3 = new Auto("Audi A1", 25995.00, 2019, "4-KLM-18");
        Fiets f1 = new Fiets("Batavus", 1200, 2019, 1234567);
        Fiets f2 = new Fiets("Batavus", 1200, 2019, 1234567);
        Fiets f3 = new Fiets("Gazelle", 1400, 2019, 1234568);
        System.out.println(b1);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);

    }
}
