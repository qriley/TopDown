import java.awt.*;

public class Game extends Canvas implements Runnable{
    String gameVersion = "0.0.0";
    public Game(){
        new Window(1000,563, "Shooty Gun Gun", this);
    }

    public void run(){


    }

        public static void main(String[] args) {
            System.out.println("Starting Game!");
            new Game();
        }

}
