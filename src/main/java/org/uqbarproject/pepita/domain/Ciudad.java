package org.uqbarproject.pepita.domain;

public class Ciudad {
	
	private int km;

	public Ciudad(int kmDondeSeUbica){
		this.setKm(kmDondeSeUbica);
	}
	public int distanciaHasta(Ciudad otraCiudad){
		return Math.abs(this.getKm() - otraCiudad.getKm());
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + km;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ciudad other = (Ciudad) obj;
		return (km != other.km);
	}
	
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}

}
