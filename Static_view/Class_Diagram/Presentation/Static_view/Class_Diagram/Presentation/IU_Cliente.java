package Static_view.Class_Diagram.Presentation;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class IU_Cliente {

	public void Hacer_Reserva() {
		// TODO - implement IU_Cliente.Hacer_Reserva
		//1. Create the frame.
		JFrame frame = new JFrame("FrameDemo");

		//2. Optional: What happens when the frame closes?
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//3. Create components and put them in the frame.
		//...create emptyLabel...
		JLabel emptyLabel = new JLabel("Puta práctica");

		
		frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);

		//4. Size the frame.
		frame.pack();

		//5. Show it.
		frame.setVisible(true);
	}

	public void Hacer_Pedido() {
		// TODO - implement IU_Cliente.Hacer_Pedido
		throw new UnsupportedOperationException();
	}

	public void Cambiar_Pedido() {
		// TODO - implement IU_Cliente.Cambiar_Pedido
		throw new UnsupportedOperationException();
	}

}