package Static_view.Class_Diagram.Domain;

public class Reserva {

	private String fecha;
	private String hora;
	private int idmesa;
	private int idreserva;
	
	public int getIdreserva() {
		return idreserva;
	}

	public void setIdreserva(int idreserva) {
		this.idreserva = idreserva;
	}

	public Reserva(String fecha, String hora, int idmesa, int idreserva) {
		
		this.fecha = fecha;
		this.hora = hora;
		this.idmesa = idmesa;
		this.idreserva = idreserva;
	}
	
	public String getFecha() {
		return fecha;
	}
	public String getHora() {
		return hora;
	}
	public int getIdmesa() {
		return idmesa;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public void setIdmesa(int idmesa) {
		this.idmesa = idmesa;
	}

	public Reserva() {
	}

}