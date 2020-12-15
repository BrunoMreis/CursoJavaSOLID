package exercicio5;

public class ContaDeEstudante {

	private MovimentaSaldo movimenta;
	private int milhas;

	public ContaDeEstudante() {
		movimenta = new MovimentaSaldo();
	}

	public void deposita(double valor) {
		movimenta.deposita(valor);
		this.milhas += (int) valor;
	}

	public void saca(double valor) {
		movimenta.deposita(valor);
	}

	public double getSaldo() {
		return movimenta.getSaldo();
	}

	public int getMilhas() {
		return milhas;
	}

}
