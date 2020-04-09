package Exercicio5;

public class TestaHeranca {

    public static void main(String args[]) {
        Banco banco = new Banco("Bradesco Bank", 1000);
        Agencia ag1 = new Agencia("001", banco);
        
        Cliente cliente1 = new Cliente("Cliente 1", "1232323");
        
        Conta conta = new Conta(500, "741852", cliente1, ag1); // conta comum
        conta.saque(560);
        conta.imprimeDados();

       /* 1. Instancie uma conta especial na variávei abaixo. 
        * 2. Realize 1 saque na conta especial cujo valor exceda o saldo mas nao ultrapasse o limite.
        * 3. Imprima os dados da conta especial
        * 4. Realize 1 saque na conta especial cujo valor ultrapasse o saldo e o limite.
        * 5. Imprima os dados da conta especial 
        */
        
        ContaEspecial contaEsp1 = null; // 1a. conta especial
        
        
        //analise o resultado do código abaixo após a definição da herança
        Conta conta2 = contaEsp1;
        conta2.imprimeDados();
    }
}
