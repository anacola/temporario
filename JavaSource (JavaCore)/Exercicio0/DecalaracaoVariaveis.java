package Exercicio0;
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
	// Declaracao das variaveis
	String nome;
	String dataNascimento;
	String rg;
	char sexo; // UTILIZE 'M' para MASCULINO e 'F' para FEMININO
	double salario;
	boolean clt;
	// Inicializacao
	
	// Prepara��o do texto a ser impresso
	String textNome = "O Senhor(a) " + nome + ", ";
	String textRg = "portador(a)do rg de numero " + rg + ", \n";
	String textNasc = "nascido em " + dataNascimento + ", ";
	String textSexo = " do sexo " + sexo + ", ";
	String text$ = " esta registrado com o salario de R$ " + salario;
	
	// Impress�o do texto
	System.out.println(textNome + textRg + textNasc + textSexo + text$);
	
	//Impress�o do texto relativo � idade, se for o caso.
    }
}
