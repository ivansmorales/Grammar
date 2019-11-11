import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;
import java.util.Scanner;
import java.lang.*;
import java.util.List;
import java.util.ArrayList;

public class App extends JFrame {

	/* Variables para Gui */
	private JButton loadBtn = new JButton("Load File");
	private JButton verifyBtn = new JButton("Verify");
	private JTextField txtA = new JTextField();
	private JTextField txtB = new JTextField();
	private JLabel lblA = new JLabel("Load your file, please.");
	private JLabel lblB = new JLabel("Enter a string: ");
	private JLabel lblC = new JLabel("Result: ");

	/* Variables para App */
	static ArrayList<String> nonTerminalSymbols;
	static ArrayList<String> terminalSymbols;
	static String startingSymbol;
	static ArrayList<ArrayList<ArrayList<String>>> productionsGrammar;


	public App() {
		setTitle("IP.2");
		setSize(400, 300);
		setLocation(new Point(300, 200));
		setLayout(null);
		setResizable(false);
		initComponent();
		initEvent();
		setVisible(true);
	}

	private void initComponent() {
		lblA.setBounds(100, 10, 200, 20);
		lblA.setFont(new Font("Arial", Font.BOLD, 18));
		loadBtn.setBounds(100, 50, 200, 30);
		loadBtn.setFont(new Font("Arial", Font.BOLD, 16));
		lblB.setBounds(100, 90, 200, 20);
		lblB.setFont(new Font("Arial", Font.PLAIN, 16));
		txtA.setBounds(100, 120, 200, 25);
		txtA.setFont(new Font("Arial", Font.PLAIN, 16));
		verifyBtn.setBounds(100, 150, 200, 30);
		verifyBtn.setFont(new Font("Arial", Font.BOLD, 16));
		lblC.setBounds(100, 200, 200, 20);
		lblC.setFont(new Font("Arial", Font.PLAIN, 16));
		txtB.setBounds(100, 230, 200, 25);
		txtB.setFont(new Font("Arial", Font.PLAIN, 16));

		add(lblA);
		add(loadBtn);
		add(lblB);
		add(txtA);
		add(verifyBtn);
		add(lblC);
		add(txtB);
	}

	private void initEvent() {

		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(1);
			}
		});

		loadBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					loadBtn(e);
				} catch (Exception exception) {
					System.out.println("Exception");
				}
			}
		});

		verifyBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verifyBtn(e);
			}
		});
	}

	private void loadBtn(ActionEvent evt) {
		Scanner sc = new Scanner(System.in);
		JFileChooser jf = new JFileChooser();
		
		int aux = jf.showOpenDialog(null);
		if (aux == JFileChooser.APPROVE_OPTION) {
			try {
				File ff = jf.getSelectedFile();
				System.out.println("Nombre del archivo: " + ff.getName());
				/*
				* Le pasamos a Scanner el objeto seleccionado que queremos que lea.
				*/
 				Scanner s = new Scanner(ff);
 				while(s.hasNextLine()) {
					System.out.println(s.nextLine());
				}
				s.close();  
				
				//txtB.read(fff, "");
			} catch (Exception ex) {
				// Logger.getLogger(FilesDemo.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
	}

/* 	public static ArrayList<String> getNonTerminalSymbols(String archivo){
		String noTerminales = "";
		try {
		  Scanner s = new Scanner();
		  noTerminales = s.nextLine();
				nonTerminalSymbols = new ArrayList<String>();
				String[] splitStr = noTerminales.split(",");
				for (int i = 0 ; i < splitStr.length ; i++) {
					nonTerminalSymbols.add(splitStr[i]);
					System.out.println(nonTerminalSymbols.get(i));
				}
				s.close();
		} catch (FileNotFoundException e) {
		  System.out.println("File not found.");
		}
		return nonTerminalSymbols;
	}  */


	private void verifyBtn(ActionEvent evt) {
		System.out.println("Apretado");
	}

}