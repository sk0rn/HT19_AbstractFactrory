package factories;

import army.interfaces.Assault;
import army.interfaces.Medic;
import army.interfaces.Sniper;
import army.interfaces.Support;
import army.soldiers.soviet.SovietAssault;
import army.soldiers.soviet.SovietMedic;
import army.soldiers.soviet.SovietSniper;
import army.soldiers.soviet.SovietSupport;

public class SovietSquadFactory implements SquadFactory {
    @Override
    public Assault createAssault() {
        return new SovietAssault();
    }

    @Override
    public Sniper createSniper() {
        return new SovietSniper();
    }

    @Override
    public Support createSupport() {
        return new SovietSupport();
    }

    @Override
    public Medic createMedic() {
        return new SovietMedic();
    }
}
