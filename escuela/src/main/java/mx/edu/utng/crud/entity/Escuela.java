package mx.edu.utng.crud.entity;

/**
 *@author Jaqueline López Morales
 * 22 de noviembre de 2019
 * email: JaquiMorales2020@gmail.com
 */


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Escuela {
	//Propiedad que identifica al objeto
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String nombre;
	@Column
	private String cct; //Clave en el centro de trabajo
	@Column
	private String domicilio;
	@Column
	private String director;
	@Column
	private String nivel;
	
	
	@ManyToOne(optional= false, cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	//Una escuela tiene muchos administrativos
	@JoinColumn
	private Administrativo administrativo;




	
	//Constructores de la clase
	public Escuela() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Escuela(Long id, String nombre, String cct, String domicilio, String director, String nivel,
			Administrativo administrativo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cct = cct;
		this.domicilio = domicilio;
		this.director = director;
		this.nivel = nivel;
		this.administrativo = administrativo;
	}


//Getters y Setters

	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public String getCct() {
		return cct;
	}




	public void setCct(String cct) {
		this.cct = cct;
	}




	public String getDomicilio() {
		return domicilio;
	}




	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}




	public String getDirector() {
		return director;
	}




	public void setDirector(String director) {
		this.director = director;
	}




	public String getNivel() {
		return nivel;
	}




	public void setNivel(String nivel) {
		this.nivel = nivel;
	}




	public Administrativo getAdministrativo() {
		return administrativo;
	}




	public void setAdministrativo(Administrativo administrativo) {
		this.administrativo = administrativo;
	}




	@Override
	public String toString() {
		return "Escuela [id=" + id + ", nombre=" + nombre + ", cct=" + cct + ", domicilio=" + domicilio + ", director="
				+ director + ", nivel=" + nivel + ", administrativo=" + administrativo + "]";
	}
	
	


	
	
	

}
