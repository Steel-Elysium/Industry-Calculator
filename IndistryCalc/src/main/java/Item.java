
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author steel elysium
 * This will be a base for all the resipies
 */
public abstract class Item {
    protected final int _materialEff, _buildTime;
    protected final float _timeEff;
    public Item(int material, float time, int buildTime){
       this._buildTime = buildTime;
       this._materialEff = material;
       this._timeEff = time;
    }
    
    abstract int NeededRuns(ArrayList<Item> lastStage);
    
    abstract Item GetOutput();
    
    abstract ArrayList<Item> GetInputs();
    
    public int GetMatEff(){
        return this._materialEff;
    }
    
    public float GetBuildTime(int runs){
        return _buildTime/(1 - _timeEff) * runs;
    }
}
