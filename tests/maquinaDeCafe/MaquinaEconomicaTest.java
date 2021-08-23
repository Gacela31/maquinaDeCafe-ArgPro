package maquinaDeCafe;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaquinaEconomicaTest {
MaquinaDeCafe maquinita;
	
	@Before
	public void setup() {
		maquinita = new MaquinaEconomica();
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
	public void queNoRestaAntesDelTercero() {
		maquinita.servirCafe();
		maquinita.servirCafe();
		maquinita.servirCafe();
		assertEquals(1000 - 10, maquinita.getGramosDeCafe());
	}
	@Test
	public void queSeAgoteElCafe() {
		for(int i = 0; i < 300; i++) {
			maquinita.servirCafe();
		}
		Assert.assertFalse(maquinita.puedeServir());
	}
	
	@Test
	public void queLuegoDeAgotarElCafeSirveVasoVacio() {
		for(int i = 0; i < 300; i++) {
			maquinita.servirCafe();
		}
		VasoDeCafe vaso = maquinita.servirCafe();
		Assert.assertFalse(vaso.estaLleno());
	}
}
