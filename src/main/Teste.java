package main;

import java.time.LocalDate;

import abstracao.Condutor;
import abstracao.Veiculos;
import heranca.Bicicleta;
import heranca.Carro;
import heranca.Moto;

public class Teste {
	public static void main(String[]args) {
		Veiculos veiculos=criarCarro();
		System.out.println(veiculos);
		
		veiculos=criarMoto();
		System.out.println(veiculos);
		
		veiculos=criarBicicleta();
		System.out.println(veiculos);
		
	}
	private static Carro criarCarro() {
		return new Carro(
				"ITA2Q20",
				"Ford",
				"Ford Fiesta",
				"Branco",
				"22222222222",
			criarCondutor());
				
	}
	private static Moto criarMoto() {
		return new Moto(
				"ANM9X33",
				"Harley-Davidson",
				"Heritage Classic 114",
				"Preta",
				"13455553579",
				criarCondutor()
				);
				
	}
	private static Bicicleta criarBicicleta() {
		return new Bicicleta(
				"Caloi",
				"Mountain Bike Aro 26",
				"Verde e Branca",
				"98478813044",
				criarCondutor()
				);
		
				
	}
	private static Condutor criarCondutor() {
		return new Condutor(
				"Maria",
				"Sampaio",
				"98867823422",
				"23456789899",
				LocalDate.of(1995, 04, 10));
	}
}
				

