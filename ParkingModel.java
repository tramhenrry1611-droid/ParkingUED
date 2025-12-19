package Parking;

public class ParkingModel {
    private String licensePlate;
    private long entryTime;
    private long exitTime;

    public ParkingModel(String licensePlate, long entryTime) {
        this.licensePlate = licensePlate;
        this.entryTime = entryTime;
    }

    public void setExitTime(long exitTime) {
        this.exitTime = exitTime;
    }

    public long getDurationMinutes() {
        return (exitTime - entryTime) / (1000 * 60);
    }

    public String getLicensePlate() {
        return licensePlate;
    }
}
