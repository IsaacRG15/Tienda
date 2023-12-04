/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author UNISTMO
 */
public class Tienda{
    private ArrayList<Prenda> inventario;
    private ArrayList<Usuario> usuario;
    
    public Tienda() {
        inventario = new ArrayList<Prenda>();
        usuario = new ArrayList<Usuario>();
    }
    
    public void ingresar_prenda(Prenda prenda){
        inventario.add(prenda);
        
    }
    
    public void ingresar_usuario(Usuario user){
        usuario.add(user);
    }

    @Override
    public String toString() {
        return "Tienda{" + "inventario=" + inventario;
    }
    
    
    
    public static void main(String args[]){
        Tienda tienda = new Tienda();
        tienda.ingresar_prenda(new Prenda("Sombrero", List.of(Estado.AGUASCALIENTES, Estado.CHIHUAHUA),"Gala",2100,17500, "Disponible", 3));
        tienda.ingresar_prenda(new Prenda("Blusa", List.of(Estado.ESTADO_DE_MEXICO, Estado.QUINTANA_ROO),"Común",1200,5000, "Disponible", 5));
        tienda.ingresar_prenda(new Prenda("Blusa", List.of(Estado.ESTADO_DE_MEXICO, Estado.QUINTANA_ROO),"Común",1200,5000, "Disponible", 5));
        System.out.println(tienda.toString());
    }
}
