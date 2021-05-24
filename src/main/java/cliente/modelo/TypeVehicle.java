package cliente.modelo;

import java.io.Serializable;

public class TypeVehicle implements Dto, Serializable
{
	private static final long serialVersionUID = 1L;

	private Long codigo;
	private String descripcion;
	private Crud tipoC;


	public TypeVehicle() 
	{

	}

	public TypeVehicle(Long codigo, String descripcion) 
	{
		this.codigo = codigo;
		this.descripcion = descripcion;
	}

	public TypeVehicle(String descripcion)
	{
		this.descripcion = descripcion;
	}
	
	

	public TypeVehicle(Long codigo) 
	{
		this.codigo = codigo;
	}

	@Override
	public String insert() 
	{
		String sql = "INSERT INTO tipovehiculo(codigo, descripcion) VALUES ("
				+ getCodigo()+", '"
				+ getDescripcion().trim()
				+ "');";
		System.out.println(sql);
		return sql;
	}

	@Override
	public String read()
	{
		return "SELECT * FROM tipovehiculo";
	}

	@Override
	public String update() 
	{
		String sql = "UPDATE tipovehiculo SET descripcion= '"+ descripcion.trim() + "' WHERE codigo =  " + getCodigo()+";";
		return sql;
	}

	@Override
	public String delete() 
	{
		return "DELETE FROM tipovehiculo WHERE descripcion = '" + getDescripcion().trim()+"';";
	}

	@Override
	public String findByPlaca()
	{
		return "SELECT * FROM tipovehiculo WHERE descripcion = '" + getDescripcion().trim()+"';";
	}

	public Long getCodigo() 
	{
		return codigo;
	}

	public void setCodigo(Long codigo) 
	{
		this.codigo = codigo;
	}

	public String getDescripcion() 
	{
		return descripcion;
	}

	public void setDescripcion(String descripcion) 
	{
		this.descripcion = descripcion;
	}

	@Override
	public String toString() 
	{
		return "tipoDeVehiculo [codigo=" + codigo + ", descripcion=" + descripcion + "]";
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
