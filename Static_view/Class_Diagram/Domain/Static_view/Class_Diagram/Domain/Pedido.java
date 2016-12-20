package Static_view.Class_Diagram.Domain;

public class Pedido {

	private String comida;
	private int idmesa;
	private int idpedido;
	private int idreserva;
	private String hora;
	private String fecha;
	
	public Pedido(int idpedido, int idreserva, int idmesa, String hora, String fecha, String comida){
		
		this.idpedido = idpedido;
		this.idreserva = idreserva;
		this.idmesa = idmesa;
		this.hora = hora;
		this.fecha = fecha;
		this.comida = comida;
		
	}
	
	public void setidpedido(int idpedido){
		
		this.idpedido = idpedido;
		
	}
	
	public void setidreserva(int idreserva){
		
		this.idreserva = idreserva;
	
	}

	public void setidmesa(int idmesa){
		
		this.idmesa = idmesa;
		
	}
	
	public void sethora(String hora){
		
		this.hora = hora;
		
	}
	
	public void setfecha(String fecha){
		
		this.fecha = fecha;
	
	}
	
	public void setcomida(String comida){
		
		this.comida = comida;
		
	}
	
	public int getidpedido(){
		
		return this.idpedido;
		
	}
	
	public int getidreserva(){
		
		return this.idreserva;
	
	}
	
	public int getidmesa(){
		
		return this.idmesa;
		
	}
	
	public String gethora(){
		
		return this.hora;
		
	}
	
	public String getfecha(){
		
		return this.fecha;
		
	}
	
	public String getcomida(){
		
		return this.comida;
		
	}

}