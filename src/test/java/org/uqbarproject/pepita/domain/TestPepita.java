package org.uqbarproject.pepita.domain;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestPepita {
	
	private Pepita pepita;
	private Manzana manzana;
	private BolsaDeAlpiste cienDeAlpiste;

	@Before
	public void init(){
		pepita = new Pepita();
		manzana = new Manzana();
		cienDeAlpiste = new BolsaDeAlpiste(100);
		pepita.setCiudad(new Ciudad(0));
	}
	
	@Test
	public void pepitaComeManzanaYAumentaSuEnergia(){
		pepita.come(manzana);
		assertEquals(100,pepita.getEnergia());
	}
	
	@Test
	public void pepitaCome100GramosDeAlpisteYAumentaEnergia(){
		pepita.come(cienDeAlpiste);
		assertEquals(8000,pepita.getEnergia());		
	}
	
	public void pepitaComeCienDeAlpisteYVuelaAGessell(){
		pepita.come(cienDeAlpiste);
		pepita.volaHacia(new Ciudad(400));
		assertEquals(5685,pepita.getEnergia());
	}
	
	
}
