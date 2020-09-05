package quesito3;

public abstract class MeioDeTransporte {

	
	private int id;
	private short ano;
	private String modelo;
	private double carga_maxima;
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public short getAno() {
		return ano;
	}
	public void setAno(short ano) {
		this.ano = ano;
	}
	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
	public Double getCarga_maxima() {
		return carga_maxima;
	}
	public void setCarga_maxima(Double carga_maxima) {
		this.carga_maxima = carga_maxima;
	}
	
	
	public abstract double consumo();
	
		
}
