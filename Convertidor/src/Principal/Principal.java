package Principal;

import javax.swing.*;


import ConversorMoneda.Moneda;
import ConversorMoneda.TestconvertidorMoneda;
import ConvertorTemperatura.FormulaConvertidorTemperatura;
import ConvertorTemperatura.TestconvertidorTemperatura;
/**
 * 
 * @author Pinget
 *
 */
public class Principal {
	boolean tempIngreso = false;

	public static void main(String[] args) {
		while (true) {
 		String moneda2 = "Seleccione";

			String eleccion = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion", "OPCIONES",
					JOptionPane.QUESTION_MESSAGE, null,
					new Object[] { "Seleccione", "Convertidor de moneda", "Convertidor de temperatura" }, "Seleccione");

			if (eleccion == "Convertidor de moneda") {

				String moneda1 = (String) JOptionPane.showInputDialog(null, "Seleccione un tipo de moneda", "OPCIONES",
						JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Seleccione", "Dolar", "Peso", "Real",
								"Euro", "Libra esterlina", "Yen", "won surcoreano" },
						"Seleccione");

				if (moneda1 != "Seleccione" && moneda1 != null) {
					moneda2 = (String) JOptionPane.showInputDialog(null, "Seleccione un tipo de moneda", "OPCIONES",
							JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Seleccione", "Dolar", "Peso", "Real",
									"Euro", "Libra esterlina", "Yen", "won surcoreano" },
							"Seleccione");

					if (moneda2 != null) {
						if (moneda1 == "Seleccione" || moneda2 == "Seleccione") {
							JOptionPane.showMessageDialog(null, "Eleccción Invalida");
						} else {

							String input = JOptionPane.showInputDialog(null, "Ingrese un valor");
							while (true) {
								if (validarNumeros(input)) {
									double ValorRecibido = Double.parseDouble(input); // CONVERTIDO DE STRING A DOUBLE.
									Moneda peso = new Moneda(moneda1, moneda2, ValorRecibido);
									TestconvertidorMoneda.convertir(peso);
									break;
								} else {
									JOptionPane.showMessageDialog(null, "Debe ingresar un Numero");
									input = JOptionPane.showInputDialog(null, "Ingrese un valor");
								}
							}
						}
					}

				} else if (moneda1 == "Seleccione") {
					JOptionPane.showMessageDialog(null, "Eleccción Invalida");
				} else {
					JOptionPane.showMessageDialog(null, "Cancelado");
				}
				// TEMPERATURA
			} else if (eleccion == "Convertidor de temperatura") {
				String temperatura2 = "Seleccione";
				String temperatura1 = (String) JOptionPane.showInputDialog(null, "Seleccione un tipo de medida",
						"OPCIONES", JOptionPane.QUESTION_MESSAGE, null,
						new Object[] { "Seleccione", "Grados Celsius", "Grado Fahrenheit", "Kelvin" }, "Seleccione");

				if (temperatura1 != "Seleccione" && temperatura1 != null) {
					temperatura2 = (String) JOptionPane.showInputDialog(null, "Seleccione otro tipo de medida",
							"OPCIONES", JOptionPane.QUESTION_MESSAGE, null,
							new Object[] { "Seleccione", "Grados Celsius", "Grado Fahrenheit", "Kelvin" },
							"Seleccione");
				}
				if (temperatura1 == null) {
					JOptionPane.showMessageDialog(null, "Cancelado");

				} else if (temperatura1 == "Seleccione" || temperatura2 == "Seleccione") {
					JOptionPane.showMessageDialog(null, "Eleccción Invalida");
				}
				else {
					String input = JOptionPane.showInputDialog(null, "Ingrese un valor");
					while (true) {
						if (validarNumeros(input)) {
							double valorRecibido2 = Double.parseDouble(input);
							FormulaConvertidorTemperatura temperatura = new FormulaConvertidorTemperatura(temperatura1,
									temperatura2, valorRecibido2);
							TestconvertidorTemperatura.convertidor(temperatura);
							break;
						} else {
							JOptionPane.showMessageDialog(null, "Debe ingresar un Numero");
							input = JOptionPane.showInputDialog(null, "Ingrese un valor");
						}
					}
				}
			} /*else if (eleccion == "Seleccione") {

				JOptionPane.showMessageDialog(null, "Eleccción Invalida");
			}*/ else {
				JOptionPane.showMessageDialog(null, "Fin de programa");
				break;
			}
			int resp = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?");
			if (JOptionPane.OK_OPTION == resp) {
				System.out.println("Selecciona opción Afirmativa");
			} else {
				JOptionPane.showMessageDialog(null, "Fin de programa");
				break;
			}
		}
	}
 
	private static boolean validarNumeros(String input) {
 
		return input.matches("^-?[0-9]+$");
	}

}
