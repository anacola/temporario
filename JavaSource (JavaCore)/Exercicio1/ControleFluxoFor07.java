package Exercicio1;
/*
 * 
 * Imprima uma tabela de numeros entre 100 e 200 seguindo o seguinte formato
 * 
 * - Se o numero for divisivel por 2 imprimir:
 *   <numero> e divisivel por 2 
 *  
 * - Se o numero for divisivel por 3 imprimir:
 *   <numero> e divisivel por 3 
 * 
 * - Se o numero for divisivel por 2 e 3  imprimir:
 *   <numero> e divisivel por 2 e divisivel por 3 e portanto e divisivel por 6
 * 
 * Utilize os laços de repetições para navegar do limite inferior ate o superior. 
 */
class ControleFluxoFor07 {

    public static void main(String[] args) {
    	int resto2, resto3;
    	
    	for(int i = 100;  i<=200; i++){
    		resto2=i%2;
    		resto3=i%3;
    				
    		if(resto2 == 0 && resto3 ==0) {
    			System.out.println(i +" é divisivel por 2 e por 3");
    		} else if (resto2 == 0) {
    			System.out.println(i + " é divisivel por 2");
    		}else if( resto3 == 0) {
    			System.out.println(i + " é divisivel por 3");
    		}
    
    	}
    }
}
