import javax.swing.JOptionPane;

public class Monedas {

	private double cantidad;
	private String divisa;
	private String moneda;
	Object[] opcion = new Object[] {
			"Peso Mexicano a Dólar", 
			"Peso Mexicano a Euro", 
			"Peso Mexicano a Libra Esterlina", 
			"Peso Mexicano a Yen Japonés",
			"Peso Mexicano a Won Sur Coreano",
			"Dólar a Peso Mexicano", 
			"Euro a Peso Mexicano", 
			"Libra Esterlina a Peso Mexicano", 
			"Yen Japonés a Peso Mexicano",
			"Won Sur Coreano a Peso Mexicano"};

	// Ingreso de la cantidad a convertir
	public void setCantidad() {
		this.cantidad = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce la cantidad a convertir: ", "Monedas", 
				JOptionPane.PLAIN_MESSAGE));
	}
	
	// Selecciona la divisa a convertir
	public void setDivisa() {
		this.divisa = (JOptionPane.showInputDialog(null, "Elige la opción a la que quieres convertir tu dinero\n$" + cantidad, "Divisas", 
				JOptionPane.PLAIN_MESSAGE,null, opcion, "")).toString();
		
		switch (divisa) {
			case "Peso Mexicano a Dólar":
				this.cantidad *= 0.055;
				this.moneda = "Dolares";
				break;
				
			case "Peso Mexicano a Euro":
				this.cantidad *= 0.051;
				this.moneda = "Euros";
				break;
				
			case "Peso Mexicano a Libra Esterlina":
				this.cantidad *= 0.044;
				this.moneda = "Libras esterlinas";
				break;
				
			case "Peso Mexicano a Yen Japonés":
				this.cantidad *= 7.22;
				this.moneda = "Yenes japoneses";
				break;
				
			case "Peso Mexicano a Won Sur Coreano":
				this.cantidad *= 71.29;
				this.moneda = "Wones sur coreanos";
				break;
				
			case "Dólar a Peso Mexicano":
				this.cantidad *= 18.23;
				moneda = "Pesos mexicanos";
				break;
				
			case "Euro a Peso Mexicano":
				this.cantidad *= 19.77;
				moneda = "Pesos mexicanos";
				break;
				
			case "Libra Esterlina a Peso Mexicano":
				this.cantidad *= 22.48;
				moneda = "Pesos mexicanos";
				break;
				
			case "Yen Japonés a Peso Mexicano":
				this.cantidad *= 0.14;
				moneda = "Pesos mexicanos";
				break;
				
			case "Won Sur Coreano a Peso Mexicano":
				this.cantidad *= 0.014;
				moneda = "Pesos mexicanos";
				break;
	
			default:
				this.moneda = "Pesos mexicanos";
				break;
		}
	}
	
	// Muestra de la cantidad convertida
		public void getCantidad() {
			JOptionPane.showMessageDialog(null, "Tienes $" + cantidad + " " + moneda, moneda, 1);
		}
}
