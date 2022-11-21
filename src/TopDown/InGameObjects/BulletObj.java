package TopDown.InGameObjects;

import TopDown.ObjectQueue;

import java.awt.*;


public class BulletObj extends InGameObj{

    char direction;
    public BulletObj(int x, int y, int height1, int width1) {
        super(x, y,height1,width1);
        vel=10;

    }
    public BulletObj(int x, int y, char dir, int height1, int width1) {
        super(x, y, height1, width1);
        vel=10;
        direction = dir;
    }

    @Override
    public void actionUpdate(ObjectQueue objQueue) {

        int actualSpeed=vel;

        //if(isAggro)actualSpeed=aggroVel;

        switch(direction){

            case 'u':
                coordY+=actualSpeed;
                break;

            case 'd':
                coordY-=actualSpeed;
                break;

            case 'l':
                coordX-=actualSpeed;
                break;

            case 'r':
                coordX+=actualSpeed;
                break;

            case 'n':
                coordX+=0;
                coordY+=0;
                break;
        }
    }

    public void render(Graphics g,int spriteNum) {
        g.setColor(Color.black);
        g.drawLine(coordX,coordY,coordX+10,coordY);
    }

    @Override
    public void collideAction(char dir, InGameObj collidedWith){
        //todo: build out the functionality when collides.
    }
}
