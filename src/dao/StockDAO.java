package dao;

import db.DbConnection;
import objects.Existencia;
import objects.GananciasPais;

import java.sql.ResultSet;
import java.util.ArrayList;

public class StockDAO {
    public static StockDAO INSTANCE = new StockDAO();

    public ArrayList<Existencia> getStocks(){
        ArrayList<Existencia> list= new ArrayList<>();

        ResultSet rs = DbConnection.INSTANCE.executeQuery("" +
                "select p.nombre_producto, pa.pais, e.existencias from existencia e " +
                "inner join producto p on (e.id_producto = p.id_producto) " +
                "inner join pais pa on (e.id_pais = pa.id_pais)");
        try{
            while(rs.next()){
                Existencia e = new Existencia();
                e.setNombreProducto(rs.getString("nombre_producto"));
                e.setNombrePais(rs.getString("pais"));
                e.setCantidad(rs.getInt("existencias"));

                list.add(e);
            }
        }catch (Exception ex){

        }

        return list;
    }
}
