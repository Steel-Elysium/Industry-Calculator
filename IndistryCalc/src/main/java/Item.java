
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author steel elysium
 * This will be a base for all the items in the respies
 */
public abstract class Item {
    protected final String _name;
    protected final int _materialEff, _buildTime, _ID;
    protected int _amount;
    protected final float _timeEff;
    protected ArrayList<Item> _requiremnts;
    
    public Item(int material, float time, int buildTime, String name, int ID, int startingAmount){
       this._buildTime = buildTime;
       this._materialEff = material;
       this._timeEff = time;
       this._name = name;
       this._requiremnts = new ArrayList<>();
       this._amount = startingAmount;
       this._ID = ID;
    }
    
    public abstract int NeededRuns(ArrayList<Item> lastStage);
    
    public ArrayList<Item> GetInputs(){
        return this._requiremnts;
    }
    
    protected void AddReactant(Item requirement){
        this._requiremnts.add(requirement);
    }
    
    public void AddAmount(int amount){
        this._amount += amount;
    }
    
    protected void AddReactant(ArrayList<Item> requiremnts){
        this._requiremnts.addAll(requiremnts);
    }
    
    public int GetMatEff(){
        return this._materialEff;
    }
    
    public float GetBuildTime(int runs){
        return _buildTime * (1 - _timeEff) * runs;
    }
    
    @Override
    public String toString(){
        return this._amount + " " + this._name;
    }
}
