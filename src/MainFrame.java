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


        for(int db=1;db<=4;db++){
            int x=(int)Math.floor(Math.random()*287+2);
            int y=(int)Math.floor(Math.random()*267+30);
            g.fillOval(x, y, 10,10);

        // g.setColor(Color.black);
        // g.fillRect(x, y, 50, 50);
        }
        
    }

}
}
