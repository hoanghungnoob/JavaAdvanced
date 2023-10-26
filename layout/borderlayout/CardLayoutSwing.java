package borderlayout;
import javax.swing.*;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutSwing extends JFrame implements ActionListener {
    // Properties
    private JButton b1, b2, b3;
    private CardLayout cardLayout;
    private JPanel cardPanel;

    // Constructor
    public CardLayoutSwing(String title) {
        super(title);

        // Initialize components
        b1 = new JButton("Button1");
        b2 = new JButton("Bt2");
        b3 = new JButton("Bt3");
        cardLayout = new CardLayout();
        cardPanel = new JPanel();

        // Add action listeners
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        // Set the layout manager to CardLayout for the cardPanel
        cardPanel.setLayout(cardLayout);

        // Add components to cardPanel
        cardPanel.add(b1, "Card1");
        cardPanel.add(b2, "Card2");
        cardPanel.add(b3, "Card3");

        // Add cardPanel to the frame
        getContentPane().add(cardPanel);

        // Set frame properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }
 
    // Action listener method
    public void actionPerformed(ActionEvent e) {
        cardLayout.next(cardPanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new CardLayoutSwing("Swing CardLayout Example");
			}
		});
        
    }
}
