package Static_view.Class_Diagram.Presentation;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jdesktop.swingx.JXDatePicker;


public class IU_Cliente {
	
	
	//Campos de día y hora
    Date dNow = new Date( );
    SimpleDateFormat dia = new SimpleDateFormat ("dd.MM.yyyy");
    SimpleDateFormat hora = new SimpleDateFormat ("hh:mm:ss");
    
    private String s_dia = dia.format(dNow);
    private String s_hora = hora.format(dNow);

	public void Hacer_Reserva() {
		
		JFrame frame = new JFrame("Reserva con pedido");
		
		//Organización de los componentes
		GridLayout contenido = new GridLayout(0,1,20,20);
		frame.setLayout(contenido);
		//Tamaño de la ventana
		frame.setMaximumSize(new Dimension(400,500));
		//Panel de contenido
		JPanel contentPanel = new JPanel();
		//Margen al borde
		contentPanel.setBorder(new EmptyBorder(50, 100, 50, 100));
		frame.setContentPane(contentPanel);
		//Operación al cerrar la ventana
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//Botones
		JButton button1 = new JButton("Solicitar mesa");
		
		frame.add(button1);
		
		JXDatePicker picker = new JXDatePicker();
        picker.setDate(Calendar.getInstance().getTime());
        picker.setFormats(new SimpleDateFormat("dd/MM/yyyy"));

        frame.add(picker);
		
		//Acciones botones
		
		button1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				System.out.print("Solicitar_Mesa()");
				
				//IU.Hacer_Reserva();
	
			}
			
		});
		
		
		//Posición en el escritorio
		frame.setLocationRelativeTo(null);
		
		frame.pack();
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