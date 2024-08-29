package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import Observadores.Observer;
import controladores.HinchaController;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.plaf.basic.BasicButtonUI;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class ContadorHinchasUI implements Observer {

	private JFrame frame;
	private HinchaController controller = new HinchaController();
	JLabel contRiver = new JLabel("");
	JLabel contIndep = new JLabel("");
	JLabel contSanLor = new JLabel("");
	JLabel contEDLP = new JLabel("");
	JLabel contArgJr = new JLabel("");
	JLabel contBoca = new JLabel("");
	JLabel contRacing = new JLabel("");
	JLabel contVelez = new JLabel("");
	JLabel contGim = new JLabel("");
	JLabel contRC = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContadorHinchasUI window = new ContadorHinchasUI();
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
	public ContadorHinchasUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1008, 575);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTitle = new JLabel("CONTADOR DE HINCHAS");
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblTitle.setBounds(343, 0, 374, 67);
		frame.getContentPane().add(lblTitle);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Elegí tu club", "", "Boca Juniors", "", "River Plate", "", "Independiente", "", "Racing Club", "", "San Lorenzo", "", "Vélez Sarsfiel", "", "Estudiantes de La Plata", "", "Gimnasia y Esgrima La Plata", "", "Argentinos Juniors", "", "Rosario Central"}));
		comboBox.setBounds(45, 125, 283, 22);
		frame.getContentPane().add(comboBox);
		comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí puedes manejar el evento
                System.out.println("JComboBox fue presionado. Seleccionado: " + comboBox.getSelectedItem());
                
                controller.agregarHincha((String)comboBox.getSelectedItem());
            }
        });
		
		JLabel lblNewLabel = new JLabel("River Plate");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(356, 180, 187, 28);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblIndependiente = new JLabel("Independiente");
		lblIndependiente.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIndependiente.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblIndependiente.setBounds(356, 236, 187, 28);
		frame.getContentPane().add(lblIndependiente);
		
		JLabel lblSanLorenzo = new JLabel("San Lorenzo");
		lblSanLorenzo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSanLorenzo.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblSanLorenzo.setBounds(356, 302, 187, 28);
		frame.getContentPane().add(lblSanLorenzo);
		
		JLabel lblEstudiantesDeLa = new JLabel("Estudiantes de La Plata");
		lblEstudiantesDeLa.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEstudiantesDeLa.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblEstudiantesDeLa.setBounds(356, 378, 187, 28);
		frame.getContentPane().add(lblEstudiantesDeLa);
		
		JLabel lblArgentinosJuniors = new JLabel("Argentinos Juniors");
		lblArgentinosJuniors.setHorizontalAlignment(SwingConstants.RIGHT);
		lblArgentinosJuniors.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblArgentinosJuniors.setBounds(356, 442, 187, 28);
		frame.getContentPane().add(lblArgentinosJuniors);
		
		JLabel lblBocaJuniors = new JLabel("Boca Juniors");
		lblBocaJuniors.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBocaJuniors.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblBocaJuniors.setBounds(650, 183, 218, 28);
		frame.getContentPane().add(lblBocaJuniors);
		
		JLabel lblRacingClub = new JLabel("Racing Club");
		lblRacingClub.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRacingClub.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblRacingClub.setBounds(650, 239, 218, 28);
		frame.getContentPane().add(lblRacingClub);
		
		JLabel lblVlezSarsfield = new JLabel("Vélez Sarsfield");
		lblVlezSarsfield.setHorizontalAlignment(SwingConstants.RIGHT);
		lblVlezSarsfield.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblVlezSarsfield.setBounds(644, 305, 224, 28);
		frame.getContentPane().add(lblVlezSarsfield);
		
		JLabel lblGimnasiaYEsgrima = new JLabel("Gimnasia y Esgrima La Plata");
		lblGimnasiaYEsgrima.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGimnasiaYEsgrima.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblGimnasiaYEsgrima.setBounds(650, 381, 218, 28);
		frame.getContentPane().add(lblGimnasiaYEsgrima);
		
		JLabel lblRosarioCentral = new JLabel("Rosario Central");
		lblRosarioCentral.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRosarioCentral.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblRosarioCentral.setBounds(650, 442, 218, 28);
		frame.getContentPane().add(lblRosarioCentral);
		
		
		contRiver.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contRiver.setBounds(553, 190, 70, 18);
		frame.getContentPane().add(contRiver);
		
		contIndep.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contIndep.setBounds(553, 246, 70, 18);
		frame.getContentPane().add(contIndep);

		
		contSanLor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contSanLor.setBounds(553, 312, 70, 18);
		frame.getContentPane().add(contSanLor);
		
		
		contEDLP.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contEDLP.setBounds(553, 388, 70, 18);
		frame.getContentPane().add(contEDLP);
		
		
		contArgJr.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contArgJr.setBounds(553, 452, 70, 18);
		frame.getContentPane().add(contArgJr);
		
		
		contBoca.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contBoca.setBounds(878, 190, 70, 18);
		frame.getContentPane().add(contBoca);
		
		
		contRacing.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contRacing.setBounds(878, 246, 70, 18);
		frame.getContentPane().add(contRacing);
		
		
		contVelez.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contVelez.setBounds(878, 312, 70, 18);
		frame.getContentPane().add(contVelez);
		
		
		contGim.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contGim.setBounds(878, 388, 70, 18);
		frame.getContentPane().add(contGim);
		
		
		contRC.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contRC.setBounds(878, 452, 70, 18);
		frame.getContentPane().add(contRC);

		
		
		
	}

	

	}
}
