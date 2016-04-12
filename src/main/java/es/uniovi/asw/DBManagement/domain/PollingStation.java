package es.uniovi.asw.DBManagement.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "POLLINGSTATION")
public class PollingStation {

	@Id
	@GeneratedValue
	private Long id;
	private String circunscripcion;
	private String comunidadAutonoma;

	public PollingStation() {

	}

	public String getCircunscripcion() {
		return circunscripcion;
	}

	public void setCircunscripcion(String circunscripcion) {
		this.circunscripcion = circunscripcion;
	}

	public String getComunidadAutonoma() {
		return comunidadAutonoma;
	}

	public void setComunidadAutonoma(String comunidadAutonoma) {
		this.comunidadAutonoma = comunidadAutonoma;
	}

	public Long getId() {
		return id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((circunscripcion == null) ? 0 : circunscripcion.hashCode());
		result = prime * result + ((comunidadAutonoma == null) ? 0 : comunidadAutonoma.hashCode());
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
		PollingStation other = (PollingStation) obj;
		if (circunscripcion == null) {
			if (other.circunscripcion != null)
				return false;
		} else if (!circunscripcion.equals(other.circunscripcion))
			return false;
		if (comunidadAutonoma == null) {
			if (other.comunidadAutonoma != null)
				return false;
		} else if (!comunidadAutonoma.equals(other.comunidadAutonoma))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PollingStation [id=" + id + ", circunscripcion=" + circunscripcion + ", comunidadAutonoma="
				+ comunidadAutonoma + "]";
	}

}
