package borderlayout;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class vidu1 extends Frame{
	private Button b1,b2,b3,b4,b5;
	
	public vidu1(String title) {
		super(title);
		
		b1 = new Button("NORTH");
		b2 = new Button("South");
		b3 = new Button("East");
		b4 = new Button("West");
		b5 = new Button("Center");
		
//		setLayout(new BorderLayout(20,10));
		
		add(b1, BorderLayout.NORTH); 
		add(b2,BorderLayout.SOUTH);
		add(b3,BorderLayout.EAST);
		add(b4,BorderLayout.WEST);
		add(b5,BorderLayout.CENTER);
		
		setLocation(300,200);
		setSize(300,200);
		setVisible(true);
		
//		addWindowListener(new WindowAdapter() {
//            public void windowClosing(WindowEvent event) {
//                dispose(); // Đóng cửa sổ Frame
//                System.exit(0); // Thoát khỏi ứng dụng
//            }
//        });
		
	}
	
	public static void main(String[] args) {
//		new introButton("BorderLayout");
		try {
            new vidu1("BorderLayout");
        } catch (Exception e) {
            e.printStackTrace();
        }
		
	}

}
