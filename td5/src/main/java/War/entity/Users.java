package War.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Users {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@OneToMany
	private List<Scripts> scripts;
	
	@Column(name = "Login", length = 64, nullable = false)
	private String login;
	@Column(name = "Password", length = 64, nullable = false)
	private String password;
	@Column(name = "Email", length = 64, nullable = false)
	private String email;
	@Column(name = "Identity", length = 64, nullable = false)
	private String identity;
	
	public Users() {
		scripts=new ArrayList<Scripts>();
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", scripts=" + scripts + ", login=" + login + ", password=" + password + ", email="
				+ email + ", identity=" + identity + "]";
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Scripts> getScripts() {
		return scripts;
	}

	public void setScripts(List<Scripts> scripts) {
		this.scripts = scripts;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}
	
}
