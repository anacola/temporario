package Exercicio0;
/*
1) Analise o código.

2) Inicialize as variáveis declaradas com valores válidos.

3) Defina uma variável idade do tipo para armazenar a idade da pessoa e inicialize.

4) Atenda as seguintes especificações:
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
 
5) Após a impressão do texto, se a idade da pessoa estiver entre 16 e 18 anos, 
   imprimir “Não esqueça de tirar seu título de eleitor!”.
6) Compile e execute a classe. Faça alteração nos valores das variáveis para 
   perceber a mudança nos resultados.
    
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
	
	// Preparação do texto a ser impresso
	String textNome = "O Senhor(a) " + nome + ", ";
	String textRg = "portador(a)do rg de numero " + rg + ", \n";
	String textNasc = "nascido em " + dataNascimento + ", ";
	String textSexo = " do sexo " + sexo + ", ";
	String text$ = " esta registrado com o salario de R$ " + salario;
	
	// Impressão do texto
	System.out.println(textNome + textRg + textNasc + textSexo + text$);
	
	//Impressão do texto relativo à idade, se for o caso.
    }
}
