
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author grege
 */
public class Basic extends Item{

    public Basic(String name, int ID ,int startingAmount) {
        super(0, 0, 0, name, ID, startingAmount);
    }

    @Override
    public int NeededRuns(ArrayList<Item> lastStage) {
        return 0;
    }

}
