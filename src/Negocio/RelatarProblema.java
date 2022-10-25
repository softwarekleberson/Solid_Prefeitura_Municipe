package Negocio;

import java.util.ArrayList;
import java.util.List;

import Endereco.Endereco;
import Municipio.Equipe;
import Municipio.FuncionarioZeladoria;
import Municipio.Municipe;
import ValidacaoDadosNegocio.ExcecaoNaoPodeSerNulo;
import ValidacaoDadosNegocio.ExcecaoTamanhoMinimo;
import ValidacaoDadosNegocio.Validador;


public class RelatarProblema {
	
	private static final int Tamanho_Minimo_Variavel = 3;
	private static final int Tamanho_Minimo_URL = 10;
	
	private String descricaoProblema;
	private String urlFoto;
	private boolean statusProblema;
	
	private Endereco endereco;
	private Municipe municipe;
	private FuncionarioZeladoria funcionarioZeladoria;
	
	private List<Equipe> equipe = new ArrayList<>();
	

	public RelatarProblema(String cidade, String bairro, String rua, String numero,
			String descricaoProblema, String urlFoto) throws ExcecaoNaoPodeSerNulo, ExcecaoTamanhoMinimo {
		
		setDescricaoProblema(descricaoProblema);
		setFoto(urlFoto);
		
		this.statusProblema = true;		
		this.endereco = new Endereco(cidade, bairro, rua, numero);
		
	}

	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public Municipe getMunicipe() {
		return municipe;
	}

	public void setMunicipe(Municipe municipe) {
		this.municipe = municipe;
	}

	public String getDescricaoProblema() {
		return descricaoProblema;
	}
	
	public void setDescricaoProblema(String tipoProblema) throws ExcecaoNaoPodeSerNulo, ExcecaoTamanhoMinimo {
		Validador.validarNaoNulo(tipoProblema, "tipoProblema");
		this.descricaoProblema = Validador.validarTamanhoMinimo(tipoProblema, Tamanho_Minimo_Variavel, "tipoProblema");
	}
	
	public String getFoto() {
		return urlFoto;
	}
	
	public void setFoto(String foto) throws ExcecaoNaoPodeSerNulo, ExcecaoTamanhoMinimo {
		Validador.validarNaoNulo(foto, "foto");
		this.urlFoto = Validador.validarTamanhoMinimo(foto, Tamanho_Minimo_URL, "foto");
	}

	public boolean isStatusProblema() {
		return statusProblema;
	}

	public void setStatusProblema(boolean statusProblema) {
		this.statusProblema = statusProblema;
	}

	public FuncionarioZeladoria getFuncionarioZeladoria() {
		return funcionarioZeladoria;
	}

	public void setFuncionarioZeladoria(FuncionarioZeladoria funcionarioZeladoria) {
		this.funcionarioZeladoria = funcionarioZeladoria;
	}

	public List<Equipe> getEquipe() {
		return equipe;
	}

	public void setEquipe(List<Equipe> equipe) {
		this.equipe = equipe;
	}

	public void addEquipe(Equipe obj) {
		equipe.add(obj);
	}
	
	public void removeEquipe(Equipe obj) {
		equipe.remove(obj);
	}

	@Override
	public String toString() {
		return "RelatarProblema [descricaoProblema=" + descricaoProblema + ", urlFoto=" + urlFoto + ", statusProblema="
				+ statusProblema + ", endereco=" + endereco + ", municipe=" + municipe + ", funcionarioZeladoria="
				+ funcionarioZeladoria + ", equipe=" + equipe + "]";
	}

		
}
