package baitap;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class maytinh extends JFrame {
    private JTextField inputField;
    private double currentValue = 0;
    private String currentOperator = "";

    public maytinh(String title) {
        setTitle("Máy Tính Bỏ Túi Đơn Giản");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        inputField = new JTextField();
        inputField.setHorizontalAlignment(JTextField.RIGHT);
        inputField.setFont(new Font("Arial", Font.PLAIN, 24));
        add(inputField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(4, 4));

        String[] buttonLabels = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "C", "0", "=", "+"};

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.BOLD, 18));
            button.addActionListener(new ButtonClickListener());
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if ("0123456789".contains(command)) {
                inputField.setText(inputField.getText() + command);
            } else if ("+-*/".contains(command)) {
                if (!inputField.getText().isEmpty()) {
                    currentValue = Double.parseDouble(inputField.getText());
                    currentOperator = command;
                    inputField.setText("");
                }
            } else if ("=".equals(command)) {
                if (!inputField.getText().isEmpty()) {
                    double newValue = Double.parseDouble(inputField.getText());
                    switch (currentOperator) {
                        case "+":
                            currentValue += newValue;
                            break;
                        case "-":
                            currentValue -= newValue;
                            break;
                        case "*":
                            currentValue *= newValue;
                            break;
                        case "/":
                            if (newValue != 0) {
                                currentValue /= newValue;
                            } else {
                                inputField.setText("Lỗi chia cho 0");
                                return;
                            }
                            break;
                    }
                    inputField.setText(String.valueOf(currentValue));
                }
            } else if ("C".equals(command)) {
                inputField.setText("");
                currentValue = 0;
                currentOperator = "";
            }
        }
    }

    public static void main(String[] args) {
    	new maytinh("máy tính bỏ túi");
    }
}

