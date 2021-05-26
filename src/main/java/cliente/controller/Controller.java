package cliente.controller;

import cliente.modelo.*;
import cliente.modelo.dao.*;

public class Controller 
{
	public boolean insertVehicle(String placa, String marca, int modelo, String color, String tipoDeVehiculo,
			double precioMinimo, int propietario) 
	{
		DaoVehicle daoVehicle = new DaoVehicle();
		Vehicle nuevo = new Vehicle(placa,marca,modelo,color,tipoDeVehiculo,precioMinimo,propietario);
		daoVehicle.insert(nuevo);
		return true;
	}

	public boolean findByPlacaVehicle(String placa)
	{		
		DaoVehicle daoVehicle = new DaoVehicle();
		Vehicle nuevo = new Vehicle(placa);
		daoVehicle.findByPlaca(nuevo);

		if(daoVehicle.findByPlaca(nuevo)==null)
		{
			daoVehicle.read();
			return false;
		}
		return true;
	}

	public boolean deleteVehicle(String placa)
	{
		DaoVehicle daoVehicle = new DaoVehicle();
		Vehicle nuevo = new Vehicle(placa);
		daoVehicle.delete(nuevo);
		return true;
	}

	public boolean updateVehicle(String placa, String marca, int modelo, String color, String tipoDeVehiculo,
			double precioMinimo, int propietario)
	{
		DaoVehicle daoVehicle = new DaoVehicle();
		Vehicle nuevo = new Vehicle(placa,marca,modelo,color,tipoDeVehiculo,precioMinimo,propietario);
		daoVehicle.update(nuevo);
		return true;
	}

	////////////////////////////////////////////////////////////////////////////	////////////////////////////////////////////////////////////////////////////	////////////////////////////////////////////////////////////////////////////

	public boolean insertOwner(int cedula, String nombre, String apellido, Long telefono, String email)
	{
		DaoOwners daoVehicle = new DaoOwners();
		Owners nuevo = new Owners(cedula,nombre,apellido,telefono,email);
		daoVehicle.insert(nuevo);
		if(daoVehicle.insert(nuevo))
		{
			return true;

		}
		daoVehicle.read();
		return false;
	}
	public boolean findByPlacaOwner(int cedula)
	{		
		DaoOwners daoVehicle = new DaoOwners();
		Owners nuevo = new Owners(cedula);
		daoVehicle.findByPlaca(nuevo);

		if(daoVehicle.findByPlaca(nuevo)==null)
		{
			daoVehicle.read();
			return false;
		}
		return true;
	}

	public boolean deleteOwner(int cedula)
	{
		DaoOwners daoVehicle = new DaoOwners();
		Owners nuevo = new Owners(cedula);
		daoVehicle.delete(nuevo);
		return true;
	}

	public boolean updateOwner(int cedula, String nombre, String apellido, Long telefono, String email)
	{
		DaoOwners daoVehicle = new DaoOwners();
		Owners nuevo = new Owners(cedula,nombre,apellido,telefono,email);
		daoVehicle.update(nuevo);
		return true;

	}

	////////////////////////////////////////////////////////////////////////// 	////////////////////////////////////////////////////////////////////////////  ////////////////////////////////////////////////////////////////////////////

	public boolean insertTradeMark(String nombre)
	{
		DaoTradeMark daoVehicle = new DaoTradeMark();
		TradeMark nuevo = new TradeMark(nombre);
		daoVehicle.insert(nuevo);
		return true;
	}
	public boolean findByPlacaTradeMark(String nombre)
	{		
		DaoTradeMark daoVehicle = new DaoTradeMark();
		TradeMark nuevo = new TradeMark(nombre);
		daoVehicle.findByPlaca(nuevo);

		if(daoVehicle.findByPlaca(nuevo)==null)
		{
			return false;
		}
		return true;
	}

	public boolean deleteTradeMark(String nombre)
	{
		DaoTradeMark daoVehicle = new DaoTradeMark();
		TradeMark nuevo = new TradeMark(nombre);
		daoVehicle.delete(nuevo);
		return true;
	}


	//////////////////////////////////////////////////////////////////////////	////////////////////////////////////////////////////////////////////////////	////////////////////////////////////////////////////////////////////////////

	public boolean insertTypeVehicle(String descripcion)
	{
		DaoTypeVehicle daoVehicle = new DaoTypeVehicle();
		TypeVehicle nuevo = new TypeVehicle(descripcion);
		daoVehicle.insert(nuevo);
		return true;
	}

	public boolean findByPlacaTypeVehicle(String descripcion)
	{		
		DaoTypeVehicle daoVehicle = new DaoTypeVehicle();
		TypeVehicle nuevo = new TypeVehicle(descripcion);
		daoVehicle.findByPlaca(nuevo);

		if(daoVehicle.findByPlaca(nuevo)==null)
		{
			daoVehicle.read();
			return false;
		}
		return true;
	}

	public boolean deleteTypeVehicle(String codigo)
	{
		DaoTypeVehicle daoVehicle = new DaoTypeVehicle();
		TypeVehicle nuevo = new TypeVehicle(codigo);
		daoVehicle.delete(nuevo);
		return true;
	}

	//////////////////////////////////////////////////////////////////////////	////////////////////////////////////////////////////////////////////////////	////////////////////////////////////////////////////////////////////////////

	public boolean insertDefect(String placa, String descripcion)
	{
		DaoDefects daoVehicle = new DaoDefects();
		Defects nuevo = new Defects(placa,descripcion);
		daoVehicle.insert(nuevo);
		return true;
	}

	public boolean findByPlacaDefect(String placa)
	{		
		DaoDefects daoVehicle = new DaoDefects();
		Defects nuevo = new Defects(placa);
		daoVehicle.findByPlaca(nuevo);
		if(daoVehicle.findByPlaca(nuevo)==null)
		{
			daoVehicle.read();
			return false;
		}
		return true;
	}

	public boolean deleteDefects(String placa)
	{
		DaoDefects daoVehicle = new DaoDefects();
		Defects nuevo = new Defects(placa);
		daoVehicle.delete(nuevo);
		return true;
	}

	public boolean updateDefects(String placa,Long orden, String descripcion)
	{
		DaoDefects daoVehicle = new DaoDefects();
		Defects nuevo = new Defects(placa,orden,descripcion);
		daoVehicle.update(nuevo);
		return true;
	}


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	////////////////////////////////////////////////////////////////////////////

	public boolean insertLogin(String userName, String contrasena)
	{
		DaoLogin daoVehicle = new DaoLogin();
		Login nuevo = new Login(userName,contrasena);
		daoVehicle.insert(nuevo);
		return true;
	}

	public boolean findByPassword(String user, String password)
	{
		DaoLogin daoVehicle = new DaoLogin();
		Login nuevo = new Login(user, password);
		daoVehicle.findByPlaca(nuevo);
		if(daoVehicle.findByPlaca(nuevo)==null)
		{
			daoVehicle.read();
			return false;
		}
		return true;

	}




}
