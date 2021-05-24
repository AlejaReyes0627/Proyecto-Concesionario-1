package cliente.modelo.dao;
import java.sql.ResultSet;
import java.sql.SQLException;

import cliente.modelo.Dto;
import cliente.modelo.Vehicle;
import container.List;
import servidor.data.DataSource;

public class DaoVehicle extends AbstractDao<Vehicle> 
{
	public DaoVehicle() 
	{
		super(DataSource.getInstance());
	}

	@Override
	public List<Vehicle> read()
	{
		DataSource         dataSource = DataSource.getInstance();
		Vehicle            data       = new Vehicle();
		ResultSet          resultSet  = dataSource.runQuery(data.read());
		List<Vehicle> vehicleList = new List<>();
		try 
		{
			while (resultSet.next()) 
			{
				vehicleList.add(getData(resultSet));
			}
		} 
		catch (SQLException throwables) 
		{
			throwables.printStackTrace();
		}
		return vehicleList;
	}

	@Override
	public Vehicle findByPlaca(Dto data) 
	{
		DataSource dataSource = DataSource.getInstance();
		ResultSet  resultSet  = dataSource.runQuery(data.findByPlaca());
		Vehicle   vehicle     = null;
		try 
		{
			while (resultSet.next()) 	            
			{	            	
				vehicle = getData(resultSet);
			}
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
		return vehicle;
	}

	private Vehicle vehiculo;

	public Vehicle getData(ResultSet resultSet) throws SQLException
	{
		vehiculo = new Vehicle(resultSet.getString("placa"),   
				resultSet.getString("marca"),
				resultSet.getInt("modelo"),
				resultSet.getString("color"),
				resultSet.getString("tipoDeVehiculo"),
				resultSet.getDouble("precioMinimo"),
				resultSet.getInt("propietario"));       
		return     vehiculo;
	}

	public Vehicle getVehiculo() 
	{
		return vehiculo;
	}




}

