package advanced_notepad;

import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.Insets;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.awt.event.ActionEvent;
import java.awt.Font;

@Properties_of_class(name="Save_as_XML_page",function="Creates a new page in which you can choose properties of the saving of the file in XML.",version="1.2")
public class Save_as_XML_page extends JFrame{
	private JTextField txtlocationfile;
	private JTextField txtfilename;
    private String  filelocation,filename;
	public String getFilelocation() {
		return filelocation;
	}
	public Save_as_XML_page() {
		
		JFrame savepage = new JFrame();
		savepage.setTitle("Save as XML");
		savepage.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		savepage.setBounds(300, 300, 400, 160);
		savepage.getContentPane().setLayout(null);
		savepage.setVisible(true);
		
		JLabel lblfilelocation = new JLabel("Choose destination folder:");
		lblfilelocation.setHorizontalAlignment(SwingConstants.CENTER);
		lblfilelocation.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblfilelocation.setBounds(10, 11, 152, 14);
		savepage.getContentPane().add(lblfilelocation);
		
		txtlocationfile = new JTextField();
		txtlocationfile.setBounds(162, 8, 110, 20);
		savepage.getContentPane().add(txtlocationfile);
		txtlocationfile.setColumns(10);
		
		JButton btnsearchfile = new JButton("Search in files");
		btnsearchfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	            JFileChooser chooser = new JFileChooser();
	            chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
	            int returnVal = chooser.showOpenDialog(getParent());
	            if(returnVal == JFileChooser.APPROVE_OPTION) {
	            	txtlocationfile.setText(chooser.getSelectedFile().getPath());	           
                }
			}
		});
		btnsearchfile.setMargin(new Insets(0, 0, 0, 0));
		btnsearchfile.setBounds(282, 7, 92, 23);
		savepage.getContentPane().add(btnsearchfile);
		
		JLabel lblfilename = new JLabel("Choose file name:");
		lblfilename.setHorizontalAlignment(SwingConstants.CENTER);
		lblfilename.setBounds(43, 50, 110, 14);
		savepage.getContentPane().add(lblfilename);
		
		txtfilename = new JTextField();
		txtfilename.setBounds(162, 47, 132, 20);
		savepage.getContentPane().add(txtfilename);
		txtfilename.setColumns(10);
		
		JButton btnapplysave = new JButton("Done");
		btnapplysave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0){
				filelocation = txtlocationfile.getText();	
				filename = txtfilename.getText();	
				Advanced_notepad_save_xml save_xml = new Advanced_notepad_save_xml();
                save_xml.setText(advanced_notepad_main.textArea.getText());
                save_xml.setF(advanced_notepad_main.textArea.getFont());
                save_xml.setM(advanced_notepad_main.textArea.getInsets());
                save_xml.setFont(advanced_notepad_main.txtfont.getText());
                save_xml.setSize_of_text(advanced_notepad_main.txtsize.getText());
                save_xml.setR(advanced_notepad_main.r);
                save_xml.setG(advanced_notepad_main.g);
                save_xml.setB(advanced_notepad_main.b);
                save_xml.setMargin_bottom(advanced_notepad_main.txtbottom.getText());
                save_xml.setMargin_left(advanced_notepad_main.txtleft.getText());
                save_xml.setMargin_right(advanced_notepad_main.txtright.getText());
                save_xml.setMargin_up(advanced_notepad_main.txtup.getText());
                save_xml.setBold(advanced_notepad_main.chckbxbold.isSelected());
                save_xml.setItalic(advanced_notepad_main.chckbxitalic.isSelected());
                save_xml.setWordstylewrap(advanced_notepad_main.chckbxWordWrap.isSelected());                
				try(FileOutputStream fos = new FileOutputStream(new File(filelocation+filename+".xml"));XMLEncoder x = new XMLEncoder(fos);) {
					x.writeObject(save_xml);
					advanced_notepad_main.consolafile="Save is done.";
				    } catch (FileNotFoundException e) {
				    	advanced_notepad_main.consolafile = "File not found.";
				    } catch (Exception e) {
				    	advanced_notepad_main.consolafile = "Unknown Exception.";
				    }
				    savepage.dispose();
			}
		});
		btnapplysave.setBounds(90, 78, 89, 23);
		savepage.getContentPane().add(btnapplysave);
		
		JButton btncancel = new JButton("Cancel");
		btncancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				savepage.dispose();
			}
		});
		btncancel.setBounds(195, 78, 89, 23);
		savepage.getContentPane().add(btncancel);
				
	}
}


