package dao;

import db.DbConnection;
import objects.Categoria;
import objects.Proveedor;

import java.sql.ResultSet;
import java.util.ArrayList;

public class CategoryDAO {
    public static CategoryDAO INSTANCE = new CategoryDAO();

    public ArrayList<Categoria> getCategories(){
        ArrayList<Categoria> list= new ArrayList<>();

        ResultSet rs = DbConnection.INSTANCE.executeQuery("" +
                "select id_categoria, nombre_categoria from categoria");
        try{
            while(rs.next()){
                Categoria c = new Categoria();
                c.setIdCategoria(rs.getInt("id_categoria"));
                c.setNombreCategoria(rs.getString("nombre_categoria"));

                list.add(c);
            }
        }catch (Exception ex){

        }

        return list;
    }
}
