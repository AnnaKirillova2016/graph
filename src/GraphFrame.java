import javax.swing.*;
import java.awt.*;
public class GraphFrame extends JFrame{
    GraphPanel panel;
    public GraphFrame(String name) throws HeadlessException {
        super(name);
       panel = new GraphPanel();
        panel.setOpaque(true);
        panel.addMouseListener(new MouseEvents());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel);
        setSize(1000, 1000);//СЂР°Р·РјРµСЂ
        setVisible(true);
        setBackground(Color.white);
    }
}
