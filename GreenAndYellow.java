import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class GreenAndYellow extends JFrame {
	JPanel contentPane = new JPanel(); //contentPane 지정
	public GreenAndYellow(){
		setTitle("Money Changer with CheckBox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new test());
		c.add(btn);
		
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] agrs) {
		new CheckBoxMoney();
	}
}
class test implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("Action"))
			b.setText("액션");
		else
			b.setText("Action");
	}
}
