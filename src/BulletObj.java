import java.awt.*;

public class BulletObj extends InGameObj{

    public BulletObj(int x, int y) {
        super(x, y);
        velX=10;

    }

    @Override
    public void actionUpdate() {
        coordX+=velX;
        coordY+=velY;

    }

    public void render(Graphics g,int spriteNum) {
        g.setColor(Color.black);
        g.drawLine(coordX,coordY,coordX+10,coordY);
    }

    @Override
    public Rectangle getBounds() {
        return null;
    }

    public void collideWithEnemy(){
        //todo: build out the functionality when the bullet collides with an enemy.
        //Perhaps if the x y plus offset of bullet is within the get bounds enemy takes damage
    }
}
