package Parking;

import java.util.HashMap;

public class StatisticsLogic {
    private HashMap<String, Integer> entryCountByStudent = new HashMap<>();
    private int currentlyParked = 0;

    public void recordEntry(String studentId) {
        entryCountByStudent.put(studentId, entryCountByStudent.getOrDefault(studentId, 0) + 1);
        currentlyParked++;
    }

    public void recordExit(String studentId) {
        if (currentlyParked > 0) {
            currentlyParked--;
        }
    }

    public int getTotalEntries() {
        int total = 0;
        for (int count : entryCountByStudent.values()) {
            total += count;
        }
        return total;
    }

    public int getCurrentlyParked() {
        return currentlyParked;
    }
 
    public int getEntryCountForStudent(String studentId) {
        return entryCountByStudent.getOrDefault(studentId, 0);
    }
}