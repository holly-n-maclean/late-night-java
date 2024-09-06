import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class CurrencyConverter extends JFrame {
	private JTextField txtAmount;
	public CurrencyConverter() {
		getContentPane().setFont(new Font("Georgia", Font.PLAIN, 11));
		getContentPane().setBackground(new Color(230, 230, 250));
		setTitle("Holly's Currency Converter");
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Currency Converter");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Gill Sans MT", Font.PLAIN, 27));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(57, 11, 315, 49);
		getContentPane().add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Georgia", Font.PLAIN, 11));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"CAD", "USD"}));
		comboBox.setBounds(178, 85, 61, 22);
		getContentPane().add(comboBox);
		
		txtAmount = new JTextField();
		txtAmount.setBounds(112, 86, 56, 20);
		getContentPane().add(txtAmount);
		txtAmount.setColumns(10);
		
		JButton btnNewButton = new JButton("Convert");
		btnNewButton.setFont(new Font("Georgia", Font.PLAIN, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double total;
				double amount = Double.parseDouble(txtAmount.getText());
			}
		});
		btnNewButton.setBounds(162, 132, 89, 23);
		getContentPane().add(btnNewButton);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Georgia", Font.PLAIN, 11));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"USD", "CAD", "AUS"}));
		comboBox_1.setBounds(277, 85, 56, 22);
		getContentPane().add(comboBox_1);
		
		JLabel lblNewLabel_1 = new JLabel("Amount:");
		lblNewLabel_1.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(57, 89, 56, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("To:");
		lblNewLabel_2.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(258, 89, 22, 14);
		getContentPane().add(lblNewLabel_2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
