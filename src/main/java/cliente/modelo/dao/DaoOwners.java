package cliente.modelo.dao;


import java.sql.ResultSet;
import java.sql.SQLException;

import cliente.modelo.Dto;
import cliente.modelo.Owners;
import container.List;
import servidor.data.DataSource;

public class DaoOwners extends AbstractDao<Owners>
{

	  public DaoOwners() {
	        super(DataSource.getInstance());
	    }

	    @Override
	    public List<Owners> read() {
	        DataSource         dataSource = DataSource.getInstance();
	        Owners            data       = new Owners();
	        ResultSet          resultSet  = dataSource.runQuery(data.read());
	        List<Owners> personList = new List<>();
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
	    public Owners findByPlaca(Dto data) {
	        DataSource dataSource = DataSource.getInstance();
	        ResultSet  resultSet  = dataSource.runQuery(data.findByPlaca());
	        Owners   person     = null;
	        try {
	            while (resultSet.next()) {
	                person = getData(resultSet);
	            }
	        } catch (SQLException throwables) {
	            throwables.printStackTrace();
	        }
	        return person;
	    }
	    private Owners vehiculo;
	    private Owners getData(ResultSet resultSet) throws SQLException {
	    	vehiculo = new Owners(resultSet.getInt("cedula"),   
	                resultSet.getString("nombre"),              
	                resultSet.getString("apellido"),           
	                resultSet.getLong("telefono"),    
	                resultSet.getString("email"));        
	        return   vehiculo;
	    }
		public Owners getVehiculo() 
		{
			return vehiculo;
		}


	
}
