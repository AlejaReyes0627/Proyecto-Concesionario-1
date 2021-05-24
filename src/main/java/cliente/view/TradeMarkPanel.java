package cliente.view;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;

import cliente.controller.Controller;

import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class TradeMarkPanel extends JDialog  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtNombre;
	private JTextField txtCodigoMar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			TradeMarkPanel dialog = new TradeMarkPanel();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public TradeMarkPanel() {
		setResizable(false);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setTitle("Marca");
		setBounds(100, 100, 364, 288);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		Controller control = new Controller();
		this.setLocationRelativeTo(null);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBounds(22, 11, 312, 81);
			panel.setBorder(new LineBorder(SystemColor.activeCaption, 2));
			panel.setBackground(Color.WHITE);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JLabel lblNewLabel = new JLabel("Nombre");
				lblNewLabel.setBounds(31, 16, 92, 14);
				panel.add(lblNewLabel);
				lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
			}
			{
				txtNombre = new JTextField();
				txtNombre.setBounds(202, 15, 100, 20);
				panel.add(txtNombre);
				txtNombre.setColumns(10);
			}
			{
				JButton btnClean1 = new JButton("Clean");
				btnClean1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{
						txtNombre.setText("");
					}
				});
				btnClean1.setFont(new Font("Tahoma", Font.PLAIN, 10));
				btnClean1.setBounds(23, 43, 100, 26);
				panel.add(btnClean1);
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setBounds(22, 112, 312, 127);
			panel.setBackground(Color.WHITE);
			panel.setBorder(new LineBorder(SystemColor.activeCaption, 2));
			panel.setForeground(Color.WHITE);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JButton btnBuscarMarca = new JButton("Search");
				btnBuscarMarca.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						control.findByPlacaTradeMark(txtNombre.getText());
						if(control.findByPlacaTradeMark(txtNombre.getText())==false)
						{
							JOptionPane.showMessageDialog(null, "The trademark you're \nsearching is NOT in the data base");
						}
						else
						{
							JOptionPane.showMessageDialog(null, "The trademark you're \nsearching is ALREADY in the data base");
						}
						
					}
				});
				btnBuscarMarca.setFont(new Font("Tahoma", Font.PLAIN, 10));
				btnBuscarMarca.setBounds(10, 48, 100, 26);
				panel.add(btnBuscarMarca);
			}
			{
				JButton btnEliminarMarca = new JButton("Remove");
				btnEliminarMarca.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						control.deleteTradeMark(txtCodigoMar.getText());
					}
				});
				btnEliminarMarca.setFont(new Font("Tahoma", Font.PLAIN, 10));
				btnEliminarMarca.setBounds(183, 90, 119, 26);
				panel.add(btnEliminarMarca);
			}
			{
				txtCodigoMar = new JTextField();
				txtCodigoMar.setBounds(245, 16, 57, 20);
				panel.add(txtCodigoMar);
				txtCodigoMar.setColumns(10);
			}
			{
				JLabel lblNewLabel_7 = new JLabel("Escriba nombre del tipo de vehiculo");
				lblNewLabel_7.setBounds(10, 11, 249, 26);
				panel.add(lblNewLabel_7);
				lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
			}
			{
				JButton btnAadirMarca = new JButton("Add");
				btnAadirMarca.setBounds(20, 90, 100, 26);
				panel.add(btnAadirMarca);
				btnAadirMarca.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						control.insertTradeMark(txtNombre.getText());
					}
				});
				btnAadirMarca.setFont(new Font("Tahoma", Font.PLAIN, 10));
			}
			{
				JButton btnClean2 = new JButton("Clean");
				btnClean2.setBounds(191, 48, 100, 26);
				panel.add(btnClean2);
				btnClean2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{
						txtCodigoMar.setText("");
					}
				});
				btnClean2.setFont(new Font("Tahoma", Font.PLAIN, 10));
			}
		}
	}
}
