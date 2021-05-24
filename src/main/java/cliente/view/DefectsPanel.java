package cliente.view;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import cliente.controller.Controller;
import cliente.modelo.Defects;
import cliente.modelo.dao.DaoDefects;

import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DefectsPanel extends JDialog{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtDescripcion;
	private JTextField txtDescripcionBus;
	private JTextField txtOrden;
	private JTextField txtPlaca;
	private JTextField txtCodigo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DefectsPanel dialog = new DefectsPanel();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DefectsPanel() {
		setResizable(false);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setTitle("Notificacion Defectos ");
		setBounds(100, 100, 364, 424);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		Controller control = new Controller ();
		contentPanel.setLayout(null);
		this.setLocationRelativeTo(null);
		{
			JPanel panel = new JPanel();
			panel.setLayout(null);
			panel.setBorder(new LineBorder(SystemColor.activeCaption, 2));
			panel.setBackground(Color.WHITE);
			panel.setBounds(28, 11, 302, 129);
			contentPanel.add(panel);
			{
				JButton btnagregar = new JButton("Add");
				btnagregar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						control.insertDefect(txtPlaca.getText(), txtDescripcion.getText());
					}
				});
				btnagregar.setFont(new Font("Tahoma", Font.PLAIN, 10));
				btnagregar.setBounds(162, 92, 130, 26);
				panel.add(btnagregar);
			}
			{
				JLabel lblDescripcion = new JLabel("Descripcion");
				lblDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 15));
				lblDescripcion.setBounds(24, 51, 92, 18);
				panel.add(lblDescripcion);
			}
			{
				txtDescripcion = new JTextField();
				txtDescripcion.setColumns(10);
				txtDescripcion.setBounds(162, 52, 130, 20);
				panel.add(txtDescripcion);
			}
			{
				JLabel lblPlaca = new JLabel("Placa");
				lblPlaca.setFont(new Font("Tahoma", Font.PLAIN, 15));
				lblPlaca.setBounds(24, 21, 92, 18);
				panel.add(lblPlaca);
			}
			{
				txtPlaca = new JTextField();
				txtPlaca.setColumns(10);
				txtPlaca.setBounds(162, 22, 130, 20);
				panel.add(txtPlaca);
			}
			{
				JButton btnClean1 = new JButton("Clean");
				btnClean1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						txtPlaca.setText("");
						txtDescripcion.setText("");
					}
				});
				btnClean1.setFont(new Font("Tahoma", Font.PLAIN, 10));
				btnClean1.setBounds(10, 91, 130, 26);
				panel.add(btnClean1);
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setLayout(null);
			panel.setForeground(Color.WHITE);
			panel.setBorder(new LineBorder(SystemColor.activeCaption, 2));
			panel.setBackground(Color.WHITE);
			panel.setBounds(28, 150, 302, 221);
			contentPanel.add(panel);
			{
				JButton btnBuscarD = new JButton("Search");
				btnBuscarD.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						DaoDefects daoVehicle = new DaoDefects();
						Defects nuevo = new Defects(txtOrden.getText());
						daoVehicle.findByPlaca(nuevo);
						if(daoVehicle.findByPlaca(nuevo)==null)
						{
							JOptionPane.showMessageDialog(null, "The car plate you're searching for is NOT in the data base");
							return;
						}
						else
						{
							daoVehicle.read();
							Defects n = daoVehicle.getVehiculo();
							txtCodigo.setText(Long.toString(n.getOrden()));
							txtDescripcionBus.setText(n.getDescripcion());
						}
					}
				});
				btnBuscarD.setFont(new Font("Tahoma", Font.PLAIN, 10));
				btnBuscarD.setBounds(159, 47, 133, 26);
				panel.add(btnBuscarD);
			}
			{
				JLabel lblDescripcion_1 = new JLabel("Descripcion");
				lblDescripcion_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
				lblDescripcion_1.setBounds(22, 116, 92, 19);
				panel.add(lblDescripcion_1);
			}
			{
				txtDescripcionBus = new JTextField();
				txtDescripcionBus.setColumns(10);
				txtDescripcionBus.setBounds(155, 117, 137, 20);
				panel.add(txtDescripcionBus);
			}
			{
				JButton btnEliminarD = new JButton("Remove");
				btnEliminarD.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						control.deleteDefects(txtOrden.getText());
					}
				});
				btnEliminarD.setFont(new Font("Tahoma", Font.PLAIN, 10));
				btnEliminarD.setBounds(12, 185, 133, 26);
				panel.add(btnEliminarD);
			}
			{
				JButton btnActualizarD = new JButton("Modify");
				btnActualizarD.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						control.updateDefects(txtOrden.getText(),Long.parseLong(txtCodigo.getText()) ,txtDescripcionBus.getText());
					}
				});
				btnActualizarD.setFont(new Font("Tahoma", Font.PLAIN, 10));
				btnActualizarD.setBounds(155, 185, 137, 26);
				panel.add(btnActualizarD);
			}
			{
				JLabel lblNewLabel_7 = new JLabel("Escribe la placa");
				lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
				lblNewLabel_7.setBounds(12, 11, 133, 26);
				panel.add(lblNewLabel_7);
			}
			{
				txtOrden = new JTextField();
				txtOrden.setColumns(10);
				txtOrden.setBounds(155, 17, 137, 20);
				panel.add(txtOrden);
			}
			{
				txtCodigo = new JTextField();
				txtCodigo.setEditable(false);
				txtCodigo.setColumns(10);
				txtCodigo.setBounds(155, 87, 137, 20);
				panel.add(txtCodigo);
			}
			{
				JLabel lbDescrip = new JLabel("Codigo");
				lbDescrip.setFont(new Font("Tahoma", Font.PLAIN, 15));
				lbDescrip.setBounds(22, 86, 92, 19);
				panel.add(lbDescrip);
			}
			{
				JButton btnClean2 = new JButton("Clean");
				btnClean2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{
						txtOrden.setText("");
						txtCodigo.setText("");
						txtDescripcionBus.setText("");
					}
				});
				btnClean2.setFont(new Font("Tahoma", Font.PLAIN, 10));
				btnClean2.setBounds(162, 146, 130, 26);
				panel.add(btnClean2);
			}
		}
	}
}
