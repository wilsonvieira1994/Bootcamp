package quesito9;

public class Adotante {

	private int id;
	private String name;
	private String telefoneFixo;
	private String telefoneCelular;
	private String email;
	private Endereco endereco;
	private boolean impedimento;
	private String motivoImpedimento;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getTelefoneFixo() {
		return telefoneFixo;
	}
	public void setTelefoneFixo(String telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
	}
	
	
	public String getTelefoneCelular() {
		return telefoneCelular;
	}
	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	public boolean isImpedimento() {
		return impedimento;
	}
	public void setImpedimento(boolean impedimento) {
		this.impedimento = impedimento;
	}
	
	
	public String getMotivoImpedimento() {
		return motivoImpedimento;
	}
	public void setMotivoImpedimento(String motivoImpedimento) {
		this.motivoImpedimento = motivoImpedimento;
	}
	
	
}
