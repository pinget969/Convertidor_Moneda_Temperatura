package ConversorMoneda;

public class Moneda {
	String tipo; //PESO
	String tipo2;
	double monto; // 300
	public Moneda(){
	}
		public Moneda(String tipo, String tipo2, double monto) {
		this.tipo = tipo;
		this.tipo2= tipo2;
		this.monto = monto;
	}
		public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public String getTipo2() {
		return tipo2;
	}
	public void setTipo2(String tipo2) {
		this.tipo2 = tipo2;
	}	
}

