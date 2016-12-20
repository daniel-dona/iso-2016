package Static_view.Class_Diagram.Domain;

import java.util.Vector;

import Static_view.Class_Diagram.Persistence.Agente;

public class Gestor_Mesas {


	/*public void Estado_Mesas(int tipo_usuario) { NO SE USA
			
	}*/

	public Mesa[] consultarmesas() throws Exception {
				
		String SQL_Consulta = "SELECT * FROM `mesas` WHERE `ocupada` = 'false';";
		
		Agente a = Agente.getAgente();
		
		Vector<Object> res = a.select(SQL_Consulta);
		
		Mesa mesas[] = new Mesa[res.size()];
		
		for(int i=0; i<res.size(); i++){
			
			Vector<String> tupla = (Vector<String>) res.elementAt(i);
			
			System.out.println(Integer.parseInt(tupla.get(0)));
			
			mesas[i] = new Mesa(Integer.parseInt(tupla.get(0)),Boolean.parseBoolean(tupla.get(1)),Boolean.parseBoolean(tupla.get(2)),Boolean.parseBoolean(tupla.get(3)));	
			
		}
		
		return mesas;
		
	}

	public boolean ocuparmesa() {
		
		//UPDATE SQL
		
		return true;
		
	}

}