package quesito4;

public class Alimento extends ItemDeLoja {

	private Integer selo;
	
	

	public Integer getSelo() {
		return selo;
	}

	public void setSelo(Integer selo) {
		this.selo = selo;
	}
	
	
	
	public int getIdentificador() {
		return this.getSelo();
	}
	
	
	
	
}
