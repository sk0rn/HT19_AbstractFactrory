package factories;

import army.interfaces.Assault;
import army.interfaces.Medic;
import army.interfaces.Sniper;
import army.interfaces.Support;

public interface SquadFactory {

    Assault createAssault();

    Sniper createSniper();

    Support createSupport();

    Medic createMedic();
}
