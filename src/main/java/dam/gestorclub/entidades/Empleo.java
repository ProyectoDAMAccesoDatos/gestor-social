package dam.gestorclub.entidades;

// Generated 16-mar-2013 16:35:04 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Empleo generated by hbm2java
 */
public class Empleo implements java.io.Serializable {

	private short idempleo;
	private String nombre;
	private String horario;
	private BigDecimal sueldo;
	private Set<Empleado> empleados = new HashSet<Empleado>(0);

	public Empleo() {
	}

	public Empleo(short idempleo, String nombre, String horario) {
		this.idempleo = idempleo;
		this.nombre = nombre;
		this.horario = horario;
	}

	public Empleo(short idempleo, String nombre, String horario,
			BigDecimal sueldo, Set<Empleado> empleados) {
		this.idempleo = idempleo;
		this.nombre = nombre;
		this.horario = horario;
		this.sueldo = sueldo;
		this.empleados = empleados;
	}

	public short getIdempleo() {
		return this.idempleo;
	}

	public void setIdempleo(short idempleo) {
		this.idempleo = idempleo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getHorario() {
		return this.horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public BigDecimal getSueldo() {
		return this.sueldo;
	}

	public void setSueldo(BigDecimal sueldo) {
		this.sueldo = sueldo;
	}

	public Set<Empleado> getEmpleados() {
		return this.empleados;
	}

	public void setEmpleados(Set<Empleado> empleados) {
		this.empleados = empleados;
	}

}
