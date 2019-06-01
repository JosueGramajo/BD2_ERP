package objects;

public class Proveedor{
    int idProveedor, idDireccion, idCiudad, idPais;
    String nombreCompania, nombreContacto, cargoContacto, telefono;

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public int getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(int idDireccion) {
        this.idDireccion = idDireccion;
    }

    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    public String getNombreCompania() {
        return nombreCompania;
    }

    public void setNombreCompania(String nombreCompania) {
        this.nombreCompania = nombreCompania;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public String getCargoContacto() {
        return cargoContacto;
    }

    public void setCargoContacto(String cargoContacto) {
        this.cargoContacto = cargoContacto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Proveedor(){}

    public Proveedor(int idProveedor, int idDireccion, int idCiudad, int idPais, String nombreCompania, String nombreContacto, String cargoContacto, String telefono) {
        this.idProveedor = idProveedor;
        this.idDireccion = idDireccion;
        this.idCiudad = idCiudad;
        this.idPais = idPais;
        this.nombreCompania = nombreCompania;
        this.nombreContacto = nombreContacto;
        this.cargoContacto = cargoContacto;
        this.telefono = telefono;
    }
}