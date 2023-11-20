
public class Main {

	public static void main(String[] args) {
		Cliente nonato = new Cliente();
		nonato.setNome("Nonato");
		
		Conta cc = new ContaCorrente(nonato);
		cc.depositar(100);
		Conta cp = new ContaPoupanca(nonato);
		cp.depositar(636.36);
		
		cc.transferir(78.45, cp);
		
		cc.comprarCartao();
		
		cc.alterarLimiteCartao(150.00);  // Altera o limite
        cp.alterarLimiteCartao(1850.00);

        cc.imprimirExtrato();
        System.out.println("Limite do Cartão de Crédito: " + cc.getLimite());
        String mensagemContaCorrente = cc.comprarCartao();
        System.out.println(mensagemContaCorrente);
        
        System.out.println();
        
        cp.imprimirExtrato();
        System.out.println("Limite do Cartão de Crédito: " + cp.getLimite());
        mensagemContaCorrente = cp.comprarCartao();
        System.out.println(mensagemContaCorrente);
	}
}
