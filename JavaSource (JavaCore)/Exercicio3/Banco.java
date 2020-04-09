package Exercicio3;
public class Banco {
	String nome;
	int numero;

	void imprime() {
		System.out.println("-------------------------");
		System.out.println("Nome do banco: " + nome);
		System.out.println("Numero do banco: " + numero);
		System.out.println("-------------------------");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}
