package ParkingManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ParkingController.Controller;

public class CheckOutPanel extends JPanel {

    private static final long serialVersionUID = 1L;

    private JTextField txtBienSo;
    private JLabel lblTien;
    private JButton btnCheckOut;

    public CheckOutPanel() {
        setLayout(new GridLayout(3, 2, 10, 10));

        add(new JLabel("Biển số xe:"));
        txtBienSo = new JTextField();
        add(txtBienSo);

        add(new JLabel("Tiền gửi:"));
        lblTien = new JLabel("0 VNĐ");
        add(lblTien);

        btnCheckOut = new JButton("Xe ra");
        add(btnCheckOut);
        btnCheckOut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String bienSo = txtBienSo.getText();

                Controller controller = new Controller();
                int tien = controller.checkOut(bienSo);

                lblTien.setText(tien + " VNĐ");
                JOptionPane.showMessageDialog(null, "Xe ra thành công!");
            }
        });
    }
}
