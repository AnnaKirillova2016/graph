import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
public class GraphPanel extends JPanel {
    public void paint(Graphics g) {


        for (int i = 0; i < Main.pointList.size(); i++) {
            //  g.drawOval(pointList.get(i).posX,pointList.get(i).posY,pointList.get(i).radius,pointList.get(i).radius);//РїРµСЂРІС‹С… РґРІРµ -СЌС‚Рѕ РєРѕРѕСЂРґРёРЅР°С‚С‹ РІРµСЂС…РЅРµРіРѕ Р»РµРІРѕРіРѕ СѓРіР»Р° РїСЂСЏРјРѕСѓРіРѕР»СЊРЅРёРєР°;
            g.setColor(Main.pointList.get(i).color);
            g.fillOval(Main.pointList.get(i).posX, Main.pointList.get(i).posY, Main.pointList.get(i).radius, Main.pointList.get(i).radius);//Р·Р°Р»РёРІРєР° С„РёРіСѓСЂС‹

        }
    }
}
