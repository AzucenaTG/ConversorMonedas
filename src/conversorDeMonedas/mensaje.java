package conversorDeMonedas;

import javax.swing.JOptionPane;

public class mensaje extends conversor {
	public static void main(String[] args) {
		try {
			// mensaje que nos permite la entrada de datos
			String mensageEnPantalla = JOptionPane.showInputDialog(null,
					"0- Pesos Argentinos a Dolares\n" + "1- Dolares a Pesos Argentinos\n" + "2- Pesos Argentinos a Euros\n" + "3- Euros a Pesos Argentinos\n"
							+ "4- Pesos Argentinos a Libras Esterlinas\n" + "5- Libras Esterlinas a Pesos Argentinos\n" + "6- Pesos Argentinos a Yen Japonés\n"
							+ "7- Yen Japonés a Pesos Argentinos\n" + "8- Pesos Argentinos a Won sur coreano\n" + "9-  Won sur coreano a Pesos Argentinos\n");
			char opcion = mensageEnPantalla.charAt(0);

			switch (opcion) {
			case '0':
				convertirPesos(173.64, "Pesos Argentinos");
				break;
			case '1':
				convertirDolar("Dolares", 0.0057);
				break;
			case '2':
				convertirPesosAEuros(185.58, "Pesos Argentinos");
				break;
			case '3':
				convertirEurosAPesos("Pesos Argentinos", 0.0054);
				break;
			case '4':
				convertirPesosALibrasEsterlinas(209.66, "Pesos Argentinos");
				break;
			case '5':
				convertirLibrasEsterlinasAPesos("Pesos Argentinos", 0.0048);
				break;
			case '6':
				convertirPesosAYenes(1.31, "Pesos Argentinos");
				break;
			case '7':
				convertirYenesAPesos("Pesos Argentinos", 0.76);
				break;
			case '8':
				convertirPesosAWons(0.14, "Pesos Argentinos");
				break;
			case '9':
				convertirWonsAPesos("Pesos Argentinos", 7.36);
				break;
			default:
				System.out.print("Opcion Incorrecta");
				break;
			}
			
			int ventanaYesNotCancel = JOptionPane.showConfirmDialog(null, "¿Deseas Continuar?");

			// 0=yes, 1=no, 2=cancel
			if (ventanaYesNotCancel == 0) {
				mensaje.main(null);
			} else if (ventanaYesNotCancel == 1) {
				JOptionPane.showMessageDialog(null, "Programa Finalizado");
			} else if (ventanaYesNotCancel == 2) {
				JOptionPane.showMessageDialog(null, "Programa Finalizado");
			}
		} catch (NullPointerException exception) {
			JOptionPane.showMessageDialog(null, "Finalizando Programa");
		}
	}
}