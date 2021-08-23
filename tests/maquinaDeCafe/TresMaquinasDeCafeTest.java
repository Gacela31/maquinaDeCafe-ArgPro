package maquinaDeCafe;

import static org.junit.Assert.*;

import org.junit.Test;

public class TresMaquinasDeCafeTest {

	@Test
	public void test() {
		MaquinaDeCafe maquinaEco = new MaquinaEconomica();
		MaquinaDeCafe maquinaEstaf = new MaquinaEstafadora();
		MaquinaDeCafe maquinaPre = new MaquinaPremium();
	
		MaquinaDeCafe [] maquinas = new MaquinaDeCafe[3];
		
		maquinas[0] = maquinaEco;
		maquinas[1] = maquinaEstaf;
		maquinas[2] = maquinaPre;
	
		for(MaquinaDeCafe cadaUna : maquinas) {
			System.out.println(cadaUna.servirCafe());
		}
		
		for(MaquinaDeCafe cadaUna : maquinas) {
			System.out.println(cadaUna.servirCafe());
		}
	}

}
