package TopDown;

import javax.swing.*;
import java.awt.*;

public class Window {
    public Window(int w,int h,String title, Game game){

        JFrame frame = new JFrame(title);

        Dimension frameDimension = new Dimension(w, h);

        frame.setPreferredSize(frameDimension);
        frame.setMaximumSize(frameDimension);
        frame.setMinimumSize(frameDimension);

        frame.add(game);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }








}
