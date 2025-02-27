package banco;

public abstract class conta {
    protected double saldo;
    public double getSaldo(){
        return saldo;
    }
    public abstract boolean sacar(double valor);    
}