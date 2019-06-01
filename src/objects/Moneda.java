package objects;

public class Moneda{
    int idMoneda;
    String moneda;
    char simbolo;

    public int getIdMoneda() {
        return idMoneda;
    }

    public void setIdMoneda(int idMoneda) {
        this.idMoneda = idMoneda;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public char getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(char simbolo) {
        this.simbolo = simbolo;
    }

    public Moneda(int idMoneda, String moneda, char simbolo) {
        this.idMoneda = idMoneda;
        this.moneda = moneda;
        this.simbolo = simbolo;
    }
}