package app;

public class ConverterWeight {

    private static final double CONV_K = 2.20462;

    public static double convKgsToPounds(double kgs) {
        return kgs * CONV_K;
    }

    public static double convPoundsToKgs(double pnds) {
        return pnds / CONV_K;
    }

}
