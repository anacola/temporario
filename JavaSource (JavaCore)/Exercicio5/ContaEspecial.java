package Exercicio5;

/*
 * Tarefas: 
 * 1) Faca com que a classe ContaEspecial estenda a classe Conta 
 * 2) Faça as correções necessárias no construtor da classe ContaEspecial. 
 * 3) Faca override do metodo saque para que ele considere o limite na hora de 
 *    verificar se existe ou nao saldo disponivel.
 */
public class ContaEspecial{
	private double limite;

	public ContaEspecial(double saldoInicial, String num, Cliente tit,
			Agencia ag, double limite) {
		this.limite = limite;
	}
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
    public void imprimeDados() {
        System.out.println("\n ============ CONTA POUPANCA ====================");
        //Inclua a chamada abaixo para invocar o método imprimeDados da superclasse
        //super.imprimeDados();
        System.out.println("Limite: " + limite);
        System.out.println("===================================================\n");

	}
}
