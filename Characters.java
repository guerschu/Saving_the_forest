
import java.util.ArrayList;

class Characters{

    ArrayList<Object> inventory;
    
    int water_intake;

    int food_intake;

    int hungry;

    int thirsty;

    ArrayList<Object> clothing;


    public character(ArrayList inventory, int hungry, int thirsty, ArrayList clothing){
        this.inventory = new ArrayList();
        this.hungry = 100;
        this.thirsty = 100;
        this.clothing = new ArrayList();
    }

    public int is_hungry(){

    }

    public int is_thirsty(){
        
    }

    
    

}