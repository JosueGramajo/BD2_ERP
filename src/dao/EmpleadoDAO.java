package dao;

import db.DbConnection;
import objects.Cliente;
import objects.Empleado;

import java.sql.ResultSet;
import java.util.ArrayList;

public class EmpleadoDAO {
    public static EmpleadoDAO INSTANCE = new EmpleadoDAO();

    public ArrayList<Empleado> getEmployees(){
        ArrayList<Empleado> list= new ArrayList<>();

        ResultSet rs = DbConnection.INSTANCE.executeQuery("" +
                "select id_empleado, nombre from empleado");
        try{
            while(rs.next()){
                Empleado e = new Empleado();
                e.setIdEmpleado(rs.getInt("id_empleado"));
                e.setNombre(rs.getString("nombre"));

                list.add(e);
            }
        }catch (Exception ex){

        }

        return list;
    }
}
