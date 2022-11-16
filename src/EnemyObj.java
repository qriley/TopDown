import java.awt.*;
import java.awt.image.BufferedImage;

public abstract class EnemyObj extends InGameObj{
    private boolean isAggro = false;
    private int aggroVel = 3; //default aggro vel 3
    private int enemyHealth = 100; //default enemy health at 100
    private int level = 1; //default level 1

    BufferedImage graphicImg = null;


    public EnemyObj(int x, int y) {
        super(x, y);
        velX=1;
    }
    public EnemyObj(int x, int y, int health, int speed, int lvl, int aggroSpeed) {
        super(x, y);
        velX=speed;
        enemyHealth = health;
        level = lvl;
        aggroVel = aggroSpeed;
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
        //g.setColor(Color.green);
        //g.fillRect(coordX,coordY,16,16);
    }

    @Override
    public Rectangle getBounds() {
        return null;
    }
}
