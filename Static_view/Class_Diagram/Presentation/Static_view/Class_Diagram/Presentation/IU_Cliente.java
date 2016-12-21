package Static_view.Class_Diagram.Presentation;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Static_view.Class_Diagram.Domain.*;


import org.jdesktop.swingx.JXDatePicker;


public class IU_Cliente {
	
	
	//Campos de día y hora
    SimpleDateFormat dia = new SimpleDateFormat ("dd/MM/yyyy");
   // SimpleDateFormat hora = new SimpleDateFormat ("hh:mm:ss");
    
    
    //Entorno de trabajo
    int idreserva = 0;
    int idpedido = 0;
    int idmesa = 0;
    
    Reserva wr = new Reserva();
    Mesa wm = new Mesa();
    Pedido wp = new Pedido();
    

	public int Hacer_Reserva() {
	
		
		
		Gestor_Reservas GR = new Gestor_Reservas();
		
		JFrame frame_m = new JFrame();
		
		JDialog frame = new JDialog(frame_m, "Reserva con pedido");
		
		
		
		//Organización de los componentes
		GridLayout contenido = new GridLayout(2,1,50,50);
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
		
		JXDatePicker fecha = new JXDatePicker();
        fecha.setDate(Calendar.getInstance().getTime());
        fecha.setFormats(new SimpleDateFormat("dd/MM/yyyy"));

        frame.add(fecha);
        
        String[] choices = { "11:00 - 13:00", "13:00 - 15:00", "19:00 - 21:00", "21:00 - 23:00"};

        JComboBox<String> horarios = new JComboBox<String>(choices);
		
        frame.add(horarios);
        
		//Acciones botones
		
		button1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					
					Vector<Object> ret_f;
					
					ret_f = GR.Hacer_Reserva(dia.format(fecha.getDate()), (String) horarios.getSelectedItem());
					
					int ret_res[] = (int[]) ret_f.get(0);
					
					wr = (Reserva) ret_f.get(1);
					
					wm = (Mesa) ret_f.get(2);
					
					idreserva = ret_res[0];
					
					idmesa = ret_res[1];
					
					if(idreserva > 0){

						System.out.println("Debug: Reserva registrada!");
						
						frame.dispose();

					}else{
						
						JFrame frame = new JFrame("Error");
						
						//Organización de los componentes
						GridLayout contenido = new GridLayout(2,1,50,50);
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
						JLabel emptyLabel = new JLabel("No hay mesas disponibles");
				        emptyLabel.setPreferredSize(new Dimension(175, 100));
				        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
						
						frame.setLocationRelativeTo(null);
						
						frame.pack();
						frame.setVisible(true);
						
					}
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Throwable e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		});
		
		
		//Posición en el escritorio
		frame.setLocationRelativeTo(null);
		
		frame.pack();
		frame.setModal(true);
		frame.setVisible(true);
		
		return idreserva;

	}

	public void Hacer_Pedido() {
		
		Gestor_Pedidos GP = new Gestor_Pedidos();
		
		JFrame frame_m = new JFrame();
		
		JDialog frame = new JDialog(frame_m, "Hacer pedido");
		
		
		
		//Organización de los componentes
		GridLayout contenido = new GridLayout(0,3,50,50);

		//Tamaño de la ventana
		frame.setMaximumSize(new Dimension(400,500));
		//Panel de contenido
		JPanel contentPanel = new JPanel();
		//Margen al borde
		contentPanel.setBorder(new EmptyBorder(50, 100, 50, 100));
		contentPanel.setLayout(contenido);
		frame.setContentPane(contentPanel);
		//Operación al cerrar la ventana
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//Botones
		
		JLabel l_pedido = new JLabel("Comida: ");
		
		JTextField t_pedido = new JTextField();
		t_pedido.setColumns(10);
		
		JButton b_pedido = new JButton("Pedir");
		
		frame.add(l_pedido);
		frame.add(t_pedido);
		frame.add(b_pedido);
		
		b_pedido.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				
				String comida = t_pedido.getText();
				
				int idpedido = 1000 + (int)(Math.random() * 9999);
				
				System.out.println(wr.getIdreserva());
				
				Pedido p = new Pedido(comida, wr.getIdmesa(), idpedido, wr.getIdreserva(), wr.getFecha(), wr.getHora());
				
				try {
			
					GP.Anadir_Pedido(wr.getFecha(), p, wm);
			
				} catch (Exception e) {

					e.printStackTrace();
				}
				
		
			}
		});
		
		//Posición en el escritorio
		frame.setLocationRelativeTo(null);
		
		frame.pack();
		frame.setModal(true);
		frame.setVisible(true);
		
	}

	public void Cambiar_Pedido() {
		Gestor_Pedidos GP = new Gestor_Pedidos();
		
		JFrame frame_m = new JFrame();
		
		JDialog frame = new JDialog(frame_m, "Cambiar pedido");
		
		
		
		//Organización de los componentes
		GridLayout contenido = new GridLayout(2,1,50,50);
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
		
		//Posición en el escritorio
		frame.setLocationRelativeTo(null);
		
		frame.pack();
		frame.setModal(true);
		frame.setVisible(true);
	}

}