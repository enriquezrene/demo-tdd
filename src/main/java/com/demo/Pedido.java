package com.demo;

/**
 * Created by moe on 4/30/16.
 */
public class Pedido {
    private ServicioMail servicioMail;

    private String producto;
    private int cantidad;
    private boolean exitoso;

    public Pedido(String producto, int cantidad) {
        this.producto=producto;
        this.cantidad=cantidad;
    }


    public void procesarPedido(Almacen almacen) {
        if(!almacen.hayStock(producto, cantidad)){
            servicioMail.enviarMail(new Correo());
        }else{
            almacen.quitar(producto, cantidad);
            exitoso=true;
        }

    }

    public void setColaboradores(ServicioMail servicioMail) {
        this.servicioMail=servicioMail;
    }

    public boolean isExitoso() {
        return exitoso;
    }
}
