package Parking;

public class FeeCalculator {
    public static double calculateFee(long minutesParked) {
        if (minutesParked <= 30) return 0;
        if (minutesParked <= 60) return 5000;
        return 5000 + ((minutesParked - 60) / 60) * 3000;
    }
}
