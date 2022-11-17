import InGameObjects.InGameObj;

import java.awt.*;
import java.util.LinkedList;

public class ObjectQueue {
    LinkedList<InGameObj> objects = new LinkedList<InGameObj>();
    int spriteUpdate=0;

    public void onTick(){
        for (int i=0;i<objects.size();i++){
            InGameObj curr = objects.get(i);
            curr.actionUpdate();
            checkcollision(curr);
        }
        spriteUpdate ^= 1;
    }
    public void onRender(Graphics g){
        for (int i=0;i<objects.size();i++){
            InGameObj curr = objects.get(i);
            curr.render(g,spriteUpdate);
        }
    }
    public void checkcollision(InGameObj obj){
        if(obj == null) return;

        int x = obj.getBounds().x;
        int y = obj.getBounds().y;
        int width = obj.getBounds().width;
        int height = obj.getBounds().height;

        for (int i=0;i<objects.size();i++){
            if(objects.get(i) == null) return;

            Rectangle checkingObjBounds =objects.get(i).getBounds();
            int checkX = checkingObjBounds.x;
            int checkY = checkingObjBounds.y;
            int checkWidth = checkingObjBounds.width;
            int checkHeight = checkingObjBounds.height;

            if(x-1 == checkX+checkWidth+1){
                obj.collideAction('l',objects.get(i));
                objects.get(i).collideAction('r',obj);
            } else if (x+width+1 == checkX-1) {
                obj.collideAction('r',objects.get(i));
                objects.get(i).collideAction('l',obj);
            } else if (y+1 == checkY-checkHeight-1) {
                obj.collideAction('u',objects.get(i));
                objects.get(i).collideAction('d',obj);
            } else if (y-height-1 == checkY+1) {
                obj.collideAction('d',objects.get(i));
                objects.get(i).collideAction('u',obj);
            }

        }
    }
    public void addObj(InGameObj curr){
        objects.add(curr);
    }
    public void removeObj(InGameObj curr){
        objects.remove(curr);
    }
}
