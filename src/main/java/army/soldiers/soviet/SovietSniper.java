package army.soldiers.soviet;

import army.interfaces.Sniper;
import army.soldiers.Soldier;

public class SovietSniper extends Soldier implements Sniper {
    @Override
    public void makeAccurateShot() {
        System.out.println("make accurate gunshot");
    }

    @Override
    public void hide() {

    }

    @Override
    public void makePrimaryAction() {
        makeAccurateShot();
    }
}
