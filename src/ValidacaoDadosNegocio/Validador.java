package ValidacaoDadosNegocio;

public class Validador {
	
	public static String validarNaoNulo(String valor, String nome) throws ExcecaoNaoPodeSerNulo {
		if(null == valor) 
			throw new ExcecaoNaoPodeSerNulo("o campo " + nome + "nao pode ser nulo ");
		return valor;
	}
	
	public static String validarTamanhoMinimo(String valor, int minimo, String nome)throws ExcecaoTamanhoMinimo{
		valor = valor.trim();
		
		if(valor.length() < minimo) 
			throw new ExcecaoTamanhoMinimo("o campo " + nome  + "precisa ser maior");
		return valor;
	}
}
