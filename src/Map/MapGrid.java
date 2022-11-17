package Map;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MapGrid {
    private Tile[][] map= new Tile[40][22];

    public MapGrid(){}

    public void LoadMap(){
        for (int row = 0; row < map.length; row++) {
            for (int col = 0; col < map[row].length; col++) {
                int swag =(int)Math.floor(Math.random()*6);
                System.out.print(swag);
                map[row][col] = new Tile(swag);
            }
        }
    }
    public void LoadGraphics(Graphics g){
        int x=0,y=0;

        for (int row = 0; row < map.length; row++) {

            for (int col = 0; col < map[row].length; col++) {
                Tile curr = map[row][col];
                BufferedImage tileImage =ImageLoader(curr.imageAddresses[curr.type]);
                System.out.print(map[row][col].type);
                render(x,y,g,tileImage,0);
                y+=32;
                //System.out.println("x: "+x+" y: "+y);
            }
            System.out.print("\n");
            y=0;
            x+=32;
        }
    }
    public void render(int coordX,int coordY,Graphics g, BufferedImage img, int spriteNum) {
        g.drawImage(img,coordX,coordY,null);
        //g.setColor(Color.green);
        //g.fillRect(coordX,coordY,16,16);
    }
    public BufferedImage ImageLoader(String fileAddress){
        BufferedImage tileImg = null;
        try{
            tileImg = ImageIO.read(new File(fileAddress));
        } catch (
                IOException e) {
            System.out.println(e.toString());
        }
        return tileImg;
    }


}
