package InGameObjects;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class SlimeEnemyObj extends EnemyObj{
    private boolean isAggro = false;
    private int aggroVel = 3; //default aggro vel 3
    private int enemyHealth = 100; //default enemy health at 100
    private int currHealth = 100; //default enemy health at 100
    private int level = 1; //default level 1


    BufferedImage[] graphicImg = new BufferedImage[2];


    public SlimeEnemyObj(int x, int y) {
        super(x, y);
        loadImage();
    }
    public SlimeEnemyObj(int x, int y, int health, int speed, int lvl, int aggroSpeed) {
        super(x, y, health, speed, lvl, aggroSpeed);
        loadImage();
    }

    public void loadImage(){
        try {
            graphicImg[0] = ImageIO.read(new File("./graphicImages/imgs/slime1-1.png"));
            graphicImg[1] = ImageIO.read(new File("./graphicImages/imgs/slime1-2.png"));

        } catch (
                IOException e) {
            System.out.println(e.toString());
        }
    }
    @Override
    public void actionUpdate() {
        coordX+=velX;
        coordY+=velY;
        if(isAggro){
            velX=aggroVel;
        }else{
            velX=1;
        }
    }

    public void render(Graphics g,int spriteNum) {
        g.drawImage(graphicImg[spriteNum],coordX,coordY,null);
        //g.setColor(Color.green);
        //g.fillRect(coordX,coordY,16,16);
    }

    @Override
    public Rectangle getBounds() {
        return null;
    }
}
