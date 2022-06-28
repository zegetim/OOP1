package pract9A;


public class Utils {
    public static void main(String[] args) {
        String test = Utils.euroBedrag(23.54546);
        System.out.println(test);
    }

    public static String euroBedrag(double bedrag) {
        double roundOff = Math.round(bedrag * 100.0) / 100.0;
        return String.format("test %f", roundOff);
    }


    public static String euroBedrag(double bedrag, int precisie) {
        return null;
    }
}

