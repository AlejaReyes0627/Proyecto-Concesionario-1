package cliente.modelo.dao;



import java.sql.ResultSet;
import java.sql.SQLException;

import cliente.modelo.Dto;
import cliente.modelo.TypeVehicle;
import container.List;
import servidor.data.DataSource;


public class DaoTypeVehicle extends AbstractDao<TypeVehicle>
{
	  public DaoTypeVehicle() {
	        super(DataSource.getInstance());
	    }

	    @Override
	    public List<TypeVehicle> read() {
	        DataSource         dataSource = DataSource.getInstance();
	        TypeVehicle            data       = new TypeVehicle();
	        ResultSet          resultSet  = dataSource.runQuery(data.read());
	        List<TypeVehicle> personList = new List<>();
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
	    public TypeVehicle findByPlaca(Dto data) {
	        DataSource dataSource = DataSource.getInstance();
	        ResultSet  resultSet  = dataSource.runQuery(data.findByPlaca());
	        TypeVehicle   person     = null;
	        try {
	            while (resultSet.next()) {
	                person = getData(resultSet);
	            }
	        } catch (SQLException throwables) {
	            throwables.printStackTrace();
	        }
	        return person;
	    }

	    private TypeVehicle vehiculo;
	    private TypeVehicle getData(ResultSet resultSet) throws SQLException {
	    	vehiculo = new TypeVehicle(resultSet.getLong("codigo"),   
	                resultSet.getString("descripcion"));    
	        return        vehiculo;
	    }
		public TypeVehicle getVehiculo() 
		{
			return vehiculo;
		}


}
