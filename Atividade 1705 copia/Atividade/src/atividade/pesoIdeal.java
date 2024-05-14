package atividade;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.border.EtchedBorder;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;


public class pesoIdeal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfPeso;
	private JTextField tfAltura;
	private JTextField tfPesoIdeal;
	private JTextField tfResultado;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	DecimalFormat df;
	
	double altura =0;
	double resultante =0;
	
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pesoIdeal frame = new pesoIdeal();
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
	public pesoIdeal() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1043, 629);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Peso Ideal", TitledBorder.LEFT, TitledBorder.TOP, null, Color.CYAN));
		panel.setBounds(81, 50, 470, 148);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblPeso = new JLabel("Peso");
		lblPeso.setForeground(Color.CYAN);
		lblPeso.setHorizontalAlignment(SwingConstants.CENTER);
		lblPeso.setFont(new Font("Arial Black", Font.PLAIN, 30));
		lblPeso.setBounds(29, 36, 111, 22);
		panel.add(lblPeso);
		
		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setForeground(Color.CYAN);
		lblAltura.setHorizontalAlignment(SwingConstants.CENTER);
		lblAltura.setFont(new Font("Arial Black", Font.PLAIN, 30));
		lblAltura.setBounds(29, 104, 111, 22);
		panel.add(lblAltura);
		
		tfPeso = new JTextField();
		tfPeso.setFont(new Font("Arial Black", Font.PLAIN, 11));
		tfPeso.setBackground(Color.LIGHT_GRAY);
		tfPeso.setBounds(204, 36, 216, 29);
		panel.add(tfPeso);
		tfPeso.setColumns(10);
		
		tfAltura = new JTextField();
		tfAltura.setBackground(Color.LIGHT_GRAY);
		tfAltura.setColumns(10);
		tfAltura.setBounds(204, 104, 216, 29);
		panel.add(tfAltura);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GRAY);
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Resultado", TitledBorder.LEFT, TitledBorder.TOP, null, Color.CYAN));
		panel_1.setBounds(81, 406, 728, 148);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		tfPesoIdeal = new JTextField();
		tfPesoIdeal.setFont(new Font("Arial Black", Font.PLAIN, 11));
		tfPesoIdeal.setHorizontalAlignment(SwingConstants.CENTER);
		tfPesoIdeal.setForeground(new Color(0, 255, 255));
		tfPesoIdeal.setEditable(false);
		tfPesoIdeal.setEnabled(false);
		tfPesoIdeal.setBackground(new Color(192, 192, 192));
		tfPesoIdeal.setColumns(10);
		tfPesoIdeal.setBounds(263, 22, 170, 47);
		panel_1.add(tfPesoIdeal);
		
		tfResultado = new JTextField();
		tfResultado.setEditable(false);
		tfResultado.setEnabled(false);
		tfResultado.setBackground(Color.LIGHT_GRAY);
		tfResultado.setColumns(10);
		tfResultado.setBounds(21, 90, 412, 47);
		panel_1.add(tfResultado);
		
		JLabel lblPesoIdeal = new JLabel("Peso Ideal");
		lblPesoIdeal.setForeground(Color.CYAN);
		lblPesoIdeal.setFont(new Font("Arial Black", Font.PLAIN, 30));
		lblPesoIdeal.setBounds(21, 14, 207, 47);
		panel_1.add(lblPesoIdeal);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfPesoIdeal.setText("");
				tfPeso.setText("");
				tfAltura.setText("");
				tfResultado.setText("");
				buttonGroup.clearSelection();
				//checkBox.setSelected(false);
				
			}
		});
		btnLimpar.setFont(new Font("Arial Black", Font.PLAIN, 30));
		btnLimpar.setForeground(Color.CYAN);
		btnLimpar.setBackground(Color.BLACK);
		btnLimpar.setBounds(504, 22, 190, 47);
		panel_1.add(btnLimpar);
		
		JButton btnEncerrar = new JButton("Encerrar");
		btnEncerrar.setFont(new Font("Arial Black", Font.PLAIN, 30));
		btnEncerrar.setForeground(Color.CYAN);
		btnEncerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int confirm = JOptionPane.showConfirmDialog(null, "Deseja Sair do Programa?", "Confirmação", JOptionPane.YES_NO_OPTION);
				if (confirm ==JOptionPane.YES_OPTION) {
					System.exit(1);	
				}
				
			}
		});
		btnEncerrar.setBackground(Color.BLACK);
		btnEncerrar.setBounds(504, 90, 190, 47);
		panel_1.add(btnEncerrar);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.GRAY);
		panel_1_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Sexo", TitledBorder.LEFT, TitledBorder.TOP, null, Color.CYAN));
		panel_1_1.setBounds(81, 249, 470, 103);
		contentPane.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JCheckBox chbxMasc = new JCheckBox("Masculino");
		buttonGroup.add(chbxMasc);
		chbxMasc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				masculino();
			}
		});
		chbxMasc.setForeground(Color.CYAN);
		chbxMasc.setFont(new Font("Arial Black", Font.PLAIN, 30));
		chbxMasc.setBackground(Color.LIGHT_GRAY);
		chbxMasc.setBounds(21, 38, 191, 43);
		panel_1_1.add(chbxMasc);
		
		JCheckBox chbxFem = new JCheckBox("Feminino");
		buttonGroup.add(chbxFem);
		chbxFem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				feminino();
			}
		});
		chbxFem.setForeground(Color.CYAN);
		chbxFem.setFont(new Font("Arial Black", Font.PLAIN, 30));
		chbxFem.setBackground(Color.LIGHT_GRAY);
		chbxFem.setBounds(236, 38, 183, 43);
		panel_1_1.add(chbxFem);
	}
	
	public void dados(){
		//double peso = Double.parseDouble(tfPeso.getText());
		double altura = Double.parseDouble(tfAltura.getText());
	}
	
	public void masculino() {
	    altura = Double.parseDouble(tfAltura.getText());
	    resultante = (72.7 * altura - 58);
	    
	    // Formata o resultado para duas casas decimais
	    DecimalFormat df = new DecimalFormat("#.##");
	    String resultadoFormatado = df.format(resultante);

	    tfPesoIdeal.setText("Seu ideal é " + resultadoFormatado + "Kg");
	}

	public void feminino() {
	    altura = Double.parseDouble(tfAltura.getText());
	    resultante = (62.1 * altura - 44);
	    
	    // Formata o resultado para duas casas decimais
	    DecimalFormat df = new DecimalFormat("#.##");
	    String resultadoFormatado = df.format(resultante);

	    tfPesoIdeal.setText("Seu ideal é " + resultadoFormatado + "Kg");
	}
}
