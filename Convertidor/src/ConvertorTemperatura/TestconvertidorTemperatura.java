package ConvertorTemperatura;
import javax.swing.JOptionPane;
public class TestconvertidorTemperatura {
	static double valor;
	
	public static void convertidor(FormulaConvertidorTemperatura formulaConvertidorTemperatura) {
		
		if(formulaConvertidorTemperatura.getOpcion1() == "Grados Celsius") {
			
			switch (formulaConvertidorTemperatura.getOpcion2()) {
			case "Grado Fahrenheit":
				valor = (formulaConvertidorTemperatura.getValor()*9/5)+32;
				JOptionPane.showMessageDialog(null, formulaConvertidorTemperatura.getValor() + " Grados Celsius es "+ valor + " Grado Fahrenheit");
				break;
			case "Kelvin":
				System.out.println(formulaConvertidorTemperatura.getValor()+273.15);
				valor = (formulaConvertidorTemperatura.getValor()+273.15);
				JOptionPane.showMessageDialog(null, formulaConvertidorTemperatura.getValor() + " Grados Celsius es "+ valor + " Kelvin");
				break;

			default:
				break;
			}
		}
		if(formulaConvertidorTemperatura.getOpcion1() == "Grado Fahrenheit") {

			switch (formulaConvertidorTemperatura.getOpcion2()) {
			case "Grados Celsius":
				valor =((formulaConvertidorTemperatura.getValor()-32)*5/9);
				JOptionPane.showMessageDialog(null, formulaConvertidorTemperatura.getValor() + " Grado Fahrenheit es "+ valor + " Grado Celsius");
				break;
			case "Kelvin":
				
				valor =((formulaConvertidorTemperatura.getValor()-32)*5/9+273.15);
				JOptionPane.showMessageDialog(null, formulaConvertidorTemperatura.getValor() + " Grado Fahrenheit es "+ valor + " Kelvin");
				break;

			default:
				break;
			}
		}
		if(formulaConvertidorTemperatura.getOpcion1() == "Kelvin") {

			switch (formulaConvertidorTemperatura.getOpcion2()) {
			case "Grados Celsius":
				valor = (formulaConvertidorTemperatura.getValor()-273.15);
				JOptionPane.showMessageDialog(null, formulaConvertidorTemperatura.getValor() + " Kelvin es "+ valor + " Grados Celsius");
				break;
			case "Grado Fahrenheit":
				valor = (formulaConvertidorTemperatura.getValor()-273) *9/5 +32;
				JOptionPane.showMessageDialog(null, formulaConvertidorTemperatura.getValor() + " Kelvin es "+ valor + " Grado Fahrenheit");
				break;

			default:
				break;
			}

		}
		if(formulaConvertidorTemperatura.getOpcion1() == formulaConvertidorTemperatura.getOpcion2()) {
			JOptionPane.showMessageDialog(null, formulaConvertidorTemperatura.getValor() +" "+ formulaConvertidorTemperatura.getOpcion1() + "  es "+ formulaConvertidorTemperatura.getValor() + " " +formulaConvertidorTemperatura.getOpcion2());
		}
	}
}
