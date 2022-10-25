package service.membro;

import Municipio.Especialidade;

public class ValidarNecessidadeTecnicoGeral implements ValidacaoMembroResponsavel {

	@Override
	public void validar(Especialidade especialidade, boolean tecnicoGeral) throws NecessarioTecnicoGeral {
		
		Especialidade responsavelGeral = especialidade.TECNICO_GERAL;
		
		if(!(responsavelGeral == Especialidade.TECNICO_GERAL && tecnicoGeral == true)) {
			throw new NecessarioTecnicoGeral("Necessario Tecnico Geral Equipe");
		}
		
	}

}
