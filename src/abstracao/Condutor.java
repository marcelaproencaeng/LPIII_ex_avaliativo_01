package abstracao;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Condutor {


private static final Integer MAIORIDADE = 18;

private String nome;
private String sobrenome;
private String cpf;
private String cnh;
private LocalDate dataNascimento;

public Condutor(String nome, 
		String sobrenome, 
		String cpf, 
		String cnh,
		LocalDate 
		dataNascimento) {
	
	this.nome = nome;
	this.sobrenome = sobrenome;
	this.cpf = cpf;
	this.cnh=cnh;
	this.dataNascimento = dataNascimento;
}

public boolean isMaiorIdade() {
	long idade = ChronoUnit.YEARS.between(dataNascimento, LocalDate.now());
	return idade >= MAIORIDADE; 
}
    @Override
public String toString() {
    	return "Condutor [nome=" + nome + ", sobrenome=" + sobrenome + ", cpf=" + cpf +",cnh=" + cnh + " ,dataNascimento=" +
dataNascimento +"]"; 
    }
  }
	