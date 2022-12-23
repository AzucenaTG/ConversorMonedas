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
	
	
}
