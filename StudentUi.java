package com;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PrinterException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentUi extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField math;
	private JTextField eng;
	private JTextField chi;
	private JTextField name;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentUi frame = new StudentUi();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public StudentUi() {
		setFont(new Font("Dialog", Font.PLAIN, 6));
		setTitle("Title_java");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 120, 681, 562);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBounds(10, 10, 340, 460);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(128, 255, 128));
		panel_1.setBounds(10, 22, 325, 41);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("學生成績系統");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblNewLabel_1.setBackground(new Color(255, 128, 64));
		lblNewLabel_1.setBounds(73, 10, 157, 21);
		panel_1.add(lblNewLabel_1);
				
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(128, 255, 128));
		panel_1_1.setBounds(10, 73, 328, 129);
		contentPane.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		name = new JTextField();
		name.setColumns(10);
		name.setBounds(121, 10, 96, 21);
		panel_1_1.add(name);
		
		chi = new JTextField();
		chi.setColumns(10);
		chi.setBounds(121, 39, 96, 21);
		panel_1_1.add(chi);
		
		eng = new JTextField();
		eng.setColumns(10);
		eng.setBounds(121, 68, 96, 21);
		panel_1_1.add(eng);
		
		math = new JTextField();
		math.setColumns(10);
		math.setBounds(121, 97, 96, 21);
		panel_1_1.add(math);
		
		
		JLabel lblNewLabel_1_2 = new JLabel("學生姓名");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblNewLabel_1_2.setBackground(new Color(255, 128, 64));
		lblNewLabel_1_2.setBounds(29, 10, 82, 21);
		panel_1_1.add(lblNewLabel_1_2);
		
		
		JLabel lblNewLabel_1_1 = new JLabel("國文");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblNewLabel_1_1.setBackground(new Color(255, 128, 64));
		lblNewLabel_1_1.setBounds(29, 39, 82, 21);
		panel_1_1.add(lblNewLabel_1_1);
		
		
		JLabel lblNewLabel_1_1_1 = new JLabel("英語");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblNewLabel_1_1_1.setBackground(new Color(255, 128, 64));
		lblNewLabel_1_1_1.setBounds(29, 68, 82, 21);
		panel_1_1.add(lblNewLabel_1_1_1);
				
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("數學");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setFont(new Font("新細明體", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1.setBackground(new Color(255, 128, 64));
		lblNewLabel_1_1_1_1.setBounds(29, 97, 82, 21);
		panel_1_1.add(lblNewLabel_1_1_1_1);
		

		
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.MAGENTA);
		panel_2.setBounds(10, 245, 316, 160);
		contentPane.add(panel_2);
		
		JTextArea out = new JTextArea();
		out.setBounds(10, 10, 296, 144);
		panel_2.add(out);
		
		
		
		
		
		
		
		
		//*****列印*****
		JButton btnNewButton_2 = new JButton("列印");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					out.print();
				} catch (PrinterException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		
		
		
		//*****關閉畫面*****
		btnNewButton_2.setBounds(197, 212, 70, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("關閉");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_3.setBounds(278, 212, 87, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_2_1 = new JButton("CMD");
		btnNewButton_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				out.setText("SSS");
			}
		});
		btnNewButton_2_1.setBounds(20, 212, 57, 23);
		contentPane.add(btnNewButton_2_1);
		
		
		
		

		

		
		
		
	}
}
