
public class ContaCorrente extends Conta{

	public ContaCorrente(Cliente cliente) {
		super(cliente);
		
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}
	
	@Override
    public void alterarLimiteCartao(double novoLimite) {
        this.limite = novoLimite;
    }
	
	@Override
	public void imprimirLimiteCartao() {
		System.out.println("Limite do Cartão de Crédito: " + this.getLimite());
	}
}
