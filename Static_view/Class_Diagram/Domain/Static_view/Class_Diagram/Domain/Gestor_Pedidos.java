package Static_view.Class_Diagram.Domain;

import Static_view.Class_Diagram.Persistence.Agente;

public class Gestor_Pedidos {


	public void Anadir_Pedido(String fecha, Pedido pedido, Mesa mesa) throws Exception {
		
		int idpedido = pedido.getIdpedido();
		
		int idreserva = pedido.getIdreserva();
		
		int idmesa = pedido.getIdmesa();
		
		String comida = pedido.getComida();
		
		String fecha_p = pedido.getFecha();
		
		String hora = pedido.getHora();
		
		String SQL_Consulta = "INSERT INTO `practicabd`.`pedidos` (`idpedido`, `idreserva`, `idmesa`, `comida`, `fecha`, `hora`) VALUES ('"+idpedido+"', '"+idreserva+"', '"+idmesa+"', '"+comida+"', '"+fecha_p+"', '"+hora+"');";
				
		Agente a = Agente.getAgente();
		
		a.insert(SQL_Consulta);
	}


	public void Modificar_Pedido(Pedido Pedido_Modificar) throws Exception {
		
		int idpedido = Pedido_Modificar.getIdpedido();
		
		int idmesa = Pedido_Modificar.getIdmesa();
		
		String comida = Pedido_Modificar.getComida();
		
		String fecha = Pedido_Modificar.getFecha();
		
		String hora = Pedido_Modificar.getHora();
		
		String SQL_Consulta = "UPDATE `pedidos` SET `idmesa`='"+idmesa+"', `comida`='"+comida+"', `fecha`='"+fecha+"', `fecha`='"+hora+"' WHERE `idpedido`='"+idpedido+"';";
		
		Agente a = Agente.getAgente();
		
		a.update(SQL_Consulta);
		
		
	}


	/*public void Eliminar_Pedido(Pedido Pedido_Eiliminar) {
		// TODO - implement Gestor_Pedidos.Eliminar_Pedido
		throw new UnsupportedOperationException();
	}

	/*public void Mostrar() {
		// TODO - implement Gestor_Pedidos.Mostrar
		throw new UnsupportedOperationException();
	}


	public void Anadir_Pedido(String fecha, Pedido pedido) {
		// TODO - implement Gestor_Pedidos.Añadir_Pedido
		throw new UnsupportedOperationException();
	}*/

}