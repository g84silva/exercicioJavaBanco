
public class ClientEjo {
	private String nome;
	private String cpf;
	
	public ClientEjo(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;	
	}

	public ClientEjo() {
		super();
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
