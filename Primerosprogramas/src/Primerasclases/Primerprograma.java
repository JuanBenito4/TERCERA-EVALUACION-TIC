package Primerasclases;

public class Primerprograma {
	private String titular;
	private double cantidad;
	//primer constructor
	public void Cuenta(String titular,double cantidad) {
		this.titular=titular;
		this.cantidad=cantidad;
		
		}
		//segundo constructor
		public void Cuenta(String titular) {
			this.titular=titular;
		}
		/**
		 * @return the titular
		 */
		public String getTitular() {
			return titular;
		}
		/**
		 * @param titular the titular to set
		 */
		public void setTitular(String titular) {
			this.titular = titular;
		}
		/**
		 * @return the cantidad
		 */
		public double getCantidad() {
			return cantidad;
		}
		/**
		 * @param cantidad the cantidad to set
		 */
		public void setCantidad(double cantidad) {
			this.cantidad = cantidad;
		}
		@Override
		public String toString() {
			return "Primerprograma [titular=" + titular + ", cantidad=" + cantidad + "]";
		}
		
	}
	
