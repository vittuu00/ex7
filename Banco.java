package Conta_Avan�ada;

public class Banco {

	private int codigo;
	private String nome;
	private int numeroAgencia;
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumeroAgencia() {
		return numeroAgencia;
	}
	public void setNumeroAgencia(int numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Banco [codigo=");
		builder.append(codigo);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", numeroAgencia=");
		builder.append(numeroAgencia);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
