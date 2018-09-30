package advanced_notepad;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
@Properties_of_class(name="Color_chooser_page",function="Creates a new page in which you can choose the color of the text.",version="1.2")
public class Color_chooser_page {
	private JTextField txtRed;
	private JTextField txtGreen;
	private JTextField txtBlue;
	private JLabel lblred;
	private JLabel lblGreen;
	private JLabel lblBlue;
	private JButton btnRed;
	private JButton btnLightGreen;
	private JButton btnLightBlue;
	private JButton btnOrange;
	private JButton btnGreen;
	private JButton btnBlue;
	private JButton btnYellow;
	private JButton btnTurquoise;
	private JButton btnDarkBlue;
	private JButton btnPink;
	private JButton btnDone;
	private JButton btnCancel;

	Color_chooser_page(int r,int g,int b){
		JFrame chooser_page = new JFrame();
		chooser_page.getContentPane().setBackground(Color.WHITE);
		chooser_page.setTitle("Choose color");
		chooser_page.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		chooser_page.setBounds(100, 100, 400, 250);
		chooser_page.getContentPane().setLayout(null);
		
		lblred = new JLabel("Red:");
		lblred.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblred.setBounds(20, 9, 30, 26);
		chooser_page.getContentPane().add(lblred);
		
		txtRed = new JTextField();
		txtRed.setText(""+r);
		txtRed.setBounds(60, 11, 49, 26);
		chooser_page.getContentPane().add(txtRed);
		txtRed.setColumns(10);
		
		lblGreen = new JLabel("Green:");
		lblGreen.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGreen.setBounds(133, 9, 44, 26);
		chooser_page.getContentPane().add(lblGreen);
		
		txtGreen = new JTextField();
		txtGreen.setText(""+g);
		txtGreen.setBounds(198, 9, 49, 26);
		chooser_page.getContentPane().add(txtGreen);
		txtGreen.setColumns(10);
		
		lblBlue = new JLabel("Blue:");
		lblBlue.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblBlue.setBounds(262, 9, 34, 26);
		chooser_page.getContentPane().add(lblBlue);
		
		txtBlue = new JTextField();
		txtBlue.setText(""+b);
		txtBlue.setBounds(311, 9, 49, 26);
		chooser_page.getContentPane().add(txtBlue);
		txtBlue.setColumns(10);
		
		btnRed = new JButton("Red");
		btnRed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtRed.setText("255");
				txtGreen.setText("0");
				txtBlue.setText("0");
			}
		});
		btnRed.setBackground(new Color(255, 0, 0));
		btnRed.setBounds(20, 46, 89, 23);
		chooser_page.getContentPane().add(btnRed);
		
		btnOrange = new JButton("Orange");
		btnOrange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtRed.setText("255");
				txtGreen.setText("128");
				txtBlue.setText("0");
			}
		});
		btnOrange.setBackground(new Color(255,128,0));
		btnOrange.setBounds(143, 46, 89, 23);
		chooser_page.getContentPane().add(btnOrange);
		
		btnYellow = new JButton("Yellow");
		btnYellow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtRed.setText("255");
				txtGreen.setText("255");
				txtBlue.setText("0");
			}
		});
		btnYellow.setBackground(new Color(255,255,0));
		btnYellow.setBounds(262, 46, 89, 23);
		chooser_page.getContentPane().add(btnYellow);
		
		btnLightGreen = new JButton("Light Green");
		btnLightGreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtRed.setText("128");
				txtGreen.setText("255");
				txtBlue.setText("0");
			}
		});
		btnLightGreen.setBackground(new Color(128,255,0));
		btnLightGreen.setBounds(20, 80, 89, 23);
		chooser_page.getContentPane().add(btnLightGreen);
		
		btnGreen = new JButton("Green");
		btnGreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtRed.setText("0");
				txtGreen.setText("255");
				txtBlue.setText("0");
			}
		});
		btnGreen.setBackground(new Color(0,255,0));
		btnGreen.setBounds(143, 80, 89, 23);
		chooser_page.getContentPane().add(btnGreen);
		
		btnTurquoise = new JButton("\u0422urquoise");
		btnTurquoise.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtRed.setText("0");
				txtGreen.setText("255");
				txtBlue.setText("128");
			}
		});
		btnTurquoise.setBackground(new Color(0,255,128));
		btnTurquoise.setBounds(262, 80, 89, 23);
		chooser_page.getContentPane().add(btnTurquoise);
		
		btnLightBlue = new JButton("Light Blue");
		btnLightBlue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtRed.setText("0");
				txtGreen.setText("255");
				txtBlue.setText("255");
			}
		});
		btnLightBlue.setBackground(new Color(0,255,255));
		btnLightBlue.setBounds(20, 114, 89, 23);
		chooser_page.getContentPane().add(btnLightBlue);
		
		btnBlue = new JButton("Blue");
		btnBlue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtRed.setText("0");
				txtGreen.setText("128");
				txtBlue.setText("255");
			}
		});
		btnBlue.setBackground(new Color(0,128,255));
		btnBlue.setBounds(143, 114, 89, 23);
		chooser_page.getContentPane().add(btnBlue);
		
		btnDarkBlue = new JButton("Dark Blue");
		btnDarkBlue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtRed.setText("0");
				txtGreen.setText("0");
				txtBlue.setText("255");
			}
		});
		btnDarkBlue.setBackground(new Color(0,0,255));
		btnDarkBlue.setBounds(262, 114, 89, 23);
		chooser_page.getContentPane().add(btnDarkBlue);
		
		JButton btnPurple = new JButton("Purple");
		btnPurple.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtRed.setText("128");
				txtGreen.setText("0");
				txtBlue.setText("255");
			}
		});
		btnPurple.setBackground(new Color(128,0,255));
		btnPurple.setBounds(88, 148, 89, 23);
		chooser_page.getContentPane().add(btnPurple);
		btnPurple.setBackground(new Color(128,0,255));
		
		btnPink = new JButton("Pink");
		btnPink.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtRed.setText("255");
				txtGreen.setText("0");
				txtBlue.setText("128");
			}
		});
		btnPink.setBackground(new Color(255,0,128));
		btnPink.setBounds(207, 148, 89, 23);
		chooser_page.getContentPane().add(btnPink);
		
		btnDone = new JButton("Done");
		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				advanced_notepad_main.r=Integer.parseInt(txtRed.getText());
				advanced_notepad_main.g=Integer.parseInt(txtGreen.getText());
				advanced_notepad_main.b=Integer.parseInt(txtBlue.getText());
				advanced_notepad_main.pnlcolorexample.setBackground(new Color(advanced_notepad_main.r,advanced_notepad_main.g,advanced_notepad_main.b));
				chooser_page.dispose();
			}
		});
		btnDone.setBounds(20, 182, 213, 23);
		chooser_page.getContentPane().add(btnDone);
		
		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			chooser_page.dispose();	
			}
		});
		btnCancel.setBounds(243, 182, 117, 23);
		chooser_page.getContentPane().add(btnCancel);
		chooser_page.setVisible(true);	
	}
}
