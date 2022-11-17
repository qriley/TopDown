import javax.imageio.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Tile {

    /**
     *  type 0 - blank
     *  type 1 = grass
     *  type 2 = long Grass
     *  type 3 = path
     *  type 4 = tree
     *  type 5 = water
     *  type 6 = wall or structure
     * **/
    int type;
    BufferedImage tileGraphic;
    InGameObj occupyingObj = null;
    String[] imageAddresses = new String[6];

    public Tile(int type){
        type = type;
        imageAddresses=ImageAddressLoader();
        tileGraphic=ImageLoader(imageAddresses[this.type]);
    }
    public Tile(int type, InGameObj obj){
        type = type;
        occupyingObj = obj;
        imageAddresses=ImageAddressLoader();
        tileGraphic=ImageLoader(imageAddresses[this.type]);
    }

    public String[] ImageAddressLoader(){
        String[] addresses = new String[6];
        addresses[0] = "./graphicImages/imgs/NatureTiles/Grass00.png";
        addresses[1] = "./graphicImages/imgs/NatureTiles/Grass00.png";
        addresses[2] = "./graphicImages/imgs/NatureTiles/GrassVines00.png";
        addresses[3] = "./graphicImages/imgs/NatureTiles/PathEdge01D.png";
        addresses[4] = "./graphicImages/imgs/NatureTiles/Trunk01.png";
        addresses[5] = "./graphicImages/imgs/NatureTiles/water00";
        //addresses[6] = "./graphicImages/imgs/NatureTiles/Grass00.png";

        return addresses;
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
