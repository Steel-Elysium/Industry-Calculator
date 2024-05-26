
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author steel elysium
 */
public class component extends Item{

    
    public component(int material, float time, int buildTime, String name, int ID) {
        super(material, time, buildTime, name, ID, 0);
    }

    @Override
    public int NeededRuns(ArrayList<Item> lastStage) {
       
        int neededItems = 0;
        
        for(Item currentItem : lastStage){
            if(currentItem._ID == super._ID){
                neededItems += currentItem._amount;
            }
        }     
        return neededItems;
    }

}
