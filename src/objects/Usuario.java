package objects;

public class Usuario{
    int idUsuario, idNivel, idPais;
    String nombreUsuario, nombreCorto, clave;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdNivel() {
        return idNivel;
    }

    public void setIdNivel(int idNivel) {
        this.idNivel = idNivel;
    }

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getNombreCorto() {
        return nombreCorto;
    }

    public void setNombreCorto(String nombreCorto) {
        this.nombreCorto = nombreCorto;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Usuario(int idUsuario, int idNivel, int idPais, String nombreUsuario, String nombreCorto, String clave) {
        this.idUsuario = idUsuario;
        this.idNivel = idNivel;
        this.idPais = idPais;
        this.nombreUsuario = nombreUsuario;
        this.nombreCorto = nombreCorto;
        this.clave = clave;
    }
}