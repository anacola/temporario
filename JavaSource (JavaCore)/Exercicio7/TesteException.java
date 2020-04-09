package Exercicio7;

import Exercicio7solucao.SaldoInsuficienteException;

class TesteException {

    public static void main(String args[]) {
        
		/*
    	 * 1) Instancie o banco, inserindo o nome e numero.
    	 * 2) Instancie a agencia, informando numero e o banco criado.
    	 * 3) Instancie o cliente, de valor aos atributos dele.
    	 * 4) Instancie a Conta Especial com o nome "contaEspecial", de valor aos atributos dela, o saldo deve ser de $ 2000 e o limite de 500.
    	 * 5) Instancie a Conta Poupanca com o nome "contaPoupanca", de valor aos atributos dele, o saldo deve ser de $ 600.
    	*/
        
    	
    	/*
    	 * 6) Trate as excess�es.
    	 */
        contaEspecial.saque(2950.0);
        contaPoupanca.saque(340.0);
        
        /*
         * 7) Chame o metodo que imprime os dados no console da classe ContaEspecial
         * 8) Chame o metodo que imprime os dados no console da classe ContaPoupanca
         * 9) Execute. Verique se uma das excess�es foi tratada no console.
         */

		

		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		/*
		 * 10) Ap�s isso altere o valor do limite da conta especial para $ 3000 
		 * 11) Saque o mesmo valor dado acima (2950.0) e imprima os dados da
		 * conta especial novamente.
		 * 12) Execute e verifique que se a excess�o n�o precisou mais ser tratada
		 * e se a conta ficou com saldo negativo
		 */
		
    }
}
