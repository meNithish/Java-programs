package airport_car_parking;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class Airport_car_parking_GUI {

	private JFrame frame;
	private JTextField cid;
	private JLabel lblNewLabel_2;
	private JTextField cno;
	private JLabel lblNewLabel_3;
	private JTextField etm;
	private JTextField eth;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField extm;
	private JLabel lblNewLabel_6;
	private JTextField exth;
	private JLabel lblNewLabel_7;
	private JButton btnNewButton;
	JLabel lblNewLabel_8;
	private JButton btnNewButton_1;
	JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Airport_car_parking_GUI window = new Airport_car_parking_GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Airport_car_parking_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 228, 225));
		frame.setBounds(100, 100, 556, 466);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CAR PARKING");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 423, 19);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Car ID :");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(45, 41, 105, 19);
		frame.getContentPane().add(lblNewLabel_1);
		
		cid = new JTextField();
		cid.setBounds(160, 40, 247, 20);
		frame.getContentPane().add(cid);
		cid.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Car No :");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(45, 72, 105, 19);
		frame.getContentPane().add(lblNewLabel_2);
		
		cno = new JTextField();
		cno.setColumns(10);
		cno.setBounds(160, 71, 247, 20);
		frame.getContentPane().add(cno);
		
		lblNewLabel_3 = new JLabel("Entry Time (min)");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(45, 134, 105, 19);
		frame.getContentPane().add(lblNewLabel_3);
		
		etm = new JTextField();
		etm.setColumns(10);
		etm.setBounds(160, 133, 247, 20);
		frame.getContentPane().add(etm);
		
		eth = new JTextField();
		eth.setColumns(10);
		eth.setBounds(160, 102, 247, 20);
		frame.getContentPane().add(eth);
		
		lblNewLabel_4 = new JLabel("Entry Time (hr)");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(45, 103, 105, 19);
		frame.getContentPane().add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Member Type");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(45, 227, 105, 19);
		frame.getContentPane().add(lblNewLabel_5);
		
		extm = new JTextField();
		extm.setColumns(10);
		extm.setBounds(160, 195, 247, 20);
		frame.getContentPane().add(extm);
		
		lblNewLabel_6 = new JLabel("Exit Time (min)");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(45, 196, 105, 19);
		frame.getContentPane().add(lblNewLabel_6);
		
		exth = new JTextField();
		exth.setColumns(10);
		exth.setBounds(160, 164, 247, 20);
		frame.getContentPane().add(exth);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(160, 226, 247, 22);
		frame.getContentPane().add(comboBox);
		
		comboBox.addItem("Normal Visitor");
		comboBox.addItem("Special Visitor");
		
		lblNewLabel_7 = new JLabel("Exit Time (hr)");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(45, 165, 105, 19);
		frame.getContentPane().add(lblNewLabel_7);
		
		btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				double charge;
				String c,n,g;
				int h1,m1,h2,m2;
				MemberType m;
				CarParking car;
				c=cid.getText();
				n=cno.getText();
				h1=Integer.parseInt(eth.getText());
				m1=Integer.parseInt(etm.getText());
				h2=Integer.parseInt(exth.getText());
				m2=Integer.parseInt(extm.getText());
				g=(String)comboBox.getSelectedItem();
				
				if(g=="Normal Visitor")
				 {
					m=MemberType.NormalVisitor;
					car=new CarParking(c,n,h1,m1,h2,m2,m);
					charge=car.CalculateParkingCharge(h1, m1, h2, m2, m);
					
					textArea.setText(textArea.getText()+"\n"+"The parking amount is : "+charge);
				 }
				
				 else 
				{
				  
					m=MemberType.SpecialVisitor;
					car=new CarParking(c,n,h1,m1,h2,m2,m);
					charge=car.CalculateParkingCharge(h1, m1, h2, m2, m);
					
					textArea.setText(textArea.getText()+"\n"+"The parking amount is : "+charge);
				}
				
				
				
									
				
				textArea.setForeground(new Color(255,0,0));
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton.setBounds(159, 252, 89, 31);
		frame.getContentPane().add(btnNewButton);
		
		textArea = new JTextArea();
		textArea.setBounds(10, 291, 520, 125);
		frame.getContentPane().add(textArea);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(250, 128, 114));
		panel.setBounds(417, 41, 113, 205);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		lblNewLabel_8 = new JLabel("NOTE");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setForeground(new Color(0, 0, 205));
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		lblNewLabel_8.setEnabled(true);
		lblNewLabel_8.setBounds(10, 11, 93, 19);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("24 hour format");
		lblNewLabel_9.setForeground(new Color(0, 0, 255));
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setBounds(10, 54, 93, 14);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_9_1 = new JLabel("Time must be");
		lblNewLabel_9_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_9_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_9_1.setBounds(10, 29, 93, 19);
		panel.add(lblNewLabel_9_1);
		
		JLabel lblNewLabel_10 = new JLabel("Member must be");
		lblNewLabel_10.setForeground(new Color(0, 0, 255));
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setBounds(0, 79, 113, 14);
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_10_1 = new JLabel("Normal Visitor");
		lblNewLabel_10_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10_1.setForeground(Color.BLUE);
		lblNewLabel_10_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_10_1.setBounds(0, 108, 113, 14);
		panel.add(lblNewLabel_10_1);
		
		JLabel lblNewLabel_10_2 = new JLabel("Special Visitor");
		lblNewLabel_10_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10_2.setForeground(Color.BLUE);
		lblNewLabel_10_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_10_2.setBounds(0, 152, 113, 14);
		panel.add(lblNewLabel_10_2);
		
		JLabel lblNewLabel_11 = new JLabel("Or");
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setForeground(new Color(0, 0, 255));
		lblNewLabel_11.setBounds(33, 133, 46, 14);
		panel.add(lblNewLabel_11);
		
		btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton_1.setBounds(274, 257, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		
		
		 
	}
}
