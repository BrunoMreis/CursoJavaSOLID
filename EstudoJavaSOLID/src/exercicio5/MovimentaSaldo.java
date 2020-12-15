package exercicio5;

public class MovimentaSaldo {
	
	
	 private double saldo;

	public void deposita(double valor) {
	        this.saldo += valor;
	    }

	    public void saca(double valor) {
	        if (valor <= this.saldo) {
	            this.saldo -= valor;
	        } else {
	            throw new IllegalArgumentException();
	        }
	    }
	    
	    public void rende(double rendimento) {
	        this.saldo += this.saldo * rendimento;
	    }

		public double getSaldo() {
			return this.saldo;
		}
}
