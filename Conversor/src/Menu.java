import javax.swing.*;

public class Menu {
	public static void main(String[] args) {
		
		int salir;
		String option = "";
		
		do {
			try {
				option = (JOptionPane.showInputDialog(null, "¡Bienvenido!\nSeleccione una opción de conversión", "Conversor", 
						JOptionPane.PLAIN_MESSAGE,null,new Object[] {"Monedas", "Temperaturas", "Almacenamiento digital"}, args)).toString();
				
				switch (option) {
					case "Monedas":
						
						Monedas divisa = new Monedas();
						
						divisa.setCantidad();
						divisa.setDivisa();
						divisa.getCantidad();
							
						break;
						
					case "Temperaturas":
						
						Temperaturas grado = new Temperaturas();
						
						grado.setUnidad();
						grado.setTemperatura();
						grado.getUnidad();
							
						break;
						
					case "Almacenamiento digital":
						
						Almacenamiento digital = new Almacenamiento();
						
						digital.setUnidad();
						digital.setAlmacenamiento();
						digital.getUnidad();
							
						break;
			
					default:
						break;
				}
			
			} catch (NullPointerException npe) {
				JOptionPane.showMessageDialog(null, "Cancelando...", "Cancelando...", 1);
			}
			
			salir = salir();
			
		} while (salir == 0);
		
		JOptionPane.showMessageDialog(null, "Programa terminado", "Saliendo...", 1);

	}
	
	public static int salir() {
		int seleccion;
		
		seleccion = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Salir del programa", JOptionPane.YES_NO_CANCEL_OPTION);
		
		return seleccion;
	}
}
