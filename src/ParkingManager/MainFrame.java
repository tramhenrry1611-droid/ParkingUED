package ParkingManager;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private static final long serialVersionUID = 1L;

    public MainFrame() {
        setTitle("QUẢN LÝ BÃI XE UED");
        setSize(800, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        JMenu menuHeThong = new JMenu("Hệ thống");
        JMenuItem itemThoat = new JMenuItem("Thoát");

        itemThoat.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        menuHeThong.add(itemThoat);
        menuBar.add(menuHeThong);
        setJMenuBar(menuBar);

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.add("Xe vào", new CheckInPanel());
        tabbedPane.add("Xe ra", new CheckOutPanel());

        add(tabbedPane);
    }

    public static void main(String[] args) {
        new MainFrame().setVisible(true);
    }
}
