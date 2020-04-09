/*
 * FomataDatas.java
 *
 */
package Exercicio8;


// 1. declare imports para as classes
// LocalDate, LocalTime, LocalDateTime e DateTimeFormatter

public class FomataDatas {

    public static void main(String[] args) {
        // 2. instancie um objeto LocalDate com a data 03/03/1997
        LocalDate data = null;
        // 3. instancie um objeto LocalTime para a hora 18h57m0s        
        LocalTime hora = null;
        // 4. crie um objeto LocalDateTime combinando os objetos LocalDate e LocalTime criados anteriormente
        LocalDateTime dataCompleta = null;
        System.out.println("data d1: " + dataCompleta);
        // 5. construa um objeto de formatacao para obter
        // a seguinte formatacao: 03/Mar/97 e guarde na variavel formatador
        DateTimeFormatter formatador = null;
        System.out.println("data formatada: " + dataCompleta.format(formatador));
        // 6. Constru mais um objeto de formatação da data com a seguinte formatação:
        // 03/03/1997, imprima valor.
        
        
        // Abaixo consta data atual sendo formatada
        System.out.println("data atual formatada: " + LocalDate.now().format(formatador));
    }
}
