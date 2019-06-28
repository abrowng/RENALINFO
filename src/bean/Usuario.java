package bean;

public class Usuario {

	private String usuario;
	private String clave;
	private String nombre;
	private String apellidos;
	private String turno;

	public Usuario(String usuario, String clave, String nombre, String apellidos, String turno) {

		this.usuario = usuario;
		this.clave = clave;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.turno = turno;
	}

	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
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

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

}
