package Exercicio6;

public class TesteCastUp {

	public static void main(String[] args) {

		Banco banco = new Banco("Bradesco Bank", 1000);
		Agencia agencia = new Agencia("001", banco);

		Cliente clienteX = new Cliente("Mr. X", "9876543-21");
		Conta conta1 = new ContaEspecial(1000, "11121314", clienteX, agencia,
				600);
		conta1.saque(180d);

		Cliente clienteY = new Cliente("Mr. Y", "543543-99");
		Conta conta2 = new ContaPoupanca(3000, "33988311", clienteY, agencia,
				"01/01/2005");
		conta2.saque(330d);

		Cliente clienteZ = new Cliente("Mr. Z", "988875-77");
		Conta conta3 = new Conta(2200, "35768351", clienteZ, agencia);
		conta3.saque(456d);

		Investimento investimento = new Investimento(4000, 0.022, 4);

		// ----------------------------------------
		// acione o metodo imprimirTributavel para
		// todas as contas e investimentos
		// ----------------------------------------
		imprimirTributavel(investimento);

		// Coloque todas as contas e investimentos em um array
		Tributavel[] trib = new Tributavel[4];

		System.out.println("imposto total devido: "
				+ calcularImpostoTotalDevido(trib));
	}

	static void imprimirTributavel(Tributavel t) {
		System.out.println("\n------------------------------------------");
		System.out.println("Tributavel: " + t.getDescricaoTributavel());
		System.out.println("Imposto Devido: " + t.calcularImpostos());
		System.out.println("------------------------------------------\n");
	}

	static double calcularImpostoTotalDevido(Tributavel[] tributaveis) {

		double impostoTotalDevido = 0;
		for (Tributavel t : tributaveis) {
			// calcule o imposto total devido
		}
		return impostoTotalDevido;

	}
}
