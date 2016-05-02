package com.demo;

/**
 * Created by moe on 4/30/16.
 */
public interface Almacen {
    boolean hayStock(String producto, int cantidad);

    void quitar(String producto, int cantidad);
}
