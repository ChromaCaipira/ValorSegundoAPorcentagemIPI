package modelagem;

public class Valor {
	private int cod;
	private int qntd;
	private double val;
	
	public Valor(int codigo, double valor, int quantidade) {
		this.cod = codigo;
		this.val = valor;
		this.qntd = quantidade;
	}
	
	public double valorPeca() {
		return this.val*this.qntd;
	}
	
	public double ipi(double porcentagem) {
		return valorPeca() * (porcentagem/100 + 1);
	}
	
	public int getCodigo() { //Getter do Código
		return this.cod;
	}
	
	public int setCodigo() { //Setter do Código
		return this.cod;
	}
	
	public double getValor() { //Getter do Valor
		return this.val;
	}
	
	public double setValor() { //Setter do Valor
		return this.val;
	}
	
	public int getQntd() { //Getter do Código
		return this.qntd;
	}
	
	public int setQntd() { //Setter do Código
		return this.qntd;
	}
}