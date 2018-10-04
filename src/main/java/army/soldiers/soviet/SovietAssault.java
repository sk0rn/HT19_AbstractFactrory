package army.soldiers.soviet;

import army.interfaces.Assault;
import army.soldiers.Soldier;

public class SovietAssault extends Soldier implements Assault {
    @Override
    public void makeGunShot() {
        System.out.println("make gunshot");
    }

    @Override
    public void makeBurstGunShot() {

    }

    @Override
    public void makePrimaryAction() {
        makeGunShot();
    }
}
