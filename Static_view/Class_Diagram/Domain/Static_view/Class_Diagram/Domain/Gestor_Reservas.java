package Static_view.Class_Diagram.Domain;

public class Gestor_Reservas {

	/**
	 * 
	 * @param fecha
	 * @param hora
	 * @throws Exception 
	 */
	public boolean Hacer_Reserva(String fecha, String hora) throws Exception {
		
		Gestor_Mesas GM = new Gestor_Mesas();
		
		//IF
		
		GM.consultarmesas();
		
		//THEN
		
		GM.ocuparmesa();
		
		return true;
		
	}

	/*public void Cancelar_Reserva() { NO SE USA
		// TODO - implement Gestor_Reservas.Cancelar_Reserva
		throw new UnsupportedOperationException();
	}*/

}