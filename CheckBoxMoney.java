import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CheckBoxMoney extends JFrame {
	int[] nber = {50000, 10000, 1000, 500, 100, 50, 10, 1}; 
	String[] str = {"금액", "오만원", "만원", "천원", "500원", "100원", "50원", "10원", "1원"};
	JLabel la = new JLabel();
	JTextField[] tf = new JTextField[str.length];
	JButton btn = new JButton("계산"); 
	JCheckBox[] checkbox = new JCheckBox[nber.length-1]; 
	public CheckBoxMoney(){
		setTitle("Money Changer with CheckBox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		Container c=getContentPane();
		c.setBackground(Color.PINK); 
		c.setLayout(null); 
		
		la = new JLabel(str[0]); 
		la.setSize(40, 20); 
		la.setLocation(30, 20); 
		c.add(la); 
		
		tf[0] = new JTextField(30); 
		tf[0].setSize(100, 20);
		tf[0].setLocation(90, 20);
		c.add(tf[0]);
		
		btn.setSize(70, 20); 
		btn.setLocation(200, 20);
		btn.addActionListener(new btnEvent()); 
		c.add(btn);
		
		for(int i=1; i<str.length; i++) { 
			la = new JLabel(str[i]); 
			la.setHorizontalAlignment(JLabel.RIGHT); 
			la.setSize(50, 20); 
			la.setLocation(50, 50+(i*20)); 
			c.add(la);
			
			tf[i] = new JTextField(30);
			tf[i].setHorizontalAlignment(JTextField.CENTER); 
			tf[i].setSize(70, 20);
			tf[i].setLocation(120, 50+(i*20)); 
			c.add(tf[i]);
			
			if(i<str.length-1) { 
				checkbox[i-1] = new JCheckBox(); 
				checkbox[i-1].setBackground(Color.PINK); 
				checkbox[i-1].setSize(20, 20);
				checkbox[i-1].setLocation(210, 50+(i*20)); 
				c.add(checkbox[i-1]);
			}
		}
		
		setSize(300,300);
		setVisible(true);
	}
	class btnEvent implements ActionListener{ 
		public void actionPerformed(ActionEvent e) {
			String input = tf[0].getText(); 
			if(input.length()==0) 
				return;
			
			int money = Integer.parseInt(input); 
			int x;
			for(int i=0; i<nber.length; i++) {
				if(i==nber.length-1) { 
					x = money/nber[i]; 
					tf[i+1].setText(Integer.toString(x));
					break;
				}
				if(!checkbox[i].isSelected()) { 
					tf[i+1].setText("0"); 
					continue;
				}
				x = money/nber[i];
				tf[i+1].setText(Integer.toString(x));
				if(x>0) 
					money=money%nber[i]; 
			}
		}
	}
	public static void mian(String [] args) {
		new CheckBoxMoney();
	}
}