package advanced_notepad;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import java.awt.Color;

import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.beans.XMLDecoder;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.awt.event.ActionEvent;
import javax.swing.JFileChooser;
import javax.swing.JCheckBox;
import java.awt.Insets;
@Properties_of_class(name="advanced_notepad_main",function="Launchs the main method in which is creating the main page and the action listeners",version="1.6")
public class advanced_notepad_main extends JFrame {

	private static final long serialVersionUID = 1L;
	public static JPanel contentPane;
	public static int style = Font.PLAIN;
	public static Font f = new Font("Arial", style, 40);
	public static JTabbedPane tabpan;
	public static JPanel font_menu;
	public static JTextField txtfont;
	public static JTextField txtsize;
	public static Color c = new Color(0, 0, 0);
	public static String font,file_location;
	public static int size, r  = 0, g = 0,b = 0;
	public static JCheckBox chckbxitalic;
	public static JCheckBox chckbxbold;
	public static JPanel pnlfile;
	public static JButton btnsaveas;
	public static JButton btnLoad;
	public static String consolafont = "", consolafile = "", consolaparagraph = "";
	public static String text; 
	public static JButton btnapply;
	public static JLabel lblcolor;
	public static JLabel lblsize;
	public static JLabel lblfont;
	public static JTextArea txtconsolafont;
	public static JTextArea txtareaconsolafile;
	public static JButton btnresetfont;
	public static JPanel pnlparagraph;
	public static JTextField txtbottom;
	public static JTextField txtleft;
	public static JTextField txtright;
	public static JTextField txtup;
	public static JTextArea txtconsolaparagraph;
	public static JCheckBox chckbxWordWrap;
	public static JLabel lblbottom;
	public static JFileChooser chooser;
	public static File file;
    public static JTextArea textArea;
    public static JScrollPane scrollPane;
    public static JPanel pnlcolorexample;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					advanced_notepad_main frame = new advanced_notepad_main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public advanced_notepad_main() {
		setTitle("Java Rich Text Editor");
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		font_menu = new JPanel();
		font_menu.setBounds(0, 0, 127, 439);

		tabpan = new JTabbedPane(JTabbedPane.TOP);
		tabpan.setBounds(10, 11, 127, 439);
		contentPane.add(tabpan);
		tabpan.add(font_menu);
		tabpan.setEnabledAt(0, true);
		tabpan.setTitleAt(0, "Font");
		font_menu.setLayout(null);

		lblfont = new JLabel("Font:");
		lblfont.setHorizontalAlignment(SwingConstants.CENTER);
		lblfont.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblfont.setBounds(10, 11, 34, 14);
		font_menu.add(lblfont);

		txtfont = new JTextField();
		txtfont.setText("Arial");
		txtfont.setBounds(43, 9, 69, 20);
		font_menu.add(txtfont);
		txtfont.setColumns(10);

		lblsize = new JLabel("Size:");
		lblsize.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblsize.setHorizontalAlignment(SwingConstants.CENTER);
		lblsize.setBounds(0, 93, 44, 14);
		font_menu.add(lblsize);

		txtsize = new JTextField();
		txtsize.setText("12");
		txtsize.setBounds(43, 92, 69, 20);
		font_menu.add(txtsize);
		txtsize.setColumns(10);

		lblcolor = new JLabel("Color:");
		lblcolor.setHorizontalAlignment(SwingConstants.CENTER);
		lblcolor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblcolor.setBounds(24, 126, 44, 14);
		font_menu.add(lblcolor);

		btnapply = new JButton("Apply");
		btnapply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtconsolafont.setText("");
				font = txtfont.getText();
				consolafont = "";
				try {
					size = Integer.parseInt(txtsize.getText());
				} catch (Exception e) {
					consolafont += "Enter valid number for size.";
					txtconsolafont.setText(consolafont);
				}
				c= new Color(r,g,b);
				textArea.setForeground(c);
				try {
				if (chckbxbold.isSelected()) {
					if (chckbxitalic.isSelected()) {
						f = new Font(font, Font.BOLD + Font.ITALIC, size);
					} else {
						f = new Font(font, Font.BOLD, size);
					}
				} else {
					if (chckbxitalic.isSelected()) {
						f = new Font(font, Font.ITALIC, size);
					} else {
						f = new Font(font, Font.PLAIN, size);
					}
				}
				textArea.setFont(f);
				}catch(Exception e) {
					consolafont += "Enter valid number for font.";
					txtconsolafont.setText(consolafont);	
				}
			}

		});
		btnapply.setBounds(10, 180, 102, 35);
		font_menu.add(btnapply);

		chckbxbold = new JCheckBox("Bold");
		chckbxbold.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxbold.setBounds(10, 50, 52, 23);
		font_menu.add(chckbxbold);

		chckbxitalic = new JCheckBox("Italic");
		chckbxitalic.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxitalic.setBounds(60, 50, 52, 23);
		font_menu.add(chckbxitalic);

		txtconsolafont = new JTextArea();
		txtconsolafont.setEditable(false);
		txtconsolafont.setBounds(10, 272, 102, 128);
		font_menu.add(txtconsolafont);
		txtconsolafont.setLineWrap(true);
		txtconsolafont.setWrapStyleWord(true);

		btnresetfont = new JButton("Reset to default");
		btnresetfont.setMargin(new Insets(2, 2, 2, 2));
		btnresetfont.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtsize.setText("12");
				txtfont.setText("Arial");
				chckbxbold.setSelected(false);
				chckbxitalic.setSelected(false);
				r=0;
				g=0;
				b=0;
				pnlcolorexample.setBackground(new Color(r,g,b));
			}
		});
		btnresetfont.setBounds(10, 226, 102, 35);
		font_menu.add(btnresetfont);
		
		JButton btnChooseColor = new JButton("Choose color");
		btnChooseColor.setMargin(new Insets(2, 2, 2, 2));
		btnChooseColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Color_chooser_page(r,g,b);
			}
		});
		btnChooseColor.setBounds(10, 151, 102, 23);
		font_menu.add(btnChooseColor);
		
		pnlcolorexample = new JPanel();
		pnlcolorexample.setBackground(new Color(r,g,b));
		pnlcolorexample.setBounds(75, 126, 15, 15);
		font_menu.add(pnlcolorexample);

		pnlfile = new JPanel();
		tabpan.addTab("File", null, pnlfile, null);
		pnlfile.setLayout(null);

		JButton btnclear = new JButton("New plot");
		btnclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtareaconsolafile.setText("");
				textArea.setText("");
			}
		});
		btnclear.setBounds(16, 10, 89, 25);
		pnlfile.add(btnclear);

		btnsaveas = new JButton("Save as");
		btnsaveas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				consolafile="";
				text = textArea.getText();
				new Save_page();
				txtareaconsolafile.setText(consolafile);
			}
		});
		btnsaveas.setBounds(16, 46, 89, 25);
		pnlfile.add(btnsaveas);

		btnLoad = new JButton("Load");
		btnLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	            chooser = new JFileChooser();
	            int returnVal = chooser.showOpenDialog(getParent());
	            if(returnVal == JFileChooser.APPROVE_OPTION) {
	               file = chooser.getSelectedFile();
	            }
				txtareaconsolafile.setText("");
				try (FileInputStream fis = new FileInputStream(file);
						DataInputStream dis = new DataInputStream(fis);) {
					text = dis.readUTF();
					textArea.setText(text);
					consolafile="Load is done.";
					txtareaconsolafile.setText(consolafile);
				} catch (FileNotFoundException a) {
					consolafile = "File not found.";
					txtareaconsolafile.setText(consolafile);
			    }catch(NullPointerException b){	
			    }catch (Exception d) {
					consolafile = "Unknown Exception.";
					txtareaconsolafile.setText(consolafile);
					System.out.println(d);
			    }
			}
		});
		btnLoad.setBounds(16, 80, 89, 25);
		pnlfile.add(btnLoad);

		txtareaconsolafile = new JTextArea();
		txtareaconsolafile.setEditable(false);
		txtareaconsolafile.setBounds(10, 219, 102, 165);
		pnlfile.add(txtareaconsolafile);
		txtareaconsolafile.setLineWrap(true);
		txtareaconsolafile.setWrapStyleWord(true);

		JButton btnsaveasxml = new JButton("Save as XML");
		btnsaveasxml.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtareaconsolafile.setText("");
				text = textArea.getText();
				new Save_as_XML_page();
				txtareaconsolafile.setText(consolafile);
				
			}
		});
		btnsaveasxml.setMargin(new Insets(2, 2, 2, 2));
		btnsaveasxml.setBounds(10, 116, 102, 23);
		pnlfile.add(btnsaveasxml);

		JButton btnloadasxml = new JButton("Load XML");
		btnloadasxml.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtareaconsolafile.setText("");
	            chooser = new JFileChooser();
	            int returnVal = chooser.showOpenDialog(getParent());
	            if(returnVal == JFileChooser.APPROVE_OPTION) {
	               file = chooser.getSelectedFile();
	            }	
				try (FileInputStream fis = new FileInputStream(file);	XMLDecoder xml = new XMLDecoder(fis);){
					Advanced_notepad_save_xml loaded_xml = (Advanced_notepad_save_xml) xml.readObject();
	                textArea.setText(loaded_xml.getText());
	                textArea.setFont(loaded_xml.getF());
	                textArea.setMargin(loaded_xml.getM());
	                textArea.setFont(loaded_xml.getF());
	                txtsize.setText(loaded_xml.getSize_of_text());
	                c = new Color(loaded_xml.getR(),loaded_xml.getG(),loaded_xml.getB());
	                pnlcolorexample.setBackground(c);
	                textArea.setForeground(c);
	                txtbottom.setText(loaded_xml.getMargin_bottom());
	                txtleft.setText(loaded_xml.getMargin_left());
	                txtright.setText(loaded_xml.getMargin_right());
	                txtup.setText(loaded_xml.getMargin_up());
	                chckbxbold.setSelected(loaded_xml.isBold());
	                chckbxitalic.setSelected(loaded_xml.isItalic());
	                chckbxWordWrap.setSelected(loaded_xml.isWordstylewrap());
				    }catch (FileNotFoundException e) {
						consolafile = "File not found.";
						txtareaconsolafile.setText(consolafile);	
				    }catch(EOFException b){
						consolafile = "File cannot be encoded.";
						txtareaconsolafile.setText(consolafile);
				    }catch(Exception e){}
			}
		});
		btnloadasxml.setMargin(new Insets(2, 2, 2, 2));
		btnloadasxml.setBounds(10, 150, 102, 23);
		pnlfile.add(btnloadasxml);

		pnlparagraph = new JPanel();
		pnlparagraph.setName("Paragraph");
		tabpan.addTab("Margins", null, pnlparagraph, null);
		pnlparagraph.setLayout(null);

		JLabel lblMargins = new JLabel("Margins:");
		lblMargins.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMargins.setHorizontalAlignment(SwingConstants.CENTER);
		lblMargins.setBounds(33, 11, 56, 23);
		pnlparagraph.add(lblMargins);

		lblbottom = new JLabel("Bottom:");
		lblbottom.setHorizontalAlignment(SwingConstants.CENTER);
		lblbottom.setBounds(0, 45, 56, 14);
		pnlparagraph.add(lblbottom);

		JLabel lblleft = new JLabel("Left:");
		lblleft.setBounds(10, 70, 46, 14);
		pnlparagraph.add(lblleft);

		JLabel lblRight = new JLabel("Right:");
		lblRight.setBounds(10, 95, 46, 14);
		pnlparagraph.add(lblRight);

		JLabel lblup = new JLabel("Up");
		lblup.setBounds(10, 120, 46, 14);
		pnlparagraph.add(lblup);

		txtbottom = new JTextField();
		txtbottom.setText("0");
		txtbottom.setBounds(53, 42, 59, 20);
		pnlparagraph.add(txtbottom);
		txtbottom.setColumns(10);

		txtleft = new JTextField();
		txtleft.setText("0");
		txtleft.setBounds(53, 67, 59, 20);
		pnlparagraph.add(txtleft);
		txtleft.setColumns(10);

		txtright = new JTextField();
		txtright.setText("0");
		txtright.setBounds(53, 92, 59, 20);
		pnlparagraph.add(txtright);
		txtright.setColumns(10);

		txtup = new JTextField();
		txtup.setText("0");
		txtup.setBounds(53, 120, 59, 20);
		pnlparagraph.add(txtup);
		txtup.setColumns(10);

		JButton btnapplymargin = new JButton("Apply");
		btnapplymargin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtconsolaparagraph.setText("");
				consolaparagraph = "";
				textArea.setWrapStyleWord(chckbxWordWrap.isSelected());
				try {
					text = textArea.getText();
					textArea.setText("");
					Insets m = new Insets(Integer.parseInt(txtbottom.getText()), Integer.parseInt(txtleft.getText()),
							Integer.parseInt(txtright.getText()), Integer.parseInt(txtup.getText()));
					textArea.setMargin(m);
				} catch (Exception a) {
					consolaparagraph = "Enter valid numbers for margins";
					txtconsolaparagraph.setText(consolaparagraph);
				} finally {
					textArea.setText(text);
				}
			}
		});
		btnapplymargin.setBounds(10, 220, 102, 23);
		pnlparagraph.add(btnapplymargin);

		txtconsolaparagraph = new JTextArea();
		txtconsolaparagraph.setEditable(false);
		txtconsolaparagraph.setWrapStyleWord(true);
		txtconsolaparagraph.setLineWrap(true);
		txtconsolaparagraph.setBounds(10, 254, 102, 130);
		pnlparagraph.add(txtconsolaparagraph);

		chckbxWordWrap = new JCheckBox("WordStyleWrap");
		chckbxWordWrap.setMargin(new Insets(2, 0, 0, 2));
		chckbxWordWrap.setSelected(true);
		chckbxWordWrap.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxWordWrap.setBounds(0, 173, 122, 23);
		pnlparagraph.add(chckbxWordWrap);
		
		textArea = new JTextArea();
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setBounds(147, 11, 577, 439);
		contentPane.add(textArea);
		
		scrollPane = new JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(144, 11, 577, 439);
		contentPane.add(scrollPane);
	}
}