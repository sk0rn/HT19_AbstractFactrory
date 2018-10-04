package army.soldiers.german;

import army.interfaces.Sniper;
import army.soldiers.Soldier;

public class GermanSniper extends Soldier implements Sniper {
    @Override
    public void makeAccurateShot() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void makePrimaryAction() {
        makeAccurateShot();
    }
}
