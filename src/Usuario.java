
import javax.swing.JOptionPane;


public class Usuario {
    private String nombre, usuario, contrasena;
    private int edad;

    public Usuario() {
    }

    public Usuario(String nombre, String usuario, String contrasena, int edad) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.edad = edad;
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
        if(edad<18){
            JOptionPane.showMessageDialog(null, "Debe ser mayor de 18 anios.");
        }
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", usuario=" + usuario + ", contrasena=" + contrasena + ", edad=" + edad + '}';
    }
    
}
