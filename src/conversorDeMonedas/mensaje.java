package conversorDeMonedas;
import javax.swing.JOptionPane;

public class mensaje extends conversor {
	public static void main(String[] args) {
		try {
			// mensaje que nos permite la entrada de datos
			String mensageEnPantalla = JOptionPane.showInputDialog(null,
					"1- Pesos Argentinos a Dolares\n" + "2- Dolares a Pesos Argentinos\n");
			char opcion = mensageEnPantalla.charAt(0);

			switch (opcion) {
			case '1':
				convertirPesos(173.64, "Pesos Argentinos");
				break;
			case '2':
				convertirDolar("Dolares", 0.0057);
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