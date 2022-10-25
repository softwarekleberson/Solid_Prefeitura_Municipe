package Endereco;

public class Endereco {
	
	private String cidade;
	private String bairro;
	private String rua;
	private String numero;
	
	public Endereco(String cidade, String bairro, String rua, String numero){
		
		this.cidade = cidade;
		this.bairro = bairro;
		this.rua = rua;
		this.numero = numero;
		
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro){
		this.bairro = bairro;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero){
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Endereco [cidade=" + cidade + ", bairro=" + bairro + ", rua=" + rua + ", numero=" + numero + "]";
	}

}
