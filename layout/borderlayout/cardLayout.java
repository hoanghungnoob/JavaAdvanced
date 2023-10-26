package borderlayout;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class cardLayout extends Frame implements ActionListener {
    // Properties
    private Button b1, b2, b3;
    private CardLayout cdr;

    // Constructor
    public cardLayout(String title) {
        super(title);

        // Initialize components
        b1 = new Button("Button1");
        b2 = new Button("Bt2");
        b3 = new Button("Bt3");
        cdr = new CardLayout();

        // Add action listeners
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        // Set the layout manager to CardLayout
        setLayout(cdr);

        // Add components
        add(b1);
        add(b2);
        add(b3);

        // Set frame properties
        setVisible(true);
        setLocation(300, 200);
        setSize(200, 200);
        addWindowListener(new WindowAdapter() {
          public void windowClosing(WindowEvent event) {
              dispose(); // Đóng cửa sổ Frame
              System.exit(0); // Thoát khỏi ứng dụng
          }
      });
    }

    // Action listener method
    public void actionPerformed(ActionEvent e) {
        cdr.next(this);
    }

    public static void main(String[] args) {
        new cardLayout("Ví Dụ 2");
    }
}
