package Principal;


import javax.swing.*;

import ConversorMoneda.Moneda;
import ConversorMoneda.TestconvertidorMoneda;
import ConvertorTemperatura.FormulaConvertidorTemperatura;
import ConvertorTemperatura.TestconvertidorTemperatura;

	public class Principal {
		
		public static void main(String[] args) {
			while(true) {
				
				String moneda2 = "Seleccione";
				
				String eleccion = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion", "OPCIONES",JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Selecione", "Convertidor de moneda", "Convertidor de temperatura"},"Selecione");
			
				if(eleccion == "Convertidor de moneda") {
					
					String moneda1 = (String) JOptionPane.showInputDialog(null, "Seleccione un tipo de moneda", "OPCIONES",JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Selecione", "Dolar","Peso", "Real", "Euro", "Libra esterlina", "Yen", "won surcoreano"},"Selecione");
					 
				
					if(moneda1 != null) {
						moneda2 = (String) JOptionPane.showInputDialog(null, "Seleccione un tipo de moneda", "OPCIONES",JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Selecione", "Dolar","Peso", "Real", "Euro", "Libra esterlina", "Yen", "won surcoreano"},"Selecione");

						if(moneda2 != null) {
					if(moneda1 == "Selecione" || moneda2 == "Selecione") {
						JOptionPane.showMessageDialog(null,"Eleccción Invalida");
					} else {
						
						String input = JOptionPane.showInputDialog(null, "Ingrese un valor");
						while(true) {
						if(validarNumeros(input)) {
							double ValorRecibido = Double.parseDouble(input); //CONVERTIDO DE STRING A DOUBLE.
							Moneda peso = new Moneda(moneda1, moneda2, ValorRecibido);
							TestconvertidorMoneda.convertir(peso);
							break;
						}else {
							JOptionPane.showMessageDialog(null,"Debe ingresar un Numero");
							input = JOptionPane.showInputDialog(null, "Ingrese un valor");
						}
					 }
					}
					}
					}
				 // TEMPERATURA
				}else if(eleccion == "Convertidor de temperatura") {
					System.out.println("Convertidor de temp");
					String temperatura1 = (String) JOptionPane.showInputDialog(null, "Seleccione un tipo de conversión", "OPCIONES",JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Selecione", "Grados Celsius","Grado Fahrenheit", "Kelvin"},"Selecione");
					String temperatura2 = (String) JOptionPane.showInputDialog(null, "Seleccione un tipo de moneda", "OPCIONES",JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Selecione", "Grados Celsius","Grado Fahrenheit", "Kelvin"},"Selecione");
					if(temperatura1 == "Selecione" || temperatura2 == "Selecione") {
						JOptionPane.showMessageDialog(null,"Eleccción Invalida");
					} else {
						String input = JOptionPane.showInputDialog(null, "Ingrese un valor");
						while(true) {
						if(validarNumeros(input)) {
							double valorRecibido2 = Double.parseDouble(input);
							FormulaConvertidorTemperatura temperatura = new FormulaConvertidorTemperatura(temperatura1, temperatura2, valorRecibido2);
							TestconvertidorTemperatura.convertidor(temperatura);
							break;
						}else {
							JOptionPane.showMessageDialog(null,"Debe ingresar un Numero");
							input = JOptionPane.showInputDialog(null, "Ingrese un valor");
						}
					 }
					}
					
				}else if(eleccion == "Selecione") {
					JOptionPane.showMessageDialog(null,"Eleccción Invalida");
				}else {
					JOptionPane.showMessageDialog(null,"Fin de programa");
			    	  break;
				}
				int resp=JOptionPane.showConfirmDialog(null,"¿Desea realizar otra conversión?");
			      if (JOptionPane.OK_OPTION == resp){
			    	   
			   System.out.println("Selecciona opción Afirmativa");
			 }else{
			    	  JOptionPane.showMessageDialog(null,"Fin de programa");
			    	   
			    	  break;
			   }
			      
			}
			
		}

		private static boolean validarNumeros(String input) {
			
			return input.matches("^-?[0-9]+$");
		}
		
	}

