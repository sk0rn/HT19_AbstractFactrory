package army.soldiers.german;

import army.interfaces.Support;
import army.soldiers.Soldier;

public class GermanSupport extends Soldier implements Support {
    @Override
    public Object giveAmmo() {
        return null;
    }

    @Override
    public void repair() {

    }

    @Override
    public void makePrimaryAction() {
        repair();
    }
}
