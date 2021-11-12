


public class cuenBancaria extends Usuario{
    private float saldo;
    private int num_cuenta;

    public cuenBancaria() {
    }

    public cuenBancaria(float saldo, int num_cuenta, String nombre, String usuario, String contrasena, int edad) {
        super(nombre, usuario, contrasena, edad);
        this.saldo = saldo;
        this.num_cuenta = num_cuenta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getNum_cuenta() {
        return num_cuenta;
    }

    public void setNum_cuenta(int num_cuenta) {
        this.num_cuenta = num_cuenta;
    }

    @Override
    public String toString() {
        return "cuenBancaria{" + "saldo=" + saldo + ", num_cuenta=" + num_cuenta +'}';
    }

    
    
}
