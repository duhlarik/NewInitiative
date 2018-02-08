import org.junit.Assert;
import org.junit.Test;

public class AddInitiativeRollTest {

    @Test
    public void addDieRollToExistingInitiative() {

        Roll roll = new Roll();

        int initiative = 4;
        initiative += roll.rollTheDie();

        Assert.assertEquals(8, initiative);
    }

}