import javax.swing.*;

public class Pruebas {
	public static void main(String[] args) {
		
		String option;
		int salir;
		
		do {
			option = (JOptionPane.showInputDialog(null, "¡Bienvenido!\nSeleccione una opción de conversión", "Conversor", 
					JOptionPane.PLAIN_MESSAGE,null,new Object[] {"Monedas", "Temperatura"}, args)).toString();
			
			switch (option) {
				case "Monedas":
					
					Monedas divisa = new Monedas();
					
					divisa.setCantidad();
					divisa.setDivisa();
					divisa.getCantidad();
						
					break;
		
				default:
					break;
			}
			
			salir = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Salir del programa", JOptionPane.YES_NO_CANCEL_OPTION);
			
		} while (salir == 0);
		
		JOptionPane.showMessageDialog(null, "Programa terminado", "Saliendo...", 1);
	}
}
