package Parking;

import java.util.HashMap;

public class ParkingSpotManager {
    private HashMap<Integer, Boolean> spotStatus = new HashMap<>();

    public ParkingSpotManager(int totalSpots) {
        for (int i = 1; i <= totalSpots; i++) {
            spotStatus.put(i, true); // true = Trống
        }
    }

    public boolean occupySpot(int spotId) {
        if (spotStatus.getOrDefault(spotId, false)) {
            spotStatus.put(spotId, false);
            return true;
        }
        return false;
    }

    public boolean releaseSpot(int spotId) {
        if (!spotStatus.getOrDefault(spotId, true)) {
            spotStatus.put(spotId, true);
            return true;
        }
        return false;
    }

    public void printStatus() {
        for (int id : spotStatus.keySet()) {
            System.out.println("Chỗ " + id + ": " + (spotStatus.get(id) ? "Trống" : "Đã đỗ"));
        }
    }
}
