package service.membro;

import Municipio.Especialidade;

public interface ValidacaoMembroResponsavel {

	void validar(Especialidade especialidade, boolean tecnicoGeral) throws NecessarioTecnicoGeral;
}
