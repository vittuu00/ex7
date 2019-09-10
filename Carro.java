package Carro.Motor.Pessoa;

public class Carro {

	private String modelo;
	private String fabricante;
	private String cor;
	protected Motor motor;
	protected Pessoa dono;
	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	public Pessoa getDono() {
		return dono;
	}
	public void setDono(Pessoa dono) {
		this.dono = dono;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Carro [modelo=");
		builder.append(modelo);
		builder.append(", fabricante=");
		builder.append(fabricante);
		builder.append(", cor=");
		builder.append(cor);
		builder.append(", motor=");
		builder.append(motor);
		builder.append(", dono=");
		builder.append(dono);
		builder.append("]");
		return builder.toString();
	}	
}
