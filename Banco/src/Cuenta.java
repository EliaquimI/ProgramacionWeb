public class Cuenta {
    private double saldo = 0;

    public Cuenta() {
        this.saldo = 0;
    }
    public double getSaldo() {
        return this.saldo;
    }

    public void setDepositar(double cantidad) {
        if (cantidad > 0) {
            saldo = saldo + cantidad;
        }
    }

    public void setRetirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo = saldo - cantidad;
        }
    }
}
