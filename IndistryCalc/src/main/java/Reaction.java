
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
public class Reaction extends Item {
    
    private int _outputAmount;
    
    
    public Reaction(int buildTime, String name, int ID, int output) {
        super(0, 0, buildTime, name, ID, 0); // Reations have not Time or Material Effencancy
        this._outputAmount = output;
    }

    @Override
    public int NeededRuns(ArrayList<Item> lastStage) {
        int neededItems = 0;
        
        for(Item currentItem : lastStage){
            if(currentItem._ID == super._ID){
                neededItems += currentItem._amount;
            }
        }
        return (int) Math.ceil(_amount / (double)this._outputAmount);
    }
    
}
