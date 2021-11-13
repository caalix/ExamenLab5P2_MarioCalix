/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Date;

/**
 *
 * @author mario
 */
public class Videojuego {
    private String nombre;
    private Date anio;
    private int cantidad;
    private double precio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getAnio() {
        return anio;
    }

    public void setAnio(Date anio) {
        this.anio = anio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Videojuego(String nombre, Date anio, int cantidad, double precio) {
        this.nombre = nombre;
        this.anio = anio;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public Videojuego() {
    }

    @Override
    public String toString() {
        return "Videojuego{" + "nombre=" + nombre + ", anio=" + anio + ", cantidad=" + cantidad + ", precio=" + precio + '}';
    }
    
}
