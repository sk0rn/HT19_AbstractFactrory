package army.soldiers.german;

import army.interfaces.Assault;
import army.soldiers.Soldier;

public class GermanAssault extends Soldier implements Assault {
    @Override
    public void makeGunShot() {
    }

    @Override
    public void makeBurstGunShot() {

    }

    @Override
    public void makePrimaryAction() {
        makeGunShot();
    }
}
