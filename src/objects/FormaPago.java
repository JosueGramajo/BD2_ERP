package objects;

public class FormaPago{
    int idFormaPago;
    String descripcion;

    public int getIdFormaPago() {
        return idFormaPago;
    }

    public void setIdFormaPago(int idFormaPago) {
        this.idFormaPago = idFormaPago;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public FormaPago(int idFormaPago, String descripcion) {
        this.idFormaPago = idFormaPago;
        this.descripcion = descripcion;
    }
}
