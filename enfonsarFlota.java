import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class enfonsarGrafic {

	private JFrame finestra;
	private JTextField textColumnes;
	private JTextField fila1;
	private JTextField fila2;
	private JTextField fila3;
	private JTextField fila4;
	private JTextField fila5;
	private JTextField fila6;
	private JTextField fila7;
	private JTextField fila8;

	//Classe main
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					enfonsarGrafic window = new enfonsarGrafic();
					window.finestra.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//Constructor de la classe
	public enfonsarGrafic() {
		initialize();
	}

	//Inicialitzacio del framehun
	private void initialize() {
		finestra = new JFrame();
		finestra.setTitle("Enfonsar La Flota");
		finestra.getContentPane().setBackground(new Color(102, 205, 170));
		finestra.setBounds(100, 100, 555, 520);
		finestra.setResizable(false);
		finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		finestra.getContentPane().setLayout(null);
		
		JPanel tauler = new JPanel();
		tauler.setBounds(50, 50, 312, 398);
		finestra.getContentPane().add(tauler);
		tauler.setLayout(null);
		
		JButton cassella1_1 = new JButton("");
		cassella1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella1_1.setBounds(0,0,39,50);
		tauler.add(cassella1_1);
		
		JButton cassella1_2 = new JButton("");
		cassella1_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella1_2.setBounds(38, 0, 39, 50);
		tauler.add(cassella1_2);
		
		JButton cassella1_3 = new JButton("");
		cassella1_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella1_3.setBounds(77, 0, 39, 50);
		tauler.add(cassella1_3);
		
		JButton cassella1_4 = new JButton("");
		cassella1_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella1_4.setBounds(116, 0, 40, 50);
		tauler.add(cassella1_4);
		
		JButton cassella1_5 = new JButton("");
		cassella1_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella1_5.setBounds(156, 0, 40, 50);
		tauler.add(cassella1_5);
		
		JButton cassella1_6 = new JButton("");
		cassella1_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella1_6.setBounds(195, 0, 39, 50);
		tauler.add(cassella1_6);
		
		JButton cassella1_7 = new JButton("");
		cassella1_7.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella1_7.setBounds(234, 0, 39, 50);
		tauler.add(cassella1_7);
		
		JButton cassella1_8 = new JButton("");
		cassella1_8.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella1_8.setBounds(273, 0, 39, 50);
		tauler.add(cassella1_8);
		
		JButton cassella2_1 = new JButton("");
		cassella2_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella2_1.setBounds(0, 50, 39, 50);
		tauler.add(cassella2_1);
		
		JButton cassella2_2 = new JButton("");
		cassella2_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella2_2.setBounds(38, 50, 39, 50);
		tauler.add(cassella2_2);
		
		JButton cassella2_3 = new JButton("");
		cassella2_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella2_3.setBounds(77, 50, 39, 50);
		tauler.add(cassella2_3);
		
		JButton cassella2_4 = new JButton("");
		cassella2_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella2_4.setBounds(116, 50, 40, 50);
		tauler.add(cassella2_4);
		
		JButton cassella2_5 = new JButton("");
		cassella2_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella2_5.setBounds(156, 50, 40, 50);
		tauler.add(cassella2_5);
		
		JButton cassella2_6 = new JButton("");
		cassella2_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella2_6.setBounds(195, 50, 39, 50);
		tauler.add(cassella2_6);
		
		JButton cassella2_7 = new JButton("");
		cassella2_7.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella2_7.setBounds(234, 50, 39, 50);
		tauler.add(cassella2_7);
		
		JButton cassella2_8 = new JButton("");
		cassella2_8.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella2_8.setBounds(273, 50, 39, 50);
		tauler.add(cassella2_8);
		
		JButton cassella3_1 = new JButton("");
		cassella3_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella3_1.setBounds(0, 100, 39, 50);
		tauler.add(cassella3_1);
		
		JButton cassella3_2 = new JButton("");
		cassella3_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella3_2.setBounds(38, 100, 39, 50);
		tauler.add(cassella3_2);
		
		JButton cassella3_3 = new JButton("");
		cassella3_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella3_3.setBounds(77, 100, 39, 50);
		tauler.add(cassella3_3);
		
		JButton cassella3_4 = new JButton("");
		cassella3_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella3_4.setBounds(116, 100, 40, 50);
		tauler.add(cassella3_4);
		
		JButton cassella3_5 = new JButton("");
		cassella3_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella3_5.setBounds(156, 100, 40, 50);
		tauler.add(cassella3_5);
		
		JButton cassella3_6 = new JButton("");
		cassella3_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella3_6.setBounds(195, 100, 39, 50);
		tauler.add(cassella3_6);
		
		JButton cassella3_7 = new JButton("");
		cassella3_7.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella3_7.setBounds(234, 100, 39, 50);
		tauler.add(cassella3_7);
		
		JButton cassella3_8 = new JButton("");
		cassella3_8.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella3_8.setBounds(273, 100, 39, 50);
		tauler.add(cassella3_8);
		
		JButton cassella4_1 = new JButton("");
		cassella4_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella4_1.setBounds(0, 150, 39, 50);
		tauler.add(cassella4_1);
		
		JButton cassella4_2 = new JButton("");
		cassella4_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella4_2.setBounds(38, 150, 39, 50);
		tauler.add(cassella4_2);
		
		JButton cassella4_3 = new JButton("");
		cassella4_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella4_3.setBounds(77, 150, 39, 50);
		tauler.add(cassella4_3);
		
		JButton cassella4_4 = new JButton("");
		cassella4_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella4_4.setBounds(116, 150, 40, 50);
		tauler.add(cassella4_4);
		
		JButton cassella4_5 = new JButton("");
		cassella4_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella4_5.setBounds(156, 150, 40, 50);
		tauler.add(cassella4_5);
		
		JButton cassella4_6 = new JButton("");
		cassella4_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella4_6.setBounds(195, 150, 39, 50);
		tauler.add(cassella4_6);
		
		JButton cassella4_7 = new JButton("");
		cassella4_7.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella4_7.setBounds(234, 150, 39, 50);
		tauler.add(cassella4_7);
		
		JButton cassella4_8 = new JButton("");
		cassella4_8.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella4_8.setBounds(273, 150, 39, 50);
		tauler.add(cassella4_8);
		
		JButton cassella5_1 = new JButton("");
		cassella5_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella5_1.setBounds(0, 198, 39, 50);
		tauler.add(cassella5_1);
		
		JButton cassella5_2 = new JButton("");
		cassella5_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella5_2.setBounds(38, 198, 39, 50);
		tauler.add(cassella5_2);
		
		JButton cassella5_3 = new JButton("");
		cassella5_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella5_3.setBounds(77, 198, 39, 50);
		tauler.add(cassella5_3);
		
		JButton cassella5_4 = new JButton("");
		cassella5_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella5_4.setBounds(116, 198, 40, 50);
		tauler.add(cassella5_4);
		
		JButton cassella5_5 = new JButton("");
		cassella5_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella5_5.setBounds(156, 198, 40, 50);
		tauler.add(cassella5_5);
		
		JButton cassella5_6 = new JButton("");
		cassella5_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella5_6.setBounds(195, 198, 39, 50);
		tauler.add(cassella5_6);
		
		JButton cassella5_7 = new JButton("");
		cassella5_7.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella5_7.setBounds(234, 198, 39, 50);
		tauler.add(cassella5_7);
		
		JButton cassella5_8 = new JButton("");
		cassella5_8.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella5_8.setBounds(273, 198, 39, 50);
		tauler.add(cassella5_8);
		
		JButton cassella6_1 = new JButton("");
		cassella6_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella6_1.setBounds(0, 248, 39, 50);
		tauler.add(cassella6_1);
		
		JButton cassella6_2 = new JButton("");
		cassella6_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella6_2.setBounds(38, 248, 39, 50);
		tauler.add(cassella6_2);
		
		JButton cassella6_3 = new JButton("");
		cassella6_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella6_3.setBounds(77, 248, 39, 50);
		tauler.add(cassella6_3);
		
		JButton cassella6_4 = new JButton("");
		cassella6_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella6_4.setBounds(116, 248, 40, 50);
		tauler.add(cassella6_4);
		
		JButton cassella6_5 = new JButton("");
		cassella6_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella6_5.setBounds(156, 248, 40, 50);
		tauler.add(cassella6_5);
		
		JButton cassella6_6 = new JButton("");
		cassella6_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella6_6.setBounds(195, 248, 39, 50);
		tauler.add(cassella6_6);
		
		JButton cassella6_7 = new JButton("");
		cassella6_7.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella6_7.setBounds(234, 248, 39, 50);
		tauler.add(cassella6_7);
		
		JButton cassella6_8 = new JButton("");
		cassella6_8.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella6_8.setBounds(273, 248, 39, 50);
		tauler.add(cassella6_8);
		
		JButton cassella7_1 = new JButton("");
		cassella7_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella7_1.setBounds(0, 298, 39, 50);
		tauler.add(cassella7_1);
		
		JButton cassella7_2 = new JButton("");
		cassella7_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella7_2.setBounds(38, 298, 39, 50);
		tauler.add(cassella7_2);
		
		JButton cassella7_3 = new JButton("");
		cassella7_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella7_3.setBounds(77, 298, 39, 50);
		tauler.add(cassella7_3);
		
		JButton cassella7_4 = new JButton("");
		cassella7_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella7_4.setBounds(116, 298, 40, 50);
		tauler.add(cassella7_4);
		
		JButton cassella7_5 = new JButton("");
		cassella7_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella7_5.setBounds(156, 298, 40, 50);
		tauler.add(cassella7_5);
		
		JButton cassella7_6 = new JButton("");
		cassella7_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella7_6.setBounds(195, 298, 39, 50);
		tauler.add(cassella7_6);
		
		JButton cassella7_7 = new JButton("");
		cassella7_7.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella7_7.setBounds(234, 298, 39, 50);
		tauler.add(cassella7_7);
		
		JButton cassella7_8 = new JButton("");
		cassella7_8.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella7_8.setBounds(273, 298, 39, 50);
		tauler.add(cassella7_8);
		
		JButton cassella8_1 = new JButton("");
		cassella8_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella8_1.setBounds(0, 348, 39, 50);
		tauler.add(cassella8_1);
		
		JButton cassella8_2 = new JButton("");
		cassella8_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella8_2.setBounds(38, 348, 39, 50);
		tauler.add(cassella8_2);
		
		JButton cassella8_3 = new JButton("");
		cassella8_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella8_3.setBounds(77, 348, 39, 50);
		tauler.add(cassella8_3);
		
		JButton cassella8_4 = new JButton("");
		cassella8_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella8_4.setBounds(116, 348, 40, 50);
		tauler.add(cassella8_4);
		
		JButton cassella8_5 = new JButton("");
		cassella8_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella8_5.setBounds(156, 348, 40, 50);
		tauler.add(cassella8_5);
		
		JButton cassella8_6 = new JButton("");
		cassella8_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella8_6.setBounds(195, 348, 39, 50);
		tauler.add(cassella8_6);
		
		JButton cassella8_7 = new JButton("");
		cassella8_7.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella8_7.setBounds(234, 348, 39, 50);
		tauler.add(cassella8_7);
		
		JButton cassella8_8 = new JButton("");
		cassella8_8.setBorder(new LineBorder(new Color(0, 0, 0)));
		cassella8_8.setBounds(273, 348, 39, 50);
		tauler.add(cassella8_8);
		
		JPanel columnes = new JPanel();
		columnes.setBackground(new Color(70, 130, 180));
		columnes.setBounds(50, 12, 312, 26);
		finestra.getContentPane().add(columnes);
		columnes.setLayout(null);
		
		textColumnes = new JTextField();
		textColumnes.setBorder(new LineBorder(new Color(0, 0, 0)));
		textColumnes.setBackground(new Color(152, 251, 152));
		textColumnes.setBounds(0, 0, 312, 26);
		textColumnes.setFont(new Font("Bold", Font.BOLD, 12));
		textColumnes.setText("   A   |   B    |   C   |    D   |    E   |   F   |   G   |   H");
		textColumnes.setEditable(false);
		columnes.add(textColumnes);
		textColumnes.setColumns(10);
		
		JPanel files = new JPanel();
		files.setBounds(12, 50, 26, 398);
		finestra.getContentPane().add(files);
		files.setLayout(null);
		
		fila1 = new JTextField();
		fila1.setBorder(new LineBorder(new Color(0, 0, 0)));
		fila1.setBackground(new Color(240, 230, 140));
		fila1.setFont(new Font("Bold", Font.BOLD, 12));
		fila1.setBounds(0, 0, 26, 50);
		files.add(fila1);
		fila1.setEditable(false);
		fila1.setText("  1");
		fila1.setColumns(10);
		
		fila2 = new JTextField();
		fila2.setBorder(new LineBorder(new Color(0, 0, 0)));
		fila2.setBackground(new Color(240, 230, 140));
		fila2.setFont(new Font("Bold", Font.BOLD, 12));
		fila2.setText("  2");
		fila2.setEditable(false);
		fila2.setColumns(10);
		fila2.setBounds(0, 45, 26, 55);
		files.add(fila2);
		
		fila3 = new JTextField();
		fila3.setBorder(new LineBorder(new Color(0, 0, 0)));
		fila3.setBackground(new Color(240, 230, 140));
		fila3.setFont(new Font("Bold", Font.BOLD, 12));
		fila3.setText("  3");
		fila3.setEditable(false);
		fila3.setColumns(10);
		fila3.setBounds(0, 95, 26, 55);
		files.add(fila3);
		
		fila4 = new JTextField();
		fila4.setBorder(new LineBorder(new Color(0, 0, 0)));
		fila4.setBackground(new Color(240, 230, 140));
		fila4.setFont(new Font("Bold", Font.BOLD, 12));
		fila4.setText("  4");
		fila4.setEditable(false);
		fila4.setColumns(10);
		fila4.setBounds(0, 145, 26, 55);
		files.add(fila4);
		
		fila5 = new JTextField();
		fila5.setBorder(new LineBorder(new Color(0, 0, 0)));
		fila5.setBackground(new Color(240, 230, 140));
		fila5.setFont(new Font("Bold", Font.BOLD, 12));
		fila5.setText("  5");
		fila5.setEditable(false);
		fila5.setColumns(10);
		fila5.setBounds(0, 195, 26, 55);
		files.add(fila5);
		
		fila6 = new JTextField();
		fila6.setBorder(new LineBorder(new Color(0, 0, 0)));
		fila6.setBackground(new Color(240, 230, 140));
		fila6.setFont(new Font("Bold", Font.BOLD, 12));
		fila6.setText("  6");
		fila6.setEditable(false);
		fila6.setColumns(10);
		fila6.setBounds(0, 245, 26, 55);
		files.add(fila6);
		
		fila7 = new JTextField();
		fila7.setBorder(new LineBorder(new Color(0, 0, 0)));
		fila7.setBackground(new Color(240, 230, 140));
		fila7.setFont(new Font("Bold", Font.BOLD, 12));
		fila7.setText("  7");
		fila7.setEditable(false);
		fila7.setColumns(10);
		fila7.setBounds(0, 295, 26, 55);
		files.add(fila7);
		
		fila8 = new JTextField();
		fila8.setBorder(new LineBorder(new Color(0, 0, 0)));
		fila8.setBackground(new Color(240, 230, 140));
		fila8.setFont(new Font("Bold", Font.BOLD, 12));
		fila8.setText("  8");
		fila8.setEditable(false);
		fila8.setColumns(10);
		fila8.setBounds(0, 345, 26, 53);
		files.add(fila8);
		
		JPanel opcions = new JPanel();
		opcions.setBorder(new LineBorder(new Color(0, 0, 0)));
		opcions.setBackground(new Color(218, 165, 32));
		opcions.setBounds(373, 50, 168, 250);
		finestra.getContentPane().add(opcions);
		opcions.setLayout(null);
		
		JComboBox selecVaixells = new JComboBox();
		selecVaixells.setBounds(15, 6, 138, 26);
		opcions.add(selecVaixells);
		selecVaixells.setBorder(new LineBorder(new Color(0, 0, 0)));
		selecVaixells.setModel(new DefaultComboBoxModel(new String[] {"     --VAIXELLS--", "        Cuirassot", "        Destructor", "        Fragata", "        Submari"}));
		
		JButton botoJugar = new JButton("Jugar");
		botoJugar.setBounds(55, 213, 71, 25);
		opcions.add(botoJugar);
		
		
	}
}
