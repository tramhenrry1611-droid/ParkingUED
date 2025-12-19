package Parking;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class LogHandler {
    private static final String FILE_PATH = "parking_log.csv";

    public static void log(String licensePlate, String action) {
        try (FileWriter writer = new FileWriter(FILE_PATH, true)) {
            String line = String.format("%s,%s,%s\n", licensePlate, action, LocalDateTime.now());
            writer.write(line);
        } catch (IOException e) {
            System.err.println("Lỗi ghi log: " + e.getMessage());
        }
    }
}

