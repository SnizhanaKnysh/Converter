import app.ConverterWeight;

public class Main {

    public static void main(String[] args) {
        double kgs = 5;
        double pnds = 12;

        System.out.println("Converting " + kgs + " kgs into pounds. The result is: " + ConverterWeight.convKgsToPounds(kgs));
        System.out.println("Converting " + pnds + " pounds into kgs. The result is: " + ConverterWeight.convPoundsToKgs(pnds));
    }

}
