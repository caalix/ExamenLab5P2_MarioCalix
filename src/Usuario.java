/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JOptionPane;

/**
 *
 * @author mario
 */
public class Usuario {
    private String nombre, usuario, contrasena;
    private int edad,num_cuenta;
    private float saldo=4500;

    public Usuario() {
    }

    public Usuario(String nombre, String usuario, String contrasena, int edad, int num_cuenta, float saldo) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.edad = edad;
        this.num_cuenta = num_cuenta;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNum_cuenta() {
        return num_cuenta;
    }

    public void setNum_cuenta(int num_cuenta) {
        this.num_cuenta = num_cuenta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", usuario=" + usuario + ", contrasena=" + contrasena + ", edad=" + edad + ", num_cuenta=" + num_cuenta + ", saldo=" + saldo + '}';
    }

    
    
}
