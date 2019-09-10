package computador;

public class Monitor {
	
	private String tipo;
	private String marca;
	private String resolucao;
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getResolucao() {
		return resolucao;
	}
	public void setResolucao(String resolucao) {
		this.resolucao = resolucao;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Monitor [tipo=");
		builder.append(tipo);
		builder.append(", marca=");
		builder.append(marca);
		builder.append(", resolucao=");
		builder.append(resolucao);
		builder.append("]");
		return builder.toString();
	}

	
}
