package Static_view.Class_Diagram.Domain;

public class Mesa {

//	private string fecha;
	private int idmesa;
	private boolean ocupada;
	private boolean reservada;
//	private string hora;
	private boolean atendida;
	
	public void setidmesa(int idmesa){
		
		this.idmesa = idmesa;
		
	}
	
	public void setocupada(boolean ocupada){
		
		this.ocupada = ocupada;
		
	}

	public void setreservada(boolean reservada){
		
		this.reservada = reservada;
		
	}
	
	public void setatendida(boolean atendida){
		
		this.atendida = atendida;
		
	}
	
	public int getidmesa(){
		
		return this.idmesa;
		
	}
	
	public boolean getocupada(){
		
		return this.ocupada;
		
	}
	
	public boolean getreservada(){
		
		return this.reservada;
		
	}
	
	public boolean getatendida(){
		
		return this.atendida;
		
	}
	
}