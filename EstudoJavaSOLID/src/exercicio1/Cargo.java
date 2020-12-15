package exercicio1;
public enum Cargo {
    DESENVOLVEDOR(new DezOuVintePorcento()),
    DBA(new QuinzeOuVinteCincoPorcento()),
    TESTER (new QuinzeOuVinteCincoPorcento());

	private Calcula regra;

	Cargo(Calcula regra) {
		this.regra = regra;
	}
	
	
	public Calcula getRegra() {
		return regra;
	}
}