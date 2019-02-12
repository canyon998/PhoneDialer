package PhoneDialerpackage;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class PhonDialer {
	JButton button0;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	JButton button7;
	JButton button8;
	JButton button9;
	JButton buttondash;
	JButton buttondial;
	String number;

	public PhonDialer() {
		JFrame myFrame = new JFrame();
		myFrame.setTitle("dialer");
		myFrame.setSize(200,250);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel contentPane = (JPanel)myFrame.getContentPane(); 
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		Border myBorder = BorderFactory.createEmptyBorder(10,10,10,10);
		contentPane.setBorder(myBorder);
		
		JPanel topPanel = new JPanel();
		topPanel.setLayout(new FlowLayout());
		JLabel myLabel = new JLabel("Enter the number to dial:");
		topPanel.add(myLabel);
		
		JPanel keys = new JPanel();
		keys.setLayout(new GridLayout(4,3,5,5));
		Border keyborder = BorderFactory.createEmptyBorder(5,5,5,5);
		keys.setBorder(keyborder);
		button0 = new JButton("0");
		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		button4 = new JButton("4");
		button5 = new JButton("5");
		button6 = new JButton("6");
		button7 = new JButton("7");
		button8 = new JButton("8");
		button9 = new JButton("9");
		buttondash = new JButton("-");
		
		keys.add(button1 );
		keys.add(button2 );
		keys.add(button3 );
		keys.add(button4 );
		keys.add(button5 );
		keys.add(button6 );
		keys.add(button7 );
		keys.add(button8 );
		keys.add(button9 );
		keys.add(buttondash);
		keys.add(button0 );
		
		contentPane.add(topPanel);
		contentPane.add(keys);
		buttondial = new JButton("dial number");
		buttondial.setAlignmentX(Component.CENTER_ALIGNMENT);
		contentPane.add(buttondial);
		myFrame.setVisible(true); 
	}

	public static void main(String[] args) {
		new PhonDialer();

	}

}
