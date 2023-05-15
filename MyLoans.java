/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myloans;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyLoans extends JFrame implements ActionListener {
    private JTextField nameField, ageField, amountField;
    private JRadioButton homeRadio, personalRadio, carRadio;
    private JButton submitButton;

    public MyLoans() {
        // Set JFrame properties
        setTitle("My Loans");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 250);
        setLayout(new GridLayout(5, 2));

        // Create JLabels and JTextFields for input
        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField();
        JLabel ageLabel = new JLabel("Age:");
        ageField = new JTextField();
        JLabel amountLabel = new JLabel("Amount:");
        amountField = new JTextField();

        // Create radio buttons
        homeRadio = new JRadioButton("Home Loan");
        personalRadio = new JRadioButton("Personal Loan");
        carRadio = new JRadioButton("Car Loan");

        // Create button group and add radio buttons to it
        ButtonGroup loanGroup = new ButtonGroup();
        loanGroup.add(homeRadio);
        loanGroup.add(personalRadio);
        loanGroup.add(carRadio);

        // Create submit button
        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);

        // Add components to JFrame
        add(nameLabel);
        add(nameField);
        add(ageLabel);
        add(ageField);
        add(amountLabel);
        add(amountField);
        add(homeRadio);
        add(personalRadio);
        add(carRadio);
        add(submitButton);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Get input values from JTextFields
        String name = nameField.getText();
        int age = Integer.parseInt(ageField.getText());
        double amount = Double.parseDouble(amountField.getText());

        // Get loan selection from radio buttons
        String selection = "";
        if (homeRadio.isSelected()) {
            selection = "Home Loan";
        } else if (personalRadio.isSelected()) {
            selection = "Personal Loan";
        } else if (carRadio.isSelected()) {
            selection = "Car Loan";
        }

        // Create Loans object and display results
        Loans l = new Loans(name, age, amount);
        JOptionPane.showMessageDialog(this, "Name: " + l.getName() + "\nAge: " + l.getAge() + "\nAmount: " + l.getAmount()
                + "\nLoan Type: " + selection, "Loan Information", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        MyLoans gui = new MyLoans();
    }
}
