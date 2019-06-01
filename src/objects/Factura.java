package objects;

public class Factura{
    int idDetalle, idProducto, cantidad, idFactura;
    double precioUnidad, descuento;

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public double getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(double precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public Factura(int idDetalle, int idProducto, int cantidad, int idFactura, double precioUnidad, double descuento) {
        this.idDetalle = idDetalle;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.idFactura = idFactura;
        this.precioUnidad = precioUnidad;
        this.descuento = descuento;
    }
}