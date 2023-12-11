import com.fasterxml.jackson.annotation.JsonInclude;
@JsonInclude(JsonInclude.Include.NON_NULL)

public class Pessoa {
	private String nome;
	private int idade;
	
	public Pessoa() {
		
	}
	public Pessoa(String nm, int idd) {
		this.nome = nm;
		this.idade = idd;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
