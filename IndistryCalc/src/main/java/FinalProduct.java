
import java.util.ArrayList;


/**
 *
 * @author steel elysium
 */
public class FinalProduct extends Item{

    public FinalProduct(int material, float time, int buildTime, String name, int ID, int startingAmount) {
        super(material, time, buildTime, name, ID, startingAmount);
    }

    @Override
    public int NeededRuns(ArrayList<Item> lastStage) {
        return super._amount;
    }
    
}
