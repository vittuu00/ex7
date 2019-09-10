package Carro.Motor.Pessoa;

public class Main {

	public static void main(String[] args) {
		
		Motor m = new Motor();
		m.setCilindros(120);
		m.setCombustivel("alcool");
		m.setMarca("ford");
		m.setPotencia(220);
		
		Pessoa p = new Pessoa();
		p.setEndereco("lalala");
		p.setNome("Vitor");
		
		Carro c = new Carro();
		c.setMotor(m);
		c.setDono(p);
		c.setCor("azul");
		c.setFabricante("lelelel");
		c.setModelo("sedam");
		
		System.out.println(p);
		System.out.println(m);
		System.out.println(c);
	}
}
