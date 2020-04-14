package Exercicio3;

public class Agencia {

	private String numero;
	private Banco banco;

	/**
	 * @param num
	 *            Numero da agencia
	 * @param bc
	 *            banco ao qual a agencia pertence
	 */
	public void inicializaAgencia(String num, Banco bc) {
		numero = num;
		banco = bc;
	}

	/**
	 * Metodo para impressao de todos os dados da classe
	 */
	public void imprimeDados() {
		System.out.println("----------------------");
		System.out.println("Agencia no. " + this.numero);
		System.out.println("Banco no." + banco.getNome());
		System.out.println("----------------------");
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

}
