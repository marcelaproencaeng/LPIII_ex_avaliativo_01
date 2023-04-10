package heranca;

import abstracao.Condutor;
import abstracao.Veiculos;

public class Moto extends Veiculos {

	private String placa;
	private String marca;
	private String modelo;
	private String cor;
	private String cnhCondutor;
	
	public Moto(String placa,
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
	public String getPlaca() {
		return placa;
	}
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public String getCor() {
		return cor;
	}
	public String getcnhCondutor() {
		return cnhCondutor;
	}
	@Override
	public String getDocumentoVeiculo() {
		return placa +" "+ marca+ " "+ modelo+" "+ cor+" ";
		
	}
	@Override
	public String getDocumentoCondutor() {
		return cnhCondutor;

      }
}