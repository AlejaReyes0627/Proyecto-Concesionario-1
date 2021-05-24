package cliente.modelo;

import java.io.Serializable;


public class Defects implements Dto,Serializable
{
	private static final long serialVersionUID = 1L;
	
	private String placa;
	private Long orden;
	private String descripcion;
	private Crud tipoC;
	
	
	public Crud getTipoC() {
		return tipoC;
	}

	public void setTipoC(Crud tipoC) {
		this.tipoC = tipoC;
	}

	public Defects() 
	{

	}

	public Defects(String placa, Long orden, String descripcion) 
	{
		this.placa = placa;
		this.orden = orden;
		this.descripcion = descripcion;
	}
	

	public Defects(String placa) {
		this.placa = placa;
	}
	
	public Defects(String placa, String descripcion) {
		super();
		this.placa = placa;
		this.descripcion = descripcion;
	}



	
	@Override
	public String insert() 
	{
		String sql = "INSERT INTO defectos(placa, orden, descripcion) VALUES ('"
                + placa.trim()+"', "
                + orden+ ",'"
                + descripcion.trim()
                + "');";
        System.out.println(sql);
        return sql;
	}
	
	@Override
	public String read() 
	{
		 return "SELECT * FROM defectos";
	}

	@Override
	public String update() 
	{
		String sql = "UPDATE defectos SET orden=  "+ getOrden() + " , descripcion= ' " 
		        + getDescripcion().trim()  +  " ' WHERE placa =  '" + getPlaca().trim() + "';";
		        return sql;
	}

	@Override
	public String delete() 
	{
		return "DELETE FROM defectos WHERE placa = '" + getPlaca().trim()+"';";
	}

	@Override
	public String findByPlaca() 
	{
		return "SELECT * FROM defectos WHERE placa = '" + getPlaca().trim()+"';";
	}
	
	
	public String getPlaca() 
	{
		return placa;
	}

	public void setPlaca(String placa) 
	{
		this.placa = placa;
	}

	public Long getOrden() 
	{
		return orden;
	}

	public void setOrden(Long orden) 
	{
		this.orden = orden;
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
		return "Defectos [placa=" + placa + ", orden=" + orden + ", descripcion=" + descripcion + "]";
	}

	@Override
	public Crud getCrud() {
		
		return tipoC;
	}

	
	
	
	
}
