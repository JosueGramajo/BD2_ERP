package dao;

import db.DbConnection;
import objects.GananciasPais;
import objects.Sales;

import java.sql.ResultSet;
import java.util.ArrayList;

public class SalesDAO {
    public static SalesDAO INSTANCE = new SalesDAO();

    public ArrayList<Sales> getSales(){
        ArrayList<Sales> list= new ArrayList<>();

        ResultSet rs = DbConnection.INSTANCE.executeQuery("" +
                "select f.fecha_pedido, f.noFactura, c.nombre_cliente, p.nombre_producto, p.precio_unidad, d.cantidad, f.total " +
                "from detalle_factura d " +
                "inner join factura f on (f.id_factura = d.id_factura) " +
                "inner join cliente c on (f.nit_cliente = c.nit_cliente) " +
                "inner join producto p on (d.id_producto = p.id_producto)");
        try{
            while(rs.next()){
                Sales s = new Sales();
                s.setFecha(rs.getString("fecha_pedido"));
                s.setNoFactura(rs.getInt("noFactura"));
                s.setCliente(rs.getString("nombre_cliente"));
                s.setProducto(rs.getString("nombre_producto"));
                s.setPrecioUnidad(rs.getDouble("precio_unidad"));
                s.setCantidad(rs.getInt("cantidad"));
                s.setTotal(rs.getDouble("total"));

                list.add(s);
            }
        }catch (Exception ex){

        }

        return list;
    }

    public void newSale(String nit, int idEmpleado, double precio, int cantidad, int idProducto){
        DbConnection.INSTANCE.executeQuery("insert into factura " +
                "values('"+nit+"',"+idEmpleado+",(SELECT CAST(GETDATE() AS DATE))," +
                "1,'n',(select top(1) noFactura from factura order by noFactura DESC) + 1,'2019-A', "+(precio * cantidad)+")");

        DbConnection.INSTANCE.executeQuery("insert into detalle_factura " +
                "values ("+idProducto+","+cantidad+",0,(SELECT IDENT_CURRENT('factura')))");
    }
}
