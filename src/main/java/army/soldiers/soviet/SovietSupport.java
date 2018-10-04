package army.soldiers.soviet;

import army.interfaces.Support;
import army.soldiers.Soldier;

public class SovietSupport extends Soldier implements Support {
    @Override
    public Object giveAmmo() {
        return null;
    }

    @Override
    public void repair() {
        System.out.println("repair");
    }

    @Override
    public void makePrimaryAction() {
        repair();
    }
}
