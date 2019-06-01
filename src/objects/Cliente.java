package objects;

public class Cliente{
    int idCliente, idDireccion, idCiudad, idPais;
    String nitCliente, nombreCliente, nombreContacto, cargoContacto, telefono;

    public Cliente(){}

    public String getNitCliente() {
        return nitCliente;
    }

    public void setNitCliente(String nitCliente) {
        this.nitCliente = nitCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
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

    public Cliente(int idCliente, int idDireccion, int idCiudad, int idPais, String nombreCliente, String nombreContacto, String cargoContacto, String telefono) {
        this.idCliente = idCliente;
        this.idDireccion = idDireccion;
        this.idCiudad = idCiudad;
        this.idPais = idPais;
        this.nombreCliente = nombreCliente;
        this.nombreContacto = nombreContacto;
        this.cargoContacto = cargoContacto;
        this.telefono = telefono;
    }
}