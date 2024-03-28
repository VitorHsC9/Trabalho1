import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EventoUnico extends Evento{

	public EventoUnico(String titulo, String descricao, LocalDate dataDeInicio, LocalDate datafinal, String local,
			List<String> participantes) {
		super(titulo, descricao, dataDeInicio, datafinal, local, new ArrayList<>(participantes));
		
	}

	
}
