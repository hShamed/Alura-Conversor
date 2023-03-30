import javax.swing.JOptionPane;

public class Temperaturas {

	private double unidad;
	private String temperatura;
	private String grado;
	Object[] opcion = new Object[] {
			"Celsius a Fahrenheit", 
			"Celsius a Kelvin",
			"Celsius a Rankine",
			"Fahrenheit a Celsius", 
			"Kelvin a Celsius", 
			"Rankine a Celsius"};

	// Ingreso de la unidad a convertir
	public void setUnidad() {
		try {
			this.unidad = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce las unidades a convertir: ", "Unidad", 
					JOptionPane.PLAIN_MESSAGE));
		} catch (NumberFormatException nfe) {
			JOptionPane.showMessageDialog(null, "El valor que introduciste no es válido", "Error", 1);
			setUnidad();
		}
	}
	
	// Selecciona la temperatura a convertir
	public void setTemperatura() {
		this.temperatura = (JOptionPane.showInputDialog(null, "Elige la opción a la que quieres convertir tus unidades\n" + unidad + "°", "Temperatura", 
				JOptionPane.PLAIN_MESSAGE,null, opcion, "")).toString();
		
		switch (temperatura) {
			case "Celsius a Fahrenheit":
				this.unidad *= 33.8;
				this.grado = "°F";
				break;
				
			case "Celsius a Kelvin":
				this.unidad *= 274.15;
				this.grado = "°K";
				break;
				
			case "Celsius a Rankine":
				this.unidad *= 493.47;
				this.grado = "°R";
				break;
				
			case "Fahrenheit a Celsius":
				this.unidad *= -17.2222222;
				this.grado = "°C";
				break;
				
			case "Kelvin a Celsius":
				this.unidad *= -272.15;
				this.grado = "°C";
				break;
				
			case "Rankine a Celsius":
				this.unidad *= -272.594444;
				this.grado = "°C";
				break;
	
			default:
				this.grado = "°C";
				break;
		}
	}
	
	// Muestra de la unidad convertida
		public void getUnidad() {
			JOptionPane.showMessageDialog(null, "Tienes " + unidad + grado, grado, 1);
		}
}
