import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.sun.javafx.tk.Toolkit;

import Static_view.*;
import Static_view.Class_Diagram.Presentation.IU_Cliente;
import javafx.scene.layout.Border;

class P3{
	
	public static void main(String[] args) {
		
		IU_Cliente IU = new IU_Cliente();
		
		JFrame frame = new JFrame("IU Cliente");
		
		//Organización de los componentes
		GridLayout contenido = new GridLayout(0,2,20,20);
		frame.setLayout(contenido);
		//Tamaño de la ventana
		frame.setMaximumSize(new Dimension(400,500));
		//Panel de contenido
		JPanel contentPanel = new JPanel();
		//Margen al borde
		contentPanel.setBorder(new EmptyBorder(100, 25, 100, 25));
		frame.setContentPane(contentPanel);
		//Operación al cerrar la ventana
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//Botones
		JButton button1 = new JButton("Realizar reserva con pedido");
		JButton button2 = new JButton("Cambiar pedido");
		
		frame.add(button1);
		frame.add(button2);
		
		//Acciones botones
		
		button1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				System.out.print("Reserva()");
				
				IU.Hacer_Reserva();
	
			}
			
		});
		
		button2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				System.out.print("Cambiar()");
				
				//IU.Cambiar_Pedido();
	
			}
			
		});
		
		
		//Posición en el escritorio
		frame.setLocationRelativeTo(null);
		
		frame.pack();
		frame.setVisible(true);

	}

}