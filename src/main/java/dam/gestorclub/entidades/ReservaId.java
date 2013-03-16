package dam.gestorclub.entidades;

// Generated 16-mar-2013 16:35:04 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * ReservaId generated by hbm2java
 */
public class ReservaId implements java.io.Serializable {

	private short pistaId;
	private Date fecha;

	public ReservaId() {
	}

	public ReservaId(short pistaId, Date fecha) {
		this.pistaId = pistaId;
		this.fecha = fecha;
	}

	public short getPistaId() {
		return this.pistaId;
	}

	public void setPistaId(short pistaId) {
		this.pistaId = pistaId;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ReservaId))
			return false;
		ReservaId castOther = (ReservaId) other;

		return (this.getPistaId() == castOther.getPistaId())
				&& ((this.getFecha() == castOther.getFecha()) || (this
						.getFecha() != null && castOther.getFecha() != null && this
						.getFecha().equals(castOther.getFecha())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getPistaId();
		result = 37 * result
				+ (getFecha() == null ? 0 : this.getFecha().hashCode());
		return result;
	}

}
