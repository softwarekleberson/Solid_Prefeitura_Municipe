package service.membro;

import java.util.List;

import Municipio.Equipe;
import Municipio.Especialidade;

public class MembrosService {

	private List<ValidacaoMembroResponsavel> validacao;
	
	public MembrosService(List<ValidacaoMembroResponsavel> validacao) {
		this.validacao = validacao;
	}
	
	public void membrosPossuiemRequesitosNecessarios(Equipe equipe, Especialidade especialidade, boolean tecnicoGeral) {
		
		this.validacao.forEach(v -> {
			try {
				v.validar(especialidade, tecnicoGeral);
			} catch (NecessarioTecnicoGeral e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		equipe.setLiberarEquipe(true);
	}
	
}
