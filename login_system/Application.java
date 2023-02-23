package bro_code;
/*JFrame frame=new JFrame();
frame.setSize(300,500);
frame.setTitle("frame");
frame.setLocation(200, 100);
frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
frame.setResizable(false);//prevent frame from being resized
ImageIcon image=new ImageIcon("C:\\logo.png");//create an image component
frame.setIconImage(image.getImage());//sets the image icon of our frame
frame.setVisible(true);//make our frame visible
frame.getContentPane().setBackground(new Color(45,88,98));
*/
public class Application {

	public static void main(String[] args) {
		IdandPasswords idandpasswords=new IdandPasswords();
		Loginpage L=new Loginpage(idandpasswords.getlogininfo());
        
	}

}
