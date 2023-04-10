package abstracao;


public abstract class Veiculos {
	
	private Condutor condutor;
	



	public Veiculos(
			
			Condutor condutor) {
		
		
		this.condutor = condutor;
	}
	
	
	

	public abstract String getDocumentoVeiculo();

	
	
	public abstract String getDocumentoCondutor();

	@Override
	public String toString() {
		return "Veiculos "
				+ "[Documento do Veiculo=" + getDocumentoVeiculo() + 
				" ,Documento do Condutor="+ getDocumentoCondutor() +
				", Condutor =" + condutor + "]";
							
	}

}


