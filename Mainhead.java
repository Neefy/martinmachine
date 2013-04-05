import java.awt.BorderLayout;


public class Mainhead extends JFrame {

  String input;
	private JPanel contentPane;
	public JTextArea txtrAnswerHere;
	public JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mainhead frame = new Mainhead();
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
	public Mainhead() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JLabel lblTheMartinMachine = DefaultComponentFactory.getInstance().createLabel("Martin Machine");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblTheMartinMachine, 12, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblTheMartinMachine, 153, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblTheMartinMachine, 289, SpringLayout.WEST, contentPane);
		contentPane.add(lblTheMartinMachine);
		
		JLabel lblWhatDoYou = DefaultComponentFactory.getInstance().createTitle("What do you want peasant?");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblWhatDoYou, 158, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblWhatDoYou, 109, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblWhatDoYou, 189, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblWhatDoYou, 373, SpringLayout.WEST, contentPane);
		contentPane.add(lblWhatDoYou);
		
		textField = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.WEST, textField, 10, SpringLayout.WEST, lblWhatDoYou);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JTextArea txtrAnswerHere = new JTextArea();
		sl_contentPane.putConstraint(SpringLayout.SOUTH, textField, -6, SpringLayout.NORTH, txtrAnswerHere);
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtrAnswerHere, 218, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtrAnswerHere, 208, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtrAnswerHere, 209, SpringLayout.WEST, contentPane);
		txtrAnswerHere.setText("ANSWER HERE");
		contentPane.add(txtrAnswerHere);
		
		JLabel lblPicture = new JLabel("PICTURE");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblPicture, 34, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblPicture, 144, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblPicture, -6, SpringLayout.NORTH, lblWhatDoYou);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblPicture, 0, SpringLayout.EAST, lblTheMartinMachine);
		lblPicture.setIcon(new ImageIcon("/home/sebastian/Documents/MARTINfix.png"));
		contentPane.add(lblPicture);
		
		JButton btnHalp = new JButton("halp");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnHalp, -3, SpringLayout.NORTH, textField);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnHalp, 12, SpringLayout.EAST, textField);
		contentPane.add(btnHalp);
		
		textField_1 = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.SOUTH, textField_1, 0, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField_1, 0, SpringLayout.EAST, textField);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblThyAnswer = DefaultComponentFactory.getInstance().createTitle("Thy Answer");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblThyAnswer, 0, SpringLayout.NORTH, txtrAnswerHere);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblThyAnswer, 0, SpringLayout.WEST, lblWhatDoYou);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblThyAnswer, 38, SpringLayout.WEST, lblTheMartinMachine);
		contentPane.add(lblThyAnswer);
	
		
	      
	      
													

	

	
	
	
}

}
