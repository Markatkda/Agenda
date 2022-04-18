package co.edu.uniquindio.agenda.model;

import java.util.Arrays;

public class Contacto {

	private String nombre;
	private int edad;
	private String telefono;
	private String correo;
	private String direccion;
	
	private int numeroGrupos;
	private int numeroCitasContacto;
	
	private Agenda agenda;
	
	private Grupo[] listaGrupos;
	private Cita[] listaCitasContacto;
	
	public Contacto(String nombre, int edad, String telefono, String correo, String direccion, int numeroGrupos,
			int numeroCitasContacto, Agenda agenda, Grupo[] listaGrupos, Cita[] listaCitasContacto) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.telefono = telefono;
		this.correo = correo;
		this.direccion = direccion;
		this.numeroGrupos = numeroGrupos;
		this.numeroCitasContacto = numeroCitasContacto;
		this.agenda = agenda;
		
		this.listaGrupos = new Grupo[numeroGrupos];
		this.listaCitasContacto = new Cita[numeroCitasContacto];
	}

	public Contacto(String nombre, int edad, String telefono, String correo, String direccion) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.telefono = telefono;
		this.correo = correo;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public String getDireccion() {
		return direccion;
	}

	public int getNumeroGrupos() {
		return numeroGrupos;
	}

	public int getNumeroCitasContacto() {
		return numeroCitasContacto;
	}

	public Agenda getAgenda() {
		return agenda;
	}

	public Grupo[] getListaGrupos() {
		return listaGrupos;
	}

	public Cita[] getListaCitasContacto() {
		return listaCitasContacto;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setNumeroGrupos(int numeroGrupos) {
		this.numeroGrupos = numeroGrupos;
	}

	public void setNumeroCitasContacto(int numeroCitasContacto) {
		this.numeroCitasContacto = numeroCitasContacto;
	}

	public void setAgenda(Agenda agenda) {
		this.agenda = agenda;
	}

	public void setListaGrupos(Grupo[] listaGrupos) {
		this.listaGrupos = listaGrupos;
	}

	public void setListaCitasContacto(Cita[] listaCitasContacto) {
		this.listaCitasContacto = listaCitasContacto;
	}

	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", edad=" + edad + ", telefono=" + telefono + ", correo=" + correo
				+ ", direccion=" + direccion + ", numeroGrupos=" + numeroGrupos + ", numeroCitasContacto="
				+ numeroCitasContacto + ", agenda=" + agenda + ", listaGrupos=" + Arrays.toString(listaGrupos)
				+ ", listaCitasContacto=" + Arrays.toString(listaCitasContacto) + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contacto other = (Contacto) obj;
		if (agenda == null) {
			if (other.agenda != null)
				return false;
		} else if (!agenda.equals(other.agenda))
			return false;
		if (correo == null) {
			if (other.correo != null)
				return false;
		} else if (!correo.equals(other.correo))
			return false;
		if (direccion == null) {
			if (other.direccion != null)
				return false;
		} else if (!direccion.equals(other.direccion))
			return false;
		if (edad != other.edad)
			return false;
		if (!Arrays.equals(listaCitasContacto, other.listaCitasContacto))
			return false;
		if (!Arrays.equals(listaGrupos, other.listaGrupos))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (numeroCitasContacto != other.numeroCitasContacto)
			return false;
		if (numeroGrupos != other.numeroGrupos)
			return false;
		if (telefono == null) {
			if (other.telefono != null)
				return false;
		} else if (!telefono.equals(other.telefono))
			return false;
		return true;
	}
	
	//METODOS 
	
	public boolean verificarIgualdad (String nombre){
		return getNombre() == nombre;
	}

}
