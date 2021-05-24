package cliente.modelo;

import java.io.Serializable;

public class Vehicle implements Dto, Serializable
{
	private static final long serialVersionUID = 1L;
	private String placa;
	private String marca;
	private int modelo;
	private String color;
	private String tipoDeVehiculo;
	private double precioMinimo;
	private int propietario;
	private Crud tipoC;
		
	
	public Vehicle() 
	{
		
	}


	public Vehicle(String placa, String marca, int modelo, String color, String tipoDeVehiculo,
			double precioMinimo, int propietario) 
	{
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.tipoDeVehiculo = tipoDeVehiculo;
		this.precioMinimo = precioMinimo;
		this.propietario = propietario;
	}



	public Vehicle(String placa) 
	{
		this.placa = placa;
	}


	@Override
	public String insert() 
	{
		  String sql = "INSERT INTO vehiculo(placa, marca, modelo, color, tipoDeVehiculo, precioMinimo, propietario) VALUES ('"
	                + getPlaca()+"', '"
	                + getMarca().trim()+ "','"
	                + getModelo() + "','" 
	                + getColor().trim() + "','" 
	                + getTipoDeVehiculo().trim() +  "','" 
	                + getPrecioMinimo() + "','" 
	                + getPropietario()
	                + "');";
	        System.out.println(sql);
	        return sql;
	}


	@Override
	public String read() 
	{
		 return "SELECT * FROM vehiculo";
	}


	@Override
	public String update() 
	{
		String sql = "UPDATE vehiculo SET marca= '"+ getMarca().trim() + "', modelo=  " 
		        + getModelo() + ", color= '"+getColor().trim() + "', tipoDeVehiculo= '" + getTipoDeVehiculo().trim() 
		        + "', precioMinimo=  " + getPrecioMinimo() +  " , propietario=  " + getPropietario()
		        +  "  WHERE placa = '" + getPlaca().trim()+" ';";
		        return sql;
	}


	@Override
	public String delete() 
	{
		return "DELETE FROM vehiculo WHERE placa ='" + getPlaca().trim()+ "';";
	}


	@Override
	public String findByPlaca() 
	{
		 return "SELECT * FROM vehiculo WHERE placa = '" + getPlaca() + "';" ;
	}
	
	
	
	public String getPlaca() 
	{
		return placa;
	}


	public void setPlaca(String placa) 
	{
		this.placa = placa;
	}


	public String getMarca() 
	{
		return marca;
	}


	public void setMarca(String marca) 
	{
		this.marca = marca;
	}


	public int getModelo() 
	{
		return modelo;
	}


	public void setModelo(int modelo) 
	{
		this.modelo = modelo;
	}


	public String getColor() 
	{
		return color;
	}


	public void setColor(String color) 
	{
		this.color = color;
	}


	public String  getTipoDeVehiculo() 
	{
		return tipoDeVehiculo;
	}


	public void setTipoDeVehiculo(String tipoDeVehiculo) 
	{
		this.tipoDeVehiculo = tipoDeVehiculo;
	}


	public double getPrecioMinimo() 
	{
		return precioMinimo;
	}


	public void setPrecioMinimo(double precioMinimo)
	{
		this.precioMinimo = precioMinimo;
	}


	public int getPropietario() 
	{
		return propietario;
	}


	public void setPropietario(int propietario) 
	{
		this.propietario = propietario;
	}




	@Override
	public String toString() 
	{
		return "vehiculo [placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", color="
				+ color + ", tipoDeVehiculo=" + tipoDeVehiculo + ", precioMinimo=" + precioMinimo + ", propietario="
				+ propietario +  "]";
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
