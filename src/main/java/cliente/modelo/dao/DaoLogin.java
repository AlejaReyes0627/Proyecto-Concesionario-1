package cliente.modelo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import cliente.modelo.Dto;
import cliente.modelo.Login;
import container.List;
import servidor.data.DataSource;


public class DaoLogin extends AbstractDao<Login>
{

    public DaoLogin()
    {
        super(DataSource.getInstance());
    }

    @Override
    public List<Login> read()
    {
        DataSource         dataSource = DataSource.getInstance();
        Login             data       = new Login();
        ResultSet          resultSet  = dataSource.runQuery(data.read());
        List<Login> personList = new List<>();
        try {
            while (resultSet.next())
            {
                personList.add(getData(resultSet));
            }
        } catch (SQLException throwables)
        {
            throwables.printStackTrace();
        }
        return personList;
    }

    @Override
    public Login findByPlaca(Dto data)
    {
        DataSource dataSource = DataSource.getInstance();
        ResultSet  resultSet  = dataSource.runQuery(data.findByPlaca());
        Login   person     = null;
        try {
            while (resultSet.next()) {
                person = getData(resultSet);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return person;
    }
    private Login vehiculo;

    public Login getData(ResultSet resultSet) throws SQLException {
        vehiculo= new Login(resultSet.getString("nombre_de_usuario"),
                resultSet.getString("contrasena"));
        return  vehiculo;
    }
    public Login getVehiculo()
    {
        return vehiculo;
    }



}