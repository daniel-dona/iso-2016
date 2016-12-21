package Static_view.Class_Diagram.Domain;

import java.util.Vector;

import Static_view.Class_Diagram.Persistence.Agente;

public class Gestor_Reservas {


	public int[] Hacer_Reserva(String fecha, String hora) throws Exception {
		
		int idreserva = 0;
		
		int idmesa_reserva = 0;

		
		int ret[] = new int[2];
		
		Gestor_Mesas GM = new Gestor_Mesas();
			
		Mesa mesas[] = GM.consultarmesas(); //Mesas que EXISTEN, no su estado, pues tenemos que verificar la situación para cuando se reserva
		

		
		if(mesas.length > 0){
		
			//GM.ocuparmesa(mesaslibres[0].getIdmesa()); //Marca como ocupada la primera mesa libre (esto solo si se reserva en la fecha/hora ACTUAL)
			
			String SQL_Consulta = "SELECT * FROM `reservas` WHERE `fecha` = '"+fecha+"' AND `hora`= '"+hora+"';";
			
			Agente a = Agente.getAgente();
			
			Vector<Object> res = a.select(SQL_Consulta);
			
			Boolean libre = true;
			
			
			for(int m=0; m<mesas.length; m++){
				
				
			
				for(int i=0; i<res.size(); i++){
					
					Vector<String> tupla = (Vector<String>) res.elementAt(i);
					
					if(Integer.parseInt(tupla.get(0)) == mesas[m].getIdmesa()){
						
						libre = false; //Si la mesa que estamos recorriendo aparece como reservada ya, la descartamos
						
					}
					
					
				}
				
				if(libre = true){ //Si no aparece como ocupada, la reservamos
					
					idmesa_reserva = mesas[m].getIdmesa();
					
					break;
					
				}
				
			}
			
			if(libre=false){
				
				System.out.println("Debug: no hay mesas disponibles ese día y hora");
				
				return ret;
				
			}else{
				
				System.out.println("Debug: insertar reserva en DB");
				
				idreserva = 1000 + (int)(Math.random() * 9999); 
				
				String SQL_Consulta_IN = "INSERT INTO `practicabd`.`reservas` (`idreserva`, `idmesa`, `fecha`, `hora`) VALUES ('"+idreserva+"', '"+idmesa_reserva+"', '"+fecha+"', '"+hora+"');";
								
				a.insert(SQL_Consulta_IN);
				
				
			}
			
			
		}
		
		ret[0] = idreserva;
		ret[1] = idmesa_reserva;
		
		return ret;
		
	}

	/*public void Cancelar_Reserva() { NO SE USA
		// TODO - implement Gestor_Reservas.Cancelar_Reserva
		throw new UnsupportedOperationException();
	}*/

}