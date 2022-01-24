/*
 * AUTOR: ALBERT NOTARIO MESTRES
 * DATA: 24/01/22
 */

package main;

public class Electrodomestico {

	// CONSTANTES
	final String COLOR = "Blanco";
	final double PRECIO = 100.0;
	final char CONSUMO = 'F';
	final double PESO = 5.0;

	// ATRIBUTOS
	private double precioBase;
	private String color;
	private char consumo;
	private double peso;

	// METODO PARA VALIDAR COLOR Y PASAR A MINUSCULAS
	private String comprobarColor(String color) {
		String colores[] = new String[] { "Blanco", "Negro", "Rojo", "Azul", "Gris" };
		String colorUsuario = color;

		for (int i = 0; i < colores.length; i++) {
			if (colorUsuario.equalsIgnoreCase(colores[i])) {
				color = colorUsuario;
				return color;
			} else {
				color = COLOR;
			}
		}

		return color;
	}

	// CONSTRUCTOR POR DEFECTO
	public Electrodomestico() {

		this.precioBase = PRECIO;
		this.color = COLOR;
		this.consumo = CONSUMO;
		this.peso = PESO;
	}

	// CONSTRUCTOR CON PRECIO PESO Y EL RESTO POR DEFECTO
	public Electrodomestico(double precioBase, double peso) {

		this.precioBase = precioBase;
		this.peso = peso;
		this.color = COLOR;
		this.consumo = CONSUMO;
	}

	// CONSTRUCTOR CON TODO
	public Electrodomestico(double precioBase, String color, char consumo, double peso) {

		this.precioBase = precioBase;
		this.color = comprobarColor(color);
		this.consumo = consumo;
		this.peso = peso;
	}

	// METODO TO STRING
	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumo=" + consumo + ", peso="
				+ peso + "]";
	}
}