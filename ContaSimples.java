package Conta_Avançada;

public class ContaSimples extends ContaBancaria {
	
	private static double saldoPoupanca;

	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}

	public void setSaldoPoupanca(double saldoPoupanca) {
		this.saldoPoupanca = saldoPoupanca;
	}
	
	public static boolean deposito(double valor) {
		if (valor > 0) {
			saldoPoupanca += valor;
			return true;
		}
		return false;
	}
	
	public static boolean saque(double valor) {
		if (saldoPoupanca < valor) {
			saldoPoupanca -= valor;
			return true;
		}
		
		return false;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaSimples [saldoPoupanca=");
		builder.append(saldoPoupanca);
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
