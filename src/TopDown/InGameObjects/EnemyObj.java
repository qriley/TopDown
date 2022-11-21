package TopDown.InGameObjects;

import TopDown.ObjectQueue;

import java.awt.*;
import java.awt.image.BufferedImage;

public abstract class EnemyObj extends InGameObj{
    private boolean isAggro = false;
    private int aggroVel = 3; //default aggro vel 3
    private int enemyHealth = 100; //default enemy health at 100
    private int level = 1; //default level 1
    private int currHealth = enemyHealth; //default enemy health at 100
    private char direction;


    BufferedImage graphicImg[] = null;


    public EnemyObj(int x, int y,int speed,int height1,int width1) {
        super(x, y, height1, width1);
        this.vel=speed;
    }
    public EnemyObj(int x, int y, int health, int speed, int lvl, int aggroSpeed, char dir,int height1,int width1) {
        super(x, y, height1, width1);
        this.vel=speed;
        this.enemyHealth = health;
        this.currHealth = health;
        this.level = lvl;
        this.isAggro = false;
        this.aggroVel = aggroSpeed;
        this.direction = dir;
    }

    @Override
    public void actionUpdate(ObjectQueue objQueue) {

        int actualSpeed=vel;

        if(isAggro)actualSpeed=aggroVel;

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

    @Override
    public void render(Graphics g,int spriteNum) {
        //g.setColor(Color.green);
        //g.fillRect(coordX,coordY,16,16);
    }

    public boolean getIsAggro(){
        return isAggro;
    }
    public void setIsAggro(boolean aggro){
        isAggro = aggro;
    }
    public int getAggroVel(){
        return aggroVel;
    }
    public void setAggroVel(int vel){
        aggroVel = vel;
    }
    public int getEnemyHealth(){
        return enemyHealth;
    }
    public void setEnemyHealth(int health){
        enemyHealth = health;
    }
    public int getLevel(){
        return level;
    }
    public void setLevel(int lvl){
        level = level;
    }
    public int getCurrHealth(){
        return currHealth;
    }
    public void setCurrHealth(int health){
        currHealth = health;
    }
}
