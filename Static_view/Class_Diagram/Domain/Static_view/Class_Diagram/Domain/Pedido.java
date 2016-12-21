package Static_view.Class_Diagram.Domain;

public class Pedido {

	private String comida;
	private int idmesa;
	private int idpedido;
	private int idreserva;
	private String hora;
	private String fecha;
	
	public Pedido(String comida, int idmesa, int idpedido, int idreserva, String hora, String fecha) {
		this.comida = comida;
		this.idmesa = idmesa;
		this.idpedido = idpedido;
		this.idreserva = idreserva;
		this.hora = hora;
		this.fecha = fecha;
	}
	
	
	public String getComida() {
		return comida;
	}

	public int getIdmesa() {
		return idmesa;
	}

	public int getIdpedido() {
		return idpedido;
	}

	public int getIdreserva() {
		return idreserva;
	}

	public String getHora() {
		return hora;
	}

	public String getFecha() {
		return fecha;
	}

	public void setComida(String comida) {
		this.comida = comida;
	}

	public void setIdmesa(int idmesa) {
		this.idmesa = idmesa;
	}

	public void setIdpedido(int idpedido) {
		this.idpedido = idpedido;
	}

	public void setIdreserva(int idreserva) {
		this.idreserva = idreserva;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public Pedido() {
	}


	
}