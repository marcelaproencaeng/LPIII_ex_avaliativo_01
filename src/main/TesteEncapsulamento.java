package main;

import Encapsulamento.Tarifa;

public class TesteEncapsulamento {
	public static void main(String[] args) {
		Tarifa tarifa=new Tarifa(15.00,5.00);
		System.out.println(tarifa);
		
		tarifa.setTarifaAteUmaHora(15.00);
		System.out.println(tarifa);
		
		tarifa.setTarifaHoraAdicional(30.00);
		System.out.println(tarifa);
		
		
		
	}

}
