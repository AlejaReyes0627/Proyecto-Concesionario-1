package cliente.modelo.dao;


import java.sql.ResultSet;
import java.sql.SQLException;

import cliente.modelo.Dto;
import cliente.modelo.TradeMark;
import container.List;
import servidor.data.DataSource;

public class DaoTradeMark extends AbstractDao<TradeMark> 
{

	public DaoTradeMark() {
		super(DataSource.getInstance());
	}

	@Override
	public List<TradeMark> read() {
		DataSource         dataSource = DataSource.getInstance();
		TradeMark            data       = new TradeMark();
		ResultSet          resultSet  = dataSource.runQuery(data.read());
		List<TradeMark> personList = new List<>();
		try {
			while (resultSet.next()) {
				personList.add(getData(resultSet));
			}
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
		return personList;
	}

	@Override
	public TradeMark findByPlaca(Dto data) {
		DataSource dataSource = DataSource.getInstance();
		ResultSet  resultSet  = dataSource.runQuery(data.findByPlaca());
		TradeMark   person     = null;
		try {
			while (resultSet.next()) {
				person = getData(resultSet);
			}
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
		return person;
	}
	private TradeMark vehiculo;

	private TradeMark getData(ResultSet resultSet) throws SQLException 
	{
		vehiculo = new TradeMark(resultSet.getInt("codigo"), resultSet.getString("nombre"));      
		return vehiculo;
	}

	public TradeMark getVehiculo() 
	{
		return vehiculo;
	}


}
