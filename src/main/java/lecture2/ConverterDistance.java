package lecture2;

public class ConverterDistance {

    private static final double CONV_M = 0.62137;

    public static double convKmToMiles(double km) {
        return km * CONV_M;
    }

    public static double convMilesToKm(double miles) {
        return miles / CONV_M;
    }

}
