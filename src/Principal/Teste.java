package Principal;

import java.util.Arrays;

import Municipio.Equipe;
import Municipio.Especialidade;
import Municipio.FuncionarioZeladoria;
import Municipio.Municipe;
import Municipio.Zeladoria;
import Negocio.RelatarProblema;
import ValidacaoDadosNegocio.ExcecaoNaoPodeSerNulo;
import ValidacaoDadosNegocio.ExcecaoTamanhoMinimo;
import service.membro.MembrosService;
import service.membro.ValidarNecessidadeTecnicoGeral;
import service.municipe.AberturaChamadoConserto;
import service.municipe.ConsertoNaoNecessario;
import service.municipio.EquipeResponsavelConserto;

public class Teste {
	public static void main(String[] args) throws ExcecaoNaoPodeSerNulo, ExcecaoTamanhoMinimo, ConsertoNaoNecessario {
		
		
		Municipe m1 = new Municipe("kleberson", "438.036.548-40", "santos@gmail.com", "471089050", "10");
		
		RelatarProblema posteSemLuz = new RelatarProblema("Mogi Das Cruzes", "vila do Ouro",
				"rus três de fevereiro", "014", "Poste sem luz ", "xxxxxxxxxxxxxxxxxxx");
		
		m1.addRelatarProblea(posteSemLuz);
		System.out.println("Status do problema : " + posteSemLuz.isStatusProblema());
		
		
		System.out.println("Tipo de problema : " + posteSemLuz.getDescricaoProblema());
		System.out.println("Relatado por : " + m1.getUsuario().getNome());
		
	
		Zeladoria zelador = new Zeladoria("Zeca Pagodinho");
		zelador.addMunicipe(m1);
		System.out.println(zelador.toString());
		
		AberturaChamadoConserto abertura = new AberturaChamadoConserto();
		abertura.abeturaChamado(m1, zelador, true);
		
		FuncionarioZeladoria funcionarioConserto = new FuncionarioZeladoria("picles", "438.036.548-40", "picles@gmail.com",
																			"471089050","40", zelador);
		
		funcionarioConserto.setFuncionarosDisponiveis(true);
		
		EquipeResponsavelConserto conserto = new EquipeResponsavelConserto();
		if(conserto.equipeResponsavel(zelador, funcionarioConserto) == true) {
			
			Equipe equipe = new Equipe();
			equipe.inserirMembroEquipe(Especialidade.ELETRICISTA);
			equipe.inserirMembroEquipe(Especialidade.TECNICO_GERAL);
			
			MembrosService ms = new MembrosService(Arrays.asList(new ValidarNecessidadeTecnicoGeral()));
			if(equipe.isLiberarEquipe() == true) {
				System.out.println("Equipe Liberada Para Trabalho");
			
			
			System.out.println("equipe criada, acessando o local do conserto \n\n");
			System.out.println(equipe.localDoConserto(m1.getRelatarProblema(), 0));
			
			}
			
			boolean problemaResolvido = equipe.solucionarProblema(m1, m1.getRelatarProblema(), 0, true);
			System.out.println("O problema foi resolvido " + problemaResolvido);
			
		}
		
		else {
			System.out.println("não é necessario fazer nada");
		}
		
		
		System.out.println("Status true problema resolvido " + m1.isConsertou());
		System.out.println(m1.toString());
		
	}
}
