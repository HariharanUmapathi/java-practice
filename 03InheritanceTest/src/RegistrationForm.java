import java.awt.FlowLayout;
import java.awt.event.FocusListener;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class RegistrationForm extends JFrame {
	private JTextField txtName;
	private JPasswordField txtPass;
	private JTextField txtLocation;
	private JButton btnSubmit;
	
	public RegistrationForm() {
		
		txtName = new JTextField(20);
		txtPass = new JPasswordField(20);
		txtLocation = new JTextField(20);
		btnSubmit = new JButton("Register");
		
		this.setLayout(new FlowLayout());
		this.add(txtName);
		this.add(txtPass);
		this.add(txtLocation);
		this.add(btnSubmit);
		
		MouseListener mh = new MyHandler();
		FocusListener fh = new MyHandler();
		
		btnSubmit.addMouseListener(mh);
		txtName.addFocusListener(fh);
		
		
		this.setVisible(true);
		this.setSize(400,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
