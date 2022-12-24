package conversorDeMonedas;

import javax.swing.JOptionPane;

public class conversor {

	static void convertirPesos(double valorDolar, String tuPais) {
		try {
			String mensajeEnPantalla = JOptionPane.showInputDialog(null, "Ingrese la cantidad de pesos :");
			double cantidadDeMoneda = Double.parseDouble(mensajeEnPantalla);
			double dolares = cantidadDeMoneda / valorDolar;
			// aqui decimos que redonde :
			dolares = (double) Math.round(dolares * 100d) / 100;

			JOptionPane.showMessageDialog(null, "tienes $ " + dolares + " Dolares");
		} catch (NumberFormatException exception) {
			JOptionPane.showMessageDialog(null, "Ocurrio un error, se acepta solamente caracter numerico");
			System.out.println("error captado");

		}
	}

	static void convertirDolar(String tuPais, double valorDolar) {
		try {
			String mensajeEnPantalla = JOptionPane.showInputDialog(null, "Ingrese la cantidad de dolares :");
			// aqui recibimos la cantidad del usuario :
			double cantidadDeMoneda = Double.parseDouble(mensajeEnPantalla);
			// convertimos a pesos dividiendo la cantidad de dolar que recibimos a pesos:
			double pesos = valorDolar / cantidadDeMoneda;
			pesos = (double) (cantidadDeMoneda * 173.5);

			JOptionPane.showMessageDialog(null, "tienes $ " + pesos + " Pesos");
		} catch (NumberFormatException exception) {
			JOptionPane.showMessageDialog(null, "Ocurrio un error, se acepta solamente caracter numerico");
			System.out.println("error captado");

		}
	}

	static void convertirPesosAEuros(double valorEuros, String tuPais) {
		try {
			String mensajeEnPantalla = JOptionPane.showInputDialog(null, "Ingrese la cantidad de pesos :");
			double cantidadDeMoneda = Double.parseDouble(mensajeEnPantalla);
			double euros = cantidadDeMoneda / valorEuros;
			euros = (double) Math.round(euros * 100d) / 100;

			JOptionPane.showMessageDialog(null, "tienes $ " + euros + " Euros");
		} catch (NumberFormatException exception) {
			JOptionPane.showMessageDialog(null, "Ocurrio un error, se acepta solamente caracter numerico");
			System.out.println("error captado");

		}
	}

	static void convertirEurosAPesos(String tuPais, double valorEuros) {
		try {
			String mensajeEnPantalla = JOptionPane.showInputDialog(null, "Ingrese la cantidad de euros :");
			double cantidadDeMoneda = Double.parseDouble(mensajeEnPantalla);
			double pesos = valorEuros / cantidadDeMoneda;
			pesos = (double) (cantidadDeMoneda * 185.58);

			JOptionPane.showMessageDialog(null, "tienes $ " + pesos + " Pesos");
		} catch (NumberFormatException exception) {
			JOptionPane.showMessageDialog(null, "Ocurrio un error, se acepta solamente caracter numerico");
			System.out.println("error captado");

		}
	}

	static void convertirPesosALibrasEsterlinas(double valorLibrasEsterlinas, String tuPais) {
		try {
			String mensajeEnPantalla = JOptionPane.showInputDialog(null, "Ingrese la cantidad de pesos :");
			double cantidadDeMoneda = Double.parseDouble(mensajeEnPantalla);
			double librasEsterlinas = cantidadDeMoneda / valorLibrasEsterlinas;
			librasEsterlinas = (double) Math.round(librasEsterlinas * 100d) / 100;

			JOptionPane.showMessageDialog(null, "tienes $ " + librasEsterlinas + " Libras Esterlinas");
		} catch (NumberFormatException exception) {
			JOptionPane.showMessageDialog(null, "Ocurrio un error, se acepta solamente caracter numerico");
			System.out.println("error captado");

		}
	}

	static void convertirLibrasEsterlinasAPesos(String tuPais, double valorLibrasEsterlinas) {
		try {
			String mensajeEnPantalla = JOptionPane.showInputDialog(null, "Ingrese la cantidad de Libras Esterlinas :");
			double cantidadDeMoneda = Double.parseDouble(mensajeEnPantalla);
			double pesos = valorLibrasEsterlinas / cantidadDeMoneda;
			pesos = (double) (cantidadDeMoneda * 0.0048);

			JOptionPane.showMessageDialog(null, "tienes $ " + pesos + " Pesos");
		} catch (NumberFormatException exception) {
			JOptionPane.showMessageDialog(null, "Ocurrio un error, se acepta solamente caracter numerico");
			System.out.println("error captado");

		}
	}

	static void convertirPesosAYenes(double valorYenes, String tuPais) {
		try {
			String mensajeEnPantalla = JOptionPane.showInputDialog(null, "Ingrese la cantidad de pesos :");
			double cantidadDeMoneda = Double.parseDouble(mensajeEnPantalla);
			double yenes = cantidadDeMoneda / valorYenes;
			yenes = (double) Math.round(yenes * 100d) / 100;

			JOptionPane.showMessageDialog(null, "tienes $ " + yenes + " Yenes");
		} catch (NumberFormatException exception) {
			JOptionPane.showMessageDialog(null, "Ocurrio un error, se acepta solamente caracter numerico");
			System.out.println("error captado");

		}
	}

	static void convertirYenesAPesos(String tuPais, double valorYenes) {
		try {
			String mensajeEnPantalla = JOptionPane.showInputDialog(null, "Ingrese la cantidad de Yenes :");
			double cantidadDeMoneda = Double.parseDouble(mensajeEnPantalla);
			double pesos = valorYenes / cantidadDeMoneda;
			pesos = (double) (cantidadDeMoneda * 0.76);

			JOptionPane.showMessageDialog(null, "tienes $ " + pesos + " Pesos");
		} catch (NumberFormatException exception) {
			JOptionPane.showMessageDialog(null, "Ocurrio un error, se acepta solamente caracter numerico");
			System.out.println("error captado");

		}
	}

	static void convertirPesosAWons(double valorWons, String tuPais) {
		try {
			String mensajeEnPantalla = JOptionPane.showInputDialog(null, "Ingrese la cantidad de pesos :");
			double cantidadDeMoneda = Double.parseDouble(mensajeEnPantalla);
			double wons = cantidadDeMoneda / valorWons;
			wons = (double) Math.round(wons * 100d) / 100;

			JOptionPane.showMessageDialog(null, "tienes $ " + wons + " Wons Surcoreano");
		} catch (NumberFormatException exception) {
			JOptionPane.showMessageDialog(null, "Ocurrio un error, se acepta solamente caracter numerico");
			System.out.println("error captado");

		}
	}

	static void convertirWonsAPesos(String tuPais, double valorWons) {
		try {
			String mensajeEnPantalla = JOptionPane.showInputDialog(null, "Ingrese la cantidad de Wons :");
			double cantidadDeMoneda = Double.parseDouble(mensajeEnPantalla);
			double pesos = valorWons / cantidadDeMoneda;
			pesos = (double) (cantidadDeMoneda * 0.76);

			JOptionPane.showMessageDialog(null, "tienes $ " + pesos + " Pesos");
		} catch (NumberFormatException exception) {
			JOptionPane.showMessageDialog(null, "Ocurrio un error, se acepta solamente caracter numerico");
			System.out.println("error captado");

		}
	}
}
