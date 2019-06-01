package objects;

import java.sql.Date;

public class Boleta{
    int idBoleta, idCliente, idEmpleado;
    Date fechaPedido;
    char suspendido;

    public int getIdBoleta() {
        return idBoleta;
    }

    public void setIdBoleta(int idBoleta) {
        this.idBoleta = idBoleta;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public char getSuspendido() {
        return suspendido;
    }

    public void setSuspendido(char suspendido) {
        this.suspendido = suspendido;
    }

    public Boleta(int idBoleta, int idCliente, int idEmpleado, Date fechaPedido, char suspendido) {
        this.idBoleta = idBoleta;
        this.idCliente = idCliente;
        this.idEmpleado = idEmpleado;
        this.fechaPedido = fechaPedido;
        this.suspendido = suspendido;
    }
}