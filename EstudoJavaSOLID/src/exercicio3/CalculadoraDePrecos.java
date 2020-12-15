package exercicio3;

public class CalculadoraDePrecos {
	public double calcula(Compra produto) {
		TabelaDePreco tabela = new TabelaDePrecoPadrao();
		Frete correios = new FretePadrao();

		double desconto = tabela.descontoPara(produto.getValor());
		double frete = correios.para(produto.getCidade());

		return produto.getValor() * (1 - desconto) + frete;
	}

}
