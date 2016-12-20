package Static_view.Class_Diagram.Domain;

public class Reserva {

	private String fecha;
	private String hora;
	private int idmesa;
	
	public Reserva(String fecha, String hora, int idmesa) {
		
		this.fecha = fecha;
		this.hora = hora;
		this.idmesa = idmesa;
		
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

}