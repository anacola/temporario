package Exercicio2;

/*
 * Criar uma uma classe 'Banco' contendo os atributos nome e o numero do mesmo
 * Depois uma classe 'Agencia' nela ficará o banco, o nome da agencia
 * e o número da agência.
 * Criar uma outra classe para o 'Cliente', contendo o nome, cpf e o endereço.
 * Por fim, uma outra classe para 'Conta' o númro da conta, o saldo,
 * a agência e o cliente.
 * Crie um método, "imprime", dentro da classe Conta onde exiba todos os dados 
 * que forem armazenados dentro de agencia, cliente e conta
 * Nesta classe, crie uma instância de Banco e uma instancia de Agencia
 * Setar os atributos do banco e da agencia com o banco criado
 * Criar uma instância de Cliente e coloque valores nos dados
 * Criar uma instância de Conta, coloque os valores nos mesmo e chame o
 * método "imprime" para exibir os dados no console
 * Crie o metodo sacar e depositar dentro da classe conta e controle o valor
 * do saldo, chame estes metodos nessa classe informando os valores para as
 * operações.
 */
public class TesteClasses {
	public static void main(String[] args) {
		Banco banco = new Banco();
		banco.numero = 567;
		banco.nome = "Banco Bradesco";
		Agencia agencia = new Agencia();
		agencia.numero = "0876";
		agencia.nome = "Paraiso";
		agencia.banco = banco;
		Cliente cliente = new Cliente();
		cliente.nome = "Rafael Onassis Nicolau";
		cliente.cpf = "657.980.976-87";
		Conta conta = new Conta();
		conta.numero = "08769-87";
		conta.saldo = 1987.07;
		conta.agencia = agencia;
		conta.cliente = cliente;
		conta.imprime();
		conta.saque(500);
		conta.imprime();
		conta.deposito(550);
		conta.imprime();
	}
}