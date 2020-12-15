package exercicio2;

import java.util.List;

public class GeradorDeNotaFiscal {

	private List<ExecultaNotaFiscal> execucoesNF;

    public GeradorDeNotaFiscal(List<ExecultaNotaFiscal> execucoesNF) {
        this.execucoesNF = execucoesNF;
    }

    public NotaFiscal gera(Fatura fatura) {

        double valor = fatura.getValorMensal();

        NotaFiscal nf = new NotaFiscal(valor, impostoSimplesSobreO(valor));

        for (ExecultaNotaFiscal execultaNotaFiscal : execucoesNF) {
			execultaNotaFiscal.execultaTarefa(nf);
		}

        return nf;
    }

    private double impostoSimplesSobreO(double valor) {
        return valor * 0.06;
    }
}