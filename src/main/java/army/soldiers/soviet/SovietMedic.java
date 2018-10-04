package army.soldiers.soviet;

import army.interfaces.Medic;
import army.soldiers.Soldier;

public class SovietMedic extends Soldier implements Medic {
    @Override
    public Object giveAidKit() {
        return null;
    }

    @Override
    public void heal() {
        System.out.println("heal");
    }

    @Override
    public void makePrimaryAction() {
        heal();
    }
}
