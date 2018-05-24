

import java.awt.*;
import java.awt.event.*;

public class MouseEvents implements MouseListener {


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

        Main.pointList.add(new Point(e.getX(),e.getY(),25,0, Color.RED));
        Main.frame.panel.repaint();
    }


    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
