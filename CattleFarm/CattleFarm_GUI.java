package cattle_farm;

import java.awt.EventQueue;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JSlider;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class CattleFarm_GUI extends Thread{

	int x=137;
	JLabel lblNewLabel ;
	private JFrame frame;
	private CardLayout cards;
	private JTextField name;
	private JTextField cidac;
	private JTextField cid_alerts;
	private JTextField cidsumm;
	private JTextField quantity;
	private JTextField feedamount;
	private JTextField vaccineamount;
	private JTextField feedtype;
	private JTextField DateTime;
	private ArrayList<CattleInfo> clist=new ArrayList<CattleInfo>();
	JTextArea textsumm = new JTextArea();
	
	/**
	 * Launch the application.
	 */
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() 
			{
				
				
				
				try {
					CattleFarm_GUI window = new CattleFarm_GUI();
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
	public CattleFarm_GUI() {
		initialize();
		run();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		cards=new CardLayout(10,10);
		frame = new JFrame();
		frame.setBounds(100, 100, 501, 548);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(cards);
		
		JPanel p1 = new JPanel();
		p1.setBackground(new Color(255, 218, 185));
		frame.getContentPane().add(p1, "p1");
		p1.setLayout(null);
		
		lblNewLabel = new JLabel("XYZ CATTLE FARM");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setEnabled(true);
		lblNewLabel.setBounds(x, 11, 157, 22);
		
		p1.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Add Cattle");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				cards.show(frame.getContentPane(), "p2");
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton.setBounds(137, 79, 157, 29);
		p1.add(btnNewButton);
		
		JButton btnAlerts = new JButton("Alerts");
		btnAlerts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				cards.show(frame.getContentPane(), "p3");
			}
		});
		btnAlerts.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnAlerts.setBounds(137, 119, 157, 29);
		p1.add(btnAlerts);
		
		JButton btnPeriodicSummary = new JButton("Periodic Summary");
		btnPeriodicSummary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				cards.show(frame.getContentPane(), "p4");
			}
		});
		btnPeriodicSummary.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnPeriodicSummary.setBounds(137, 159, 157, 29);
		p1.add(btnPeriodicSummary);
		
		DateTime = new JTextField();
		DateTime.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		DateTime.setForeground(Color.BLUE);
		DateTime.setBounds(272, 266, 157, 20);
		p1.add(DateTime);
		DateTime.setColumns(10);
		String dt="dd/MM/yyyy  HH:mm:ss z";
		SimpleDateFormat formatDate = new SimpleDateFormat(dt);
		formatDate.setTimeZone(TimeZone.getTimeZone("IST"));
		Date date = new Date();
		DateTime.setText(formatDate.format(date));
		String c=dt.substring(0, 2);
		JPanel p2 = new JPanel();
		p2.setBackground(new Color(255, 192, 203));
		frame.getContentPane().add(p2, "p2");
		p2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Add Cattle");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_1.setEnabled(true);
		lblNewLabel_1.setBounds(110, 11, 292, 19);
		p2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Cattle Name :");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(48, 43, 99, 14);
		p2.add(lblNewLabel_2);
		
		name = new JTextField();
		name.setBounds(157, 41, 258, 20);
		p2.add(name);
		name.setColumns(10);
		
		cidac = new JTextField();
		cidac.setColumns(10);
		cidac.setBounds(157, 68, 258, 20);
		p2.add(cidac);
		
		JLabel lblNewLabel_2_1 = new JLabel("Cattle ID :");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_2_1.setBounds(48, 70, 99, 14);
		p2.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Cattle Type :");
		lblNewLabel_2_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_2_1_1.setBounds(48, 98, 76, 14);
		p2.add(lblNewLabel_2_1_1);
		
		JRadioButton cow = new JRadioButton("Cow");
		cow.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		cow.setBounds(135, 95, 67, 23);
		p2.add(cow);
		
		ButtonGroup bg=new ButtonGroup();
		
		
		JRadioButton ox = new JRadioButton("Ox");
		ox.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		ox.setBounds(215, 95, 67, 23);
		p2.add(ox);
		
		JRadioButton buffalo = new JRadioButton("Buffalo");
		buffalo.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		buffalo.setBounds(292, 95, 123, 23);
		p2.add(buffalo);
		
		bg.add(cow);
		bg.add(buffalo);
		bg.add(ox);
		
		JTextArea textac = new JTextArea();
		textac.setBounds(10, 395, 445, 83);
		p2.add(textac);
		
		JComboBox day = new JComboBox();
		day.setBounds(169, 131, 47, 22);
		p2.add(day);
		
		for(int i=1;i<=31;i++)
		{
			day.addItem(""+i);
		}
		
		JComboBox month = new JComboBox();
		month.setBounds(285, 131, 48, 22);
		p2.add(month);
		
		for(int i=1;i<=12;i++)
		{
			month.addItem(""+i);
		}
		
		JComboBox year = new JComboBox();
		year.setBounds(343, 131, 72, 22);
		p2.add(year);
		
		for(int i=2000;i<=2050;i++)
		{
			year.addItem(""+i);
		}
		JComboBox day2 = new JComboBox();
		day2.setBounds(169, 164, 47, 22);
		p2.add(day2);
		for(int i=1;i<=31;i++)
		{
			day2.addItem(""+i);
		}
		
		JComboBox month2 = new JComboBox();
		month2.setBounds(285, 164, 48, 22);
		p2.add(month2);
		for(int i=1;i<=12;i++)
		{
			month2.addItem(""+i);
		}		
		
		JComboBox year2 = new JComboBox();
		year2.setBounds(343, 164, 72, 22);
		p2.add(year2);
		for(int i=2000;i<=2050;i++)
		{
			year2.addItem(""+i);
		}
		JComboBox day3 = new JComboBox();
		day3.setBounds(169, 192, 47, 22);
		p2.add(day3);
		for(int i=1;i<=31;i++)
		{
			day3.addItem(""+i);
		}
		
		JComboBox month3 = new JComboBox();
		month3.setBounds(285, 192, 48, 22);
		p2.add(month3);
		
		for(int i=1;i<=12;i++)
		{
			month3.addItem(""+i);
		}		
		JComboBox year3 = new JComboBox();
		year3.setBounds(343, 192, 72, 22);
		p2.add(year3);
		for(int i=2000;i<=2050;i++)
		{
			year3.addItem(""+i);
		}
		JComboBox day4 = new JComboBox();
		day4.setBounds(169, 220, 47, 22);
		p2.add(day4);
		
		for(int i=1;i<=31;i++)
		{
			day4.addItem(""+i);
		}
		
		JComboBox month4 = new JComboBox();
		month4.setBounds(286, 220, 47, 22);
		p2.add(month4);
		for(int i=1;i<=12;i++)
		{
			month4.addItem(""+i);
		}		
		JComboBox year4 = new JComboBox();
		year4.setBounds(343, 220, 72, 22);
		p2.add(year4);
		for(int i=2000;i<=2050;i++)
		{
			year4.addItem(""+i);
		}
		JComboBox vaccinationtype = new JComboBox();
		vaccinationtype.setBounds(316, 253, 99, 22);
		p2.add(vaccinationtype);
		
		vaccinationtype.addItem("Nasal");
		vaccinationtype.addItem("Syringe");
		JButton btnNewButton_1 = new JButton("Submit");
		btnNewButton_1.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) 
			{
				CattleInfo f;
				CattleFeedInfo fi;
				CattleInsurance ci;
				CattleVaccination cv;
				
				VaccinationType vt;
				CattleType ct;
				date D1,D2,D3,D4;
				String n,i,ft,v;
				double q,fp,vp;
				int d1,d2,d3,d4,y1,y2,y3,y4,m1,m2,m3,m4;
				
				n=name.getText();
				i=cidac.getText();
				ft=feedtype.getText();
				
				q=Double.parseDouble(quantity.getText());
				fp=Double.parseDouble(feedamount.getText());
				vp=Double.parseDouble(vaccineamount.getText());
				
				d1=Integer.parseInt((String)day.getSelectedItem());
				d2=Integer.parseInt((String)day2.getSelectedItem());
				d3=Integer.parseInt((String)day3.getSelectedItem());
				d4=Integer.parseInt((String)day4.getSelectedItem());
				
				y1=Integer.parseInt((String)year.getSelectedItem());
				y2=Integer.parseInt((String)year2.getSelectedItem());
				y3=Integer.parseInt((String)year3.getSelectedItem());
				y4=Integer.parseInt((String)year4.getSelectedItem());
				
				m1=Integer.parseInt((String)month.getSelectedItem());
				m2=Integer.parseInt((String)month2.getSelectedItem());
				m3=Integer.parseInt((String)month3.getSelectedItem());
				m4=Integer.parseInt((String)month4.getSelectedItem());
				
				D1=new date(d1,m1,y1);
				D2=new date(d2,m2,y2);
				D3=new date(d3,m3,y3);
				D4=new date(d4,m4,y4);
				
				v=(String)vaccinationtype.getSelectedItem();
				
				if(v=="Nasal")
				{
					vt=VaccinationType.Nasal;
					cv=new CattleVaccination(D1,vp,vt);
				}
				else
				{
					vt=VaccinationType.Syringe;
					cv=new CattleVaccination(D1,vp,vt);
				}
				
				fi=new CattleFeedInfo(D4,q,fp,ft);
				
				ci= new CattleInsurance(D2,D3);
				
				if(cow.isSelected())
				{
					ct=CattleType.Cow;
					f=new CattleInfo(n,i,ct,ci,cv,fi);
					clist.add(f);
					textac.setText(textac.getText()+"\nSuccess");
				}
				else if(ox.isSelected())
				{
					ct=CattleType.Ox;
					f=new CattleInfo(n,i,ct,ci,cv,fi);
					clist.add(f);
					textac.setText(textac.getText()+"\nSuccess");
				}
				else if(buffalo.isSelected())
				{
					ct=CattleType.Buffalo;
					f=new CattleInfo(n,i,ct,ci,cv,fi);
					clist.add(f);
					textac.setText(textac.getText()+"\nSuccess");
				}
				
				else
				{
					textac.setText(textac.getText()+"\nFailed");
				}
				
				cidac.setText(null);
				name.setText(null);
				bg.clearSelection();
				vaccineamount.setText(null);
				feedamount.setText(null);
				feedtype.setText(null);
				quantity.setText(null);
				
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton_1.setBounds(169, 360, 89, 30);
		p2.add(btnNewButton_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Date for Vaccination");
		lblNewLabel_2_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_2_1_1_1.setBounds(39, 134, 137, 14);
		p2.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Insurance Done :");
		lblNewLabel_2_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_2_1_1_1_1.setBounds(39, 167, 123, 14);
		p2.add(lblNewLabel_2_1_1_1_1);
		
		
		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("Insurance Due");
		lblNewLabel_2_1_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_2_1_1_1_1_1.setBounds(39, 195, 123, 14);
		p2.add(lblNewLabel_2_1_1_1_1_1);
		
		
		
		JLabel lblNewLabel_2_1_1_1_1_1_1 = new JLabel("Feed Purchase Due");
		lblNewLabel_2_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_2_1_1_1_1_1_1.setBounds(39, 223, 123, 14);
		p2.add(lblNewLabel_2_1_1_1_1_1_1);
		
		
	
		JLabel lblNewLabel_2_2 = new JLabel("Quantity(Kg)");
		lblNewLabel_2_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_2_2.setBounds(39, 253, 82, 20);
		p2.add(lblNewLabel_2_2);
		
		quantity = new JTextField();
		quantity.setColumns(10);
		quantity.setBounds(126, 253, 76, 20);
		p2.add(quantity);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("Feed amount :");
		lblNewLabel_2_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_2_1_3.setBounds(47, 300, 99, 14);
		p2.add(lblNewLabel_2_1_3);
		
		feedamount = new JTextField();
		feedamount.setColumns(10);
		feedamount.setBounds(134, 298, 67, 20);
		p2.add(feedamount);
		
		vaccineamount = new JTextField();
		vaccineamount.setColumns(10);
		vaccineamount.setBounds(157, 329, 258, 20);
		p2.add(vaccineamount);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Vaccine Amount :");
		lblNewLabel_2_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_2_2_1.setBounds(39, 329, 114, 14);
		p2.add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("Feed Type");
		lblNewLabel_2_2_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_2_2_2.setBounds(214, 296, 82, 14);
		p2.add(lblNewLabel_2_2_2);
		
		
		
		feedtype = new JTextField();
		feedtype.setColumns(10);
		feedtype.setBounds(285, 294, 89, 20);
		p2.add(feedtype);
		
		JLabel lblNewLabel_3 = new JLabel("Vaccination Type :");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(205, 257, 107, 14);
		p2.add(lblNewLabel_3);
		
		JButton btnNewButton_2_2 = new JButton("Back");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				cards.show(frame.getContentPane(), "p1");
				cidac.setText(null);
				name.setText(null);
				bg.clearSelection();
				vaccineamount.setText(null);
				feedamount.setText(null);
				feedtype.setText(null);
				quantity.setText(null);
			}
		});
		btnNewButton_2_2.setBounds(10, 11, 70, 19);
		p2.add(btnNewButton_2_2);
		
		JLabel lblNewLabel_4 = new JLabel("Month :");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(226, 135, 46, 14);
		p2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Month :");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setBounds(229, 168, 46, 14);
		p2.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Month :");
		lblNewLabel_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_2.setBounds(229, 196, 46, 14);
		p2.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_3 = new JLabel("Month :");
		lblNewLabel_4_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_3.setBounds(230, 224, 46, 14);
		p2.add(lblNewLabel_4_3);
		
		
		JPanel p3 = new JPanel();
		p3.setBackground(new Color(224, 255, 255));
		frame.getContentPane().add(p3, "p3");
		p3.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("Alerts");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_1_1.setEnabled(true);
		lblNewLabel_1_1.setBounds(122, 11, 242, 19);
		p3.add(lblNewLabel_1_1);
		
		cid_alerts = new JTextField();
		cid_alerts.setColumns(10);
		cid_alerts.setBounds(157, 42, 258, 20);
		p3.add(cid_alerts);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Cattle ID :");
		lblNewLabel_2_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_2_1_2.setBounds(48, 44, 99, 14);
		p3.add(lblNewLabel_2_1_2);
		
		JTextArea text_alerts = new JTextArea();
		text_alerts.setBounds(10, 132, 445, 346);
		p3.add(text_alerts);
		
		JButton btnNewButton_1_1 = new JButton("Submit");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String h;
				h=cid_alerts.getText();
				for(CattleInfo c:clist)
				{
					if(c.CattleID.equals(h))
					{
						
						text_alerts.setText(text_alerts.getText()+"\nDate to purchase Feed :"+c.feed.PurchaseDate().day()+"."+c.feed.PurchaseDate().month()+"."+c.feed.PurchaseDate().year());
						text_alerts.setText(text_alerts.getText()+"\n Date for Vaccination :"+c.Vaccine.date().day()+"."+c.Vaccine.date().month()+"."+c.Vaccine.date().year() );
						text_alerts.setText(text_alerts.getText()+"\n Date for Insurance Renewal :"+c.Insurance.InsuranceDue().day()+"."+c.Insurance.InsuranceDue().month()+"."+c.Insurance.InsuranceDue().year() );
					}
				}
				
				cid_alerts.setText(null);
			}
		});
		btnNewButton_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton_1_1.setBounds(193, 75, 89, 30);
		p3.add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("Back");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				cid_alerts.setText(null);
				text_alerts.setText(null);
				cards.show(frame.getContentPane(), "p1");
			}
		});
		btnNewButton_2_1.setBounds(10, 11, 70, 19);
		p3.add(btnNewButton_2_1);
		
		JPanel p4 = new JPanel();
		p4.setBackground(new Color(255, 222, 173));
		frame.getContentPane().add(p4, "p4");
		p4.setLayout(null);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Periodic Summary");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_1_1_1.setEnabled(true);
		lblNewLabel_1_1_1.setBounds(93, 11, 336, 19);
		p4.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("Cattle ID :");
		lblNewLabel_2_1_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_2_1_2_1.setBounds(48, 44, 99, 14);
		p4.add(lblNewLabel_2_1_2_1);
		
		cidsumm = new JTextField();
		cidsumm.setColumns(10);
		cidsumm.setBounds(157, 42, 258, 20);
		p4.add(cidsumm);
		
		JButton first = new JButton("<<");
		
		first.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		first.setBounds(43, 438, 89, 23);
		p4.add(first);
		
		JButton previous = new JButton("<");
		previous.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		previous.setBounds(142, 439, 89, 23);
		p4.add(previous);
		
		JButton Last = new JButton(">>");
		Last.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Last.setBounds(340, 438, 89, 23);
		p4.add(Last);
		
		JButton next = new JButton(">");
		next.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		next.setBounds(241, 437, 89, 23);
		p4.add(next);
		JButton btnNewButton_1_1_1 = new JButton("Submit");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String h;
				h=cidsumm.getText();
				for(CattleInfo c:clist)
				{
					if(c.CattleID.equals(h))
					{
						textsumm.setText("\n"+c.CattleName);
						textsumm.setText(textsumm.getText()+"\nFeed Info : "+c.feed.Quantity()+", Rs"+c.feed.price()+", Date to purchase Feed : "+c.feed.PurchaseDate().day()+"."+c.feed.PurchaseDate().month()+"."+c.feed.PurchaseDate().year());
						textsumm.setText(textsumm.getText()+"\n "+"Type of vaccination : "+c.Vaccine.T()+", Date for Vaccination : "+c.Vaccine.date().day()+"."+c.Vaccine.date().month()+"."+c.Vaccine.date().year() );
						textsumm.setText(textsumm.getText()+"\n"+"Date for Insurance Done : "+c.Insurance.InsuranceDone().day()+"."+c.Insurance.InsuranceDone().month()+"."+c.Insurance.InsuranceDone().year() + ", Date for Insurance Renewal :"+c.Insurance.InsuranceDue().day()+"."+c.Insurance.InsuranceDue().month()+"."+c.Insurance.InsuranceDue().year() );
						
					}
					
					
				}
				
				cidsumm.setText(null);
			}
		});
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_1_1.setBounds(189, 73, 89, 30);
		p4.add(btnNewButton_1_1_1);
		
		
		textsumm.setBounds(10, 132, 445, 268);
		p4.add(textsumm);
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				cidsumm.setText(null);
				textsumm.setText(null);
				cards.show(frame.getContentPane(), "p1");
			}
		});
		btnNewButton_2.setBounds(10, 11, 70, 19);
		p4.add(btnNewButton_2);
		
		
		
		
}
}
