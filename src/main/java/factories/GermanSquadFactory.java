package factories;

import army.interfaces.Assault;
import army.interfaces.Medic;
import army.interfaces.Sniper;
import army.interfaces.Support;
import army.soldiers.german.GermanAssault;
import army.soldiers.german.GermanMedic;
import army.soldiers.german.GermanSupport;
import army.soldiers.german.GermanSniper;

public class GermanSquadFactory implements SquadFactory {
    @Override
    public Assault createAssault() {
        return new GermanAssault();
    }

    @Override
    public Sniper createSniper() {
        return new GermanSniper();
    }

    @Override
    public Support createSupport() {
        return new GermanSupport();
    }

    @Override
    public Medic createMedic() {
        return new GermanMedic();
    }
}
