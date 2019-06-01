package dao;

import Utils.Global;
import db.DbConnection;
import objects.Producto;

import java.sql.ResultSet;
import java.util.ArrayList;

public class ProductDAO {
    public static ProductDAO INSTANCE = new ProductDAO();

    public ArrayList<Producto> getProductosStorage(){

        ArrayList<Producto> list = new ArrayList<>();

        ResultSet rs = DbConnection.INSTANCE.executeQuery(
                "select p.id_producto, p.nombre_producto, p.precio_unidad, e.existencias, c.pais from producto p " +
                        "inner join existencia e on(p.id_producto = e.id_producto) " +
                        "inner join pais c on(e.id_pais = c.id_pais) " +
                        "where e.id_pais = "+ Global.country +"");

        try{
            Producto p;
            while(rs.next()){
                p = new Producto();
                p.setIdProducto(rs.getInt("id_producto"));
                p.setNombreProducto(rs.getString("nombre_producto"));
                p.setPrecioUnidad(rs.getDouble("precio_unidad"));
                p.setExistencias(rs.getInt("existencias"));
                p.setPais(rs.getString("pais"));

                list.add(p);
            }
        }catch (Exception ex){
            return null;
        }

        return list;
    }

    public ArrayList<Producto> getAllProducts(){

        ArrayList<Producto> list = new ArrayList<>();

        ResultSet rs = DbConnection.INSTANCE.executeQuery(
                "select p.id_producto, p.nombre_producto, p.precio_unidad, p.suspendido, c.nombre_categoria, pr.nombre_compania from producto p " +
                        "inner join categoria c on (p.id_categoria = c.id_categoria) " +
                        "inner join proveedor pr on (p.id_proveedor = pr.id_proveedor)");

        try{
            Producto p;
            while(rs.next()){
                p = new Producto();
                p.setIdProducto(rs.getInt("id_producto"));
                p.setNombreProducto(rs.getString("nombre_producto"));
                p.setPrecioUnidad(rs.getDouble("precio_unidad"));
                p.setSuspendido(rs.getString("suspendido"));
                p.setNombreCategoria(rs.getString("nombre_categoria"));
                p.setNombreProveedor(rs.getString("nombre_compania"));

                list.add(p);
            }
        }catch (Exception ex){
            return null;
        }

        return list;
    }

    public void deleteProduct(int id){
        ResultSet rs = DbConnection.INSTANCE.executeQuery(
                "exec sp_producto " +
                        " @id_producto = "+ id +"," +
                        " @nombre_producto = ''," +
                        " @id_proveedor = 0," +
                        " @id_categoria = 0," +
                        " @cantidad_por_unidad = 0," +
                        " @precio_unidad = 0," +
                        " @unidades_pedido = 0," +
                        " @suspendido = ''," +
                        " @datos = 'Delete'");
    }

    public void insertProduct(String nombre, int idProveedor, int idCategoria, double precio, int cantidad){
        DbConnection.INSTANCE.executeQuery(
                " exec sp_producto " +
                        " @id_producto = 0," +
                        " @nombre_producto = '"+ nombre +"'," +
                        " @id_proveedor = "+ idProveedor +"," +
                        " @id_categoria = "+ idCategoria +"," +
                        " @cantidad_por_unidad = 0," +
                        " @precio_unidad = "+ precio +"," +
                        " @unidades_pedido = 0," +
                        " @suspendido = 'n'," +
                        " @datos = 'Insert'");

        DbConnection.INSTANCE.executeQuery(
                "insert into existencia values ((SELECT IDENT_CURRENT('producto')), "+Global.country+", "+cantidad+")");
    }
}
