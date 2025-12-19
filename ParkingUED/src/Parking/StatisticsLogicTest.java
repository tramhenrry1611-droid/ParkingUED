package Parking;

public class StatisticsLogicTest {
    public static void main(String[] args) {
        StatisticsLogic logic = new StatisticsLogic();

        logic.recordEntry("SV001");
        logic.recordEntry("SV001");
        logic.recordEntry("SV002");
        logic.recordExit("SV001");

        assert logic.getEntryCountForStudent("SV001") == 2 : "SV001 phải có 2 lượt";
        assert logic.getEntryCountForStudent("SV002") == 1 : "SV002 phải có 1 lượt";
        assert logic.getCurrentlyParked() == 2 : "Phải còn 2 xe đang đỗ";

        System.out.println("✅ Unit Test Passed!");
    }
}