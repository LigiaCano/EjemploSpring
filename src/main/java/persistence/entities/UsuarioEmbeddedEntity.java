package persistence.entities;

import javax.persistence.Embeddable;

@Embeddable
public class UsuarioEmbeddedEntity {
	
	private String login;
	
	private String password;
	
	public UsuarioEmbeddedEntity(){
		
	}
	
	public UsuarioEmbeddedEntity(String login, String password) {
		this.login = login;
		this.password = password;
	}
	
	@Override
	public String toString(){
		return "Usuario [Login: " + login + "Passowrd: " + password + "]";
	}
	
	public String getLogin(){
		return login;
	}
	
	public String getPassword(){
		return password;
	}
}
