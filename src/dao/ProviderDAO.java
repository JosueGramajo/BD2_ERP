package dao;

import db.DbConnection;
import objects.GananciasPais;
import objects.Proveedor;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProviderDAO {
    public static ProviderDAO INSTANCE = new ProviderDAO();

    public ArrayList<Proveedor> getProviders(){
        ArrayList<Proveedor> list= new ArrayList<>();

        ResultSet rs = DbConnection.INSTANCE.executeQuery("" +
                "select id_proveedor, nombre_compania from proveedor");
        try{
            while(rs.next()){
                Proveedor p = new Proveedor();
                p.setIdProveedor(rs.getInt("id_proveedor"));
                p.setNombreCompania(rs.getString("nombre_compania"));

                list.add(p);
            }
        }catch (Exception ex){

        }

        return list;
    }
}
