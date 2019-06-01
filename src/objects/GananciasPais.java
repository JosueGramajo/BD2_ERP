package objects;

public class GananciasPais {
    double ganancias;
    String pais;

    public GananciasPais(){}

    public GananciasPais(double ganancias, String pais) {
        this.ganancias = ganancias;
        this.pais = pais;
    }

    public double getGanancias() {
        return ganancias;
    }

    public void setGanancias(double ganancias) {
        this.ganancias = ganancias;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
