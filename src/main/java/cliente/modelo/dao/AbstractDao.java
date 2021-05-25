
package cliente.modelo.dao;
import cliente.modelo.Dto;
import container.List;
import servidor.data.DataSource;

public abstract class AbstractDao<T extends Dto>
{
	  protected final DataSource dataSource;

	    protected AbstractDao(DataSource dataSource) 
	    {
	        this.dataSource = dataSource;
	    }

	    public boolean insert(Dto data) 
	    {
	        return dataSource.runUpdateQuery(data.insert());
	    }

	    public abstract List<T> read();

	    public boolean update(Dto data) 
	    {
	        return dataSource.runUpdateQuery(data.update());
	    }

	    public boolean delete(Dto data) {
	        return dataSource.runUpdateQuery(data.delete());
	    }

	    public abstract T findByPlaca(Dto data);
}
