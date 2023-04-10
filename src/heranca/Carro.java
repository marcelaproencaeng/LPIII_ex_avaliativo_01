package heranca;

import java.time.LocalDateTime;

import abstracao.Condutor;
import abstracao.Veiculos;

public class Carro extends Veiculos {
	private String placa;
	private String marca;
	private String modelo;
	private String cor;
	private String cnhCondutor;
	
	
	
	
	public Carro(String placa,
				 String marca,
				 String modelo,
			     String cor,
			     String cnhCondutor,
			     Condutor condutor) {
		
		Super(condutor);
		this.placa=placa;
		this.marca=marca;
		this.modelo=modelo;
		this.cor=cor;
		this.cnhCondutor=cnhCondutor;
		
	}


	public String getDocumentoVeiculo() {
		return placa + "" + modelo +" " + marca +" "+ cor +" ";
	}
	public String getDocumentoCondutor() {
		return cnhCondutor;
			     
	}
}
	


