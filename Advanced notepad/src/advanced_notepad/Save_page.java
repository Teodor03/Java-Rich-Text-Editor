package advanced_notepad;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.Insets;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Font;

@Properties_of_class(name="Save_page",function="Creates a new page in which you can choose properties of the saving of the file.",version="1.2")
public class Save_page extends JFrame{
	private JTextField txtlocationfile;
	private JTextField txtfilename;
    private String  filelocation,filename;
	public String getFilelocation() {
		return filelocation;
	}
	public Save_page() {
		
		JFrame savepage = new JFrame();
		savepage.setTitle("Save as");
		savepage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		savepage.setBounds(600, 600, 400, 160);
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
				try (FileOutputStream fos = new FileOutputStream(filelocation+filename+".txt");
						DataOutputStream dos = new DataOutputStream(fos);) {
					dos.writeUTF(advanced_notepad_main.text);
					advanced_notepad_main.consolafile="Save is done.";					
					savepage.dispose();
				}  catch (FileNotFoundException o) {
					advanced_notepad_main.consolafile="The file was not found.";
				}catch (Exception e) {
			    	advanced_notepad_main.consolafile="Unknown Exception";
			    }

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


