import java.util.* ;
import java.awt.event.* ;
import java.awt.* ;
import javax.swing.* ;
public class MailSystemMenu extends JFrame{
	private Container contentPane ;
	private MailServer servers ;
	public MailSystemMenu(){
		servers=new MailServer() ;
		setTitle("Welcome to Mail Services") ;
		setDefaultCloseOperation(EXIT_ON_CLOSE) ;
		makeMenuBar() ;
		displayMenu() ;
	}
	private void displayMenu(){
		JFrame f=this ;
		setLayout(null);
		Color c1 = new Color(0, 255, 51);
		f.getContentPane().setBackground(Color.WHITE);
		setBounds(300,50,700,650) ;
		ImageIcon image=new ImageIcon("image.png") ;
		JLabel background=new JLabel(image) ;
		background.setBounds(0,-25,700,650);
		JPanel panel=new JPanel(new FlowLayout(FlowLayout.CENTER)) ;
		JPanel panel1=new JPanel(new BorderLayout()) ;
		JPanel panel2=new JPanel(new BorderLayout()) ;
		JLabel l1=new JLabel("Welcome to Mail Service");
		JLabel l2=new JLabel("New Users Sign-Up First");
		l1.setFont(new Font("Serif", Font.BOLD, 20));
		l1.setForeground(Color.BLACK);
		l2.setFont(new Font("Serif", Font.BOLD, 20));
		l2.setForeground(Color.BLACK);
		JButton sign_up=new JButton("SIGN-UP") ;
		sign_up.setBackground(c1);
		sign_up.setForeground(Color.BLACK);
		JButton login=new JButton("SIGN-IN") ;
		login.setBackground(c1);
		login.setForeground(Color.BLACK);
		JButton exit=new JButton("EXIT") ;
		exit.setBackground(Color.RED);
		exit.setForeground(Color.BLACK);
		panel1.add(l1,BorderLayout.NORTH) ;
		panel2.add(l2,BorderLayout.NORTH);
		panel.add(sign_up) ;
		panel.add(login) ;
		panel.add(exit) ;
		panel.setBounds(160,425,400,60);
		panel1.setBounds(250,190,450,30);
		panel2.setBounds(250,220,450,30);
		panel.setOpaque(false);
		panel1.setOpaque(false);
		panel2.setOpaque(false);
		add(background) ;
		background.add(panel1) ;
		background.add(panel) ;
		background.add(panel2);
		validate() ;
		repaint() ;
		setVisible(true) ;
		sign_up.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){
		setVisible(false) ;
		SignUp window=new SignUp(f,servers) ; 
 		} } ) ;
		login.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){
		setVisible(false) ;
		SignIn s=new SignIn(f) ;
		} } ) ;
		exit.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){
		System.exit(0) ;
		} } ) ;	
	}
	private void makeMenuBar(){
		JFrame f=this ;
		JMenuBar menubar=new JMenuBar() ;
		setJMenuBar(menubar) ;
		JMenu about=new JMenu("About") ;
		menubar.add(about) ;
		JMenuItem exit=new JMenuItem("Exit") ;
		JMenuItem developerInfo=new JMenuItem("Developer") ;
		about.add(developerInfo) ;
		about.add(exit) ;
		developerInfo.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){
		JOptionPane dialog=new JOptionPane() ;
		dialog.showMessageDialog(f,"MUPPALA SAI SHASHANK-CODE CLAUSE",
		"DEVELOPER INFORMATION",JOptionPane.INFORMATION_MESSAGE) ; } } ) ;
		exit.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){
		System.exit(0) ; } } ) ;
		}
}