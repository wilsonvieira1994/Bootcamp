package quesito1;

public class Transporte {

		private Integer id;
		private Integer ano;
		private String modelo;
		private Double carga_maxima;
		private Double potencia;
		
		public Transporte() {
			
		}
		
		public Transporte(Integer id, Integer ano, String modelo, Double carga_maxima, Double potencia) {
			this.id = id;
			this.ano = ano;
			this.modelo = modelo;
			this.carga_maxima = carga_maxima;
			this.potencia = potencia;
		}
		
		
		
		/**
		 * Retorna a potência do motor X carga máxima (kg) X 100
		 * @return O consumo do transporte
		 */
		public Double consumo() {
			return this.potencia * this.carga_maxima * 100;
		}	
		
		
		
		public void setId(Integer id) {
				this.id = id;
		}
		
		public Integer getId() {
			return this.id;
		}
		
		public void setAno(Integer ano) {
				this.ano = ano;
		}
		
		public Integer getAno() {
			return this.ano;
		}
		
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		
		public String getModelo() {
			return this.modelo;
		}
		
		public void setCargaMaxima(Double cargaMaxima) {
			this.carga_maxima = cargaMaxima;
		}
		
		public Double getCargaMaxima() {
			return this.carga_maxima;
		}
		
		public void setPotencia(Double potencia) {
			this.potencia = potencia;
		}
		
		public Double getPotencia() {
			return this.potencia;
		}
			
		
		/**
		 * Simula o setModelo()
		 * @param modelo
		 */
		public void gravaModelo(String modelo) {
			this.setModelo(modelo);
		}
		
		/**
		 * Simula o getModelo()
		 * @return
		 */
		public String leiaModelo() {
			return this.getModelo();
		}
		
		
	}

	

	
