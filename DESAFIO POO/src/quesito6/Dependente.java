package quesito6;

public class Dependente {
	
	
	private int sequencial;
	private String nomeCompleto;
	private Integer sexo;
	private String dataDeNascimento;
	private boolean participaPlano;
	
	
	public int getSequencial() {
		return sequencial;
	}
	public void setSequencial(int sequencial) {
		this.sequencial = sequencial;
	}
	
	
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	
	
	public Integer getSexo() {
		return sexo;
	}
	public void setSexo(Integer sexo) {
		this.sexo = sexo;
	}
	
	
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	
	
	public boolean isParticipaPlano() {
		return participaPlano;
	}
	public void setParticipaPlano(boolean participaPlano) {
		this.participaPlano = participaPlano;
	}
	
	

}
