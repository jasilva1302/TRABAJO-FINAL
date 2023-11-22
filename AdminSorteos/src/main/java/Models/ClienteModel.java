package Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cliente")
public class ClienteModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column
	private String nombre;
	
	@Column
	private String apellido;
	
	@Column
	private String numerocliente;
	
	@Column
	private String direccion;
	
	@Column
	private String correo;
	

	@Column
	private long numerosorteo;
	
	public Long getid() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
		
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String Nombre) {
		this.nombre = Nombre;
		
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String Apellido) {
		this.apellido = Apellido;
		
	}
	
	public String getNumeroCliente() {
		return numerocliente;
	}
	
	public void setNumeroCliente(String NumeroCliente) {
		this.numerocliente = NumeroCliente;
		
	}
	

	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String Direccion) {
		this.direccion = Direccion;
		
	}
	
	public String getEmail() {
		return correo;
	}
	
	public void setEmail(String Email) {
		this.correo= Email;
		
	}
	
	public Long getNumeroSorteo() {
		return numerosorteo;
	}
	
	public void setNumeroSorteo(Long NumeroSorteo) {
		this.numerosorteo = NumeroSorteo;
		
	}
	
	
}
