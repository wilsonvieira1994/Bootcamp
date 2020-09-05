package quesito3;

public class Terreste extends MeioDeTransporte{

	private int qtdeRodas;
	private double potencia;
	
	
	
	
	public int getQtdeRodas() {
		return qtdeRodas;
	}
	public void setQtdeRodas(int qtdeRodas) {
		this.qtdeRodas = qtdeRodas;
	}
	
	
	public Double getPotencia() {
		return potencia;
	}
	public void setPotencia(Double potencia) {
		this.potencia = potencia;
	}
	
	
	@Override
	public double consumo() {
		
		return this.getPotencia() * this.getCarga_maxima() * 100;
	}
	
	
	
}
