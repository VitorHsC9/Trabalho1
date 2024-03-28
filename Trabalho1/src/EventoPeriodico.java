import java.time.LocalDate;
import java.util.ArrayList;

import java.util.List;

public class EventoPeriodico extends EventoRecorrente {
 
	private List<DiaSemana> diasDaSemana = new ArrayList<>();

	public EventoPeriodico(String titulo, String descricao, String frequencia, LocalDate dataDeInicio, LocalDate datafinal, String local,
			List<String> participantes) {
		super(titulo, descricao, local, dataDeInicio, datafinal, local, new ArrayList<>(participantes));
	       for (DiaSemana dia : diasDaSemana) {
	            this.diasDaSemana.add(dia);
	        }
	}

	public List<DiaSemana> getDiasDaSemana() {
		return diasDaSemana;
	}

	public void setDiasDaSemana(List<DiaSemana> diasDaSemana) {
		this.diasDaSemana = diasDaSemana;
	}

	@Override
	public String toString() {
		return "EventoPeriodico [diasDaSemana=" + diasDaSemana + "]";
	}
	
	
 
}
