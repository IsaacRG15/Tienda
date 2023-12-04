/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda;

/**
 *
 * @author UNISTMO
 */
public class Usuario {
    private final String nombre;
    private final String dirreccion;
    private final int numero;
    private final int tarjeta;

    public Usuario(String nombre, String dirreccion, int numero, int tarjeta) {
        this.nombre = nombre;
        this.dirreccion = dirreccion;
        this.numero = numero;
        this.tarjeta = tarjeta;
    }
}
