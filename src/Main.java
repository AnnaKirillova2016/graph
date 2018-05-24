
import com.sun.corba.se.impl.orbutil.graph.Graph;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import javax.swing.*;

public class Main {
public   static ArrayList<Point> pointList;
public static GraphFrame frame;
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {

                Point p1 = new Point(20, 20, 10, 1, Color.BLUE);
                pointList = new ArrayList<Point>();
                pointList.add(p1);
                p1 = new Point(50, 50, 10, 1, Color.BLUE);
                pointList.add(p1);
                 frame=new GraphFrame("Игра") ;
                frame.setVisible(true);
               // crateMainFrame();
            }
        });
        System.out.println("Р’РІРµРґРµРЅРѕ РЅРµРїСЂР°РІРёР»СЊРЅРѕРµ С‡РёСЃР»Рѕ");
    }
}

