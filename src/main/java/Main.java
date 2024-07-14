import app.ConverterWeight;
import lecture2.ConverterDistance;

public class Main {

    public static void main(String[] args) {
        double kgs = 5;
        double pnds = 12;

        double km = 10.0;
        double miles = 20.0;

        System.out.println("WEIGHT CONVERTER");
        System.out.println();


        System.out.println("Converting " + kgs + " kgs into pounds. The result is: " + ConverterWeight.convKgsToPounds(kgs));
        System.out.println("Converting " + pnds + " pounds into kgs. The result is: " + ConverterWeight.convPoundsToKgs(pnds));

        System.out.println();
        System.out.println("DISTANCE CONVERTER");
        System.out.println();

        System.out.println("Converting " + km + " km into miles. The result is: " + ConverterDistance.convKmToMiles(km));
        System.out.println("Converting " + miles + " miles into kms. The result is: " + ConverterDistance.convMilesToKm(miles));
    }

}
