package org.uqbarproject.pepita.domain;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestPepita {
	
	private Pepita pepita;
	private Manzana manzana;
	private BolsaDeAlpiste cienDeAlpiste;
	private Ciudad gesell;

	@Before
	public void init(){
		pepita = new Pepita();
		manzana = new Manzana();
		cienDeAlpiste = new BolsaDeAlpiste(100);
		pepita.setCiudad(new Ciudad(0));
		gesell = new Ciudad(400);
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
	
	@Test
	public void pepitaVuelaYBajaSuEnergia(){
		pepita.come(cienDeAlpiste);
		pepita.volaHacia(gesell);
		assertEquals(5585,pepita.getEnergia());
	}
	
	@Test
	public void pepitaVuelvaYCambiaDeCiudad(){
		pepita.come(cienDeAlpiste);
		pepita.volaHacia(gesell);
		assertEquals(gesell,pepita.getCiudad());		
	}
}
