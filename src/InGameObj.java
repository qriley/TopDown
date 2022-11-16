import java.awt.*;

public abstract class InGameObj {
    protected int coordX, coordY, velX = 0, velY= 0;

    public InGameObj(int x,int y){
        this.coordX = x;
        this.coordY = y;
    }
    public abstract void actionUpdate();
    public abstract void render(Graphics g);
    public abstract Rectangle getBounds();

    public int getCoordX(){
        return coordX;
    }
    public void setCoordX(int x){
        this.coordX = x;
    }
    public int getCoordY(){
        return coordY;
    }
    public void setCoordY(int y){
        this.coordY = y;
    }
}
