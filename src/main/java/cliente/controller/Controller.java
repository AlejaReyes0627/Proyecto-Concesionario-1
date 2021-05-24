package cliente.controller;

import cliente.modelo.Defects;
import cliente.modelo.Owners;
import cliente.modelo.TradeMark;
import cliente.modelo.TypeVehicle;
import cliente.modelo.Vehicle;
import cliente.modelo.dao.DaoDefects;
import cliente.modelo.dao.DaoOwners;
import cliente.modelo.dao.DaoTradeMark;
import cliente.modelo.dao.DaoTypeVehicle;
import cliente.modelo.dao.DaoVehicle;

public class Controller 
{
	public boolean insertVehicle(String placa, String marca, int modelo, String color, String tipoDeVehiculo,
			double precioMinimo, int propietario) 
	{
		DaoVehicle daoVehicle = new DaoVehicle();
		Vehicle nuevo = new Vehicle(placa,marca,modelo,color,tipoDeVehiculo,precioMinimo,propietario);
		daoVehicle.insert(nuevo);
		if(daoVehicle.insert(nuevo))
		{
			return true;
		}
		return false;
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

	public void deleteVehicle(String placa)
	{
		DaoVehicle daoVehicle = new DaoVehicle();
		Vehicle nuevo = new Vehicle(placa);
		daoVehicle.delete(nuevo);
	}

	public void updateVehicle(String placa, String marca, int modelo, String color, String tipoDeVehiculo,
			double precioMinimo, int propietario)
	{
		DaoVehicle daoVehicle = new DaoVehicle();
		Vehicle nuevo = new Vehicle(placa,marca,modelo,color,tipoDeVehiculo,precioMinimo,propietario);
		daoVehicle.update(nuevo);	
	}

	////////////////////////////////////////////////////////////////////////////	////////////////////////////////////////////////////////////////////////////	////////////////////////////////////////////////////////////////////////////

	public void insertOwner(int cedula, String nombre, String apellido, Long telefono, String email) 
	{
		DaoOwners daoVehicle = new DaoOwners();
		Owners nuevo = new Owners(cedula,nombre,apellido,telefono,email);
		daoVehicle.insert(nuevo);
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

	public void deleteOwner(int cedula)
	{
		DaoOwners daoVehicle = new DaoOwners();
		Owners nuevo = new Owners(cedula);
		daoVehicle.delete(nuevo);
	}

	public void updateOwner(int cedula, String nombre, String apellido, Long telefono, String email)
	{
		DaoOwners daoVehicle = new DaoOwners();
		Owners nuevo = new Owners(cedula,nombre,apellido,telefono,email);
		daoVehicle.update(nuevo);

	}

	////////////////////////////////////////////////////////////////////////// 	////////////////////////////////////////////////////////////////////////////  ////////////////////////////////////////////////////////////////////////////

	public void insertTradeMark(String nombre) 
	{
		DaoTradeMark daoVehicle = new DaoTradeMark();
		TradeMark nuevo = new TradeMark(nombre);
		daoVehicle.insert(nuevo);
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

	public void deleteTradeMark(String nombre)
	{
		DaoTradeMark daoVehicle = new DaoTradeMark();
		TradeMark nuevo = new TradeMark(nombre);
		daoVehicle.delete(nuevo);
	}
	
	public void updateTradeMark(int codigo, String nombre) 
	{
		
	}


	//////////////////////////////////////////////////////////////////////////	////////////////////////////////////////////////////////////////////////////	////////////////////////////////////////////////////////////////////////////

	public void insertTypeVehicle(String descripcion) 
	{
		DaoTypeVehicle daoVehicle = new DaoTypeVehicle();
		TypeVehicle nuevo = new TypeVehicle(descripcion);
		daoVehicle.insert(nuevo);
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

	public void deleteTypeVehicle(String codigo)
	{
		DaoTypeVehicle daoVehicle = new DaoTypeVehicle();
		TypeVehicle nuevo = new TypeVehicle(codigo);
		daoVehicle.delete(nuevo);
	}

	//////////////////////////////////////////////////////////////////////////	////////////////////////////////////////////////////////////////////////////	////////////////////////////////////////////////////////////////////////////

	public void insertDefect(String placa, String descripcion)
	{
		DaoDefects daoVehicle = new DaoDefects();
		Defects nuevo = new Defects(placa,descripcion);
		daoVehicle.insert(nuevo);
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

	public void deleteDefects(String placa)
	{
		DaoDefects daoVehicle = new DaoDefects();
		Defects nuevo = new Defects(placa);
		daoVehicle.delete(nuevo);
	}

	public void updateDefects(String placa,Long orden, String descripcion)
	{
		DaoDefects daoVehicle = new DaoDefects();
		Defects nuevo = new Defects(placa,orden,descripcion);
		daoVehicle.update(nuevo);
	}




}
