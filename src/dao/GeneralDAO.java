package dao;

import Utils.Global;
import db.DbConnection;
import objects.GananciasPais;
import objects.Producto;

import java.sql.ResultSet;
import java.util.ArrayList;

public class GeneralDAO {
    public static GeneralDAO INSTANCE = new GeneralDAO();

    public int getNumberOfUsers(){
        ResultSet rs = DbConnection.INSTANCE.executeQuery("select count(*) as 'NumberOfUsers' from usuario");

        try{
            while(rs.next()){
                return rs.getInt("NumberOfUsers");
            }
        }catch (Exception ex){
            return 0;
        }

        return 0;
    }

    public int getNumberOfSales(){
        ResultSet rs = DbConnection.INSTANCE.executeQuery("select count(*) as 'NumberOfSales' from factura");

        try{
            while(rs.next()){
                return rs.getInt("NumberOfSales");
            }
        }catch (Exception ex){
            return 0;
        }

        return 0;
    }

    public int getNumberOfClients(){
        ResultSet rs = DbConnection.INSTANCE.executeQuery("select count(*) as 'NumberOfClients' from cliente");

        try{
            while(rs.next()){
                return rs.getInt("NumberOfClients");
            }
        }catch (Exception ex){
            return 0;
        }

        return 0;
    }

    public Double getTotalEarnings(){
        ResultSet rs = DbConnection.INSTANCE.executeQuery("select SUM(total) as 'Total' from factura");

        try{
            while(rs.next()){
                return rs.getDouble("Total");
            }
        }catch (Exception ex){
            return 0.0;
        }

        return 0.0;
    }

    public ArrayList<GananciasPais> getEarningsByCountry(){
        ArrayList<GananciasPais> list= new ArrayList<>();

        ResultSet rs = DbConnection.INSTANCE.executeQuery("" +
                "select SUM(total) as 'total', p.pais from factura f " +
                "inner join empleado e on (f.id_empleado = e.id_empleado) " +
                "inner join pais p on (p.id_pais = e.id_pais) " +
                "group by p.pais");
        try{
            while(rs.next()){
                GananciasPais g = new GananciasPais();
                g.setGanancias(rs.getDouble("total"));
                g.setPais(rs.getString("pais"));

                list.add(g);
            }
        }catch (Exception ex){

        }

        return list;
    }
}
