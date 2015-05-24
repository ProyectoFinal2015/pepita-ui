package org.uqbarproject.pepita.domain;

public class BolsaDeAlpiste implements Comida {

	private int cant;

	public BolsaDeAlpiste(int cantidadDeGramos){
		super();
		this.cant = cantidadDeGramos;
	}
	
	@Override
	public int energia() {
		return getCant() * 80;
	}

	public int getCant() {
		return cant;
	}

	public void setCant(int cant) {
		this.cant = cant;
	}

}
