import java.time.LocalDate;

import java.util.List;

public class EventoRecorrente extends Evento{

	private String frequencia;
	
	public EventoRecorrente(String titulo, String descricao, String frequencia, LocalDate dataDeInicio, LocalDate datafinal, String local,
			List<String> participantes) {
		super(titulo, descricao, dataDeInicio, datafinal, local, participantes);
		this.frequencia = frequencia;
	}

	public String getFrequencia() {
		return frequencia;
	}

	public void setFrequencia(String frequencia) {
		this.frequencia = frequencia;
	}


}
