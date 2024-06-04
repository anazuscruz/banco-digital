package banco_digital;

public class Main {

	public static void main(String[] args) {
		Conta cc = new ContaCorrete();
		Conta poupanca = new ContaPoupanca();
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
