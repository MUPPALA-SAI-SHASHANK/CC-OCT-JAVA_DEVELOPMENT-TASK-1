import java.util.* ;
import java.awt.event.* ;
import java.awt.* ;
import javax.swing.* ;
public class SignUp extends JFrame{
	private Container content_pane ;
	private JOptionPane dialog  ;
	private JFrame f ;
	private MailServer servers ;
	public SignUp(JFrame f,MailServer servers){
	this.f=f ;
	this.servers=servers ;
	//content_pane=getContentPane() ;
	dialog= new JOptionPane() ;
 	setDefaultCloseOperation(DISPOSE_ON_CLOSE) ;
	displaySignUp() ;
 	}
	private void displaySignUp(){
		JFrame k=this;
		setLayout(null) ;
		Color c1=new Color(0,255,51);
		k.getContentPane().setBackground(Color.WHITE);
		setBounds(300,50,700,650) ;
		setTitle("Sign-Up for new Account") ;
		ImageIcon image=new ImageIcon("image.png") ;
		JLabel background=new JLabel(image) ;
		background.setBounds(0,0,700,650);
		JPanel panel1=new JPanel(new FlowLayout(FlowLayout.CENTER));
		JLabel l0=new JLabel("Welcome New Users!!!");
		l0.setFont(new Font("serif",Font.BOLD,16));
		l0.setForeground(Color.BLACK);
		JPanel panel2=new JPanel(new FlowLayout(FlowLayout.CENTER));
		JLabel l1=new JLabel("Create Your Account...");
		l1.setFont(new Font("serif",Font.BOLD,16));
		l1.setForeground(Color.BLACK);
		JLabel server=new JLabel("Enter Your Full-Name: ") ;
		server.setFont(new Font("Serif", Font.BOLD, 16));
		server.setForeground(Color.BLACK);
		JLabel username=new JLabel("Enter Username for Account : ") ;
		username.setFont(new Font("Serif", Font.BOLD, 16));
		username.setForeground(Color.BLACK);
		JLabel password=new JLabel("Enter Password for Account : ") ;
		password.setFont(new Font("Serif", Font.BOLD, 16));
		password.setForeground(Color.BLACK);
		JLabel passwordrep=new JLabel("Repeat Password for Account : ") ;
		passwordrep.setFont(new Font("Serif", Font.BOLD, 16));
		passwordrep.setForeground(Color.BLACK);
		JTextField serverInput=new JTextField() ;
		JTextField usertext=new JTextField() ;
		JPasswordField passtext=new JPasswordField() ;
		JPasswordField passtextrep=new JPasswordField() ;
		JButton signup=new JButton("SIGN UP") ;
		signup.setBackground(c1);
		signup.setForeground(Color.BLACK);
		JButton back=new JButton("Back") ;
		back.setBackground(Color.BLACK);
		back.setForeground(Color.WHITE);
		JPanel panel=new JPanel(new GridLayout(4,4))  ;
		JPanel buttonpanel=new JPanel(new FlowLayout(FlowLayout.CENTER)) ;
		panel.add(server);
		panel.add(serverInput);
		panel.add(username) ;
		panel.add(usertext) ;
		panel.add(password) ;
		panel.add(passtext) ;
		panel.add(passwordrep) ;
		panel.add(passtextrep) ;
		panel1.add(l0);
		panel2.add(l1);
		buttonpanel.add(back) ;
		buttonpanel.add(signup) ;
		panel.setBounds(127,270,450,100) ;
		panel1.setBounds(190,160,300,60);
		panel2.setBounds(190,225,300,60);
		buttonpanel.setBounds(260,450,200,50);
		panel.setOpaque(false);
		panel1.setOpaque(false);
		panel2.setOpaque(false);
		buttonpanel.setOpaque(false);
		background.add(panel) ;
		background.add(buttonpanel) ;
		background.add(panel1);
		background.add(panel2);
		add(background) ;
		validate() ;
		repaint() ;
		signup.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){
			String serverName=serverInput.getText();
			String usname=usertext.getText() ;
			String pass=passtext.getText() ;
			String passrep=passtextrep.getText() ;
			if((usname.isEmpty())||(pass.isEmpty())||(passrep.isEmpty())){
			dialog.showMessageDialog(content_pane,"Fields can not be left empty !","Error",JOptionPane.ERROR_MESSAGE) ;
			}
			else{
			if(pass.equals(passrep)){
			MailLogin.users.add(new MailClient(servers,serverName,usname,pass)) ;		
			dialog.showMessageDialog(content_pane,"Sign-Up Successful !","Successful",JOptionPane.INFORMATION_MESSAGE) ;
			setVisible(false) ;
			f.setVisible(true);
			}
			else{
			dialog.showMessageDialog(content_pane,"The two Passwords do not match !","ERROR",JOptionPane.ERROR_MESSAGE) ;
			} } } } ) ;
		back.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){
			setVisible(false) ;
			f.setVisible(true);
			} } ) ;
		setVisible(true) ;
}
}