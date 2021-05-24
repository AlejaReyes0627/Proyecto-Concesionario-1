package cliente.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import cliente.controller.Controller;
import cliente.modelo.Owners;
import cliente.modelo.Vehicle;
import cliente.modelo.dao.DaoOwners;
import cliente.modelo.dao.DaoVehicle;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;

public class ClientePrincipal extends JFrame 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtFindByPlaca;
	private JTextField txtMarcaBus;
	private JTextField txtModeloBus;
	private JTextField txtColorBus;
	private JTextField txtTipoVehiculoBus;
	private JTextField txtPecioBus;
	private JTextField txtPropietarioBus;
	private JTextField txtCedulaBus;
	private JTextField txtNombreBus;
	private JTextField txtApellidoBus;
	private JTextField txtTelefonoBus;
	private JTextField txtEmailBus;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientePrincipal frame = new ClientePrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ClientePrincipal() {
		setResizable(false);
		setTitle("Servidor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 663, 740);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		Controller control = new Controller();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(null);

		JButton btnMensajeria = new JButton("Messenger service");
		btnMensajeria.setBounds(393, 661, 125, 25);
		btnMensajeria.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnMensajeria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
		}});
		contentPane.add(btnMensajeria);

		JLabel lblNewLabel = new JLabel("Concesionario de Autos");
		lblNewLabel.setBounds(151, 11, 354, 37);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		contentPane.add(lblNewLabel);

		JButton btnNotificarD = new JButton("Defects");
		btnNotificarD.setBounds(141, 660, 125, 26);
		btnNotificarD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				DefectsPanel notificar = new DefectsPanel();
				notificar.setVisible(true);
			}
		});
		btnNotificarD.setFont(new Font("Tahoma", Font.PLAIN, 10));
		contentPane.add(btnNotificarD);

		JLabel lblNewLabel_3_1 = new JLabel("Marca");
		lblNewLabel_3_1.setBounds(59, 426, 104, 14);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_1);

		txtMarcaBus = new JTextField();
		txtMarcaBus.setBounds(173, 423, 422, 20);
		txtMarcaBus.setColumns(10);
		contentPane.add(txtMarcaBus);

		JLabel lblNewLabel_4_1 = new JLabel("Modelo");
		lblNewLabel_4_1.setBounds(59, 451, 69, 14);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_4_1);

		txtModeloBus = new JTextField();
		txtModeloBus.setBounds(173, 448, 422, 20);
		txtModeloBus.setColumns(10);
		contentPane.add(txtModeloBus);

		JLabel lblNewLabel_5_1 = new JLabel("Color");
		lblNewLabel_5_1.setBounds(59, 476, 54, 14);
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_5_1);

		txtColorBus = new JTextField();
		txtColorBus.setBounds(173, 473, 422, 20);
		txtColorBus.setColumns(10);
		contentPane.add(txtColorBus);

		JLabel lblNewLabel_6_1 = new JLabel("Tipo de vehiculo");
		lblNewLabel_6_1.setBounds(59, 494, 110, 25);
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_6_1);

		txtTipoVehiculoBus = new JTextField();
		txtTipoVehiculoBus.setBounds(173, 497, 422, 20);
		txtTipoVehiculoBus.setColumns(10);
		contentPane.add(txtTipoVehiculoBus);

		JLabel lblNewLabel_7_1 = new JLabel("Precio");
		lblNewLabel_7_1.setBounds(59, 522, 69, 14);
		lblNewLabel_7_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_7_1);

		txtPecioBus = new JTextField();
		txtPecioBus.setBounds(173, 519, 422, 20);
		txtPecioBus.setColumns(10);
		contentPane.add(txtPecioBus);

		JLabel lblNewLabel_8_1 = new JLabel("Propietario");
		lblNewLabel_8_1.setBounds(59, 547, 87, 17);
		lblNewLabel_8_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_8_1);

		txtPropietarioBus = new JTextField();
		txtPropietarioBus.setBounds(173, 544, 422, 20);
		txtPropietarioBus.setColumns(10);
		contentPane.add(txtPropietarioBus);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(29, 339, 591, 288);
		panel_1.setBorder(new LineBorder(SystemColor.activeCaption, 2));
		panel_1.setBackground(Color.WHITE);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JButton btnActualizar = new JButton("Update vehicle");
		btnActualizar.setBounds(163, 242, 131, 27);
		panel_1.add(btnActualizar);
		btnActualizar.setFont(new Font("Tahoma", Font.PLAIN, 10));

		JButton btnEliminar = new JButton("Remove vehicle");
		btnEliminar.setBounds(316, 241, 138, 29);
		panel_1.add(btnEliminar);
		btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 10));

		JLabel lblNewLabel_8 = new JLabel("Ingrese placa del vehiculo");
		lblNewLabel_8.setBounds(12, 12, 198, 24);
		panel_1.add(lblNewLabel_8);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 14));

		txtFindByPlaca = new JTextField();
		txtFindByPlaca.setBounds(204, 15, 226, 20);
		panel_1.add(txtFindByPlaca);
		txtFindByPlaca.setColumns(10);
		
				JButton btnBuscar = new JButton("Search vehicle");
				btnBuscar.setBounds(456, 13, 110, 27);
				panel_1.add(btnBuscar);
				btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 10));
				
				JButton btnLimpiar1 = new JButton("Clean");
				btnLimpiar1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{
						txtFindByPlaca.setText("");
						txtMarcaBus.setText("");
						txtModeloBus.setText("");
						txtColorBus.setText("");
						txtTipoVehiculoBus.setText("");
						txtPecioBus.setText("");
						txtPropietarioBus.setText("");
					}
				});
				btnLimpiar1.setFont(new Font("Tahoma", Font.PLAIN, 10));
				btnLimpiar1.setBounds(481, 242, 85, 27);
				panel_1.add(btnLimpiar1);
				
						JButton btnAgregarVehiculo = new JButton("Add vehicle");
						btnAgregarVehiculo.setBounds(22, 242, 118, 27);
						panel_1.add(btnAgregarVehiculo);
						btnAgregarVehiculo.addActionListener(new ActionListener() 
						{
							public void actionPerformed(ActionEvent e) 
							{
								control.insertTradeMark(txtMarcaBus.getText());
								control.insertTypeVehicle(txtTipoVehiculoBus.getText());
								control.insertVehicle(txtFindByPlaca.getText(),txtMarcaBus.getText(),Integer.parseInt(txtModeloBus.getText()),txtColorBus.getText(),txtTipoVehiculoBus.getText(),
										Double.parseDouble(txtPecioBus.getText()),Integer.parseInt(txtPropietarioBus.getText()));	
							}
						});
						btnAgregarVehiculo.setFont(new Font("Tahoma", Font.PLAIN, 10));
						
						JRadioButton rdbtnModificables = new JRadioButton("Modificables");
						rdbtnModificables.setBackground(Color.WHITE);
						rdbtnModificables.addActionListener(new ActionListener() 
						{
							public void actionPerformed(ActionEvent e) 
							{
								if(rdbtnModificables.isSelected()) 
								{
									txtMarcaBus.setEditable(false);
									txtTipoVehiculoBus.setEditable(false);
								}
								else
								{
									txtMarcaBus.setEditable(true);
									txtTipoVehiculoBus.setEditable(true);
								}
							}
							
						});
						rdbtnModificables.setBounds(22, 43, 111, 23);
						panel_1.add(rdbtnModificables);
						
						
						
						
				btnBuscar.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent e) 
					{
						DaoVehicle daoVehicle = new DaoVehicle();
						Vehicle nuevo = new Vehicle(txtFindByPlaca.getText());
						daoVehicle.findByPlaca(nuevo);

						if(daoVehicle.findByPlaca(nuevo)==null)
						{
							JOptionPane.showMessageDialog(null, "The vehicle you're searching \n is NOT in the data base");
							return;
						}
						else
						{
							daoVehicle.read();
							Vehicle n = daoVehicle.getVehiculo();
							txtMarcaBus.setText(n.getMarca()); 
							txtModeloBus.setText(Integer.toString(n.getModelo()));
							txtColorBus.setText(n.getColor());
							txtTipoVehiculoBus.setText(n.getTipoDeVehiculo());
							txtPecioBus.setText(Double.toString(n.getPrecioMinimo()));
							txtPropietarioBus.setText(Integer.toString(n.getPropietario()));
						}
						JOptionPane.showMessageDialog(null, "The vehicle you're searching \n is ALREADY in the data base");
					}
				});

		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(153, 180, 209));
		separator.setBounds(-19, 647, 789, 2);
		contentPane.add(separator);

		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new LineBorder(SystemColor.activeCaption, 2));
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setBounds(29, 76, 591, 231);
		contentPane.add(panel_2_1);
		panel_2_1.setLayout(null);

		JLabel lblNewLabel_12_1 = new JLabel("Telefono");
		lblNewLabel_12_1.setBounds(22, 120, 62, 13);
		lblNewLabel_12_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_2_1.add(lblNewLabel_12_1);

		JLabel lblNewLabel_13_1 = new JLabel("Email");
		lblNewLabel_13_1.setBounds(22, 144, 62, 13);
		lblNewLabel_13_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_2_1.add(lblNewLabel_13_1);

		JButton btnBuscarPropietario = new JButton("Search owner");
		btnBuscarPropietario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				DaoOwners daoVehicle = new DaoOwners();
				Owners nuevo = new Owners(Integer.parseInt(txtCedulaBus.getText()));
				daoVehicle.findByPlaca(nuevo);

				if(daoVehicle.findByPlaca(nuevo)==null)
				{
					JOptionPane.showMessageDialog(null, "The owner you're searching \n is NOT in the data base");
					return;
				}
				else
				{
					daoVehicle.read();
					Owners n = daoVehicle.getVehiculo();
					txtNombreBus.setText(n.getNombre()); 
					txtApellidoBus.setText(n.getApellido());
					txtTelefonoBus.setText(Long.toString(n.getTelefono()));
					txtEmailBus.setText(n.getEmail());
				}
			}
		});
		btnBuscarPropietario.setBounds(450, 11, 115, 27);
		panel_2_1.add(btnBuscarPropietario);
		btnBuscarPropietario.setFont(new Font("Tahoma", Font.PLAIN, 10));

		txtEmailBus = new JTextField();
		txtEmailBus.setBounds(182, 144, 380, 19);
		panel_2_1.add(txtEmailBus);
		txtEmailBus.setText("");
		txtEmailBus.setColumns(10);

		txtTelefonoBus = new JTextField();
		txtTelefonoBus.setBounds(182, 118, 380, 19);
		panel_2_1.add(txtTelefonoBus);
		txtTelefonoBus.setText("");
		txtTelefonoBus.setColumns(10);

		txtApellidoBus = new JTextField();
		txtApellidoBus.setBounds(182, 91, 380, 19);
		panel_2_1.add(txtApellidoBus);
		txtApellidoBus.setText("");
		txtApellidoBus.setColumns(10);

		txtNombreBus = new JTextField();
		txtNombreBus.setBounds(182, 61, 380, 19);
		panel_2_1.add(txtNombreBus);
		txtNombreBus.setColumns(10);

		JLabel lblNewLabel_9_1 = new JLabel("Ingrese cedula del propietario");
		lblNewLabel_9_1.setBounds(12, 9, 226, 27);
		panel_2_1.add(lblNewLabel_9_1);
		lblNewLabel_9_1.setFont(new Font("Tahoma", Font.BOLD, 14));

		txtCedulaBus = new JTextField();
		txtCedulaBus.setBounds(232, 13, 208, 19);
		panel_2_1.add(txtCedulaBus);
		txtCedulaBus.setColumns(10);

		JLabel lblNewLabel_11_1 = new JLabel("Apellido");
		lblNewLabel_11_1.setBounds(22, 90, 62, 19);
		panel_2_1.add(lblNewLabel_11_1);
		lblNewLabel_11_1.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JLabel lblNewLabel_10_1 = new JLabel("Nombre");
		lblNewLabel_10_1.setBounds(22, 63, 62, 13);
		panel_2_1.add(lblNewLabel_10_1);
		lblNewLabel_10_1.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JButton btnActualizarPropietario = new JButton("Update owner");
		btnActualizarPropietario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				control.updateOwner(Integer.parseInt(txtCedulaBus.getText()),txtNombreBus.getText(), txtApellidoBus.getText(), Long.parseLong(txtTelefonoBus.getText()), txtEmailBus.getText());			
			}
		});
		btnActualizarPropietario.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnActualizarPropietario.setBounds(163, 183, 141, 27);
		panel_2_1.add(btnActualizarPropietario);

		JButton btnEliminarPropietario = new JButton("Remove vehicle");
		btnEliminarPropietario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Controller vehiculo = new Controller();
				vehiculo.deleteOwner(Integer.parseInt(txtCedulaBus.getText()));
			}
		});
		btnEliminarPropietario.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnEliminarPropietario.setBounds(329, 182, 124, 29);
		panel_2_1.add(btnEliminarPropietario);
		
		JButton btnLimpiar2 = new JButton("Clean");
		btnLimpiar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				txtCedulaBus.setText("");
				txtNombreBus.setText("");
				txtApellidoBus.setText("");
				txtTelefonoBus.setText("");
				txtEmailBus.setText("");
			}
		});
		btnLimpiar2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnLimpiar2.setBounds(477, 183, 85, 27);
		panel_2_1.add(btnLimpiar2);
		
				JButton btnAgregarPropietario = new JButton("Add owner");
				btnAgregarPropietario.setBounds(22, 183, 131, 27);
				panel_2_1.add(btnAgregarPropietario);
				btnAgregarPropietario.setFont(new Font("Tahoma", Font.PLAIN, 10));
				btnAgregarPropietario.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						control.insertOwner(Integer.parseInt(txtCedulaBus.getText()),txtNombreBus.getText(), txtApellidoBus.getText(), Long.parseLong(txtTelefonoBus.getText()), txtEmailBus.getText());
					}
				});
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
			 
				control.deleteVehicle(txtFindByPlaca.getText());
				control.deleteTradeMark(txtMarcaBus.getText());
				control.deleteTypeVehicle(txtTipoVehiculoBus.getText());
				
			}
		});
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				control.updateVehicle(txtFindByPlaca.getText(),txtMarcaBus.getText(),Integer.parseInt(txtModeloBus.getText()),txtColorBus.getText(),txtTipoVehiculoBus.getText(),
						Double.parseDouble(txtPecioBus.getText()),Integer.parseInt(txtPropietarioBus.getText()));			
			}
		});
	}
}
