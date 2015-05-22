package org.uqbarproject.pepita.domain;

public class Ciudad {
	
	private int km;

	public Ciudad(int kmDondeSeUbica){
		this.setKm(kmDondeSeUbica);
	}
	public int distanciaHasta(Ciudad otraCiudad){
		return Math.abs(this.getKm() - otraCiudad.getKm());
	}
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}

}
