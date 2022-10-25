package service.municipe;

import Municipio.Municipe;
import Municipio.Zeladoria;

public class AberturaChamadoConserto {

	public void abeturaChamado(Municipe municipe ,Zeladoria zeladoria, boolean aberturaChamada) throws ConsertoNaoNecessario {
		
		if(aberturaChamada != true) {
			throw new ConsertoNaoNecessario("Abertura não necessaria para conserto");
		}
		
		zeladoria.setAvisarFuncionarioZelador(true);
		municipe.aberturaConserto(zeladoria);
		
	}
}
