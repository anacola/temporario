package Exercicio3;
/*
 * 
 * As seguintes alteracoes foram feitas para encapsulamento dos atributos da classe Conta:
 * - Todos os atributos tem o modificador de acesso private, ou seja, nao poderao ser 
 * alterados diretamente, somente atraves de metodos da propria classe 
 * - Nao e necessario criar setter para o saldo, pois este atributo esta encapsulado 
 * pelos metodos saque(double valor), deposito(double valor) e getSaldo().
 * 
 * Analise o codigo abaixo.
 */
public class Conta {

	private double saldo;
	private String numero;
	private Agencia agencia;
	private Cliente titular;


	public void saque(double valor) {
		System.out.println("Realizando saque de R$ " + valor + " da conta "
				+ numero);
		if (valor > 0) {
			if (saldo >= valor) {
				saldo -= valor;
			} else
				System.out.println("Saldo insuficiente");
		} else {
			System.out.println("O valor de saque deve ser positivo");
		}
	}

	public void deposito(double valor) {
		System.out.println("Realizando deposito de R$" + valor + " da conta "
				+ numero);
		if (valor >= 0) {
			this.saldo += valor;
		} else
			System.out.println("O valor do deposito deve ser positivo");
	}

	public void imprimeDados() {
		System.out.println("\n----------------------------");
		System.out.println(" AGENCIA:" + agencia);
		System.out.println(" NUMERO : " + numero);
		System.out.println(" TITULAR: " + titular);
		System.out.println(" SALDO  : R$" + saldo);
		System.out.println("-----------------------------\n");
	}

	public double getSaldo() {
		return saldo;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public String getNumero() {
		return numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	
}
