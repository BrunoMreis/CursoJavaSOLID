package exercicio5;

public class ContaComum {
	
    private MovimentaSaldo movimenta;

    public ContaComum() {
        movimenta = new MovimentaSaldo();
    }

    public void deposita(double valor) {
        movimenta.deposita(valor);
    }

    public void saca(double valor) {
    	movimenta.deposita(valor);
    }

    public void rende() {
        movimenta.rende(.01);
    }

    public double getSaldo() {
        return movimenta.getSaldo();
    }

}
