package org.uqbarproject.pepita.domain;

public class Pepita {
	
	private int energia;
	private Ciudad ciudad;

	public void come(Comida comida) {
		this.setEnergia(this.getEnergia() + comida.energia());
	}

	public void volaHacia(Ciudad ciudad) { 
		this.setEnergia(this.getEnergia() -  15 - 6 * (ciudad.distanciaHasta(this.getCiudad())));
		this.setCiudad(ciudad);
	}

	
	//Getters & Setters
	
	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

}

