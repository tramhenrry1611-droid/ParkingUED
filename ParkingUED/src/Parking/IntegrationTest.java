package Parking;

public class IntegrationTest {
    public static void main(String[] args) {
        StatisticsLogic logic = new StatisticsLogic();
        StatisticsView view = new StatisticsView();

        logic.recordEntry("SV001");
        logic.recordEntry("SV002");
        logic.recordExit("SV001");

        view.showReport(logic.getTotalEntries(), logic.getCurrentlyParked());
    }
}