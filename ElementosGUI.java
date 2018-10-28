import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import com.birosoft.liquid.LiquidLookAndFeel;
//7import com.seaglass.SeaGlassLookAndFeel;
import net.sf.tinylaf.TinyLookAndFeel;
public class ElementosGUI {
    
    public static void main(String[] args) {
	String ax = System.getProperty("os.name"); //variable que toma el nombre del sistema operativo que se tenga instalado
	
        if(ax.equals("Windows 7") || ax.equals("Windows")){//si es un sistema windows se aplica el skin que tiene java para windows
            try {
		UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");
		Elementos w = new Elementos();
		// TODO code application logic here
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Elementos.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(Elementos.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(Elementos.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(Elementos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(ax.equals("Linux")){//si es un sistema linux se aplica el skin que tiene java para linux
            try {
		UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");
		Elementos w = new Elementos();
                // TODO code application logic here
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Elementos.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(Elementos.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(Elementos.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(Elementos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
