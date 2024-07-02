//Soham Patel
//Mathematics calculator
//August 11, 2023
//This program is made to calculate mathematics basic +, -, * and / using the GUI


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	private JLabel labelForNum1, labelForNum2, labelForResult, labelForErrors;
    private JTextField textFieldForNum1, textFieldForNum2;
    private JButton buttonForAddition, buttonForSubtraction, buttonForMultiplication, buttonForDivision;
    private double num1, num2, result;
    public Calculator() {
        setTitle("Mathematics Calculator");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());

        GridBagConstraints gridLayout = new GridBagConstraints();
        gridLayout.gridx = 0;
        gridLayout.gridy = 0;

        labelForNum1 = new JLabel("Number 1:");
        add(labelForNum1, gridLayout);

        textFieldForNum1 = new JTextField(13);
        gridLayout.gridx = 1;
        add(textFieldForNum1, gridLayout);

        gridLayout.gridx = 0;
        gridLayout.gridy = 1;

        labelForNum2 = new JLabel("Number 2:");
        add(labelForNum2, gridLayout);

        textFieldForNum2 = new JTextField(13);
        gridLayout.gridx = 1;
        add(textFieldForNum2, gridLayout);

        gridLayout.gridx = 0;
        gridLayout.gridy = 2;
        gridLayout.gridwidth = 2;

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonForAddition = new JButton("+");
        buttonForSubtraction = new JButton("-");
        buttonForMultiplication = new JButton("*");
        buttonForDivision = new JButton("/");
        buttonPanel.add(buttonForAddition);
        buttonPanel.add(buttonForSubtraction);
        buttonPanel.add(buttonForMultiplication);
        buttonPanel.add(buttonForDivision);
        add(buttonPanel, gridLayout);

        gridLayout.gridy = 3;
        gridLayout.gridwidth = 2;

        labelForResult = new JLabel("Result:");
        add(labelForResult, gridLayout);

        gridLayout.gridy = 4;
        gridLayout.gridwidth = 2;

        JPanel resultPanel = new JPanel(new FlowLayout());
        labelForErrors = new JLabel();
        resultPanel.add(labelForErrors);
        add(resultPanel, gridLayout);

        buttonForAddition.addActionListener(this);
        buttonForSubtraction.addActionListener(this);
        buttonForMultiplication.addActionListener(this);
        buttonForDivision.addActionListener(this);
    }
    
    
    public void actionPerformed(ActionEvent e) {

        JButton clickedButton = (JButton) e.getSource();
        clickedButton.setBackground(Color.BLUE);
        try {
        	num1 = Double.parseDouble(textFieldForNum1.getText());
        	num2 = Double.parseDouble(textFieldForNum2.getText());
        
        if (clickedButton == buttonForAddition) {
            result = num1 + num2;
        } else if (clickedButton == buttonForSubtraction) {
            result = num1 - num2;
        } else if (clickedButton == buttonForMultiplication) {
            result = num1 * num2;
        } else if (clickedButton == buttonForDivision) {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                throw new ArithmeticException("Division by zero is not allowed.");
            }
        }
        
        labelForErrors.setText(""); 
        labelForResult.setText("Result: " + result);


    } catch (NumberFormatException ex) {
        labelForErrors.setText("Error: Invalid input. Please enter valid numbers.");
        labelForResult.setText("");
    } 
   }

    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Calculator().setVisible(true));
    }
}
