package Exercicio9;

import java.util.ArrayList;
import java.util.List;

//import Exercicio6solucao.Tributavel;

public class TesteList {

    public static void main(String args[]) {
        Cliente c1 = new Cliente("Rafael", "37634545", "425.425.425-10");
        Cliente c2 = new Cliente("Eder", "38634587", "425.485.425-59");
        Cliente c3 = new Cliente("Caio", "31634541", "325.425.425-10");
        Cliente c4 = new Cliente("Victor", "37638945", "896.425.201-10");
        
        Cliente c5 = new Cliente();
        c5.setNome("David");
        c5.setCpf("120.478.457-10");
        c5.setTelefone("45632210");
        
        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);
        clientes.add(c4);
        clientes.add(c5);
        
        
        /*
         *  1. Coloque todos os clientes (Objetos) acima em um ArrayList, 
         *  sem mexer no código acima.
         *  
         */
        

        
        /*
         *  2. Imprima estes clientes no console
         */
        
        System.out.println(clientes);
        
        
        /*
         *  3. Remova o cliente de numero 4 e imprima o resultado no console novamente.
         */
        for(int i = 0; i < clientes.size(); i++)
        {
            Cliente removerCliente = clientes.get(i);

            if(removerCliente.getNome().equals("Victor"))
            {
                clientes.remove(removerCliente);
                break;
            }
        }

        /*
         *  4. Imprima somente os nomes dos clientes.
         */
        System.out.println(clientes);
        
   
    }
}