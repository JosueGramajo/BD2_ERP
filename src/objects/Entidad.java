package objects;

public class Entidad{
    int idEntidad, idPais, idMoneda;
    String nombreEntidad;

    public int getIdEntidad() {
        return idEntidad;
    }

    public void setIdEntidad(int idEntidad) {
        this.idEntidad = idEntidad;
    }

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    public int getIdMoneda() {
        return idMoneda;
    }

    public void setIdMoneda(int idMoneda) {
        this.idMoneda = idMoneda;
    }

    public String getNombreEntidad() {
        return nombreEntidad;
    }

    public void setNombreEntidad(String nombreEntidad) {
        this.nombreEntidad = nombreEntidad;
    }

    public Entidad(int idEntidad, int idPais, int idMoneda, String nombreEntidad) {
        this.idEntidad = idEntidad;
        this.idPais = idPais;
        this.idMoneda = idMoneda;
        this.nombreEntidad = nombreEntidad;
    }
}