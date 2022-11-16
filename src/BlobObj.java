import java.awt.*;

public class BlobObj extends InGameObj{
//todo: create enemy object, blob will be enemy. enemy will have health, speed when aggro, graphic image and bounds for weapon collision.
    private boolean isAggro = false;
    public BlobObj(int x, int y) {
        super(x, y);
        velX=1;

    }

    @Override
    public void actionUpdate() {
        coordX+=velX;
        coordY+=velY;
        if(isAggro){
            velX=3;
        }else{
            velX=1;
        }
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.green);
        g.fillRect(coordX,coordY,32,32);
    }

    @Override
    public Rectangle getBounds() {
        return null;
    }
}
