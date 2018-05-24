import java.awt.*;

public class Point {
    public int posX;
    public int posY;
    public int radius;
    public int state; // СЃС‚Р°С‚СѓСЃ РєРµРј  Р·РІРЅСЏС‚
    public Color color;

    public Point(int x, int y, int _radius, int _state, Color _color)
    {
        this.posX = x;
        this.posY = y;
        this.radius = _radius;
        this.state = _state;
        this.color = _color;
    }
}
