package persistence.entities;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PersonaEmbeddedEntity {
	
	@Id
	@GeneratedValue
	private int id;
	
	
	private String nombre;
	
	private String apellido;
	
	@Embedded
	private UsuarioEmbeddedEntity usuario;
	
	
	public PersonaEmbeddedEntity() {
		
	}
	
	public PersonaEmbeddedEntity(String nombre, String apellido, UsuarioEmbeddedEntity usuario){
		this.nombre = nombre;
		this.apellido = apellido;
		this.usuario = usuario;
	}
	
	@Override
	public String toString(){
		return "PersonaEmbeddedEntity [nombre: " + nombre + "apellido: " + apellido + "usuario: "+  usuario + "]";
	}
	
	@Override
	public int hashCode(){
		return id;
	}
	
	@Override
	public boolean equals(Object obj){
		 if (obj == null) {
	            return false;
	        } else if (getClass() != obj.getClass()) {
	            return false;
	        } else {
	            return id == ((PersonaEmbeddedEntity) obj).id;
	        }
	}
	
	
	public int getId(){
		return id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellido(){
		return apellido;
	}
	
	public UsuarioEmbeddedEntity getUsuario(){
		return usuario;
	}

}
