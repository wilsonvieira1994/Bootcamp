package quesito4;

public class Ferramenta extends ItemDeLoja {

	
	private String categoria;
	private Integer serial;
	
	
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	
	public Integer getSerial() {
		return serial;
	}
	public void setSerial(Integer serial) {
		this.serial = serial;
	}
	
	
	
	public int getIdentificador() {
		return this.getSerial();
	}
	
	
	public void separar() {
		this.setCategoria("Outros");
	}

	
	public void separar(String categoria) {
		this.setCategoria(categoria);
	}
	
	
}
