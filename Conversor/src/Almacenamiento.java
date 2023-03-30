import javax.swing.JOptionPane;

public class Almacenamiento {

	private double unidad;
	private String almacenamiento;
	private String abreviatura;
	Object[] opcion = new Object[] {
			"Bytes a Kilobytes", 
			"Bytes a Megabytes",
			"Bytes a Gigabytes",
			"Bytes a Terabytes", 
			"Kilobytes a Bytes",
			"Megabytes a Bytes",
			"Gigabytes a Bytes",
			"Terabytes a Bytes"};

	// Ingreso de la unidad a convertir
	public void setUnidad() {
		try {
			this.unidad = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce las unidades a convertir: ", "Unidad de almacenamiento", 
					JOptionPane.PLAIN_MESSAGE));
		} catch (NumberFormatException nfe) {
			JOptionPane.showMessageDialog(null, "El valor que introduciste no es válido", "Error", 1);
			setUnidad();
		}
	}
	
	// Selecciona la unidad de almacenamiento a convertir
	public void setAlmacenamiento() {
		this.almacenamiento = (JOptionPane.showInputDialog(null, "Elige la opción a la que quieres convertir tus unidades\n" + unidad, "Almacenamiento", 
				JOptionPane.PLAIN_MESSAGE,null, opcion, "")).toString();
		
		switch (almacenamiento) {
			case "Bytes a Kilobytes":
				this.unidad *= 0.001;
				this.abreviatura = "KB";
				break;
				
			case "Bytes a Megabytes":
				this.unidad *= 0.000001;
				this.abreviatura = "MB";
				break;
				
			case "Bytes a Gigabytes":
				this.unidad *= 0.000000001;
				this.abreviatura = "GB";
				break;
				
			case "Bytes a Terabytes":
				this.unidad *= 0.000000000001;
				this.abreviatura = "TB";
				break;
				
			case "Kilobytes a Bytes":
				this.unidad *= 1000;
				this.abreviatura = "B";
				break;
				
			case "Megabytes a Bytes":
				this.unidad *= 1000000;
				this.abreviatura = "B";
				break;
				
			case "Gigabytes a Bytes":
				this.unidad *= 1000000000.0;
				this.abreviatura = "B";
				break;
				
			case "Terabytes a Bytes":
				this.unidad *= 1000000000000.0;
				this.abreviatura = "B";
				break;
	
			default:
				this.abreviatura = "B";
				break;
		}
	}
	
	// Muestra de la unidad convertida
		public void getUnidad() {
			JOptionPane.showMessageDialog(null, "Tienes " + unidad + " " + abreviatura, abreviatura, 1);
		}
}
