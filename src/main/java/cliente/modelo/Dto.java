package cliente.modelo;

public interface Dto 
{
	String insert();
	String read();
	String update();
	String delete();
	String findByPlaca();
	Crud getCrud();
}
