package dao;

import db.DbConnection;
import objects.Cliente;
import objects.GananciasPais;

import java.sql.ResultSet;
import java.util.ArrayList;

public class ClientDAO {
    public static ClientDAO INSTANCE = new ClientDAO();

    public ArrayList<Cliente> getClients(){
        ArrayList<Cliente> list= new ArrayList<>();

        ResultSet rs = DbConnection.INSTANCE.executeQuery("" +
                "select nit_cliente, nombre_cliente from cliente");
        try{
            while(rs.next()){
                Cliente c = new Cliente();
                c.setNitCliente(rs.getString("nit_cliente"));
                c.setNombreCliente(rs.getString("nombre_cliente"));

                list.add(c);
            }
        }catch (Exception ex){

        }

        return list;
    }
}
