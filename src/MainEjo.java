
public class MainEjo {

	public static void main(String[] args) {
		
		ClientEjo cl1 = new ClientEjo("Romilda das Tapiocas", "000.000.000-01");
		ClientEjo cl2 = new ClientEjo("Cremildo das Tapiocas", "000.000.000-02");
		ClientEjo cl3 = new ClientEjo("Zeninha das Tapiocas", "000.000.000-03");
		
		ContaEjo c1 = new ContaEjo("445", 80.00, cl1);
		ContaEjo c2 = new ContaEjo("556", 100.00, cl2);
		ContaEjo c3 = new ContaEjo("667",10.00, cl3);
	
//		System.out.println("Saldo da conta c1 é: " + c1.getSaldo() + " e da conta c2 é: " + c2.getSaldo());
//		
//		c1.creditar(25);
//		System.out.println("Saldo da conta c1 é: " + c1.getSaldo() + " e da conta c2 é: " + c2.getSaldo());
//		c2.debitar(30);
//		System.out.println("Saldo da conta c1 é: " + c1.getSaldo() + " e da conta c2 é: " + c2.getSaldo());
//		
//		c2.transferir(c1,20);
//		System.out.println("Saldo da conta c1 é: " + c1.getSaldo() + " e da conta c2 é: " + c2.getSaldo());
//		c2.debitar(60);
//		System.out.println(c2.getSaldo());

		System.out.println("Saldo conta c2 é: " + c2.getSaldo() + " e Saldo conta c3 é: " + c3.getSaldo());
		c3.transferir(c2, 9);
		System.out.println("Saldo conta c2 é: " + c2.getSaldo() + " e Saldo conta c3 é: " + c3.getSaldo());
		
	}
	

}
