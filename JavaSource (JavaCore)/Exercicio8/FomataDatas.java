package Exercicio8;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

// 1. declare imports para as classes
// LocalDate, LocalTime, LocalDateTime e DateTimeFormatter

public class FomataDatas {

    public static void main(String[] args) {
        // 2. instancie um objeto LocalDate com a data 03/03/1997
        LocalDate data = LocalDate.of(1997, 3, 3);
        System.out.println("data: " + data);
        // 3. instancie um objeto LocalTime para a hora 18h57m0s        
        LocalTime hora = LocalTime.of(18, 57);
        System.out.println("hora: " + hora);
        // 4. crie um objeto LocalDateTime combinando os objetos LocalDate e LocalTime criados anteriormente
        LocalDateTime dataCompleta = LocalDateTime.of(data, hora);
        System.out.println("data d1: " + dataCompleta);
        // 5. construa um objeto de formatacao para obter
        // a seguinte formatacao: 03/Mar/97 e guarde na variavel formatador
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        System.out.println("data formatada: " + dataCompleta.format(formatador));
        // 6. Constru mais um objeto de formata��o da data com a seguinte formata��o:
        // 03/03/1997, imprima valor.
        
        DateTimeFormatter dataFormatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("data formatada: " + dataCompleta.format(dataFormatador));
        
        // Abaixo consta data atual sendo formatada
        System.out.println("data atual formatada: " + LocalDate.now().format(dataFormatador));
    }
}
