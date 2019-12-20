import java.awt.Color;
import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JTextField;

public class TextHandler implements FocusListener {

	@Override
	public void focusGained(FocusEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		Component cmp = e.getComponent();
		JTextField txt = (JTextField)cmp;
		String val = txt.getText();
		
		if(val.matches("[a-z]+")) {
			cmp.setBackground(Color.green);
		}else {
			cmp.setBackground(Color.red);
		}
	}

}
