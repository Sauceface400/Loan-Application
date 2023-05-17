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
    private JLabel nameLabel, addressLabel, statusLabel, loanTypeLabel, loanValueLabel, loanLocationLabel, carMakerLabel,
            carModelLabel, carYearLabel, purposeLabel;
    private JTextField nameField, addressField, loanValueField, loanLocationField, carMakerField, carModelField,
            carYearField, purposeField;
    private JComboBox<String> statusCombo, loanTypeCombo;
    private JButton submitButton;
    private String[] statusOptions = { "Employed", "Self-Employed", "Unemployed" };
    private String[] loanTypeOptions = { "Home Loan", "Personal Loan", "Car Loan" };

    public MyLoans() {
        // set up window
        setTitle("Loan Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setResizable(false);

        // set up content pane
        Container contentPane = getContentPane();
        contentPane.setLayout(new GridLayout(8, 2));

        // create components
        nameLabel = new JLabel("Name:");
        nameField = new JTextField();
        addressLabel = new JLabel("Address:");
        addressField = new JTextField();
        statusLabel = new JLabel("Employment Status:");
        statusCombo = new JComboBox<>(statusOptions);
        loanTypeLabel = new JLabel("Loan Type:");
        loanTypeCombo = new JComboBox<>(loanTypeOptions);
        loanValueLabel = new JLabel("Home/Car Value:");
        loanValueField = new JTextField();
        loanLocationLabel = new JLabel("Home Location:");
        loanLocationField = new JTextField();
        carMakerLabel = new JLabel("Car Maker:");
        carMakerField = new JTextField();
        carModelLabel = new JLabel("Car Model:");
        carModelField = new JTextField();
        carYearLabel = new JLabel("Car Year:");
        carYearField = new JTextField();
        purposeLabel = new JLabel("Loan Purpose:");
        purposeField = new JTextField();
        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);

        // add components to content pane
        contentPane.add(nameLabel);
        contentPane.add(nameField);
        contentPane.add(addressLabel);
        contentPane.add(addressField);
        contentPane.add(statusLabel);
        contentPane.add(statusCombo);
        contentPane.add(loanTypeLabel);
        contentPane.add(loanTypeCombo);
        contentPane.add(loanValueLabel);
        contentPane.add(loanValueField);
        contentPane.add(loanLocationLabel);
        contentPane.add(loanLocationField);
        contentPane.add(carMakerLabel);
        contentPane.add(carMakerField);
        contentPane.add(carModelLabel);
        contentPane.add(carModelField);
        contentPane.add(carYearLabel);
        contentPane.add(carYearField);
        contentPane.add(purposeLabel);
        contentPane.add(purposeField);
        contentPane.add(submitButton);

        // show window
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText();
        String address = addressField.getText();
        String status = (String) statusCombo.getSelectedItem();
        String selection = (String) loanTypeCombo.getSelectedItem();

        // check which loan type was selected
        if (selection.equals("Home Loan")) {
            String loanValueString = loanValueField.getText();
            double loanValue = Double.parseDouble(loanValueString);
            String loanLocation = loanLocationField.getText();
            Home l = new Home(selection, loanLocation, loanValue);
            Home homeLoan = (Home) l;
            JOptionPane.showMessageDialog(this, "\nLoan Type: " + selection + "\nHome Type: " + homeLoan.getType()
                    + "\nLocation: " + homeLoan.getLocation() + "\nValue: " + homeLoan.getValue(),
                    "Loan Information", JOptionPane.INFORMATION_MESSAGE);
        } else if (selection.equals("Personal Loan")) {
            String purpose = purposeField.getText();
            Loans l = new Loans(selection, purpose, status);
            Loans personalLoan = (Loans) l;
            JOptionPane.showMessageDialog(this, "Name: " + name + "\nAddress: " + address + "\nStatus: " + status
                    + "\nLoan Type: " + selection + "\nLoan Purpose: " + personalLoan,
                    "Loan Information", JOptionPane.INFORMATION_MESSAGE);
        } else if (selection.equals("Car Loan")) {
            String carMaker = carMakerField.getText();
            String carModel = carModelField.getText();
            int carYear = Integer.parseInt(carYearField.getText());
            Car l = new Car(carMaker, carModel, carYear);
            Car carLoan = (Car) l;
            JOptionPane.showMessageDialog(this, "\nLoan Type: " + selection + "\nCar Maker: " + carLoan.getMaker()
                    + "\nCar Model: " + carLoan.getModel() + "\nCar Year: " + carLoan.getYear(),
                    "Loan Information", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Loans loanApp = new Loans();
                loanApp.setVisible(true);
            }
        });
    }
}