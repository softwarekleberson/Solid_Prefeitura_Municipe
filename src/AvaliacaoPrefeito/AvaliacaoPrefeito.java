package AvaliacaoPrefeito;


import Municipio.Municipe;

public class AvaliacaoPrefeito{
	
	public static int QTDAVALIADORES = 0;
	public static double NOTAPARAPREFEITO = 0;
	
	private String nome;
	private Municipe municipe;
	

	public AvaliacaoPrefeito(String nome, double nota) {
		
		this.nome = nome;
		
		QTDAVALIADORES ++;
		avalicaoPrefeito(nota);
	}
	
	private void avalicaoPrefeito(double nota) {
		NOTAPARAPREFEITO += nota;
		NOTAPARAPREFEITO /= QTDAVALIADORES;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Municipe getMunicipe() {
		return municipe;
	}

	public void setMunicipe(Municipe municipe) {
		this.municipe = municipe;
	}

	public static double getNOTAPARAPREFEITO() {
		return NOTAPARAPREFEITO;
	}

	public static void setNOTAPARAPREFEITO(double nOTAPARAPREFEITO) {
		NOTAPARAPREFEITO = nOTAPARAPREFEITO;
	}

	
	
}


