package Carro.Motor.Pessoa;

public class Motor {

	private String marca;
	private String combustivel;
	private int cilindros;
	private float potencia;
	
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	public int getCilindros() {
		return cilindros;
	}
	public void setCilindros(int cilindros) {
		this.cilindros = cilindros;
	}
	public float getPotencia() {
		return potencia;
	}
	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Motor [marca=");
		builder.append(marca);
		builder.append(", combustivel=");
		builder.append(combustivel);
		builder.append(", cilindros=");
		builder.append(cilindros);
		builder.append(", potencia=");
		builder.append(potencia);
		builder.append("]");
		return builder.toString();
	}
}
