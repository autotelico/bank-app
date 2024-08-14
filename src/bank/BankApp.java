package bank;

import bank.assets.BalanceDisplay;
import bank.assets.Frame;
import bank.assets.Panel;

import javax.swing.*;
import java.net.URL;
import java.util.Scanner;
import java.awt.*;

public class BankApp {
    private double balance;

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    BankApp(String username, String password) {
        this.balance = 100;

        // Set up window
        Frame frame = new Frame();
        frame.setTitle("Bank App");
        Panel panel = new Panel();
        BalanceDisplay balanceField = new BalanceDisplay(this.balance);
        panel.add(balanceField);

        frame.add(panel);

        ImageIcon icon = new ImageIcon(getClass().getResource("images/bank-icon.png"), "Favicon for the BankApp");
        frame.setIconImage(icon.getImage());



    }

    public static void main(String[] args) {
        Scanner dataEntryForm = new Scanner(System.in);
        String username = "Carl";
        String password = "whirler";
        BankApp carlsBank = new BankApp(username, password);

    }
}
