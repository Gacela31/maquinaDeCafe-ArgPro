package maquinaDeCafe;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaquinaPremiumTest {

	MaquinaDeCafe maquinita;
	
	@Before
	public void setup() {
		maquinita = new MaquinaPremium();
	}
	@Test
	public void queDevuelveUnVasoAlServir() {
		VasoDeCafe vaso = maquinita.servirCafe();
		Assert.assertNotNull(vaso);
	}
	
	@Test
	public void quePuedeServirUnCafe() {
		Assert.assertTrue(maquinita.puedeServir());
	}
	
	@Test
	public void queSeAgoteElCafe() {
		for(int i = 0; i < 100; i++) {
			maquinita.servirCafe();
		}
		Assert.assertFalse(maquinita.puedeServir());
	}
	
	@Test
	public void queLuegoDeAgotarElCafeSirveVasoVacio() {
		for(int i = 0; i < 100; i++) {
			maquinita.servirCafe();
		}
		VasoDeCafe vaso = maquinita.servirCafe();
		Assert.assertFalse(vaso.estaLleno());
	}

}
