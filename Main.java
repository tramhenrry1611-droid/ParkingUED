package Parking;

public class Main {
    public static void main(String[] args) {
        ParkingSpotManager manager = new ParkingSpotManager(5);
        manager.printStatus();

        String licensePlate = "43A-12345";
        long entryTime = System.currentTimeMillis();
        ParkingModel car = new ParkingModel(licensePlate, entryTime);

        LogHandler.log(licensePlate, "ENTRY");

        if (manager.occupySpot(2)) {
            System.out.println("Xe " + licensePlate + " đã đỗ tại chỗ số 2.");
        } else {
            System.out.println("Chỗ số 2 đã có xe.");
        }

        manager.printStatus();

        try {
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long exitTime = entryTime + (95 * 60 * 1000); 
        car.setExitTime(exitTime);

        long duration = car.getDurationMinutes();
        double fee = FeeCalculator.calculateFee(duration);
        System.out.println("Xe " + licensePlate + " đỗ " + duration + " phút. Phí = " + fee + " VND");

        LogHandler.log(licensePlate, "EXIT");
     
        manager.releaseSpot(2);
        manager.printStatus();
    }
}
