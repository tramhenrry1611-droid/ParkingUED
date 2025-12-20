package ParkingManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ParkingController.Controller;

public class CheckInPanel extends JPanel {

    private static final long serialVersionUID = 1L;

    private JTextField txtBienSo;
    private JTextField txtMaSV;
    private JButton btnCheckIn;

    public CheckInPanel() {
        setLayout(new GridLayout(3, 2, 10, 10));

        add(new JLabel("Biển số xe:"));
        txtBienSo = new JTextField();
        add(txtBienSo);

        add(new JLabel("Mã sinh viên:"));
        txtMaSV = new JTextField();
        add(txtMaSV);

        btnCheckIn = new JButton("Xe vào");
        add(btnCheckIn);

        btnCheckIn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String bienSo = txtBienSo.getText();
                String maSV = txtMaSV.getText();

                Controller controller = new Controller();
                controller.checkIn(bienSo, maSV);

                JOptionPane.showMessageDialog(null, "Xe vào thành công!");
            }
        });
    }
}
