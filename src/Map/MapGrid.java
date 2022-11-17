package Map;

import java.awt.*;
import java.awt.image.BufferedImage;

public class MapGrid {
    private Tile[][] map= new Tile[40][22];
    private Graphics g;
    public MapGrid(Graphics gr){
        g=gr;
        LoadMap();
        LoadGraphics(gr);
    }

    public void LoadMap(){
        for (int row = 0; row < map.length; row++) {
            for (int col = 0; col < map[row].length; col++) {
                map[row][col] = new Tile(1);
            }
        }
    }
    public void LoadGraphics(Graphics g){
        int x=0,y=0;

        for (int row = 0; row < map.length; row++) {

            for (int col = 0; col < map[row].length; col++) {

                render(x,y,g,map[row][col].tileGraphic,0);
                y+=32;
                //System.out.println("x: "+x+" y: "+y);
            }
            y=0;
            x+=32;
        }
    }
    public void render(int coordX,int coordY,Graphics g, BufferedImage img, int spriteNum) {
        g.drawImage(img,coordX,coordY,null);
        //g.setColor(Color.green);
        //g.fillRect(coordX,coordY,16,16);
    }


}
