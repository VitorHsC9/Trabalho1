import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Evento {

	private String titulo;
	private String descricao;
	private LocalDate dataDeInicio;
	private LocalDate datafinal;
	private String local;
	private List<String> participantes = new ArrayList<>();

	public Evento(String titulo, String descricao, LocalDate dataDeInicio, LocalDate datafinal, String local,
			List<String> participantes) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.dataDeInicio = dataDeInicio;
		this.datafinal = datafinal;
		this.local = local;
		this.participantes = participantes;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getDataDeInicio() {
		return dataDeInicio;
	}

	public void setDataDeInicio(LocalDate dataDeInicio) {
		this.dataDeInicio = dataDeInicio;
	}

	public LocalDate getDatafinal() {
		return datafinal;
	}

	public void setDatafinal(LocalDate datafinal) {
		this.datafinal = datafinal;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public List<String> getParticipantes() {
		return participantes;
	}

	public void setParticipantes(List<String> participantes) {
		this.participantes = participantes;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataDeInicio, datafinal, descricao, local, participantes, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Evento other = (Evento) obj;
		return Objects.equals(dataDeInicio, other.dataDeInicio) && Objects.equals(datafinal, other.datafinal)
				&& Objects.equals(descricao, other.descricao) && Objects.equals(local, other.local)
				&& Objects.equals(participantes, other.participantes) && Objects.equals(titulo, other.titulo);
	}

	@Override
	public String toString() {
		return "Evento [Título = " + titulo + ", Descrição = " + descricao + ", Início =" + dataDeInicio
				+ ", Fim =" + datafinal + ", Local = " + local + ", Participantes =" + participantes + "]";
	}
	
	
    public void adicionarParticipante(String participante) {
        if (!participantes.contains(participante)) {
            participantes.add(participante);
        } else {
            System.out.println("O participante já está na lista.");
        }
    }


    public void removerParticipante(String participante) {
        if (participantes.contains(participante)) {
            participantes.remove(participante);
        } else {
            System.out.println("O participante não está na lista.");
        }
    }

   public void imprimirParticipantes() {
        for (String participante : participantes) {
            System.out.println(participante);
        }
    }
	
   public void imprimirEvento() {
	   System.out.println("Evento [Título = " + titulo + ", Descrição = " + descricao + ", Início =" + dataDeInicio
				+ ", Fim =" + datafinal + ", Local = " + local + ", Participantes =" + participantes + "]");
   }
	
}
