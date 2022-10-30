package Foot_Ball_Player;

import java.awt.EventQueue;


import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.awt.event.ActionEvent;

public class Foot_Ball_Player_GUI {

	private JFrame frame;
	private CardLayout cards;
	private JTextField name;
	private JTextField idap;
	private JTextField mc;
	private JTextField tsshots;
	private JTextField gc;
	private JTextField idsp;
	private ArrayList<FieldPlayer> flist=new ArrayList<FieldPlayer>();
	private ArrayList<Integer> bfp=new ArrayList<Integer>();
	private ArrayList<GoalKeeper> glist=new ArrayList<GoalKeeper>();
	private ArrayList<Integer> bgk=new ArrayList<Integer>();
	JTextArea textsbp;
	JTextArea textdap;
	ListIterator<FieldPlayer> li;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Foot_Ball_Player_GUI window = new Foot_Ball_Player_GUI();
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
	public Foot_Ball_Player_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		cards=new CardLayout(0,0);
		frame = new JFrame();
		frame.setBounds(100, 100, 532, 530);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(cards);
		
		JPanel p0 = new JPanel();
		p0.setBackground(new Color(255, 228, 196));
		frame.getContentPane().add(p0, "p0");
		p0.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Football Board");
		lblNewLabel.setEnabled(true);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setBounds(10, 11, 496, 31);
		p0.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("What Would you like to do ? :");
		lblNewLabel_1.setEnabled(true);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(44, 80, 282, 21);
		p0.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Add a Player");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				cards.show(frame.getContentPane(), "p2");
			}
		});
		btnNewButton.setEnabled(true);
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton.setBounds(171, 112, 155, 31);
		p0.add(btnNewButton);
		
		JButton btnSearchPlayer = new JButton("Search Player");
		btnSearchPlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				cards.show(frame.getContentPane(), "p1");
			}
		});
		btnSearchPlayer.setEnabled(true);
		btnSearchPlayer.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnSearchPlayer.setBounds(171, 162, 155, 31);
		p0.add(btnSearchPlayer);
		
		JButton btnDisplayBestPlayers = new JButton("Display Best Players");
		btnDisplayBestPlayers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				cards.show(frame.getContentPane(), "p3");
				
			}
		});
		btnDisplayBestPlayers.setEnabled(true);
		btnDisplayBestPlayers.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnDisplayBestPlayers.setBounds(171, 213, 155, 31);
		p0.add(btnDisplayBestPlayers);
		
		JButton btnDisplayAllPlayers = new JButton("Display All Players");
		btnDisplayAllPlayers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				cards.show(frame.getContentPane(), "p4");
				if(li.hasNext())
				{
					FieldPlayer F=li.next();
					
					textdap.setText("\n"+F.Name+" "+F.id+" Matches Played : "+ F.Count()+" Goals : "+F.goalcount());
				}
			}
		});
		btnDisplayAllPlayers.setEnabled(true);
		btnDisplayAllPlayers.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnDisplayAllPlayers.setBounds(171, 270, 155, 31);
		p0.add(btnDisplayAllPlayers);
		
		JPanel p1 = new JPanel();
		p1.setBackground(new Color(255, 228, 225));
		frame.getContentPane().add(p1, "p1");
		p1.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Search Player");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(100, 11, 293, 22);
		p1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("ID :");
		lblNewLabel_3_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_1_1.setBounds(101, 57, 64, 21);
		p1.add(lblNewLabel_3_1_1);
		
		idsp = new JTextField();
		idsp.setColumns(10);
		idsp.setBounds(175, 58, 287, 20);
		p1.add(idsp);
		
		JTextArea textsp = new JTextArea();
		textsp.setEditable(false);
		textsp.setBounds(10, 126, 496, 354);
		p1.add(textsp);
		
		JButton btnNewButton_1_1 = new JButton("Search");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				int id;
				
				id=Integer.parseInt(idsp.getText());
				
				for(FieldPlayer f:flist)
				{
					if(f.id==id)
					{
						textsp.setText("\n"+f.Name+" "+f.id+" "+" No of Matches : "+ f.count+ " "+"No of Goals : "+f.goalcount());
						
					}
				}
				
				for(GoalKeeper f:glist)
				{
					if(f.id==id)
					{
						textsp.setText("\n"+f.Name+" "+f.id+" "+" No of Matches : "+ f.count+ " "+"Stop Rate  : "+f.stoprate());
					
						
					}
				}
				
				String h=textsp.getText();
				if(h==null)
				{
					textsp.setText("Not found");
				}
			}
		});
		btnNewButton_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton_1_1.setBounds(185, 84, 110, 31);
		p1.add(btnNewButton_1_1);
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				idsp.setText(null);
				textsp.setText(null);
				cards.show(frame.getContentPane(), "p0");
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton_2.setBounds(10, 13, 89, 23);
		p1.add(btnNewButton_2);
		
		JPanel p2 = new JPanel();
		p2.setBackground(new Color(255, 182, 193));
		frame.getContentPane().add(p2, "p2");
		p2.setLayout(null);
		
		JLabel lblAddPlayer = new JLabel("Add Player");
		lblAddPlayer.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddPlayer.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblAddPlayer.setBounds(117, 11, 287, 31);
		p2.add(lblAddPlayer);
		
		JLabel lblNewLabel_2 = new JLabel("Type Of Player :");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(73, 68, 136, 21);
		p2.add(lblNewLabel_2);
		
		JRadioButton fieldplayer = new JRadioButton("Field Player");
		fieldplayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				tsshots.setEditable(false);
				gc.setEditable(true);
			}
		});
		fieldplayer.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		fieldplayer.setBounds(194, 68, 109, 23);
		p2.add(fieldplayer);
		
		JRadioButton goalie = new JRadioButton("Goalie");
		goalie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			gc.setEditable(false);
			tsshots.setEditable(true);
			}
		});
		goalie.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		goalie.setBounds(325, 68, 109, 23);
		p2.add(goalie);
		
        ButtonGroup bg=new ButtonGroup();
		
		bg.add(fieldplayer);
		bg.add(goalie);
		
		JLabel lblNewLabel_3 = new JLabel("Name   :");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(117, 111, 64, 21);
		p2.add(lblNewLabel_3);
		
		name = new JTextField();
		name.setBounds(191, 112, 287, 20);
		p2.add(name);
		name.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("ID :");
		lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_1.setBounds(117, 143, 64, 21);
		p2.add(lblNewLabel_3_1);
		
		idap = new JTextField();
		idap.setColumns(10);
		idap.setBounds(191, 144, 287, 20);
		p2.add(idap);
		
		JLabel lblNewLabel_3_2 = new JLabel("Match Count");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_2.setBounds(95, 175, 86, 21);
		p2.add(lblNewLabel_3_2);
		
		mc = new JTextField();
		mc.setColumns(10);
		mc.setBounds(191, 176, 287, 20);
		p2.add(mc);
		
		JLabel tss = new JLabel("Total Stopping Shots :");
		tss.setHorizontalAlignment(SwingConstants.CENTER);
		tss.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		tss.setBounds(52, 207, 129, 21);
		p2.add(tss);
		
		tsshots = new JTextField();
		tsshots.setColumns(10);
		tsshots.setBounds(191, 208, 287, 20);
		p2.add(tsshots);
		
		JLabel lblNewLabel_3_4 = new JLabel("Goals Count");
		lblNewLabel_3_4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_4.setBounds(95, 239, 86, 21);
		p2.add(lblNewLabel_3_4);
		
		gc = new JTextField();
		gc.setColumns(10);
		gc.setBounds(191, 240, 287, 20);
		p2.add(gc);
		
		JTextArea textap = new JTextArea();
		textap.setEditable(false);
		textap.setBounds(10, 327, 496, 153);
		p2.add(textap);
		
		JButton btnNewButton_1 = new JButton("Insert");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				textap.setText(null);
				FieldPlayer f;
				GoalKeeper gk;
				String n;
				int c,g,t,id;
				if(fieldplayer.isSelected())
				{
					n=name.getText();
					id=Integer.parseInt(idap.getText());
					c=Integer.parseInt(mc.getText());
					g=Integer.parseInt(gc.getText());
					f=new FieldPlayer(n,c,id,g);
					
					if(flist.add(f))
					{
						textap.setText("Successfully added");
						bfp.add(f.goalcount());
						li=flist.listIterator();
					}
					
					else
					{
						textap.setText("Failed to add");
					}
				}
				
				else
				{
					n=name.getText();
					id=Integer.parseInt(idap.getText());
					c=Integer.parseInt(mc.getText());
					t=Integer.parseInt(tsshots.getText());
					gk=new GoalKeeper(n,c,id,t);
					
					if(glist.add(gk))
					{
						textap.setText("Successfully added");
						bgk.add(gk.stoprate());
					}
					
					else
					{
						textap.setText("Failed to add");
					}
				}
				bg.clearSelection();
				tsshots.setEditable(true);
				gc.setEditable(true);
				name.setText(null);
				idap.setText(null);
				mc.setText(null);
				tsshots.setText(null);
				gc.setText(null);
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton_1.setBounds(193, 281, 110, 31);
		p2.add(btnNewButton_1);
		
		
		
		JButton btnNewButton_2_1 = new JButton("Back");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				name.setText(null);
				idap.setText(null);
				
				textap.setText(null);
				cards.show(frame.getContentPane(), "p0");
			}
		});
		btnNewButton_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton_2_1.setBounds(10, 11, 89, 23);
		p2.add(btnNewButton_2_1);
		
		JPanel p3 = new JPanel();
		p3.setBackground(new Color(255, 255, 224));
		frame.getContentPane().add(p3, "p3");
		p3.setLayout(null);
		
		JLabel lblNewLabel_4_1 = new JLabel("Search Best Player");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_4_1.setBounds(123, 11, 296, 22);
		p3.add(lblNewLabel_4_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Search");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				textsbp.setText(null);
				Collections.sort(bfp,Collections.reverseOrder());
				Collections.sort(bgk,Collections.reverseOrder());
				int g=bfp.get(0);
				int s=bgk.get(0);
					for(FieldPlayer f:flist)
					{
						if(f.goalcount()==g)
						{
							textsbp.setText(textsbp.getText()+"\n"+f.Name+" "+f.id+" "+" No of Matches : "+ f.count+ " "+"No of Goals : "+f.goalcount());
							
						}
						
					}
					
				
					for(GoalKeeper f:glist)
					{
						if(f.stoprate()==s)
						{
							textsbp.setText(textsbp.getText()+"\n"+f.Name+" "+f.id+" "+" No of Matches : "+ f.count+ " "+"Stop Rate  : "+f.stoprate());
						
						}
						
						
					}
					
					
				
			}
		});
		btnNewButton_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton_1_1_1.setBounds(199, 68, 110, 31);
		p3.add(btnNewButton_1_1_1);
		
		textsbp = new JTextArea();
		textsbp.setEditable(false);
		textsbp.setBounds(10, 126, 496, 354);
		p3.add(textsbp);
		
		JButton btnNewButton_2_2 = new JButton("Back");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				textsbp.setText(null);
				cards.show(frame.getContentPane(), "p0");
			}
		});
		btnNewButton_2_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton_2_2.setBounds(20, 13, 89, 23);
		p3.add(btnNewButton_2_2);
		
		JPanel p4 = new JPanel();
		p4.setBackground(new Color(240, 255, 240));
		frame.getContentPane().add(p4, "p4");
		p4.setLayout(null);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Display All Players");
		lblNewLabel_4_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_4_1_1.setBounds(115, 11, 312, 22);
		p4.add(lblNewLabel_4_1_1);
		
		 textdap = new JTextArea();
		textdap.setEditable(false);
		textdap.setBounds(10, 62, 496, 283);
		p4.add(textdap);
		
		JButton btnNewButton_2_3 = new JButton("Back");
		btnNewButton_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				textdap.setText(null);
				cards.show(frame.getContentPane(), "p0");
			}
		});
		btnNewButton_2_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton_2_3.setBounds(20, 13, 89, 23);
		p4.add(btnNewButton_2_3);
		
		
		
		JButton previous = new JButton("<");
		previous.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				textdap.setText(null);
				
				
			 if(li.hasPrevious())
			 {
					FieldPlayer Fp=li.previous();
					textdap.setText("\n"+Fp.Name+" "+Fp.id+"  No of matches :  "+Fp.count+ " No of Goals : "+Fp.goalcount());
					
			 }
			}
		});
		previous.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		previous.setBounds(176, 376, 72, 23);
		p4.add(previous);
		
		JButton next = new JButton(">");
		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			
			{
				textdap.setText(null);
				if(li.hasNext())
				{
					FieldPlayer F=li.next();
					textdap.setText("\n"+F.Name+" "+F.id+"  No of matches :  "+F.count+ " No of Goals : "+F.goalcount());
					
				}
			}
		});
		next.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		next.setBounds(270, 374, 72, 23);
		p4.add(next);

		
		JButton last = new JButton(">>");
		last.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				textdap.setText(null);
				FieldPlayer F=flist.get(flist.size()-1);
				
				textdap.setText(textdap.getText()+"\n"+F.Name+" "+F.id+"  No of matches :  "+F.count+ " No of Goals : "+F.goalcount());
			}
		});
		last.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		last.setBounds(355, 375, 72, 23);
		p4.add(last);
		JButton first = new JButton("<<");
		first.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				textdap.setText(null);
				FieldPlayer F=flist.get(0);
				
				
				textdap.setText(textdap.getText()+"\n"+F.Name+" "+F.id+"  No of matches :  "+F.count+ " No of Goals : "+F.goalcount());
				
			}
		});
		first.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		first.setBounds(91, 375, 72, 23);
		p4.add(first);
			}
}
