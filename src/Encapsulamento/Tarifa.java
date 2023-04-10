package Encapsulamento;

public class Tarifa {
	private double tempo;
	private double valorHora;
	private double tarifa;
	
	
	private double tarifaAteMeiaHora;
	private double tarifaAteUmaHora;
	private double tarifaHoraAdicional;
	private double diaria;
	private double t1;
	private double t6;
	
	public Tarifa(double tarifaAteMeiaHora,double tarifaHoraAdicional)
	{ this.tarifaAteMeiaHora=tarifaAteMeiaHora;
	  this.tarifaHoraAdicional=tarifaHoraAdicional;
	  tarifa=tarifaAteMeiaHora+tarifaHoraAdicional;
	  
	  if(t1<tempo && tempo<=t6) {
		  
		  tarifa=tarifaAteUmaHora + tarifaHoraAdicional;
		  System.out.println(tarifa);
	}else {
		  System.out.println(diaria);
	}
	}
	  private void recalcularTarifa() {
		  tarifa=tarifaAteMeiaHora+tarifaHoraAdicional;
	  }
	  public double getTarifaAteMeiaHora() {
		  return tarifaAteMeiaHora;
	  }
	  public void setTarifaAteMeiaHora(double tarifaAteMeiaHora) {
		  this.tarifaAteMeiaHora=tarifaAteMeiaHora;
		  recalcularTarifa();
	  }
	  public double getTarifaHoraAdicional() {
		  return tarifaHoraAdicional;
		  
	  }
	  public void setTarifaHoraAdicional() {
		  this.tarifaHoraAdicional=tarifaHoraAdicional;
		  recalcularTarifa();
		  
	  }
	  public double getTarifa() {
		  return tarifa;
	  }
	  
	@Override 
	public String to String() {
		return "Tarifa[tarifaAteMeiaHora="+tarifaAteMeiaHora+",tarifaHoraAdicional="+ tarifaHoraAdicional+"]";
				
	}
}

		
		
		

