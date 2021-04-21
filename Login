import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Login {

    private JFrame login;
    private JTextField empNom;
    private JTextField empCog;
    private JTextField empUsu;
    private JPasswordField empContr;
    private JTextArea campObservacions;
    private final ButtonGroup buttonGroup = new ButtonGroup();

    //Classe main on s'executa el programa
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Login window = new Login();
                    window.login.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    //Constructor de la classe
    public Login() {
        inicialitzacio();
        infCamps();
        empInf();
        gustos();
        edad();
        botons();
        profesions();
        observacions();
    }

    //Definicio de les caracteristiques de la finestra
    private void inicialitzacio() {
        //Diseny de la finestra
        login = new JFrame();
        login.setTitle("Login");
        login.setResizable(false);
        login.getContentPane().setBackground(new Color(135, 206, 250));
        login.setBounds(100, 100, 400, 500);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login.getContentPane().setLayout(null);
    }

    //Camps on s'especifica l'informacio a emplenar en cada camp
    private void infCamps() {
        //Nom
        JTextPane campNom = new JTextPane();
        campNom.setFont(new Font("Bold", Font.BOLD, 11));
        campNom.setBackground(new Color(240, 230, 140));
        campNom.setBorder(new LineBorder(new Color(0, 0, 0)));
        campNom.setEditable(false);
        campNom.setText("NOM:");
        campNom.setBounds(10, 11, 37, 20);
        login.getContentPane().add(campNom);

        //Cognoms
        JTextPane campCog = new JTextPane();
        campCog.setFont(new Font("Bold", Font.BOLD, 11));
        campCog.setBackground(new Color(240, 230, 140));
        campCog.setBorder(new LineBorder(new Color(0, 0, 0)));
        campCog.setEditable(false);
        campCog.setText("COGNOMS:");
        campCog.setBounds(10, 42, 73, 20);
        login.getContentPane().add(campCog);

        //Usuari
        JTextPane campUsu = new JTextPane();
        campUsu.setFont(new Font("Bold", Font.BOLD, 11));
        campUsu.setBackground(new Color(240, 230, 140));
        campUsu.setBorder(new LineBorder(new Color(0, 0, 0)));
        campUsu.setEditable(false);
        campUsu.setText("USUARI:");
        campUsu.setBounds(10, 73, 58, 20);
        login.getContentPane().add(campUsu);

        //Contraseña
        JTextPane campCont = new JTextPane();
        campCont.setFont(new Font("Bold", Font.BOLD, 11));
        campCont.setBackground(new Color(240, 230, 140));
        campCont.setBorder(new LineBorder(new Color(0, 0, 0)));
        campCont.setEditable(false);
        campCont.setText("CONTRASENYA:");
        campCont.setBounds(10, 104, 100, 20);
        login.getContentPane().add(campCont);
    }

    //Camp on s'introdueix l'informacio requerida
    private void empInf() {
        //Introduccio del nom
        empNom = new JTextField();
        empNom.setColumns(10);
        empNom.setBounds(52, 11, 332, 20);
        login.getContentPane().add(empNom);

        //Introduccio dels cognoms
        empCog = new JTextField();
        empCog.setColumns(10);
        empCog.setBounds(90, 42, 294, 20);
        login.getContentPane().add(empCog);

        //Introduccio de l'usuari
        empUsu = new JTextField();
        empUsu.setColumns(10);
        empUsu.setBounds(74, 73, 310, 20);
        login.getContentPane().add(empUsu);

        //Introduccio de la contraseña
        empContr = new JPasswordField();
        empContr.setBounds(115, 104, 269, 20);
        login.getContentPane().add(empContr);
    }

    //JPanel on es troba un checkbox sobre gustos
    private void gustos() {
        JPanel gustos = new JPanel();
        gustos.setBorder(new LineBorder(new Color(0, 0, 0)));
        gustos.setBounds(305, 135, 79, 146);
        login.getContentPane().add(gustos);

        //Apartat del checkbox
        Label checkbox = new Label("GUSTOS");
        checkbox.setFont(new Font("Bold", Font.BOLD, 12));
        gustos.add(checkbox);

        //Opcions del checkbox
        //Opcio 1
        Checkbox rock = new Checkbox("Rock");
        gustos.add(rock);

        //Opcio 2
        Checkbox jazz = new Checkbox("Jazz");
        gustos.add(jazz);

        //Opcio 3
        Checkbox punk = new Checkbox("Punk");
        gustos.add(punk);

        //Opcio 4
        Checkbox ska = new Checkbox("Ska");
        gustos.add(ska);
    }

    //JPanel on es troba un checkbox sobre l'edat del usuari
    private void edad() {
        JPanel edad = new JPanel();
        edad.setBorder(new LineBorder(new Color(0, 0, 0)));
        edad.setBounds(10, 135, 66, 146);
        login.getContentPane().add(edad);

        //Apartat del checkbox
        Label edadUsu = new Label("EDAD");
        edadUsu.setFont(new Font("Bold", Font.BOLD, 12));
        edad.add(edadUsu);

        //Diferents rangs d'edat a seleccionar
        JRadioButton edad1 = new JRadioButton("0-10");
        buttonGroup.add(edad1);
        edad1.setHorizontalAlignment(SwingConstants.LEFT);
        edad.add(edad1);

        JRadioButton edad2 = new JRadioButton("11-15");
        buttonGroup.add(edad2);
        edad2.setHorizontalAlignment(SwingConstants.LEFT);
        edad.add(edad2);

        JRadioButton edad3 = new JRadioButton("16-18");
        buttonGroup.add(edad3);
        edad3.setHorizontalAlignment(SwingConstants.LEFT);
        edad.add(edad3);

        JRadioButton edad4 = new JRadioButton("+18");
        buttonGroup.add(edad4);
        edad4.setHorizontalAlignment(SwingConstants.LEFT);
        edad.add(edad4);
    }

    //Apartat de ComboBox per seleccionar la professio
    private void profesions() {
        JComboBox profesions = new JComboBox();
        profesions.setModel(new DefaultComboBoxModel(new String[] {"--Seleccionar Professio--",
                "-Electricista",
                "-Programador",
                "-Panader",
                "-Cuiner",
                "-Music",
                "-Professor",
                "-Dissenyador"}));
        profesions.setBounds(86, 135, 209, 30);
        login.getContentPane().add(profesions);
    }

    //Camp per emplenar amb les observacions convenients
    private void observacions() {
        JTextArea observacions = new JTextArea();
        observacions.setBorder(new LineBorder(new Color(0, 0, 0)));
        observacions.setBackground(new Color(240, 230, 140));
        observacions.setFont(new Font("Tahoma", Font.BOLD, 11));
        observacions.setEditable(false);
        observacions.setText("OBSERVACIONS");
        observacions.setBounds(10, 292, 104, 20);
        login.getContentPane().add(observacions);

        //Camp per emplenar amb les observacions
        campObservacions = new JTextArea();
        campObservacions.setBorder(new LineBorder(new Color(0, 0, 0)));
        campObservacions.setWrapStyleWord(true);
        campObservacions.setLineWrap(true);
        campObservacions.setBackground(new Color(255, 255, 255));
        campObservacions.setBounds(10, 323, 374, 105);
        login.getContentPane().add(campObservacions);

        JScrollBar scrollBar = new JScrollBar();
        scrollBar.setBackground(Color.CYAN);
        scrollBar.setMaximum(500);
        scrollBar.setBounds(367, 323, 17, 100);
        login.getContentPane().add(scrollBar);
    }

    //Apartat amb els botons ACCEPTAR/CANCELAR
    private void botons() {
        //Boto d'acceptar
        JButton botAcceptar = new JButton("ACCEPTAR");
        botAcceptar.setBounds(81, 437, 108, 23);
        login.getContentPane().add(botAcceptar);

        //Boto de cancelar
        JButton botCancelar = new JButton("CANCELAR");
        botCancelar.setBounds(200, 437, 108, 23);
        login.getContentPane().add(botCancelar);
    }
}
