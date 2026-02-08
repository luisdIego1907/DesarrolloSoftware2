/*
Crea una excepción SaldoInsuficienteException.

Crea una clase CuentaBancaria con:

saldo

método retirar(double monto)

Si el monto a retirar es mayor al saldo, lanza la excepción.

En main, intenta hacer varios retiros y maneja el error.

Extra:
Incluye en el mensaje el saldo actual y el monto solicitado.
 */
public class E2 {

    public static void main(String[] args) {
        
        BancAccount b = new BancAccount();

        b.withdraw(25);

        b.withdraw(120);
    }
}

class BancAccount{

    private double balance = 100;

    public void withdraw(double withdrawAmount){

        if (withdrawAmount > this.balance) {
            
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }
        
        this.balance = this.balance - withdrawAmount;
        System.out.println("Total balance: " + this.balance);
    }
}

class SaldoInsuficienteException extends IllegalArgumentException{

    public SaldoInsuficienteException(String mensaje){
        super(mensaje);
    }
}