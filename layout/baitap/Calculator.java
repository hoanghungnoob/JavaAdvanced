package baitap;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class Calculator extends Frame {
    private JTextArea textArea;
    private double rs;
    private double tmp1;
    private String currentOperator;

    public Calculator(String title) {
        super(title);
        textArea = new JTextArea(5, 20);
        textArea.setEditable(false);
        textArea.setFont(new Font("Arial", Font.PLAIN, 18));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        Panel buttonPanel = new Panel(new GridLayout(5, 4));
        String[] buttonLabels = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "C", "0", "=", "+", "Xóa"};
        for (String label : buttonLabels) {
            Button button = new Button(label);
            button.setFont(new Font("Arial", Font.BOLD, 18));
            button.addActionListener(new ButtonClickListener());
            buttonPanel.add(button);
        }

        add(textArea, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.SOUTH);
        setVisible(true);
        setLocation(200, 100);
        pack();
        setSize(300,400);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent event) {
                dispose();
                System.exit(0);
            }
        });
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if ("0123456789".contains(command)) {
                textArea.append(command);
            } else if ("+-*/".contains(command)) {
                if (currentOperator != null) {
                    calculate();
                }
                tmp1 = Double.parseDouble(textArea.getText());
                textArea.append(" " + command + " ");
                currentOperator = command;
            } else if ("C".equals(command)) {
                textArea.setText("");
                currentOperator = null;
            } else if ("=".equals(command)) {
                if (currentOperator != null) {
                    calculate();
                }
            } else if ("Xóa".equals(command)) {
                // Xóa ký tự cuối cùng từ dòng phép tính
                String text = textArea.getText();
                if (!text.isEmpty()) {
                    textArea.setText(text.substring(0, text.length() - 1));
                }
            }
        }

        private void calculate() {
            String[] tokens = textArea.getText().split(" ");
            double tmp2 = Double.parseDouble(tokens[tokens.length - 1]);
            switch (currentOperator) {
                case "+":
                    rs = tmp1 + tmp2;
                    break;
                case "-":
                    rs = tmp1 - tmp2;
                    break;
                case "*":
                    rs = tmp1 * tmp2;
                    break;
                case "/":
                    if (tmp2 != 0) {
                        rs = tmp1 / tmp2;
                    } else {
                        JOptionPane.showMessageDialog(null, "Lỗi chia cho 0", "Lỗi", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    break;
            }
            textArea.append(" = " + rs + "\n");
            currentOperator = null;
        }
    }

    public static void main(String[] args) {
        new Calculator("Máy tính bỏ túi");
    }
}
