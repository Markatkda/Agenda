package co.edu.uniquindio.agenda.model;

import java.util.Arrays;

public class Agenda {

	private String nombre;
	
	private int numeroContactos;
	private int numeroGrupos;
	private int numeroCitas;

	private Contacto[] listaContactos;
	private Grupo[] listaGrupos;
	private Cita[] listaCitas;
	
	public Agenda(String nombre, Contacto[] listaContactos, Grupo[] listaGrupos, Cita[] listaCitas, int numeroContactos,
			int numeroGrupos, int numeroCitas) {
		super();
		this.nombre = nombre;
	
		this.numeroContactos = numeroContactos;
		this.numeroGrupos = numeroGrupos;
		this.numeroCitas = numeroCitas;
		
		this.listaContactos = new Contacto[numeroContactos];
		this.listaGrupos = new Grupo[numeroGrupos];
		this.listaCitas = new Cita[numeroCitas];
		
	}

	public String getNombre() {
		return nombre;
	}

	public int getNumeroContactos() {
		return numeroContactos;
	}

	public int getNumeroGrupos() {
		return numeroGrupos;
	}

	public int getNumeroCitas() {
		return numeroCitas;
	}

	public Contacto[] getListaContactos() {
		return listaContactos;
	}

	public Grupo[] getListaGrupos() {
		return listaGrupos;
	}

	public Cita[] getListaCitas() {
		return listaCitas;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setNumeroContactos(int numeroContactos) {
		this.numeroContactos = numeroContactos;
	}

	public void setNumeroGrupos(int numeroGrupos) {
		this.numeroGrupos = numeroGrupos;
	}

	public void setNumeroCitas(int numeroCitas) {
		this.numeroCitas = numeroCitas;
	}

	public void setListaContactos(Contacto[] listaContactos) {
		this.listaContactos = listaContactos;
	}

	public void setListaGrupos(Grupo[] listaGrupos) {
		this.listaGrupos = listaGrupos;
	}

	public void setListaCitas(Cita[] listaCitas) {
		this.listaCitas = listaCitas;
	}

	@Override
	public String toString() {
		return "Agenda [nombre=" + nombre + ", numeroContactos=" + numeroContactos + ", numeroGrupos=" + numeroGrupos
				+ ", numeroCitas=" + numeroCitas + ", listaContactos=" + Arrays.toString(listaContactos)
				+ ", listaGrupos=" + Arrays.toString(listaGrupos) + ", listaCitas=" + Arrays.toString(listaCitas) + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agenda other = (Agenda) obj;
		if (!Arrays.equals(listaCitas, other.listaCitas))
			return false;
		if (!Arrays.equals(listaContactos, other.listaContactos))
			return false;
		if (!Arrays.equals(listaGrupos, other.listaGrupos))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (numeroCitas != other.numeroCitas)
			return false;
		if (numeroContactos != other.numeroContactos)
			return false;
		if (numeroGrupos != other.numeroGrupos)
			return false;
		return true;
	}
	
	//METODOS
	
	public String crearContacto(String nombre, int edad, String correo, String direccion) throws Exception{
	
		String mensaje = "";
		int posicionContacto = 0;
		Contacto contactoEncontrado = null;
		
		if (contacto == null){
			throw new NullPointerException("El contacto no existe");
		}
		
		contactoEncontrado = buscarContacto();
		
		if (contactoEncontrado != null){
			throw new Exception("El juguete ya existe");
		} else {
			posicionContacto = buscarPosicionDisponible();
			
			if(posicionContacto!= -1){
				listaContactos[posicionContacto] = contacto;
				mensaje = "Creado con exito";
				
			} else{
				throw new Exception("No hay cupo");
			}
		}
		
		return mensaje;
	}
	
	
	public String crearContacto(String nombre, int edad, String telefono, String correo, String direccion) {
		
		String mensaje = "";
		int posicionDisponible = 0;
		boolean existeContacto = false;

		posicionDisponible = obtenerPosicionDisponibleContacto();

		if(posicionDisponible == -1){
			mensaje = "No hay posiciobes disponibles";
			
		}else{
			existeContacto = verificarExistenciaContacto(nombre);
			
			if(existeContacto == false){
				listaContactos[posicionDisponible] = new Contacto(nombre, edad, telefono, correo, direccion);
				
			}else{
				mensaje = "Ya existe un contacto con este numero de telefono";
			}
		}

		return "El contacto fue creado";
	}

	private boolean verificarExistenciaContacto(String nombre) {
		// TODO Auto-generated method stub
		return false;
	}

	private int obtenerPosicionDisponibleContacto() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
