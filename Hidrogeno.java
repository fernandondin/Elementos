import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.Image;
import java.awt.Insets;
public class Hidrogeno{
    public static final int NUMERO_ATOMICO=1;
    public static final double MASA_ATOMICA=1.008;
    public static final String NOMBRE="Hidrógeno";
    public static final String SIMBOLO="H";
    public static final int GRUPO=1;
    public static final int PERIODO=1;
    private JFrame frame;
    private JButton h;
	private JLabel title;
    public Hidrogeno(){
	frame=new JFrame("Hidr\u00f3geno");
	title=new JLabel("<html><body><p><FONT SIZE=20><font face=Clucky_Duck>Hidr\u00f3geno</font></p></FONT></body></html>");
	title.setBounds(180,30,200,50);
	frame.add(title);
	h= new JButton("<html><body><p ALIGN=LEFT><FONT SIZE=1>1</FONT></p><p><FONT SIZE=4 ><b>&nbsp;&nbsp;&nbsp;H</b></FONT></p><p><FONT SIZE=0>Hidr\u00f3geno</FONT></p><p><FONT SIZE=0>&nbsp;&nbsp;1.008</FONT></p></body></html>");
	h.setMargin(new Insets(0,0,1,20)); 
	h.setBounds(225,120,50,50);
	h.setToolTipText("Hidr\u00f3geno");
	h.setBackground(new Color(93,199,88));
	frame.add(h);
	frame.setBounds(400,50,550,650);
	frame.setLayout(null);
	frame.setResizable(false);
	Image img= Toolkit.getDefaultToolkit().getImage("Andromeda.jpg");
	frame.setIconImage(img);
	frame.setVisible(true);
	JFrame temp = frame;
	frame.addWindowListener( new WindowAdapter(){
	public void windowClosing(WindowEvent e){
		//temp.dispose();
		System.exit(0);
	}
	});
    }
    public static void main(String[] args){
	Hidrogeno a = new Hidrogeno();
    }
}
