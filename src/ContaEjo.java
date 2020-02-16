
public class ContaEjo {
	private String numero;
	private double saldo;
	private ClientEjo cliente;
	
	public ContaEjo(String numero, ClientEjo cliente) {
		this.numero = numero;
		this.cliente = cliente;
	}
	
	public ContaEjo(String numero, double saldo, ClientEjo cliente) {
		this.numero = numero;
		this.saldo = saldo;
		this.cliente = cliente;
	}
	
	public ContaEjo() {
		super();
	}
	
	public String getNumero() {
		return this.numero;
	}
	
	private void setNumero(String numero) {
		this.numero = numero;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public ClientEjo getCliente() {
		return this.cliente;
	}
	
	private void setCliente(ClientEjo cliente) {
		this.cliente = cliente;
	}
	
	public double creditar(double valor) {
		this.saldo = saldo + valor;
		return this.saldo;
	}
	
	public double debitar(double valor) {
		if (this.saldo >= valor) {
			this.saldo = saldo - valor;
			System.out.println("Transação realizada com sucesso!");
			}else{
			System.out.println("Saldo insuficiente para esta transação!");
			}
		return saldo;
	}
	
	public double transferir(ContaEjo contaDestino, double valor) {
		if(this.getSaldo() - valor < 0) {
			System.out.println("Saldo da conta de origem é insuficiente para esta transação!");
			}else{
			this.debitar(valor);
			contaDestino.creditar(valor);
			}
		return this.getSaldo();
	}
	
}

