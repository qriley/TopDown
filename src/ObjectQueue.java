import java.awt.*;
import java.util.LinkedList;

public class ObjectQueue {
    LinkedList<InGameObj> objects = new LinkedList<InGameObj>();

    public void onTick(){
        for (int i=0;i<objects.size();i++){
            InGameObj curr = objects.get(i);
            curr.actionUpdate();
        }
    }
    public void onRender(Graphics g){
        for (int i=0;i<objects.size();i++){
            InGameObj curr = objects.get(i);
            curr.render(g);
        }
    }
    public void addObj(InGameObj curr){
        objects.add(curr);
    }
    public void removeObj(InGameObj curr){
        objects.remove(curr);
    }
}
