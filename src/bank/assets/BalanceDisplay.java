package bank.assets;

import javax.swing.*;

public class BalanceDisplay extends JTextField {
    public  BalanceDisplay() {
        this.setVisible(true);
        this.setBounds(50, 50, 100, 100);
    }

    public BalanceDisplay(double balance) {
        this.setVisible(true);
        this.setBounds(50, 50, 100, 100);
        this.setText(Double.toString(balance));
    }
}
