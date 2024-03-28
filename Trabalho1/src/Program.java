import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
   
		
		String p1 = "Rodrygo";

		
		List<String> participantes = Arrays.asList("João", "Maria", "Carlos");
        EventoUnico e1 = new EventoUnico("Copa do Mundo", "Brasil x França", LocalDate.of(2026, 7, 12), 
        		LocalDate.of(2026, 7, 12), 
        		"Estádio do Maracanã", 
        		participantes);
		
        System.out.println(e1);
        
        e1.adicionarParticipante(p1);
        e1.removerParticipante("Maria");
        
        e1.imprimirParticipantes();
        
        EventoRecorrente e2 = new EventoRecorrente("Concerto", "Só música clássica"," Semanal",
                LocalDate.of(2024, 4, 1),
                LocalDate.of(2024, 4, 1),
                "Setor Universitário",
                participantes
            );
        
        System.out.println(e2);
        
        EventoPeriodico e3 = new EventoPeriodico("Fut do Zé", "Fut 8x8", "Semanal",
                LocalDate.of(2024, 04, 02), 
                LocalDate.of(2024, 04, 02), 
                "Jardim Guanabara",
                participantes
            );
        
        e3.setDiasDaSemana((Arrays.asList(DiaSemana.TERÇA, DiaSemana.SEXTA)));
        e3.imprimirEvento();
        System.out.println(e3);
	}
	
	
}