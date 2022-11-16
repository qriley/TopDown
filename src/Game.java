import java.awt.*;
import java.awt.image.BufferStrategy;

public class Game extends Canvas implements Runnable{

    public int width = 1000;
    public int height = 563;
    public String gameVersion;
    public String gameTitle = "Shooty Gun Gun";
    private boolean isRunning = false;

    private Thread thread;
    private ObjectQueue objQueue;
    public Game(String version){
        gameVersion = version;
        new Window(width,height, gameTitle+" - "+version, this);
        start();
        objQueue = new ObjectQueue();
        objQueue.addObj(new BlobObj(100,100));
        objQueue.addObj(new BulletObj(100,100));
    }
    public void start(){
        isRunning = true;
        thread = new Thread(this);
        thread.start();
    }
    public void stop(){
        isRunning = false;
        try {
            thread.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    public void run(){
        //Thank you notch
        long lastTime = System.nanoTime();
        double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        long timer = System.currentTimeMillis();
        int updates = 0;
        int frames = 0;
        while(isRunning){
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            while(delta >= 1){
                tick();
                // updates++;
                delta--;
            }
            render();
            frames++;

            if(System.currentTimeMillis() - timer > 1000){
                timer += 1000;
                System.out.println("FPS: " + frames + " TICKS: " + updates);
                frames = 0;
                // updates = 0;
            }
        }
        stop();
    }
    public void tick(){
        objQueue.onTick();
    }
    public void render(){
        BufferStrategy buff= this.getBufferStrategy();
        if(buff==null){
            this.createBufferStrategy(3);
            return;
        }

        Graphics graphic = buff.getDrawGraphics();

        graphic.setColor(Color.BLUE);
        graphic.fillRect(0,0,width,height);

        objQueue.onRender(graphic);

        graphic.dispose();
        buff.show();
    }


        public static void main(String[] args) {
            String gameVersion = "0.0.0";
            System.out.println("Starting Game! Version: "+gameVersion);
            new Game(gameVersion);
        }

}
