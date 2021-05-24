package cliente.modelo;

import java.io.Serializable;

public class Owners implements Dto, Serializable
{
	private static final long serialVersionUID = 1L;

	private int cedula;
	private String nombre;
	private String apellido;
	private Long telefono;
	private String email;
	private Crud tipoC;

	public Owners() 
	{

	}

	public Owners(int cedula, String nombre, String apellido, Long telefono, String email) 
	{
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.email = email;
	}
	
	public Owners(int cedula) 
	{
		this.cedula = cedula;
	}

	@Override
	public String insert() 
	{
		String sql = "INSERT INTO propietarios(cedula, nombre, apellido, telefono, email) VALUES ("
				+ getCedula() +", '"
				+ getNombre().trim()+ "','"
				+ getApellido().trim() + "','" 
				+ getTelefono() + "','" 
				+ getEmail().trim()
				+ "');";
		System.out.println(sql);
		return sql;
	}

	@Override
	public String read() 
	{
		return "SELECT * FROM propietarios";
	}

	@Override
	public String update() 
	{
		String sql = "UPDATE propietarios SET nombre= ' "  + getNombre().trim() + " ', apellido= ' " 
				+ getApellido().trim() +  " ', telefono= ' "+getTelefono() + " ', email= ' " + getEmail().trim() 
				+  " ' WHERE cedula =  " + cedula;
		return sql;
	}

	@Override
	public String delete()
	{
		return "DELETE FROM propietarios WHERE cedula = " + getCedula();
	}

	@Override
	public String findByPlaca() 
	{
		 return "SELECT * FROM propietarios WHERE cedula = " + getCedula();
	}

	public int getCedula() 
	{
		return cedula;
	}

	public void setCedula(int cedula) 
	{
		this.cedula = cedula;
	}

	public String getNombre() 
	{
		return nombre;
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	public String getApellido() 
	{
		return apellido;
	}

	public void setApellido(String apellido) 
	{
		this.apellido = apellido;
	}

	public Long getTelefono() 
	{
		return telefono;
	}

	public void setTelefono(Long telefono) 
	{
		this.telefono = telefono;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}

	

	@Override
	public String toString() 
	{
		return "propietarios [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono="
				+ telefono + ", email=" + email + "]";
	}

	@Override
	public Crud getCrud() {
		// TODO Auto-generated method stub
		return tipoC;
	}
	public Crud getTipoC() {
		return tipoC;
	}

	public void setTipoC(Crud tipoC) {
		this.tipoC = tipoC;
	}

}
