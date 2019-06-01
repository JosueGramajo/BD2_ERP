package objects;

public class DetalleBoleta{
    int idDetalleBoleta, idProducto, cantidad, idBoleta;
    double precioUnidad, descuento;

    public int getIdDetalleBoleta() {
        return idDetalleBoleta;
    }

    public void setIdDetalleBoleta(int idDetalleBoleta) {
        this.idDetalleBoleta = idDetalleBoleta;
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

    public int getIdBoleta() {
        return idBoleta;
    }

    public void setIdBoleta(int idBoleta) {
        this.idBoleta = idBoleta;
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

    public DetalleBoleta(int idDetalleBoleta, int idProducto, int cantidad, int idBoleta, double precioUnidad, double descuento) {
        this.idDetalleBoleta = idDetalleBoleta;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.idBoleta = idBoleta;
        this.precioUnidad = precioUnidad;
        this.descuento = descuento;
    }
}
