package objects;

public class Sales {
    String fecha;
    int noFactura;
    String cliente;
    String producto;
    double precioUnidad;
    int cantidad;
    double total;

    public Sales(){}

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getNoFactura() {
        return noFactura;
    }

    public void setNoFactura(int noFactura) {
        this.noFactura = noFactura;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(double precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Sales(String fecha, int noFactura, String cliente, String producto, double precioUnidad, int cantidad, double total) {
        this.fecha = fecha;
        this.noFactura = noFactura;
        this.cliente = cliente;
        this.producto = producto;
        this.precioUnidad = precioUnidad;
        this.cantidad = cantidad;
        this.total = total;
    }
}
