package Static_view.Class_Diagram.Domain;

public class Gestor_Usuario {

	private string login;
	private string password;

	public string getLogin() {
		return this.login;
	}

	public void setLogin(string login) {
		this.login = login;
	}

	public string getPassword() {
		return this.password;
	}

	public void setPassword(string password) {
		this.password = password;
	}

	/**
	 * 
	 * @param login
	 * @param password
	 */
	public boolean autenticarse(string login, string password) {
		// TODO - implement Gestor_Usuario.autenticarse
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param login
	 * @param password
	 */
	public void registrarse(string login, string password) {
		// TODO - implement Gestor_Usuario.registrarse
		throw new UnsupportedOperationException();
	}

}