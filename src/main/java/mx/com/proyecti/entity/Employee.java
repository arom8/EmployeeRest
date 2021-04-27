package mx.com.proyecti.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



//Anotacion inicia con arroba
//Metadata hace referencia al afuncionalidad de nuestro codigo
//Le asigna funcionalidad o caracteristicas a nuestro codigo
//LAs anotaciones sustituyen alos archivos de configuracion
//
@Entity //definir a esta clase como una entidad
@Table(name="employee")//relacionar nuestra entidad definida en java con la tabla definida en oracle
public class Employee implements Serializable {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;
	private String firstname;
	private String lastname;
	private Date birthdate;
	private Double salary;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstName) {
		this.firstname = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastName) {
		this.lastname = lastName;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthDate) {
		this.birthdate = birthDate;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	
}
