package ConvertorTemperatura;

public class FormulaConvertidorTemperatura {
	String opcion1;
	String opcion2;
	double valor;
	
	public FormulaConvertidorTemperatura(String temperatura1, String temperatura2, double valorRecibido2) {
		this.opcion1 = temperatura1;
		this.opcion2 = temperatura2;
		this.valor= valorRecibido2;
	}

	public String getOpcion1() {
		return opcion1;
	}

	public void setOpcion1(String opcion1) {
		this.opcion1 = opcion1;
	}

	public String getOpcion2() {
		return opcion2;
	}

	public void setOpcion2(String opcion2) {
		this.opcion2 = opcion2;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
