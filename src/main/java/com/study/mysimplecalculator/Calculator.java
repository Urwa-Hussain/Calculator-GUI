package com.study.mysimplecalculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

public class Calculator extends JFrame implements ActionListener {

    private JTextField textField;
    private JButton button1, button2, button3, button4, button5, button6, button7, button8, button9, button0;
    private JButton buttonAdd, buttonSubtract, buttonMultiply, buttonDivide, buttonClear, buttonEquals, buttonDecimal, buttonBackspace;
    private double num1 = 0, num2 = 0, result = 0;
    private char operator;
    private boolean hasDecimal = false;

    public Calculator() {
        super("My Calculator");
        setLayout(new BorderLayout());

        // Create the text field
        textField = new JTextField();
        JFrame frame = new JFrame();
        frame.setSize(300,460);
        frame.setTitle("CALCULATOR");
        frame.setLayout(null);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Font myFont = new Font ("Arial",Font.BOLD,12); 
        
        
        JTextArea tfNumber = new JTextArea();
        tfNumber.setBounds(50,20,200,50);
        tfNumber.setFont(myFont);
        Border border = BorderFactory.createLineBorder(Color.PINK);
        tfNumber.setBorder(border);
        tfNumber.setEditable(false);   //not allow editing in textfeild
        textField.setEditable(false);
        textField.setHorizontalAlignment(JTextField.LEFT);
        add(textField, BorderLayout.NORTH);

        // Create the button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(6, 3));

        // Create the buttons
        button9 = new JButton("9");
        buttonPanel.add(button9);
        button8 = new JButton("8");
        buttonPanel.add(button8);
        buttonDivide = new JButton("÷");
        buttonDivide.setFont(new Font("SansSerif", Font.ITALIC, 18));
        buttonPanel.add(buttonDivide);
        button7 = new JButton("7");
        buttonPanel.add(button7);
        button6 = new JButton("6");
        buttonPanel.add(button6);
        buttonMultiply = new JButton("×");
        buttonMultiply.setFont(new Font("SansSerif", Font.ITALIC, 18));
        buttonPanel.add(buttonMultiply);
        button5 = new JButton("5");
        buttonPanel.add(button5);
        button4 = new JButton("4");
        buttonPanel.add(button4);
        buttonAdd = new JButton("+");
        buttonAdd.setFont(new Font("SansSerif", Font.ITALIC, 18));
        buttonPanel.add(buttonAdd);
        button3 = new JButton("3");
        buttonPanel.add(button3);
        button2 = new JButton("2");
        buttonPanel.add(button2);
        buttonSubtract = new JButton("-");
        buttonSubtract.setFont(new Font("SansSerif", Font.ITALIC, 18));
        buttonPanel.add(buttonSubtract);
        button1 = new JButton("1");
        buttonPanel.add(button1);
        button0 = new JButton("0");
        buttonPanel.add(button0);
        buttonEquals = new JButton("=");
        buttonEquals.setFont(new Font("SansSerif", Font.ITALIC, 18));
        buttonPanel.add(buttonEquals);
        buttonDecimal = new JButton(".");
        buttonPanel.add(buttonDecimal);
        buttonClear = new JButton("C");
        // buttonClear.setForeground(Color.RED);
        buttonPanel.add(buttonClear);
        buttonBackspace = new JButton("←");
        buttonPanel.add(buttonBackspace);

        // Set background and foreground colors
        textField.setBackground(Color.WHITE);
        textField.setForeground(Color.BLACK);
        button0.setBackground(Color.WHITE);
        button1.setBackground(Color.WHITE);
        button2.setBackground(Color.WHITE);
        button3.setBackground(Color.WHITE);
        button4.setBackground(Color.WHITE);
        button5.setBackground(Color.WHITE);
        button6.setBackground(Color.WHITE);
        button7.setBackground(Color.WHITE);
        button8.setBackground(Color.WHITE);
        button9.setBackground(Color.WHITE);
        buttonAdd.setBackground(Color.WHITE);
        buttonDecimal.setBackground(Color.WHITE);
        buttonSubtract.setBackground(Color.WHITE);
        buttonMultiply.setBackground(Color.WHITE);
        buttonDivide.setBackground(Color.WHITE);
        buttonEquals.setBackground(Color.WHITE);
        buttonClear.setBackground(Color.WHITE);
        buttonBackspace.setBackground(Color.WHITE);

        // Set font and font size
        Font font = new Font("Arial", Font.PLAIN, 18);
        textField.setFont(font);
        button0.setFont(font);
        button1.setFont(font);
        button2.setFont(font);
        button3.setFont(font);
        button4.setFont(font);
        button5.setFont(font);
        button6.setFont(font);
        button7.setFont(font);
        button8.setFont(font);
        button9.setFont(font);
        buttonAdd.setFont(font);
        buttonDecimal.setFont(font);
        buttonSubtract.setFont(font);
        buttonMultiply.setFont(font);
        buttonDivide.setFont(font);
        buttonEquals.setFont(font);
        buttonClear.setFont(font);
        buttonBackspace.setFont(font);

        // Set button size and margins
        Dimension buttonSize = new Dimension(60, 60);
        Insets buttonMargin = new Insets(0, 0, 0, 0);
        button0.setPreferredSize(buttonSize);
        button0.setMargin(buttonMargin);
        button1.setPreferredSize(buttonSize);
        button1.setMargin(buttonMargin);
        button2.setPreferredSize(buttonSize);
        button2.setMargin(buttonMargin);
        button3.setPreferredSize(buttonSize);
        button3.setMargin(buttonMargin);
        button4.setPreferredSize(buttonSize);
        button4.setMargin(buttonMargin);
        button5.setPreferredSize(buttonSize);
        button5.setMargin(buttonMargin);
        button6.setPreferredSize(buttonSize);
        button6.setMargin(buttonMargin);
        button7.setPreferredSize(buttonSize);
        button7.setMargin(buttonMargin);
        button8.setPreferredSize(buttonSize);
        button8.setMargin(buttonMargin);
        button9.setPreferredSize(buttonSize);
        button9.setMargin(buttonMargin);
        buttonAdd.setPreferredSize(buttonSize);
        buttonAdd.setMargin(buttonMargin);
        buttonDecimal.setPreferredSize(buttonSize);
        buttonDecimal.setMargin(buttonMargin);
        buttonSubtract.setPreferredSize(buttonSize);
        buttonSubtract.setMargin(buttonMargin);
        buttonMultiply.setPreferredSize(buttonSize);
        buttonMultiply.setMargin(buttonMargin);
        buttonDivide.setPreferredSize(buttonSize);
        buttonDivide.setMargin(buttonMargin);
        buttonEquals.setPreferredSize(buttonSize);
        buttonEquals.setMargin(buttonMargin);
        buttonClear.setPreferredSize(buttonSize);
        buttonClear.setMargin(buttonMargin);
        buttonBackspace.setMargin(buttonMargin);

        // Add the button panel to the frame
        add(buttonPanel, BorderLayout.CENTER);

        // Add action listeners to the buttons
        button0.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        buttonAdd.addActionListener(this);
        buttonSubtract.addActionListener(this);
        buttonMultiply.addActionListener(this);
        buttonDivide.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonEquals.addActionListener(this);
        buttonDecimal.addActionListener(this);
        buttonBackspace.addActionListener(this);

        // Set the size of the frame and display it
        setSize(300, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String buttonText = e.getActionCommand();
        String text = textField.getText();
        switch (buttonText) {
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
                textField.setText(textField.getText() + buttonText);
                break;
            case ".":
                if (!hasDecimal) {
                    textField.setText(textField.getText() + ".");
                    hasDecimal = true;
                }
                break;
            case "+":
            case "-":
            case "×":
            case "÷":
                num1 = Double.parseDouble(textField.getText());
                operator = buttonText.charAt(0);
                textField.setText("");
                hasDecimal = false;
                break;
            case "=":
                num2 = Double.parseDouble(textField.getText());
                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '×':
                        result = num1 * num2;
                        break;
                    case '÷':
                        result = num1 / num2;
                        break;
                }
                textField.setText(Double.toString(result));
                hasDecimal = (Double.toString(result).contains("."));
                break;
            case "C":
                textField.setText("");
                num1 = 0;
                num2 = 0;
                result = 0;
                hasDecimal = false;
                break;
            case "←":
                String newText = text.substring(0, text.length() - 1);
                textField.setText(newText);
        }

    }
}
