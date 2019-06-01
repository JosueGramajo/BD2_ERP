package objects;

public class Ciudad{
    int idCiudad;
    String ciudad;

    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Ciudad(int idCiudad, String ciudad) {
        this.idCiudad = idCiudad;
        this.ciudad = ciudad;
    }
}