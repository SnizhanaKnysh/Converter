import lecture2.ConverterDistance;

public class Main {

    public static void main(String[] args) {

        double km = 10.0;
        double miles = 20.0;

        System.out.println(ConverterDistance.convKmToMiles(km));
        System.out.println(ConverterDistance.convMilesToKm(miles));
    }

}
