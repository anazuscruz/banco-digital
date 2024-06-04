package banco_digital;

public class ContaCorrete extends Conta{
	
	public void imprimirExtrato() {
		System.out.println("===Extrato Conta Correte===");
		super.imprimirInfosComuns();
		
	}
}