import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
   
		
		String p1 = "Rodrygo";

		
		List<String> participantes = Arrays.asList("Jo�o", "Maria", "Carlos");
        EventoUnico e1 = new EventoUnico("Copa do Mundo", "Brasil x Fran�a", LocalDate.of(2026, 7, 12), 
        		LocalDate.of(2026, 7, 12), 
        		"Est�dio do Maracan�", 
        		participantes);
		
        System.out.println(e1);
        
        e1.adicionarParticipante(p1);
        e1.removerParticipante("Maria");
        
        e1.imprimirParticipantes();
        
        EventoRecorrente e2 = new EventoRecorrente("Concerto", "S� m�sica cl�ssica"," Semanal",
                LocalDate.of(2024, 4, 1),
                LocalDate.of(2024, 4, 1),
                "Setor Universit�rio",
                participantes
            );
        
        System.out.println(e2);
        
        EventoPeriodico e3 = new EventoPeriodico("Fut do Z�", "Fut 8x8", "Semanal",
                LocalDate.of(2024, 04, 02), 
                LocalDate.of(2024, 04, 02), 
                "Jardim Guanabara",
                participantes
            );
        
        e3.setDiasDaSemana((Arrays.asList(DiaSemana.TER�A, DiaSemana.SEXTA)));
        e3.imprimirEvento();
        System.out.println(e3);
	}
	
	
}