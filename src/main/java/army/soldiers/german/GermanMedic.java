package army.soldiers.german;

import army.interfaces.Medic;
import army.soldiers.Soldier;

public class GermanMedic extends Soldier implements Medic {
    @Override
    public Object giveAidKit() {
        return null;
    }

    @Override
    public void heal() {

    }

    @Override
    public void makePrimaryAction() {
        heal();
    }
}
