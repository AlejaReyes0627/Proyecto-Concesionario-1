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

public class TypeOfVehiclePanel extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtDescripcion;
	private JTextField txtCodigo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			TypeOfVehiclePanel dialog = new TypeOfVehiclePanel();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public TypeOfVehiclePanel() {
		setResizable(false);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setTitle("Tipo de vehiculo");
		setBounds(100, 100, 352, 292);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		Controller control = new Controller();
		contentPanel.setLayout(null);
		this.setLocationRelativeTo(null);
		{
			JPanel panel = new JPanel();
			panel.setLayout(null);
			panel.setBorder(new LineBorder(SystemColor.activeCaption, 2));
			panel.setBackground(Color.WHITE);
			panel.setBounds(27, 11, 302, 81);
			contentPanel.add(panel);
			{
				JButton btnAadirTipoVeh = new JButton("Add");
				btnAadirTipoVeh.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						control.insertTypeVehicle(txtDescripcion.getText());
					}
				});
				btnAadirTipoVeh.setFont(new Font("Tahoma", Font.PLAIN, 10));
				btnAadirTipoVeh.setBounds(162, 42, 130, 26);
				panel.add(btnAadirTipoVeh);
			}
			{
				JLabel lblDescripcion = new JLabel("Descripcion");
				lblDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 15));
				lblDescripcion.setBounds(24, 10, 92, 18);
				panel.add(lblDescripcion);
			}
			{
				txtDescripcion = new JTextField();
				txtDescripcion.setColumns(10);
				txtDescripcion.setBounds(162, 11, 130, 20);
				panel.add(txtDescripcion);
			}
			{
				JButton btnClean1 = new JButton("Clean");
				btnClean1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						txtDescripcion.setText("");
					}
				});
				btnClean1.setFont(new Font("Tahoma", Font.PLAIN, 10));
				btnClean1.setBounds(12, 42, 130, 26);
				panel.add(btnClean1);
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setLayout(null);
			panel.setForeground(Color.WHITE);
			panel.setBorder(new LineBorder(SystemColor.activeCaption, 2));
			panel.setBackground(Color.WHITE);
			panel.setBounds(27, 113, 302, 128);
			contentPanel.add(panel);
			{
				JButton btnBuscarTipoVehiculo = new JButton("Search");
				btnBuscarTipoVehiculo.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{
						control.findByPlacaTypeVehicle(txtCodigo.getText());
						if(control.findByPlacaTypeVehicle(txtCodigo.getText())==false)
						{
							JOptionPane.showMessageDialog(null, "The type of vehicle you're searching is NOT in the data base");
							return;
						}
						else
						{
							JOptionPane.showMessageDialog(null, "The type of vehicle you're searching is ALREADY in the data base");	
						}
					}
				});
				btnBuscarTipoVehiculo.setFont(new Font("Tahoma", Font.PLAIN, 10));
				btnBuscarTipoVehiculo.setBounds(12, 47, 112, 26);
				panel.add(btnBuscarTipoVehiculo);
			}
			{
				JButton btnEliminarTipoVehiculo = new JButton("Remove");
				btnEliminarTipoVehiculo.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						control.deleteTypeVehicle(txtCodigo.getText());
					}
				});
				btnEliminarTipoVehiculo.setFont(new Font("Tahoma", Font.PLAIN, 10));
				btnEliminarTipoVehiculo.setBounds(159, 47, 133, 26);
				panel.add(btnEliminarTipoVehiculo);
			}
			{
				JLabel lblNewLabel_7 = new JLabel("Escribe nombre del vehiculo");
				lblNewLabel_7.setBounds(12, 11, 194, 26);
				panel.add(lblNewLabel_7);
				lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
			}
			{
				txtCodigo = new JTextField();
				txtCodigo.setBounds(211, 17, 81, 20);
				panel.add(txtCodigo);
				txtCodigo.setColumns(10);
			}
			{
				JButton btnClean2 = new JButton("Clean");
				btnClean2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						txtCodigo.setText("");
					}
				});
				btnClean2.setFont(new Font("Tahoma", Font.PLAIN, 10));
				btnClean2.setBounds(76, 87, 130, 26);
				panel.add(btnClean2);
			}
		}
	}
}
