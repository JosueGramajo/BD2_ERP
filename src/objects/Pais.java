package objects;

public class Pais{
    int idPais;
    String pais;

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Pais(int idPais, String pais) {
        this.idPais = idPais;
        this.pais = pais;
    }
}

