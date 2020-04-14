package Exercicio4;

public class Conta {

	private double saldo;
	private String numero;
	private Agencia agencia;
	private Cliente titular;

	public void inicializaConta(double saldo, String numero, Cliente tit,
			Agencia agencia) {
		this.numero = numero;
		this.titular = tit;
		this.agencia = agencia;
		this.saldo = saldo;
	}

	public void inicializaConta(String numero, Cliente tit, Agencia agencia) {
		this.inicializaConta(0, numero, tit, agencia);
	}

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
		System.out.println(" AGENCIA:" + this.agencia.getNumero());
		System.out.println(" NUMERO : " + numero);
		System.out.println(" TITULAR: " + this.titular.nome);
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
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
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
	
