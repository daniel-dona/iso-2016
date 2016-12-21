package Static_view.Class_Diagram.Domain;

public class Mesa {

	private int idmesa;
	private boolean ocupada;
	private boolean reservada;
	private boolean atendida;
	
	public int getIdmesa() {
		return idmesa;
	}
	public boolean isOcupada() {
		return ocupada;
	}
	public boolean isReservada() {
		return reservada;
	}
	public boolean isAtendida() {
		return atendida;
	}
	public void setIdmesa(int idmesa) {
		this.idmesa = idmesa;
	}
	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}
	public void setReservada(boolean reservada) {
		this.reservada = reservada;
	}
	public void setAtendida(boolean atendida) {
		this.atendida = atendida;
	}
	
	public Mesa(int idmesa, boolean ocupada, boolean reservada, boolean atendida) {
		this.idmesa = idmesa;
		this.ocupada = ocupada;
		this.reservada = reservada;
		this.atendida = atendida;
	}
	public Mesa() {
	}
	

	
}