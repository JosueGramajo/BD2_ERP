package objects;

public class Producto{
    int idProducto;
    int idProveedor;
    int idCategoria;
    int cantidadPorUnidad;
    int unidadesPedido;
    private String pais;
    private int existencias;
    String nombreProducto;
    double precioUnidad;
    String suspendido;
    String nombreProveedor;
    String nombreCategoria;

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public Producto(){}

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getCantidadPorUnidad() {
        return cantidadPorUnidad;
    }

    public void setCantidadPorUnidad(int cantidadPorUnidad) {
        this.cantidadPorUnidad = cantidadPorUnidad;
    }

    public int getUnidadesPedido() {
        return unidadesPedido;
    }

    public void setUnidadesPedido(int unidadesPedido) {
        this.unidadesPedido = unidadesPedido;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(double precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public String getSuspendido() {
        return suspendido;
    }

    public void setSuspendido(String suspendido) {
        this.suspendido = suspendido;
    }

    public Producto(int idProducto, int idProveedor, int idCategoria, int cantidadPorUnidad, int unidadesPedido, String nombreProducto, double precioUnidad, String suspendido) {
        this.idProducto = idProducto;
        this.idProveedor = idProveedor;
        this.idCategoria = idCategoria;
        this.cantidadPorUnidad = cantidadPorUnidad;
        this.unidadesPedido = unidadesPedido;
        this.nombreProducto = nombreProducto;
        this.precioUnidad = precioUnidad;
        this.suspendido = suspendido;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }
}