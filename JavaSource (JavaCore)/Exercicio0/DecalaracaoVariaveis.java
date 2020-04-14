package Exercicio0;

import java.util.Scanner;

/*
1) Analise o c�digo.

2) Inicialize as vari�veis declaradas com valores v�lidos.

3) Defina uma vari�vel idade do tipo para armazenar a idade da pessoa e inicialize.

4) Atenda as seguintes especifica��es:
 - Quando o sexo for masculino (M), deve ser impresso:
     O Senhor <nome da pessoa>, portador do rg... 
  - Quando o sexo for feminino (F), deve ser impresso:
     A Senhora <nome da pessoa>, portadora do rg ..
  - Quando o sexo for invalido (diferente de F ou M), deve ser impresso:
     O Senhor(a) <nome da pessoa>, portador(a)
  - Quando a pessoa for CLT, deve ser impresso:
     esta registrado com o salario de R$ <salario>
  - Quando a pessoa for Autonoma, deve ser impresso:
     foi contratado pelo valor de R$ <salario>
 
5) Ap�s a impress�o do texto, se a idade da pessoa estiver entre 16 e 18 anos, 
   imprimir �N�o esque�a de tirar seu t�tulo de eleitor!�.
6) Compile e execute a classe. Fa�a altera��o nos valores das vari�veis para 
   perceber a mudan�a nos resultados.
    
*/
public class DecalaracaoVariaveis {

    public static void main(String[] args) {
    	
    	Scanner entrada = new Scanner(System.in);
	// Declaracao das variaveis
		String nome, dataNascimento, rg, text$;
		int idade;
		char sexo; // UTILIZE 'M' para MASCULINO e 'F' para FEMININO
		double salario;
		boolean clt;
		// Inicializacao
		System.out.println("Insira seu nome:");
	    nome = entrada.nextLine();
	    
	    System.out.println("Insira sua data de nascimento:");
	    dataNascimento = entrada.next();
	    
	    System.out.println("Qual sua idade?");
	    idade = entrada.nextInt();
	    
	    System.out.println("Insira seu RG:");
	    rg = entrada.next();
	    
	    System.out.println("Insira seu sexo: F ou M:");
	    sexo = entrada.next().charAt(0);
	    
	    System.out.println("Insira seu salario:");
	    salario = entrada.nextDouble();
	    
	    entrada.nextLine();
	    
	    System.out.println("Voc� � CLT? (true/false)");
	    clt = entrada.nextBoolean();
    
    
    
	   if(sexo == "F".charAt(0)){
			String textNome = "A Senhora " + nome + ", ";
			String textRg = "portadora do rg de numero " + rg + ", \n";
			String textNasc = "nascida em " + dataNascimento + ", ";
			String textSexo = " do sexo " + sexo + ", ";
			if (clt == true) {
				text$ = " esta registrada com o salario de R$ " + salario;
			}else {
				text$ = " esta contratada com o salario de R$ " + salario;
			}
			
			System.out.println(textNome + textRg + textNasc + textSexo + text$);
	
	 
	   } else if(sexo == "M".charAt(0)){
			String textNome = "O Senhor " + nome + ", ";
			String textRg = "portador do rg de numero " + rg + ", \n";
			String textNasc = "nascido em " + dataNascimento + ", ";
			String textSexo = " do sexo " + sexo + ", ";
			if (clt == true) {
				text$ = " esta registrado com o salario de R$ " + salario;
			}else {
				text$ = " esta contratado com o salario de R$ " + salario;
			}
			System.out.println(textNome + textRg + textNasc + textSexo + text$);
	 
	   } else {
			String textNome = "O Senhor(a) " + nome + ", ";
			String textRg = "portador(a)do rg de numero " + rg + ", \n";
			String textNasc = "nascido em " + dataNascimento + ", ";
			String textSexo = " do sexo " + sexo + ", ";
			if (clt == true) {
				text$ = " esta registrado(a) com o salario de R$ " + salario;
			}else {
				text$ = " esta contratado(a) com o salario de R$ " + salario;
			}
		
			System.out.println(textNome + textRg + textNasc + textSexo + text$);
	  }
	   
	 //Impress�o do texto relativo � idade, se for o caso.
	   
	   if (idade>= 16 && idade<=18) {
		   System.out.println("N�o esque�a de tirar seu t�tulo de eleitor!");
	   }
	}
}
