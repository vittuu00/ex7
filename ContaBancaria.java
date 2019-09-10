package Conta_Avançada;

public class ContaBancaria {
	
	private Banco banco;
	private int agencia;
	private int conta;
	private static double saldo;
	private Pessoa correntista;
	
	
	public Banco getBanco() {
		return banco;
	}
	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Pessoa getCorrentista() {
		return correntista;
	}
	public void setCorrentista(Pessoa correntista) {
		this.correntista = correntista;
	}
	
	public static boolean deposito(double valor) {
		if (valor > 0) {
			saldo += valor;
			return true;
		}
		return false;
	}
	
	public static boolean saque(double valor) {
		if (saldo < valor) {
			saldo -= valor;
			return true;
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaBancaria [banco=");
		builder.append(banco);
		builder.append(", agencia=");
		builder.append(agencia);
		builder.append(", conta=");
		builder.append(conta);
		builder.append(", correntista=");
		builder.append(correntista);
		builder.append("]");
		return builder.toString();
	}
	
	
}
