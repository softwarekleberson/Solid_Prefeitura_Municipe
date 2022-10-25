package Municipio;

import java.time.LocalDate;

public class Membro {

	private Especialidade especialidade;
	private LocalDate entradaEquipe;
	
	public Membro(Especialidade especialidade) {
		this.especialidade = especialidade;
		this.entradaEquipe = LocalDate.now();
	}
	
	public Especialidade getEspecialidade() {
		return especialidade;
	}
	
	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}
	
	public LocalDate getEntradaEquipe() {
		return entradaEquipe;
	}
	
	public void setEntradaEquipe(LocalDate entradaEquipe) {
		this.entradaEquipe = entradaEquipe;
	}

	@Override
	public String toString() {
		return "Membro [especialidade=" + especialidade + ", entradaEquipe=" + entradaEquipe + "]";
	}
	
	
}
