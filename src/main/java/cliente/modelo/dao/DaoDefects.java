package cliente.modelo.dao;


import java.sql.ResultSet;
import java.sql.SQLException;

import cliente.modelo.Defects;
import cliente.modelo.Dto;
import container.List;
import servidor.data.DataSource;


public class DaoDefects extends AbstractDao<Defects>
{

    public DaoDefects() {
        super(DataSource.getInstance());
    }

    @Override
    public List<Defects> read() {
        DataSource         dataSource = DataSource.getInstance();
        Defects             data       = new Defects();
        ResultSet          resultSet  = dataSource.runQuery(data.read());
        List<Defects> personList = new List<>();
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
    public Defects findByPlaca(Dto data) {
        DataSource dataSource = DataSource.getInstance();
        ResultSet  resultSet  = dataSource.runQuery(data.findByPlaca());
        Defects   person     = null;
        try {
            while (resultSet.next()) {
                person = getData(resultSet);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return person;
    }
private Defects vehiculo;

    public Defects getData(ResultSet resultSet) throws SQLException {
    	vehiculo= new Defects(resultSet.getString("placa"),   
                resultSet.getLong("orden"),            
                resultSet.getString("descripcion"));       
        return     vehiculo; 
    }
	public Defects getVehiculo() 
	{
		return vehiculo;
	}



}
