package Exercicio3;


public class TestaConta {

    public static void main(String[] args) {
    	Banco banco = new Banco();
    	banco.setNome("Bradesco");
    	banco.setNumero(908);
    	
    	Agencia agencia = new Agencia();
    	agencia.inicializaAgencia("123", banco);
    	
    	Cliente cliente = new Cliente();
    	cliente.inicializaCliente("Ana Carolina","123.456.789-00");
    	cliente.imprimeDados();
    			
    	Conta conta = new Conta();
    	conta.inicializaConta(1000, "1234", agencia, cliente);
    			
    	conta.deposito(500);
		conta.imprimeDados();
		conta.saque(600);
		conta.imprimeDados();
		conta.saque(900);
		conta.imprimeDados();
    	
        // Criar um objeto do tipo Conta
        // Usar o metodo inicializaConta para fazer a inicializacao do objeto criado
        // executar um deposito
        // Imprimir o saldo apos o deposito
        // executar um saque cujo valor seja menor que o saldo
        // Imprimir o saldo apos o deposito
        // executar uma retirada cujo valor seja maior que o saldo
        // Imprimir o saldo apos o deposito
    }
}
