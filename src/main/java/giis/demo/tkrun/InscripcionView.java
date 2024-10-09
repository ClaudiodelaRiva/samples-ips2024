package giis.demo.tkrun;

import java.awt.EventQueue;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Component;
import javax.swing.JTabbedPane;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InscripcionView {

	private JFrame frame;
	private JTable tabCarreras;
	private JTable tabAtletas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InscripcionView window = new InscripcionView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InscripcionView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Inscripcion");
		frame.setName("Inscripcion");
		frame.setBounds(100, 100, 618, 505);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[604px,grow]", "[14px][132.00px][][145.00][48.00,grow][grow][]"));
		
		JLabel lblCarrera = new JLabel("Seleccionar Carrera");
		frame.getContentPane().add(lblCarrera, "cell 0 0,growx,aligny top");
		
		tabCarreras = new JTable();
		tabCarreras.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tabCarreras.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		JScrollPane tabCarrerasPanel = new JScrollPane(tabCarreras);
		frame.getContentPane().add(tabCarrerasPanel, "cell 0 1,grow");
		
		JLabel lblAtletas = new JLabel("Seleccionar Atleta");
		frame.getContentPane().add(lblAtletas, "cell 0 2,alignx leading");
		
		tabAtletas = new JTable();
		tabAtletas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tabAtletas.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		JScrollPane tabAtletasPanel = new JScrollPane(tabCarreras);
		frame.getContentPane().add(tabAtletasPanel, "cell 0 3,grow");
		
		JButton btnInscripcion = new JButton("Inscribirse");
		frame.getContentPane().add(btnInscripcion, "cell 0 5");
		
		
	}

}
