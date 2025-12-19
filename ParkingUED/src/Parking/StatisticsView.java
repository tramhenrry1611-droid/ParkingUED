package Parking;

public class StatisticsView {
    public void showReport(int totalEntries, int totalCurrentlyParked) {
        System.out.println("📊 Báo cáo thống kê:");
        System.out.println("- Tổng số lượt gửi xe: " + totalEntries);
        System.out.println("- Số lượng xe đang đỗ: " + totalCurrentlyParked);
    }
}