package maquinaDeCafe;

public class MaquinaEconomica extends MaquinaDeCafe {
	
	private int contadorDeServidos = 0;
	
	public MaquinaEconomica() {
		super();
	}
	
	@Override
	public void restarCafe() {
		this.contadorDeServidos ++;
		if(this.contadorDeServidos % 3 == 0) {
			super.restarCafe();
			this.contadorDeServidos = 0;
		}
	}
}
