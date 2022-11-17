package InGameObjects;

public abstract class ItemObject extends InGameObj{

    private boolean isInNPCInv = false;
    private boolean isInPlayerInv = false;

    private int value=0;

    public ItemObject(int x, int y, int height1, int width1) {
        super(x, y, height1, width1);
    }
    public ItemObject(int x, int y, int val, boolean npcInv,boolean playerInv, int height1, int width1) {
        super(x, y, height1, width1);
        value = val;
        isInNPCInv =npcInv;
        isInPlayerInv = playerInv;
    }

    public boolean getIsInNPCInv(){
        return isInNPCInv;
    }
    public void setIsInNPCInv (boolean npc){
        isInNPCInv = npc;
    }
    public boolean getIsInPlayerInv(){
        return isInPlayerInv;
    }
    public void setIsInPlayerInv(boolean inv){
        isInPlayerInv = inv;
    }

    public int getValue(){
        return value;
    }
    public void setValue(int val){
        value = val;
    }
}