package objects;

public class Nivel{
    int idNivel;
    int nivel;

    public int getIdNivel() {
        return idNivel;
    }

    public void setIdNivel(int idNivel) {
        this.idNivel = idNivel;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Nivel(int idNivel, int nivel) {
        this.idNivel = idNivel;
        this.nivel = nivel;
    }
}