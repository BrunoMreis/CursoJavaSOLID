package exercicio2;
public class EnviadorDeEmail implements ExecultaNotaFiscal {

    public void execultaTarefa(NotaFiscal nf) {
        System.out.println("envia email da nf " + nf.getId());
    }
}