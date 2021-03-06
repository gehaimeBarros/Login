package br.com.testelogin;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import java.awt.GridLayout;

public class Login {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		JPanel panel = new JPanel(new BorderLayout(5, 5));

		JPanel label = new JPanel(new GridLayout(0, 1, 2, 2));
		label.add(new JLabel("E-Mail", SwingConstants.RIGHT));
		label.add(new JLabel("Password", SwingConstants.RIGHT));
		panel.add(label, BorderLayout.WEST);

		JPanel controls = new JPanel(new GridLayout(0, 1, 2, 2));
		JTextField username = new JTextField();
		controls.add(username);
		JPasswordField password = new JPasswordField();
		controls.add(password);
		panel.add(controls, BorderLayout.CENTER);

		JOptionPane.showMessageDialog(null, panel, "login", JOptionPane.PLAIN_MESSAGE);

		String PERGUNTA = JOptionPane.showInputDialog("Informações do login?");

		if (PERGUNTA.equals("sim")) {
			JOptionPane.showMessageDialog(null, "Dados Login\n\nUser: " + username.getText() + "\nPass: " + password.getText()+"\n\n",
					"login / Informações", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Ok, encerrando.");
		}

	}
}
