package banco_digital;

public class ContaPoupanca extends Conta{
	
	public void imprimirExtrato() {
		System.out.println("===Extrato Conta Poupanca ===");
		super.imprimirInfosComuns();
	}
	
}
