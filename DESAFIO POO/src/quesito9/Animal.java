package quesito9;

import java.util.Date;

public class Animal {
	private int id;
	private String name;
	private char tipo;
	private String rga;
	private Date dataNascimento;
	private Raca raca;
	private char genero;
	private String deficiencia;
	private boolean vacinado;
	private boolean cadastrado;
	private double tamanho;
	private double peso;
	private String temperamento;
	private String observacao;
	private Date dataResgate;
	
	
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
	
	
	public char getTipo() {
		return tipo;
	}
	public void setTipo(char tipo) {
		this.tipo = tipo;
	}
	
	
	public String getRga() {
		return rga;
	}
	public void setRga(String rga) {
		this.rga = rga;
	}
	
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
	public Raca getRaca() {
		return raca;
	}
	public void setRaca(Raca raca) {
		this.raca = raca;
	}
	
	
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	
	
	public String getDeficiencia() {
		return deficiencia;
	}
	public void setDeficiencia(String deficiencia) {
		this.deficiencia = deficiencia;
	}
	
	
	public boolean isVacinado() {
		return vacinado;
	}
	public void setVacinado(boolean vacinado) {
		this.vacinado = vacinado;
	}
	
	
	public boolean isCadastrado() {
		return cadastrado;
	}
	public void setCadastrado(boolean cadastrado) {
		this.cadastrado = cadastrado;
	}
	
	
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	public String getTemperamento() {
		return temperamento;
	}
	public void setTemperamento(String temperamento) {
		this.temperamento = temperamento;
	}
	
	
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	
	public Date getDataResgate() {
		return dataResgate;
	}
	public void setDataResgate(Date dataResgate) {
		this.dataResgate = dataResgate;
	}
	
	
}
