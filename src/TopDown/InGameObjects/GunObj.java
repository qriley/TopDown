package TopDown.InGameObjects;

import TopDown.ObjectQueue;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
public class GunObj extends ItemObject{
    BufferedImage[] graphicImg = new BufferedImage[2];

    int damage=0;

    public GunObj(int x, int y, int height1, int width1, int dmg) {
        super(x, y, height1, width1);
        this.damage = dmg;
        loadImage();
    }

    public GunObj(int x, int y, int val, boolean npcInv, boolean playerInv, int height1, int width1, int dmg) {
        super(x, y, val, npcInv, playerInv, height1, width1);
        this.damage = dmg;
        loadImage();
    }
    public void loadImage(){
        try {
            graphicImg[0] = ImageIO.read(new File("./graphicImages/imgs/gunObj1-1.png"));
            graphicImg[1] = ImageIO.read(new File("./graphicImages/imgs/gunObj1-2.png"));

        } catch (
                IOException e) {
            System.out.println(e.toString());
        }
    }

    public void actionUpdate(ObjectQueue objQueue) {
        //if( user inputs the shoot command)
        onShoot(objQueue);
    }
    public void onShoot(ObjectQueue objQueue){
        objQueue.addObj(new BulletObj(this.coordX+16,coordY+3,'r', 1,10));

    }
    @Override
    public void render(Graphics g, int spriteNum) {
        g.drawImage(graphicImg[spriteNum],coordX,coordY,null);

    }

    @Override
    public void collideAction(char dir, InGameObj collidedWith) {

    }
}
