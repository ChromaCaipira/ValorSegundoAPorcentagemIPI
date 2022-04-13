package aplicação;

import modelagem.Valor;

public class App {
	private static Valor peca1;
	private static Valor peca2;
	public static void main(String[] args) {
		peca1 = new Valor(13, 13, 12);
		peca2 = new Valor(12, 11, 10);
		
		double valorProduto = peca1.valorPeca() + peca2.valorPeca();
		double valorTotalComIPI = peca1.ipi(10) + peca2.ipi(10);
		
		System.out.printf("O somatório do valor das peças é: %.2f%n", valorProduto);
		System.out.printf("O valor total a ser pago é: %.2f%n", valorTotalComIPI);
	}
}