package service.municipio;

import Municipio.FuncionarioZeladoria;
import Municipio.Zeladoria;
import service.municipe.ConsertoNaoNecessario;

public class EquipeResponsavelConserto {

	public boolean equipeResponsavel(Zeladoria zeladoria, FuncionarioZeladoria funcionarioZeladoria) throws ConsertoNaoNecessario {
		
		if(!(zeladoria.isAvisarFuncionarioZelador() == true  && funcionarioZeladoria.isFuncionarosDisponiveis() == true)) {
			throw new ConsertoNaoNecessario("Conserto n�o necessario");
		}
		
		return funcionarioZeladoria.equipeResponsavelPeloConserto(true);
	}
}
