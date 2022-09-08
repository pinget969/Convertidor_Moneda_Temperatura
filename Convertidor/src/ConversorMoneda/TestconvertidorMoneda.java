package ConversorMoneda;

import javax.swing.JOptionPane;
public class TestconvertidorMoneda {
/**
 * 
 * @param moneda
 */
	public static void convertir(Moneda moneda) {
		if(moneda.getTipo().equals("Peso")) {
			switch (moneda.getTipo2()) {
			case "Dolar":
				double PesoADolar = moneda.getMonto() * PesoSeleccionado.dolar();
				JOptionPane.showMessageDialog(null,"Tienes $"+ PesoADolar + " Dolares");
				break;
			case "Real":
				double PesoAReal = moneda.getMonto() * PesoSeleccionado.real();
				System.out.println(PesoAReal);
				JOptionPane.showMessageDialog(null,"Tienes $"+ PesoAReal + " Real");
				break;
			case "Euro":
				double PesoAEuro = moneda.getMonto() * PesoSeleccionado.euro();
				JOptionPane.showMessageDialog(null,"Tienes $"+ PesoAEuro + " Euro");
				break;
			case "Libra esterlina":
				double PesoALibraEsterlina = moneda.getMonto() * PesoSeleccionado.libra();
				JOptionPane.showMessageDialog(null,"Tienes $"+ PesoALibraEsterlina + " Libra Esterlina");
				break;
			case "Yen":
				double PesoAYen = moneda.getMonto() * PesoSeleccionado.yen();
				JOptionPane.showMessageDialog(null,"Tienes $"+ PesoAYen + " Yen");
				break;
			case "won surcoreano":
				double PesoAWonKoreano = moneda.getMonto() * PesoSeleccionado.wonKorearo();
				System.out.println(PesoAWonKoreano);
				break;
			default:
				break;
			}
		}
		if(moneda.getTipo().equals("Dolar")) {
			switch (moneda.getTipo2()) {
			case "Peso":
				double DolarAPeso = moneda.getMonto() * DolarSeleccionado.dolar();
				JOptionPane.showMessageDialog(null,"Tienes $"+ DolarAPeso + " Pesos");
				break;
			case "Real":
				double DolarAReal = moneda.getMonto() * DolarSeleccionado.real();
				JOptionPane.showMessageDialog(null,"Tienes $"+ DolarAReal + " Real");
				break;
			case "Euro":
				double DolarAEuro = moneda.getMonto() * DolarSeleccionado.euro();
				JOptionPane.showMessageDialog(null,"Tienes $"+ DolarAEuro + " Euro");
				break;
			case "Libra esterlina":
				double DolarALibraEsterlina = moneda.getMonto() * DolarSeleccionado.libra();
				JOptionPane.showMessageDialog(null,"Tienes $"+ DolarALibraEsterlina + " Libra Esterlina");
				break;
			case "Yen":
				double DolarAYen = moneda.getMonto() * DolarSeleccionado.yen();
				JOptionPane.showMessageDialog(null,"Tienes $"+ DolarAYen + " Yen");
				break;
			case "won surcoreano":
				double DolarAWonKoreano = moneda.getMonto() * DolarSeleccionado.wonKorearo();
				JOptionPane.showMessageDialog(null,"Tienes $"+ DolarAWonKoreano + " Won Surcoreano");
				break;
			default:
				break;
			}
		}
		if(moneda.getTipo().equals("Real")) {
			switch (moneda.getTipo2()) {
			case "Peso":
				double RealAPeso = moneda.getMonto() * RealSeleccionado.peso();
				JOptionPane.showMessageDialog(null,"Tienes $"+ RealAPeso + " Pesos");
				break;
			case "Dolar":
				double RealADolar = moneda.getMonto() * RealSeleccionado.dolar();
				JOptionPane.showMessageDialog(null,"Tienes $"+ RealADolar + " Dolar");
				break;
			case "Euro":
				double RealAEuro = moneda.getMonto() * RealSeleccionado.euro();
				JOptionPane.showMessageDialog(null,"Tienes $"+ RealAEuro + " Euro");
				break;
			case "Libra esterlina":
				double RealALibraEsterlina = moneda.getMonto() * RealSeleccionado.libra();
				JOptionPane.showMessageDialog(null,"Tienes $"+ RealALibraEsterlina + " Libra esterlina");
				break;
			case "Yen":
				double RealAYen = moneda.getMonto() * RealSeleccionado.yen();
				JOptionPane.showMessageDialog(null,"Tienes $"+ RealAYen + " Yen");
				break;
			case "won surcoreano":
				double RealAWonKoreano = moneda.getMonto() * RealSeleccionado.wonKorearo();
				JOptionPane.showMessageDialog(null,"Tienes $"+ RealAWonKoreano + " Won Surcoreano");
				break;
			default:
				break;
			}
		}
		if(moneda.getTipo().equals("Euro")) {
			switch (moneda.getTipo2()) {
			case "Peso":
				double RealAPeso = moneda.getMonto() * EuroSeleccionado.peso();
				JOptionPane.showMessageDialog(null,"Tienes $"+ RealAPeso + " Pesos");
				break;
			case "Dolar":
				double EuroADolar = moneda.getMonto() * EuroSeleccionado.dolar();
				JOptionPane.showMessageDialog(null,"Tienes $"+ EuroADolar + " Dolar");
				break;
			case "Real":
				double RealAEuro = moneda.getMonto() * EuroSeleccionado.real();
				JOptionPane.showMessageDialog(null,"Tienes $"+ RealAEuro + " Real");
				break;
			case "Libra esterlina":
				double EuroALibraEsterlina = moneda.getMonto() * EuroSeleccionado.LibraEsterlina();
				JOptionPane.showMessageDialog(null,"Tienes $"+ EuroALibraEsterlina + " Libra esterlina");
				break;
			case "Yen":
				double EuroAYen = moneda.getMonto() * EuroSeleccionado.yen();
				JOptionPane.showMessageDialog(null,"Tienes $"+ EuroAYen + " Yen");
				break;
			case "won surcoreano":
				double EuroAWonKoreano = moneda.getMonto() * EuroSeleccionado.wonKorearo();
				JOptionPane.showMessageDialog(null,"Tienes $"+ EuroAWonKoreano + " Won Surcoreano");
				break;
			default:
				break;
			}
		}
		if(moneda.getTipo().equals("Libra esterlina")) {
			switch (moneda.getTipo2()) {
			case "Peso":
				double LibraEsterlinaAPeso = moneda.getMonto() * libraSeleccionada.peso();
				JOptionPane.showMessageDialog(null,"Tienes $"+ LibraEsterlinaAPeso + " Pesos");
				break;
			case "Dolar":
				double LibraEsterlinaADolar = moneda.getMonto() * libraSeleccionada.dolar();
				JOptionPane.showMessageDialog(null,"Tienes $"+ LibraEsterlinaADolar + " Dolar");
				break;
			case "Real":
				double LibraEsterlinaALibra = moneda.getMonto() * libraSeleccionada.real();
				JOptionPane.showMessageDialog(null,"Tienes $"+ LibraEsterlinaALibra + " Real");
				break;
			case "Euro":
				double LibraEsterlinaAEuro = moneda.getMonto() * libraSeleccionada.euro();
				JOptionPane.showMessageDialog(null,"Tienes $"+ LibraEsterlinaAEuro + " Euro");
				break;
			case "Yen":
				double LibraEsterlinaAYen = moneda.getMonto() * libraSeleccionada.yen();
				JOptionPane.showMessageDialog(null,"Tienes $"+ LibraEsterlinaAYen + " Yen");
				break;
			case "won surcoreano":
				double LibraEsterlinaAWonKoreano = moneda.getMonto() * libraSeleccionada.wonKorearo();
				JOptionPane.showMessageDialog(null,"Tienes $"+ LibraEsterlinaAWonKoreano + " Won Surcoreano");
				break;
			default:
				break;
			}
		}
		if(moneda.getTipo().equals("won surcoreano")) {
			switch (moneda.getTipo2()) {
			case "Peso":
				double wonKorearoAPeso = moneda.getMonto() * WonKoreanoSeleccionado.peso();
				JOptionPane.showMessageDialog(null,"Tienes $"+ wonKorearoAPeso + " Pesos");
				break;
			case "Dolar":
				double wonKorearoADolar = moneda.getMonto() * WonKoreanoSeleccionado.dolar();
				JOptionPane.showMessageDialog(null,"Tienes $"+ wonKorearoADolar + " Dolar");
				break;
			case "Real":
				double wonKorearoAReal = moneda.getMonto() * WonKoreanoSeleccionado.real();
				JOptionPane.showMessageDialog(null,"Tienes $"+ wonKorearoAReal + " Real");
				break;
			case "Euro":
				double wonKorearoAEuro = moneda.getMonto() * WonKoreanoSeleccionado.euro();
				JOptionPane.showMessageDialog(null,"Tienes $"+ wonKorearoAEuro + " Euro");
				break;
			case "Yen":
				double wonKorearoAYen = moneda.getMonto() * WonKoreanoSeleccionado.yen();
				JOptionPane.showMessageDialog(null,"Tienes $"+ wonKorearoAYen + " Yen");
				break;
			case "Libra esterlina":
				double wonKorearoALibraEsterlina = moneda.getMonto() * WonKoreanoSeleccionado.libra();
				JOptionPane.showMessageDialog(null,"Tienes $"+ wonKorearoALibraEsterlina + " Libra Esterlina");
				break;
			default:
				break;
			}
		}
		if(moneda.getTipo().equals("Yen")) {
			switch (moneda.getTipo2()) {
			case "Peso":
				double wonKorearoAPeso = moneda.getMonto() * yenSeleccionado.peso();
				JOptionPane.showMessageDialog(null,"Tienes $"+ wonKorearoAPeso + " Pesos");
				break;
			case "Dolar":
				double wonKorearoADolar = moneda.getMonto() * yenSeleccionado.dolar();
				JOptionPane.showMessageDialog(null,"Tienes $"+ wonKorearoADolar + " Dolar");
				break;
			case "Real":
				double wonKorearoAReal = moneda.getMonto() * yenSeleccionado.real();
				JOptionPane.showMessageDialog(null,"Tienes $"+ wonKorearoAReal + " Real");
				break;
			case "Euro":
				double wonKorearoAEuro = moneda.getMonto() * yenSeleccionado.euro();
				JOptionPane.showMessageDialog(null,"Tienes $"+ wonKorearoAEuro + " Euro");
				break;
			case "won surcoreano":
				double wonKorearoAYen = moneda.getMonto() * yenSeleccionado.wonsurcoreano();
				JOptionPane.showMessageDialog(null,"Tienes $"+ wonKorearoAYen + " Won Surcoreano");
				break;
			case "Libra esterlina":
				double wonKorearoALibraEsterlina = moneda.getMonto() * yenSeleccionado.libra();
				JOptionPane.showMessageDialog(null,"Tienes $"+ wonKorearoALibraEsterlina + " Libra Esterlina");
				break;
			default:
				break;
			}
		}
	}
}

