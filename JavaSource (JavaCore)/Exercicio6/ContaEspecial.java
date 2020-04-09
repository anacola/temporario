package Exercicio6;


public class ContaEspecial extends Conta {
	private double limite;
	
	public ContaEspecial(double saldoInicial, String num, Cliente tit, Agencia ag, double limite) {
		super(saldoInicial, num, tit, ag);
		this.limite = limite;
	}

	public ContaEspecial(String num, Cliente tit, Agencia ag, double limite) {
		super(num, tit, ag);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
    @Override
	public void saque(double valor) {
    	 System.out.println("Realizando saque de R$ " + valor + " da conta " + getNumero());
         if (valor > 0) {
             if (saldo + limite >= valor) {
                 saldo -= valor;
                 acumularCPMF(valor);
             } else
                 System.out.println("Saldo insuficiente");
         } else {
             System.out.println("O valor de saque deve ser positivo");
         }
	}

	public void imprimeDados() {
        System.out.println("\n ============ CONTA POUPANCA ====================");
        super.imprimeDados();
        System.out.println("Limite: " + limite);
        System.out.println("===================================================\n");

	}
}
