package objects;

public class Direccion{
    int idDireccion;
    String direccion;

    public int getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(int idDireccion) {
        this.idDireccion = idDireccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Direccion(int idDireccion, String direccion) {
        this.idDireccion = idDireccion;
        this.direccion = direccion;
    }
}
