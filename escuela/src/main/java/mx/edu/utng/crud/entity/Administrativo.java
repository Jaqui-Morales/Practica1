package mx.edu.utng.crud.entity;

/**
 *@author Jaqueline López Morales
 * 22 de noviembre de 2019
 * email: JaquiMorales2020@gmail.com
 */


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Administrativo {

	//Propiedad que identifica al objeto
		@Id
		@NotBlank(message= "El id no debe estar vacío")
		private Long id;
		
		@NotBlank(message= "El nombre no debe estar vacío ")
		private String nombre;
		
		@NotBlank(message= "Apellidos no debe estar vacío ")
		private String apellidos;
		
		@NotBlank(message= "La CURP no debe estar vacía ")
		private String curp;
		
		@NotBlank(message= "Antiguedad no debe estar vacío ")
		private String antiguedad;
		
		@NotBlank(message= "Departamento no debe estar vacío ")
		private String departamento;


		
		//Constructores de la clase
		
		public Administrativo() {
			super();
		}



		public Administrativo(@NotBlank(message = "El id no debe estar vacío") Long id,
				@NotBlank(message = "El nombre no debe estar vacío ") String nombre,
				@NotBlank(message = "Apellidos no debe estar vacío ") String apellidos,
				@NotBlank(message = "La CURP no debe estar vacía ") String curp,
				@NotBlank(message = "Antiguedad no debe estar vacío ") String antiguedad,
				@NotBlank(message = "Departamento no debe estar vacío ") String departamento) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.curp = curp;
			this.antiguedad = antiguedad;
			this.departamento = departamento;
		}


		//Getters and Setters
		
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



		public String getApellidos() {
			return apellidos;
		}



		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}



		public String getCurp() {
			return curp;
		}



		public void setCurp(String curp) {
			this.curp = curp;
		}



		public String getAntiguedad() {
			return antiguedad;
		}



		public void setAntiguedad(String antiguedad) {
			this.antiguedad = antiguedad;
		}



		public String getDepartamento() {
			return departamento;
		}



		public void setDepartamento(String departamento) {
			this.departamento = departamento;
		}



		@Override
		public String toString() {
			return "Administrativo [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", curp=" + curp
					+ ", antiguedad=" + antiguedad + ", departamento=" + departamento + "]";
		}
		
		
		
		
		
}
