package Principal;

import javax.swing.*;

import ConversorMoneda.Moneda;
import ConversorMoneda.TestconvertidorMoneda;

	public class Principal {
		
		public static void main(String[] args) {
			String eleccion = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion", "OPCIONES",JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Selecione", "Convertidor de moneda", "Convertidor de temperatura"},"Selecione");
			
				if(eleccion == "Convertidor de moneda") {
					String moneda1 = (String) JOptionPane.showInputDialog(null, "Seleccione un tipo de moneda", "OPCIONES",JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Selecione", "Dolar","Peso", "Real", "Euro", "Libra esterlina", "Yen", "won surcoreano"},"Selecione");
					String moneda2 = (String) JOptionPane.showInputDialog(null, "Seleccione un tipo de moneda", "OPCIONES",JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Selecione", "Dolar","Peso", "Real", "Euro", "Libra esterlina", "Yen", "won surcoreano"},"Selecione");

					String input = JOptionPane.showInputDialog(null, "Ingrese la cantidad de Dolares");
					double ValorRecibido = Double.parseDouble(input); //CONVERTIDO DE STRING A DOUBLE.
					System.out.println(ValorRecibido);
					//CONVERTIR MONEDAS
					Moneda peso = new Moneda(moneda1, moneda2, ValorRecibido);
					TestconvertidorMoneda.convertir(peso);
				
				}else if(eleccion == "Convertidor de temperatura") {
					System.out.println("Convertidor de temp");
				}else {
					JOptionPane.showMessageDialog(null,"Eleccción Invalida");
				}
			}
		}
