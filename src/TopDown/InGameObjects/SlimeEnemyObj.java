package TopDown.InGameObjects;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class SlimeEnemyObj extends EnemyObj{


    BufferedImage[] graphicImg = new BufferedImage[2];


    public SlimeEnemyObj(int x, int y,int speed,int height1,int width1) {
        super(x, y, speed, height1, width1);
        loadImage();
    }
    public SlimeEnemyObj(int x, int y, int health, int speed, int lvl, int aggroSpeed, char dir, int height1, int width1) {
        super(x, y, health, speed, lvl, aggroSpeed, dir, height1, width1);
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
    /*@Override
    public void actionUpdate(ObjectQueue objQueue) {
        coordX+=velX;
        coordY+=velY;
        if(this.getIsAggro()){
            velX=this.getAggroVel();
        }else{
            velX=1;
        }
    }*/

    public void render(Graphics g,int spriteNum) {
        g.drawImage(graphicImg[spriteNum],coordX,coordY,null);
        //g.setColor(Color.green);
        //g.fillRect(coordX,coordY,16,16);
    }

    public void collideAction(char dir, InGameObj collidedWith){
        //todo: build out the functionality when collides.
    }
}
