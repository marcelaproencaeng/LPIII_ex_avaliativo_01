package heranca;

import abstracao.Condutor;
import abstracao.Veiculos;

public class Bicicleta extends Veiculos {

	private String marca;
	private String modelo;
	private String cor;
	private String cpfCondutor;
	
	public Bicicleta(String marca,
			String modelo,
			String cor,
			String cpfCondutor,
			Condutor condutor) {
		Super(condutor);
		this.marca=marca;
		this.modelo=modelo;
		this.cor=cor;
		this.cpfCondutor=cpfCondutor;
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
	public String getCpfCondutor() {
		return cpfCondutor;
	}
	@Override
	public String getDocumentoVeiculo() {
		return getMarca() +""+getModelo()+""+getCor()+"";
	}
	@Override
	public String getDocumentoCondutor() {
		return getCpfCondutor()+"";
	}
	
}
	