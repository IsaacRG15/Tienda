/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda;

import java.util.List;


/**
 *
 * @author UNISTMO
 */
public class Prenda {
    private final String prenda;
    private final List estado;
    private final String categoria;
    private final double costoRenta;
    private final double costoVenta;
    private final String estado_prenda;
    private final int cantidad;

    public Prenda(String prenda, List estado, String categoria, double costoRenta, double costoVenta, String estado_prenda, int cantidad) {
        this.prenda = prenda;
        this.estado = estado;
        this.categoria = categoria;
        this.costoRenta = costoRenta;
        this.costoVenta = costoVenta;
        this.estado_prenda = estado_prenda;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Prenda{" + "prenda=" + prenda + ", estado=" + estado + ", categoria=" + categoria + ", costoRenta=" + costoRenta + ", costoVenta=" + costoVenta + ", estado_prenda=" + estado_prenda + ", cantidad=" + cantidad + '}';
    }
}
