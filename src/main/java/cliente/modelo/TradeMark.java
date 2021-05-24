package cliente.modelo;

import java.io.Serializable;

public class TradeMark implements Dto,Serializable
{
	private static final long serialVersionUID = 1L;

	private int codigo;
	private String nombre;
	private Crud tipoC;

	public TradeMark() 
	{

	}

	public TradeMark(int codigo, String nombre) 
	{
		this.codigo = codigo;
		this.nombre = nombre;
	}
	

	public TradeMark(int codigo) 
	{
		this.codigo = codigo;
	}


	public TradeMark(String nombre) {
		this.nombre = nombre;
	}

	
	@Override
	public String insert() 
	{
		String sql = "INSERT INTO marcas(codigo, nombre) VALUES ("
				+ getCodigo()+", '"
				+ getNombre().trim()
				+ "');";
		System.out.println(sql);
		return sql;
	}
	
	

	@Override
	public String read() 
	{
		return "SELECT * FROM marcas"+";";
	}

	@Override
	public String update() 
	{
		String sql = "UPDATE marcas SET nombre= '"+ getNombre().trim()+"' WHERE codigo =  " + getCodigo()+";";
		return sql;
	}

	@Override
	public String delete() 
	{
		return "DELETE FROM marcas WHERE nombre = '" + getNombre().trim()+"';";
	}

	@Override
	public String findByPlaca() 
	{
		return "SELECT * FROM marcas WHERE nombre ='" + getNombre().trim()+"';";
	}


	

	public int getCodigo() 
	{
		return codigo;
	}

	public void setCodigo(int codigo) 
	{
		this.codigo = codigo;
	}

	public String getNombre() 
	{
		return nombre;
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	@Override
	public String toString() 
	{
		return "Marcas [codigo=" + codigo + ", nombre=" + nombre + "]";
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
