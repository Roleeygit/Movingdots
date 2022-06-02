import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Graphics;

public class MainFrame extends JFrame {
    SajátComponent sc = new SajátComponent();
    public MainFrame() {
        this.add(this.sc);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);
        this.setVisible(true);
        //5x5 kör vagy négyzet megjelenítés
        //koordináta: (10;10)


    }    
class SajátComponent extends JComponent {
    @Override
    public void paint(Graphics g) {

        int x = (int) Math.floor(Math.random()*297+2);
        int x1 = (int) Math.floor(Math.random()*297+2);
        int x2 = (int) Math.floor(Math.random()*297+2);
        int x3 = (int) Math.floor(Math.random()*297+2);

        int y = (int) Math.floor(Math.random()*297+2);
        int y1 = (int) Math.floor(Math.random()*297+2);
        int y2 = (int) Math.floor(Math.random()*297+2);
        int y3 = (int) Math.floor(Math.random()*297+2);

        System.out.println(x);
        System.out.println(y);

        // g.setColor(Color.black);
        // g.fillOval(5, 30, 10, 10);
        // g.setColor(Color.black);
        // g.fillOval(5, 15, 10, 10);
        // g.setColor(Color.black);
        // g.fillOval(20, 10, 10, 10);
        // g.setColor(Color.black);
        // g.fillOval(40, 15, 10, 10);

        g.setColor(Color.black);
        g.fillOval(x, y, 10, 10);

        g.setColor(Color.black);
        g.fillOval(x1, y1, 10, 10);

        g.setColor(Color.black);
        g.fillOval(x2, y2, 10, 10);

        g.setColor(Color.black);
        g.fillOval(x3, y3, 10, 10);

        // g.setColor(Color.black);
        // g.fillRect(x, y, 50, 50);

        
    }
}
}
