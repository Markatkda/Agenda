package co.edu.uniquindio.agenda.model;

public class Grupo {

	private String nombre;
	
	private int numeroConstactosGrupo;
	private int numeroCitasGrupo;
	
	private Contacto[] listaContactosGrupo;
	private Cita[] listaCitasGrupo;
	
	public Grupo(String nombre, int numeroConstactosGrupo, int numeroCitasGrupo, Contacto[] listaContactosGrupo,
			Cita[] listaCitasGrupo) {
		super();
		this.nombre = nombre;
		this.numeroConstactosGrupo = numeroConstactosGrupo;
		this.numeroCitasGrupo = numeroCitasGrupo;
		
		this.listaContactosGrupo = new Contacto[numeroConstactosGrupo]
		this.listaCitasGrupo = new Cita[numeroCitasGrupo];
	}
	
	
	
}
