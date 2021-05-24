package cliente.modelo;

import java.io.Serializable;

public class Login implements Dto,Serializable
{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String nombre;
    private String contrasena;

    public Login(String nombre, String contrasena) {
        this.nombre = nombre;
        this.contrasena = contrasena;
    }

    public Login() {

    }


    public Login(String contrasena) {
        this.contrasena = contrasena;
    }

    public String insert()
    {
        String sql = "INSERT INTO registro(nombre_de_usuario,contrasena) VALUES ('"
                + getNombre().trim()+"', '"
                + getContrasena().trim()
                + "');";
        System.out.println(sql);
        return sql;
    }

    public String findByPlaca()
    {
        return "SELECT * FROM registro WHERE contrasena = '" + getContrasena().trim() + "';" ;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String read() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String update() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String delete() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Crud getCrud() {
        // TODO Auto-generated method stub
        return null;
    }





}
