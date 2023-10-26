package borderlayout;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.InputMismatchException;

public class layout_vd3 extends Frame implements ActionListener{
	// 1 thuộc tính Attribute
	private Label l1,l2,l3;
	private TextField tf1,tf2,tf3;
	private Button b1,b2,b3,b4;
	private Panel p1,p2;
	private double rs;
	//2. constructor hàm tạo
	public layout_vd3(String title) {
		super(title);
		//1 Khởi tạo thuộc tính
		l1= new Label("Number 1: ");
		l2= new Label("Number 2: ");
		l3= new Label("Number 3: ");
		tf1 = new TextField();
		tf2 = new TextField();
		tf3 = new TextField();
		tf3.setEditable(false);
		b1 =new Button("+");
		b2 =new Button("-");
		b3 =new Button("*");
		b4 =new Button("/");
		p1 = new Panel();		
		p2 = new Panel();		
		//2 gán dữ kiện nghe điều kiện
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		//3 thiết lập lay out
		p1.setLayout(new GridLayout(3,3));
		//4 chèn các thành phần vào layout
		p1.add(l1);
		p1.add(tf1);
		p1.add(l2);
		p1.add(tf2);
		p1.add(l3);
		p1.add(tf3);
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(b4);
		add(p1,"Center");
		add(p2,"South");
		
		//5 thiết lập hiển thị
		setVisible(true);
		setLocation(300,200);
		pack();
		addWindowListener(new WindowAdapter() {
	          public void windowClosing(WindowEvent event) {
	              dispose(); // Đóng cửa sổ Frame
	              System.exit(0); // Thoát khỏi ứng dụng
	          }
	      });
	}
	// 3. phuong thuc
	public void tong() {
		rs = Double.parseDouble(tf1.getText())+Double.parseDouble(tf2.getText());
		tf3.setText(String.valueOf(rs));
	}
		
	public void hieu() {
		rs = Double.parseDouble(tf1.getText())-Double.parseDouble(tf2.getText());
		tf3.setText(String.valueOf(rs));
	}
	
	public void tich() {
		rs = Double.parseDouble(tf1.getText())*Double.parseDouble(tf2.getText());
		tf3.setText(String.valueOf(rs));
	}
	
	public void thuong() {
		// ham xu li ngoai le	
		double dividend = 0;
		double divisor=0;
		try {
	        dividend = Double.parseDouble(tf1.getText());
	        divisor = Double.parseDouble(tf2.getText());
			if (divisor == 0) {	           
				throw new ArithmeticException("Error: Division by zero is not allowed.");
			}           
	        rs = dividend / divisor;
		}catch(ArithmeticException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}
		tf3.setText(String.valueOf(rs));
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand()=="+") {
			tong();
		}
		if(e.getActionCommand()=="-") {
				hieu();	
		}
		if(e.getActionCommand()=="*") {
			tich();
		}
		if(e.getActionCommand()=="/") {
			thuong();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new layout_vd3("mays tinhs");
	}

}
