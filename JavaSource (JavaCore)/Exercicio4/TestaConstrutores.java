package Exercicio4;

import java.util.Set;

/*
 * 1) Construa um objeto da classe Conta com cada construtor e chame o metodo imprimeDados 
 * 2) Construa um objeto da classe Cliente e chame o metodo imprimeDados
 * 
 */

 
public class TestaConstrutores {

    public static void main(String[] args) {
    	Banco banco = new Banco();
    	banco.nome = "Bradesco";
    	banco.numero = 123;
    	banco.imprime();

    	Cliente cliente = new Cliente();
    	cliente.nome = "Filipe Lourenço";
    	cliente.cpf= "12.456.789-00";
    	cliente.imprimeDados();
    	
    	Agencia agencia = new Agencia(null, banco);
    	agencia.setNumero("0009");
    	agencia.setBanco(banco);
    	agencia.imprimeDados();
    	
    	Conta conta = new Conta();
    	conta.setAgencia(agencia);
    	conta.setNumero("1345");
    	conta.setSaldo(567);
    	conta.setTitular(cliente);
    	conta.imprimeDados();
    	
    }
}
