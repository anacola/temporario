package Exercicio2;

public class Conta {
	Agencia agencia;
	Cliente cliente;
	String numero;
	double saldo;
	int saque;
	
	public void imprime() {
		System.out.println("Ag�ncia: " + agencia);
		System.out.println("Cliente: " + cliente);
		System.out.println("N�mero da conta " + numero);
		System.out.println("Saldo: " + saldo);
		 
	}
	
	public void sacar(double valor){
        if(saldo >= valor){
            saldo -= valor;
            saque++;
            System.out.println("Sacado: " + valor);
            System.out.println("Novo saldo: " + saldo + "\n");
        } else {
            System.out.println("Saldo insuficiente. Fa�a um dep�sito\n");
        }
    }

	public void saque(int i) {
		if(saldo >= i){
            saldo -= i;
            saque++;
            System.out.println("Sacado: " + i);
            System.out.println("Novo saldo: " + saldo + "\n");
        } else {
            System.out.println("Saldo insuficiente. Fa�a um dep�sito\n");
        }		
	}
	
	public void deposito(double valor)
    {
        saldo += valor;
        System.out.println("Depositado: " + valor);
        System.out.println("Novo saldo: " + saldo + "\n");
    }
}