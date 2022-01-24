/*
 * AUTOR: ALBERT NOTARIO MESTRES
 * DATA: 24/01/22
 */

package main;

public class MainAPP {

	public static void main(String[] args) {

		Electrodomestico e1 = new Electrodomestico(300, "Rojo", 'A', 55.4);
		Electrodomestico e2 = new Electrodomestico(300, "Azul", 'A', 55.4);

		System.out.println(e1.toString());
		System.out.println(e2.toString());

	}

}