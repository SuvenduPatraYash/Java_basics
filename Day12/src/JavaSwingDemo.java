import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JavaSwingDemo 
{
	
	public static void main(String[] args) 
	{
		JFrame f=new JFrame();  
		
		JButton b=new JButton("Button");  
		b.setBounds(130,100,100, 40);  
		          
		f.add(b);  
		          
		f.setSize(400,500);  
		f.setLayout(null);  
		f.setVisible(true);
		
		//JFrame f= f.setDefaultCloseOperation(Jframe.EXIT_ON_CLOSE);

	}

}
