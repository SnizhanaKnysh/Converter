import lecture2.ConverterDistance;

public class Main {

    public static void main(String[] args) {
        double kgs = 5;
        double pnds = 12;

        System.out.println("Converting " + kgs + " kgs into pounds. The result is: " + ConverterWeight.convKgsToPounds(kgs));
        System.out.println("Converting " + pnds + " pounds into kgs. The result is: " + ConverterWeight.convPoundsToKgs(pnds));
        double km = 10.0;
        double miles = 20.0;
        System.out.println(ConverterDistance.convKmToMiles(km));
        System.out.println(ConverterDistance.convMilesToKm(miles));
        System.out.println(ConverterDistance.convKmToMiles(km));
        System.out.println(ConverterDistance.convMilesToKm(miles));
    }

}
