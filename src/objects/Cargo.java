package objects;

public class Cargo{
    int idCargo;
    double cargoContacto;

    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    public double getCargoContacto() {
        return cargoContacto;
    }

    public void setCargoContacto(double cargoContacto) {
        this.cargoContacto = cargoContacto;
    }

    public Cargo(int idCargo, double cargoContacto) {
        this.idCargo = idCargo;
        this.cargoContacto = cargoContacto;
    }
}