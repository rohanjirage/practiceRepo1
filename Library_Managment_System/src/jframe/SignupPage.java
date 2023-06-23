package jframe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.Font;
import java.awt.Point;
import java.awt.Cursor;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class SignupPage extends JFrame {

	private JPanel contentPane;
	private Label label;
	private Label label_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignupPage frame = new SignupPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SignupPage() {
		setFont(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,1000,1000);
		contentPane = new JPanel();
		contentPane.setMaximumSize(new Dimension(1523, 828));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel = new Panel();
		panel.setFocusTraversalKeysEnabled(false);
		panel.setBackground(new Color(204, 255, 255));
		panel.setForeground(new Color(0, 0, 0));
		panel.setBounds(10, 10, 966, 723);
		contentPane.add(panel);
		
		JLayeredPane layeredPane = new JLayeredPane();
		panel.add(layeredPane);
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		panel.add(layeredPane_1);
		
		label = new Label("Rohan");
		label.setLocation(new Point(100, 100));
		label.setForeground(new Color(255, 0, 0));
		label.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		panel.add(label);
		
		label_1 = new Label("Jirage");
		label_1.setForeground(new Color(165, 42, 42));
		label_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		panel.add(label_1);
	}
	public Label getLabel() {
		return label;
	}
}
