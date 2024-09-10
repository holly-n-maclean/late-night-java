package currencyConverter;

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
	private JComboBox<String> txtTo;
	private JComboBox<String> textFrom;
	private JLabel lblNewLabel_3;
	
	public void convertCurrency() {
        double total;
        double amount = Double.parseDouble(txtAmount.getText());
        
        if (textFrom.getSelectedItem().equals("USD") 
                && (txtTo.getSelectedItem().toString().equals("CAD"))) {
            total = amount * 1.27;
            lblNewLabel_3.setText(String.valueOf(total));
        }
        else if (textFrom.getSelectedItem().equals("USD")
                && (txtTo.getSelectedItem().toString().equals("AUS"))) {
            total = amount * 1.35;
            lblNewLabel_3.setText(String.valueOf(total));
        } else if (textFrom.getSelectedItem().equals("CAD")
                && (txtTo.getSelectedItem().toString().equals("USD"))) {
            total = amount * 0.79;
            lblNewLabel_3.setText(String.valueOf(total));
        } else if (textFrom.getSelectedItem().equals("CAD")
                && (txtTo.getSelectedItem().toString().equals("AUS"))) {
            total = amount * 1.06;
            lblNewLabel_3.setText(String.valueOf(total));
        }
	}
	
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
		
		textFrom = new JComboBox<String>();
		textFrom.setFont(new Font("Georgia", Font.PLAIN, 11));
		textFrom.setModel(new DefaultComboBoxModel<String>(new String[] {"CAD", "USD"}));
		textFrom.setBounds(178, 85, 61, 22);
		getContentPane().add(textFrom);
		
		txtAmount = new JTextField();
		txtAmount.setBounds(112, 86, 56, 20);
		getContentPane().add(txtAmount);
		txtAmount.setColumns(10);
		
		JButton btnNewButton = new JButton("Convert");
		btnNewButton.setFont(new Font("Georgia", Font.PLAIN, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				convertCurrency();
			}
		});
		btnNewButton.setBounds(162, 132, 89, 23);
		getContentPane().add(btnNewButton);
		
		txtTo = new JComboBox<String>();
		txtTo.setFont(new Font("Georgia", Font.PLAIN, 11));
		txtTo.setModel(new DefaultComboBoxModel<String>(new String[] {"USD", "CAD", "AUS"}));
		txtTo.setBounds(277, 85, 56, 22);
		getContentPane().add(txtTo);
		
		JLabel lblNewLabel_1 = new JLabel("Amount:");
		lblNewLabel_1.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(57, 89, 56, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("To:");
		lblNewLabel_2.setFont(new Font("Georgia", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(258, 89, 22, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Enter amount and click convert");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(91, 194, 242, 14);
		getContentPane().add(lblNewLabel_3);
	}

	public static void main(String[] args) {
		CurrencyConverter myConverter = new CurrencyConverter();
		myConverter.setSize(450, 300);
		myConverter.setVisible(true);
		

	}
}
