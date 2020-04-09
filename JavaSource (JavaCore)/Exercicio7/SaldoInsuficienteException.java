package Exercicio7;


public class SaldoInsuficienteException extends Exception {

	public SaldoInsuficienteException(String mensagem, Throwable erroOriginal) {
		super(mensagem, erroOriginal);
	}

	public SaldoInsuficienteException(String mensagem) {
		super(mensagem);
	}

}
